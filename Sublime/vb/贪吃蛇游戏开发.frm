VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "̰������Ϸ����"
   ClientHeight    =   7080
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   12060
   LinkTopic       =   "Form1"
   ScaleHeight     =   7080
   ScaleWidth      =   12060
   StartUpPosition =   3  '����ȱʡ
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False

'������ɫ������
Private Type Color
    R As Integer '��ɫ
    G As Integer '��ɫ
    B As Integer '��ɫ
End Type
'����ʳ������
Private Type Food
    Y As Single
    X As Single
    C As Color
End Type

Private Type Node 'ÿһ������
    D As Integer ' 37�� 38�� 39�� 40��
    X As Single 'left
    Y As Single 'top
    C As Color '������ɫ
End Type

Dim W As Integer 'ÿһ������Ŀ��
Dim sno() As Node '����һ���ߣ��Ƕ�̬����
Dim currentDirect As Integer '�������˶��ĵ�ǰ����
Private WithEvents timer1 As Timer
Attribute timer1.VB_VarHelpID = -1
Private WithEvents lbscore As Label '�Զ���һ����ǩ�ؼ�������¼�ؼ�
Attribute lbscore.VB_VarHelpID = -1
Private WithEvents lbinfo As Label  '������Ϣ˵�����������ڰ��¿ո����ͣ�뿪ʼ
Attribute lbinfo.VB_VarHelpID = -1
Dim score As Long


'����ʳ�����
Dim goods As Food
Dim n As Long '��������ڵ���


'��ʼ��һ���ߵĸ�������
Function init()
    'WindowState = 2 '�������
    AutoRedraw = True ' �Զ��ػ�
    W = 200
    currentDirect = 39 'Ĭ�������˶�
    n = 5
    ReDim sno(n) As Node
    
    '��ʼ��������ɫ
    Randomize
    Dim R%, G%, B%
    R = Int(Rnd * 256)
    G = Int(Rnd * 256)
    B = Int(Rnd * 256)
    '��ʼ�����������
    Dim i%
    For i = 0 To UBound(sno) Step 1
        sno(i).D = currentDirect
        sno(i).X = ScaleWidth / 2 + i * W
        sno(i).Y = ScaleHeight / 2
        '��ʼ��������ɫ
        sno(i).C.R = R
        sno(i).C.G = G
        sno(i).C.B = B
    Next i
'��ʼ��ʳ������
Call rndFood


End Function
'��ʳ��
Function drawFood()
    Line (goods.X, goods.Y)-(goods.X + W, goods.Y + W), RGB(goods.C.R, goods.C.G, goods.C.B), BF
End Function
'�������һ��ʳ���ڴ�����
Function rndFood()
        Randomize
    goods.X = Int(Rnd * (ScaleWidth - W))
    goods.Y = Int(Rnd * (ScaleHeight - W))
    goods.C.R = Int(Rnd * 256)
    goods.C.G = Int(Rnd * 256)
    goods.C.B = Int(Rnd * 256)
End Function
'��һ����
Function drowsSnake()
    Cls
    Dim i As Long
    For i = 0 To UBound(sno) Step 1
        Line (sno(i).X, sno(i).Y)-(sno(i).X + W, sno(i).Y + W), RGB(sno(i).C.R, sno(i).C.G, sno(i).C.B), BF
    Next i
End Function

Private Sub Form_KeyPress(KeyAscii As Integer)
If KeyAscii = 32 And timer1.Enabled = True Then
    timer1.Enabled = False '��ͣ��Ϸ
    lbinfo.Visible = True
    
Else
    timer1.Enabled = True '��ʼ��Ϸ
    lbinfo.Visible = False
End If
End Sub

Private Sub Form_KeyUp(KeyCode As Integer, Shift As Integer)
    If Abs(currentDirect - KeyCode) <> 2 And Abs(currentDirect - KeyCode) < 4 Then currentDirect = KeyCode
End Sub

Private Sub Form_Load()
Call init
Call drowsSnake
'��ʱ�ӿؼ����г�ʼ��
Set timer1 = Controls.Add("vb.timer", "timer1")
timer1.Interval = 100
timer1.Enabled = True
'�Է�����ǩ���г�ʼ��
Set lbscore = Controls.Add("vb.label", "lbscore")
lbscore.AutoSize = True
lbscore.BackStyle = vbTransparent
lbscore.Visible = True
lbscore.Caption = "�÷֣�" & score
lbscore.Move 100, 100
'����Ϣ��ǩ���г�ʼ����
Set lbinfo = Controls.Add("vb.label", "lbinfo")
lbinfo.AutoSize = True
lbinfo.BackStyle = vbTransparent
lbinfo.Visible = False
lbinfo.Caption = "��ͣ"
lbinfo.FontSize = 20

lbinfo.Move ScaleWidth / 2 - lbinfo.Width / 2, ScaleHeight / 2 - lbinfo.Height / 2
End Sub
'�˶�˼·������ͷ�ڵ㣬ɾ��β�ڵ�
Function sport()
    Dim i%
    '��ÿһ���ڵ��������ǰ�ƶ�һλ
    For i = 1 To UBound(sno) Step 1
        sno(i - 1) = sno(i)
        
    Next i
'��ͷ�ڵ㣬Ҳ������������һλ���¸�ֵ
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



'�ߵ��˶�
Private Sub timer1_Timer()
Call sport
Call drowsSnake
'�ж��Ƿ�ײ������
If isCrashWall Then
    If MsgBox("�Ƿ������", vbYesNo, "��Ϸ������") = vbYes Then
        Call init
    Else
        End
    End If
End If
'��ʳ��
Call drawFood
'�ж��Ƿ�Ե�ʳ��
If isEatFood Then
    '��������
    n = n + 1
    score = score + 1 '���ӷ���
    lbscore.Caption = "�÷֣�" & score
    ReDim Preserve sno(n)
    'ͷ�����
    
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
    'β�����
    '�ƶ����ݣ�����һ��
    Dim i As Long
    For i = n To 1 Step -1
        sno(i) = sno(i - 1)
    Next i
    '�ڵ�һ���������
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
    '�ı�ͷ����һ�ڵ���ɫ
    
    sno(n).C.R = goods.C.R
    sno(n).C.G = goods.C.G
    sno(n).C.B = goods.C.B
    '�ٴ��������ʳ��
    
    Call rndFood
End If
End Sub

'�Ƿ�ײ�������Ե��ײ������true���������false
Function isCrashWall() As Boolean
    isCrashWall = False
    If sno(UBound(sno)).X + W > ScaleWidth _
    Or sno(UBound(sno)).X < 0 _
    Or sno(UBound(sno)).Y < 0 _
    Or sno(UBound(sno)).Y + W > ScaleHeight Then
        isCrashWall = True 'ײ����
        
    End If
End Function
'�Ƿ�Ե�ʳ�true��ʾ�Ե���false��ʾû�Ե�
Function isEatFood()
    'Ĭ��û�гԵ�
    isEatFood = False
    '�ж��Ƿ�Ե��������ж���ͷ��ʳ���Ƿ���ײ
    If sno(UBound(sno)).X + W > goods.X _
        And sno(UBound(sno)).X < goods.X + W _
        And sno(UBound(sno)).Y + W > goods.Y _
        And sno(UBound(sno)).Y < goods.Y Then
        
        isEatFood = True
        
    End If
    
    
End Function

























