VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   5685
   ClientLeft      =   165
   ClientTop       =   810
   ClientWidth     =   9225
   LinkTopic       =   "Form1"
   ScaleHeight     =   5685
   ScaleWidth      =   9225
   StartUpPosition =   3  '窗口缺省
   Begin VB.CommandButton Command2 
      Caption         =   "查询"
      Height          =   495
      Left            =   2040
      TabIndex        =   7
      Top             =   3480
      Width           =   1335
   End
   Begin VB.CommandButton Command1 
      Caption         =   "添加数据"
      Height          =   615
      Left            =   600
      TabIndex        =   6
      Top             =   3360
      Width           =   1215
   End
   Begin VB.CommandButton cmdcancel 
      Caption         =   "取消"
      Height          =   615
      Left            =   2040
      TabIndex        =   5
      Top             =   2520
      Width           =   1215
   End
   Begin VB.CommandButton cmdok 
      Caption         =   "确定"
      Height          =   615
      Left            =   600
      TabIndex        =   4
      Top             =   2520
      Width           =   1095
   End
   Begin VB.TextBox txtpassword 
      Height          =   495
      IMEMode         =   3  'DISABLE
      Left            =   2040
      PasswordChar    =   "*"
      TabIndex        =   3
      Top             =   1560
      Width           =   2895
   End
   Begin VB.TextBox txtusername 
      Height          =   495
      Left            =   2040
      TabIndex        =   2
      Top             =   840
      Width           =   2895
   End
   Begin VB.Label password 
      AutoSize        =   -1  'True
      Caption         =   "密码："
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   15
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   300
      Left            =   840
      TabIndex        =   1
      Top             =   1680
      Width           =   900
   End
   Begin VB.Label username 
      AutoSize        =   -1  'True
      Caption         =   "用户："
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   15
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   300
      Left            =   840
      TabIndex        =   0
      Top             =   960
      Width           =   900
   End
   Begin VB.Menu shouye 
      Caption         =   "首页"
   End
   Begin VB.Menu guanyu 
      Caption         =   "关于"
      Begin VB.Menu ruanjian 
         Caption         =   "软件设计"
      End
      Begin VB.Menu VB 
         Caption         =   "VB"
      End
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Option Explicit
Const maxlogtimes As Integer = 3
Dim conn As New ADODB.Connection '声明并创建连接对象
Dim rs As ADODB.Recordset '声明连接对象
Dim sql$
 
Private Sub cmdcancel_Click()
 
        Dim intresult As Integer
        
        intresult = MsgBox("你选择了推出系统登录，退出将不能启动管理系统！" & vbCrLf _
        & "是否真的退出？", vbYesNo, "登录验证")
        
        If intresult = vbYes Then End
    
 
End Sub
 
Private Function check_password(ByVal username As String, ByVal password As String) As Byte

    On Error GoTo gperror
      
    Dim objcn As New Connection, objrs As New Recordset, strcn As String
      
    Dim strsql As String
      
        objcn.ConnectionString = "Provider=Microsoft.Jet.OLEDB.3.51;" & "Data Source=" & App.Path & "\实例2.mdb"
            
                objcn.Open
             
                strsql = "select 口令 from 系统用户 where 用户名='" & username & "'"
             
                Set objrs.ActiveConnection = objcn
             
                objrs.Open (strsql)
             
                If objrs.EOF Then
            
                    check_password = 0
                
            Else
              
                    If password <> Trim(objrs.Fields("口令").Value) Then
               
                        check_password = 1
                    
                    Else
                    
                        check_password = 2
                     
                    End If
     
            End If
          
        objcn.Close
             
             
        Set objrs = Nothing
        
        Set objcn = Nothing
        
        Exit Function
        
gperror:
        
        check_password = 255
        
        Set objrs = Nothing
        
        Set objcn = Nothing
        
End Function
 
 
Private Sub cmdok_Click()
 
        Static intlogtimes As Integer '保存用户请求登录次数
        
        Dim intchecked As Integer, strname As String, strpassword As String
        
        intlogtimes = intlogtimes + 1
        
        If intlogtimes > maxlogtimes Then
               
                '超过允许登录次数，显示提示信息
                
                MsgBox "你已经超过允许验证次数！" & vbCr _
                           & "应用程序将结束！", vbCritical, "登录验证"
                           
               End
                  
         
        Else
        
            strname = Trim(txtusername.Text)
            
            strpassword = Trim(txtpassword.Text)
            
            '检验用户名和口令的合法性
            
            Select Case check_password(strname, strpassword)
          
        
          Case 0
    
             MsgBox "<" & strname & _
             ">不是系统用户，请检查用户名输入是否正确！", vbCritical, "登录验证"
             
               txtusername.SetFocus
               
               txtusername.SelStart = 0
               
               txtusername.SelLength = Len(txtusername)
               
          Case 1
             
               
                MsgBox "口令错误，请重新输入！", vbCritical, "登录验证"
                
               txtpassword = ""
               
                txtpassword.SetFocus
                
        Case 2
               
                Unload Me
                
                 MsgBox "登录成功，将启动系统程序！", vbInformation, "登录验证"
                 Form2.Show
               
       
       Case Else
             
               MsgBox "登录验证未正常完场！，请重新运行登录程序," & vbCrLf
               
           
         End Select
           
          
      End If
           
  End Sub

Private Sub Command1_Click()
 If conn.State = 0 Then
    conn.ConnectionString = "Provider=Microsoft.Jet.OLEDB.3.51;" & "Data Source=" & App.Path & "\实例2.mdb;Persist Security Info=False"
    conn.Open '打开数据库
 End If
 'SQL插入语句
  sql = "insert into [系统用户]([用户名],[口令]) values('" & txtusername.Text & "','" & txtpassword.Text & "')"
  '创建数据集对象的连接
  Set rs = New ADODB.Recordset
  rs.Open sql, conn, adOpenKeyset, adLockBatchOptimistic
End Sub

Private Sub Command2_Click()
Form3.Show
End Sub

Private Sub ruanjian_Click()
Form5.Show
End Sub

Private Sub shouye_Click()
Form4.Show
End Sub

Private Sub VB_Click()
Form5.Show
End Sub
