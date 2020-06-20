VERSION 5.00
Begin VB.Form Form3 
   Caption         =   "字符串处理函数"
   ClientHeight    =   6690
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   13305
   LinkTopic       =   "Form3"
   ScaleHeight     =   6690
   ScaleWidth      =   13305
   StartUpPosition =   3  '窗口缺省
   Begin VB.CommandButton Command5 
      Caption         =   "InStrRev"
      Height          =   855
      Left            =   11280
      TabIndex        =   7
      Top             =   1320
      Width           =   1815
   End
   Begin VB.CommandButton Command4 
      Caption         =   "InStr"
      Height          =   855
      Left            =   8760
      TabIndex        =   6
      Top             =   1320
      Width           =   1815
   End
   Begin VB.TextBox Text1 
      Height          =   615
      Left            =   2880
      TabIndex        =   4
      Top             =   2760
      Width           =   2415
   End
   Begin VB.CommandButton Command3 
      Caption         =   "Lcase"
      Height          =   855
      Left            =   6240
      TabIndex        =   2
      Top             =   1320
      Width           =   1815
   End
   Begin VB.CommandButton Command2 
      Caption         =   "Ucase"
      Height          =   855
      Left            =   3240
      TabIndex        =   1
      Top             =   1320
      Width           =   1815
   End
   Begin VB.CommandButton Command1 
      Caption         =   "join"
      Height          =   855
      Left            =   480
      TabIndex        =   0
      Top             =   1320
      Width           =   1815
   End
   Begin VB.Label Label2 
      Caption         =   "只能输入数字"
      Height          =   255
      Left            =   3360
      TabIndex        =   5
      Top             =   2520
      Width           =   1095
   End
   Begin VB.Label Label1 
      Alignment       =   2  'Center
      Caption         =   "验证码"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   15.75
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   600
      TabIndex        =   3
      Top             =   2880
      Width           =   1815
   End
End
Attribute VB_Name = "Form3"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
Dim n() As Variant
n = Array(11, 222, 33, 45, 34, 54)
Print Join(n, "/")
End Sub

Private Sub Command2_Click()
Dim s$, b$
s = "asdfdsaghafdgsdg"

Print UCase(s)

End Sub

Private Sub Command3_Click()
Dim s$
s = "ADGAGVASDGFASFD"
Print LCase(s)
End Sub


Private Sub Command4_Click()
Dim s$
s = "as12f32"
Print InStr(1, s, "f", vbBinaryCompare)


End Sub

Private Sub Command5_Click()
Dim s$
s = "sfasdfaswd"
Print InStrRev(s, "w", 10, vbBinaryCompare)

End Sub

Private Sub Text1_KeyUp(KeyCode As Integer, Shift As Integer)
If Not (Text1.Text = CStr(Val(Text1.Text))) Then
    MsgBox "内容不合法"
    Text1.Text = ""
End If
End Sub
