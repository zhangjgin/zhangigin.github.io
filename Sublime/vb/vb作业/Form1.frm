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
   StartUpPosition =   3  '����ȱʡ
   Begin VB.CommandButton Command2 
      Caption         =   "��ѯ"
      Height          =   495
      Left            =   2040
      TabIndex        =   7
      Top             =   3480
      Width           =   1335
   End
   Begin VB.CommandButton Command1 
      Caption         =   "�������"
      Height          =   615
      Left            =   600
      TabIndex        =   6
      Top             =   3360
      Width           =   1215
   End
   Begin VB.CommandButton cmdcancel 
      Caption         =   "ȡ��"
      Height          =   615
      Left            =   2040
      TabIndex        =   5
      Top             =   2520
      Width           =   1215
   End
   Begin VB.CommandButton cmdok 
      Caption         =   "ȷ��"
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
      Caption         =   "���룺"
      BeginProperty Font 
         Name            =   "����"
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
      Caption         =   "�û���"
      BeginProperty Font 
         Name            =   "����"
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
      Caption         =   "��ҳ"
   End
   Begin VB.Menu guanyu 
      Caption         =   "����"
      Begin VB.Menu ruanjian 
         Caption         =   "������"
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
Dim conn As New ADODB.Connection '�������������Ӷ���
Dim rs As ADODB.Recordset '�������Ӷ���
Dim sql$
 
Private Sub cmdcancel_Click()
 
        Dim intresult As Integer
        
        intresult = MsgBox("��ѡ�����Ƴ�ϵͳ��¼���˳���������������ϵͳ��" & vbCrLf _
        & "�Ƿ�����˳���", vbYesNo, "��¼��֤")
        
        If intresult = vbYes Then End
    
 
End Sub
 
Private Function check_password(ByVal username As String, ByVal password As String) As Byte

    On Error GoTo gperror
      
    Dim objcn As New Connection, objrs As New Recordset, strcn As String
      
    Dim strsql As String
      
        objcn.ConnectionString = "Provider=Microsoft.Jet.OLEDB.3.51;" & "Data Source=" & App.Path & "\ʵ��2.mdb"
            
                objcn.Open
             
                strsql = "select ���� from ϵͳ�û� where �û���='" & username & "'"
             
                Set objrs.ActiveConnection = objcn
             
                objrs.Open (strsql)
             
                If objrs.EOF Then
            
                    check_password = 0
                
            Else
              
                    If password <> Trim(objrs.Fields("����").Value) Then
               
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
 
        Static intlogtimes As Integer '�����û������¼����
        
        Dim intchecked As Integer, strname As String, strpassword As String
        
        intlogtimes = intlogtimes + 1
        
        If intlogtimes > maxlogtimes Then
               
                '���������¼��������ʾ��ʾ��Ϣ
                
                MsgBox "���Ѿ�����������֤������" & vbCr _
                           & "Ӧ�ó��򽫽�����", vbCritical, "��¼��֤"
                           
               End
                  
         
        Else
        
            strname = Trim(txtusername.Text)
            
            strpassword = Trim(txtpassword.Text)
            
            '�����û����Ϳ���ĺϷ���
            
            Select Case check_password(strname, strpassword)
          
        
          Case 0
    
             MsgBox "<" & strname & _
             ">����ϵͳ�û��������û��������Ƿ���ȷ��", vbCritical, "��¼��֤"
             
               txtusername.SetFocus
               
               txtusername.SelStart = 0
               
               txtusername.SelLength = Len(txtusername)
               
          Case 1
             
               
                MsgBox "����������������룡", vbCritical, "��¼��֤"
                
               txtpassword = ""
               
                txtpassword.SetFocus
                
        Case 2
               
                Unload Me
                
                 MsgBox "��¼�ɹ���������ϵͳ����", vbInformation, "��¼��֤"
                 Form2.Show
               
       
       Case Else
             
               MsgBox "��¼��֤δ�����곡�������������е�¼����," & vbCrLf
               
           
         End Select
           
          
      End If
           
  End Sub

Private Sub Command1_Click()
 If conn.State = 0 Then
    conn.ConnectionString = "Provider=Microsoft.Jet.OLEDB.3.51;" & "Data Source=" & App.Path & "\ʵ��2.mdb;Persist Security Info=False"
    conn.Open '�����ݿ�
 End If
 'SQL�������
  sql = "insert into [ϵͳ�û�]([�û���],[����]) values('" & txtusername.Text & "','" & txtpassword.Text & "')"
  '�������ݼ����������
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
