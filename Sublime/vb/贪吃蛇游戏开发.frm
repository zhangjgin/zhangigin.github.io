VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "贪吃蛇游戏开发"
   ClientHeight    =   7080
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   12060
   LinkTopic       =   "Form1"
   ScaleHeight     =   7080
   ScaleWidth      =   12060
   StartUpPosition =   3  '窗口缺省
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False

'定义颜色的类型
Private Type Color
    R As Integer '红色
    G As Integer '绿色
    B As Integer '蓝色
End Type
'定义食物类型
Private Type Food
    Y As Single
    X As Single
    C As Color
End Type

Private Type Node '每一节蛇身
    D As Integer ' 37左 38上 39右 40下
    X As Single 'left
    Y As Single 'top
    C As Color '蛇身颜色
End Type

Dim W As Integer '每一节蛇身的宽度
Dim sno() As Node '声明一条蛇，是动态数组
Dim currentDirect As Integer '代表蛇运动的当前方向
Private WithEvents timer1 As Timer
Attribute timer1.VB_VarHelpID = -1
Private WithEvents lbscore As Label '自定义一个标签控件用来记录控件
Attribute lbscore.VB_VarHelpID = -1
Private WithEvents lbinfo As Label  '定义信息说明，例如用于按下空格键暂停与开始
Attribute lbinfo.VB_VarHelpID = -1
Dim score As Long


'声明食物变量
Dim goods As Food
Dim n As Long '代表蛇身节点数


'初始化一条蛇的各个参数
Function init()
    'WindowState = 2 '窗体最大化
    AutoRedraw = True ' 自动重绘
    W = 200
    currentDirect = 39 '默认向右运动
    n = 5
    ReDim sno(n) As Node
    
    '初始化蛇身颜色
    Randomize
    Dim R%, G%, B%
    R = Int(Rnd * 256)
    G = Int(Rnd * 256)
    B = Int(Rnd * 256)
    '初始化各个坐标点
    Dim i%
    For i = 0 To UBound(sno) Step 1
        sno(i).D = currentDirect
        sno(i).X = ScaleWidth / 2 + i * W
        sno(i).Y = ScaleHeight / 2
        '初始化蛇身颜色
        sno(i).C.R = R
        sno(i).C.G = G
        sno(i).C.B = B
    Next i
'初始化食物数据
Call rndFood


End Function
'画食物
Function drawFood()
    Line (goods.X, goods.Y)-(goods.X + W, goods.Y + W), RGB(goods.C.R, goods.C.G, goods.C.B), BF
End Function
'随机生成一个食物在窗体内
Function rndFood()
        Randomize
    goods.X = Int(Rnd * (ScaleWidth - W))
    goods.Y = Int(Rnd * (ScaleHeight - W))
    goods.C.R = Int(Rnd * 256)
    goods.C.G = Int(Rnd * 256)
    goods.C.B = Int(Rnd * 256)
End Function
'画一条蛇
Function drowsSnake()
    Cls
    Dim i As Long
    For i = 0 To UBound(sno) Step 1
        Line (sno(i).X, sno(i).Y)-(sno(i).X + W, sno(i).Y + W), RGB(sno(i).C.R, sno(i).C.G, sno(i).C.B), BF
    Next i
End Function

Private Sub Form_KeyPress(KeyAscii As Integer)
If KeyAscii = 32 And timer1.Enabled = True Then
    timer1.Enabled = False '暂停游戏
    lbinfo.Visible = True
    
Else
    timer1.Enabled = True '开始游戏
    lbinfo.Visible = False
End If
End Sub

Private Sub Form_KeyUp(KeyCode As Integer, Shift As Integer)
    If Abs(currentDirect - KeyCode) <> 2 And Abs(currentDirect - KeyCode) < 4 Then currentDirect = KeyCode
End Sub

Private Sub Form_Load()
Call init
Call drowsSnake
'对时钟控件进行初始化
Set timer1 = Controls.Add("vb.timer", "timer1")
timer1.Interval = 100
timer1.Enabled = True
'对分数标签进行初始化
Set lbscore = Controls.Add("vb.label", "lbscore")
lbscore.AutoSize = True
lbscore.BackStyle = vbTransparent
lbscore.Visible = True
lbscore.Caption = "得分：" & score
lbscore.Move 100, 100
'对信息标签进行初始化化
Set lbinfo = Controls.Add("vb.label", "lbinfo")
lbinfo.AutoSize = True
lbinfo.BackStyle = vbTransparent
lbinfo.Visible = False
lbinfo.Caption = "暂停"
lbinfo.FontSize = 20

lbinfo.Move ScaleWidth / 2 - lbinfo.Width / 2, ScaleHeight / 2 - lbinfo.Height / 2
End Sub
'运动思路：插入头节点，删除尾节点
Function sport()
    Dim i%
    '将每一个节点的数据向前移动一位
    For i = 1 To UBound(sno) Step 1
        sno(i - 1) = sno(i)
        
    Next i
'将头节点，也就是数组的最后一位重新赋值
    If currentDirect = 37 Then
        sno(UBound(sno)).X = sno(UBound(sno)).X - W
    ElseIf currentDirect = 38 Then
        sno(UBound(sno)).Y = sno(UBound(sno)).Y - W
    ElseIf currentDirect = 39 Then
        sno(UBound(sno)).X = sno(UBound(sno)).X + W
    ElseIf currentDirect = 40 Then
        sno(UBound(sno)).Y = sno(UBound(sno)).Y + W
    End If
    
End Function



'蛇的运动
Private Sub timer1_Timer()
Call sport
Call drowsSnake
'判断是否撞到窗体
If isCrashWall Then
    If MsgBox("是否继续？", vbYesNo, "游戏结束！") = vbYes Then
        Call init
    Else
        End
    End If
End If
'画食物
Call drawFood
'判断是否吃到食物
If isEatFood Then
    '增长蛇身
    n = n + 1
    score = score + 1 '增加分数
    lbscore.Caption = "得分：" & score
    ReDim Preserve sno(n)
    '头部添加
    
'    sno(n).D = currentDirect
'    sno(n).C.R = goods.C.R
'    sno(n).C.G = goods.C.G
'    sno(n).C.B = goods.C.B
   
'    If currentDirect = 37 Then
'        sno(n).X = sno(n - 1).X - W
'        sno(n).Y = sno(n - 1).Y
'    ElseIf currentDirect = 39 Then
'        sno(n).X = sno(n - 1).X + W
'        sno(n).Y = sno(n - 1).Y
'    ElseIf currentDirect = 38 Then
'        sno(n).X = sno(n - 1).X
'        sno(n).Y = sno(n - 1).Y - W
'    ElseIf currentDirect = 40 Then
'        sno(n).X = sno(n - 1).X
'        sno(n).Y = sno(n - 1).Y + W
'    End If
    '尾部添加
    '移动数据，往后一格
    Dim i As Long
    For i = n To 1 Step -1
        sno(i) = sno(i - 1)
    Next i
    '在第一格添加数据
        If currentDirect = 37 Then
        sno(0).X = sno(0).X + W
        sno(0).Y = sno(0).Y
    ElseIf currentDirect = 39 Then
        sno(0).X = sno(0).X - W
        sno(n).Y = sno(n - 1).Y
    ElseIf currentDirect = 38 Then
        sno(0).X = sno(0).X
        sno(0).Y = sno(0).Y + W
    ElseIf currentDirect = 40 Then
        sno(0).X = sno(0).X
        sno(0).Y = sno(0).Y - W
    End If
    '改变头部这一节的颜色
    
    sno(n).C.R = goods.C.R
    sno(n).C.G = goods.C.G
    sno(n).C.B = goods.C.B
    '再次随机生成食物
    
    Call rndFood
End If
End Sub

'是否撞到窗体边缘，撞到返回true，否则就是false
Function isCrashWall() As Boolean
    isCrashWall = False
    If sno(UBound(sno)).X + W > ScaleWidth _
    Or sno(UBound(sno)).X < 0 _
    Or sno(UBound(sno)).Y < 0 _
    Or sno(UBound(sno)).Y + W > ScaleHeight Then
        isCrashWall = True '撞到了
        
    End If
End Function
'是否吃到食物，true表示吃到，false表示没吃到
Function isEatFood()
    '默认没有吃到
    isEatFood = False
    '判断是否吃到，就是判断蛇头与食物是否碰撞
    If sno(UBound(sno)).X + W > goods.X _
        And sno(UBound(sno)).X < goods.X + W _
        And sno(UBound(sno)).Y + W > goods.Y _
        And sno(UBound(sno)).Y < goods.Y Then
        
        isEatFood = True
        
    End If
    
    
End Function

























