VERSION 5.00
Begin VB.Form Form2 
   BorderStyle     =   1  'Fixed Single
   Caption         =   "Form2"
   ClientHeight    =   6555
   ClientLeft      =   45
   ClientTop       =   390
   ClientWidth     =   5010
   LinkTopic       =   "Form2"
   MaxButton       =   0   'False
   MinButton       =   0   'False
   ScaleHeight     =   6555
   ScaleWidth      =   5010
   StartUpPosition =   2  '屏幕中心
   Begin VB.CommandButton Command1 
      Caption         =   "更新"
      Height          =   735
      Left            =   960
      TabIndex        =   5
      Top             =   4320
      Width           =   3375
   End
   Begin VB.TextBox Text1 
      Height          =   495
      Left            =   1800
      TabIndex        =   1
      Top             =   2760
      Width           =   2655
   End
   Begin VB.TextBox Text2 
      Height          =   495
      IMEMode         =   3  'DISABLE
      Left            =   1800
      PasswordChar    =   "*"
      TabIndex        =   0
      Top             =   3480
      Width           =   2655
   End
   Begin VB.Label Label4 
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   15
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   2760
      TabIndex        =   6
      Top             =   1920
      Width           =   1575
   End
   Begin VB.Label Label3 
      AutoSize        =   -1  'True
      Caption         =   "唯一编码"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   18
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   360
      Left            =   840
      TabIndex        =   4
      Top             =   1920
      Width           =   1500
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      Caption         =   "账号"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   18
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   360
      Left            =   840
      TabIndex        =   3
      Top             =   2760
      Width           =   750
   End
   Begin VB.Label Label2 
      AutoSize        =   -1  'True
      Caption         =   "密码"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   18
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   360
      Left            =   840
      TabIndex        =   2
      Top             =   3480
      Width           =   750
   End
End
Attribute VB_Name = "Form2"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Option Explicit
Dim conn As New ADODB.Connection
Dim rs As ADODB.Recordset
Dim sql As String

Public Sub Command1_Click()
    If conn.State = 0 Then
        conn.ConnectionString = "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & App.Path & "\数据库\Database3.mdb;Persist Security Info=False"
        conn.Open
    End If
    '更新数据库
    Set rs = New ADODB.Recordset
    sql = "update [users] set [username] = '" & Text1.Text & "' ,[password]='" & Text1.Text & "' where id=" & Label4.Caption
    rs.Open sql, conn, adOpenKeyset, adLockBatchOptimistic
    '更新mshflexgrid
    'Call Form1.Command2_Click '不能实时更新
    Form1.MSHFlexGrid1.TextMatrix(Form1.MSHFlexGrid1.Row, 1) = Text1.Text
    Form1.MSHFlexGrid1.TextMatrix(Form1.MSHFlexGrid1.Row, 2) = Text2.Text
    Unload Form2
    
    
End Sub

Private Sub Form_Load()
    Label4.Caption = Form1.MSHFlexGrid1.TextMatrix(Form1.MSHFlexGrid1.Row, 0)
    Text1.Text = Form1.MSHFlexGrid1.TextMatrix(Form1.MSHFlexGrid1.Row, 1)
    Text2.Text = Form1.MSHFlexGrid1.TextMatrix(Form1.MSHFlexGrid1.Row, 1)
End Sub


