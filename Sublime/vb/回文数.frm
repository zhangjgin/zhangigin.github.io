VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   4995
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   8490
   LinkTopic       =   "Form1"
   ScaleHeight     =   4995
   ScaleWidth      =   8490
   StartUpPosition =   3  '窗口缺省
   Begin VB.TextBox Text2 
      Height          =   2655
      Left            =   360
      MultiLine       =   -1  'True
      ScrollBars      =   2  'Vertical
      TabIndex        =   2
      Text            =   "回文数.frx":0000
      Top             =   360
      Width           =   7695
   End
   Begin VB.CommandButton Command1 
      Caption         =   "提交"
      Height          =   495
      Left            =   5400
      TabIndex        =   1
      Top             =   3840
      Width           =   1815
   End
   Begin VB.TextBox Text1 
      Height          =   495
      Left            =   3480
      TabIndex        =   0
      Text            =   "1000"
      Top             =   3840
      Width           =   1815
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      Caption         =   "数字范围"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   10.5
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   210
      Left            =   2400
      TabIndex        =   3
      Top             =   3960
      Width           =   900
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
Dim s$, i&
Text2.Text = ""
For i = 0 To Val(Text1.Text) Step 1
    '判断是不是回文数
    If CStr(i) = StrReverse(CStr(i)) Then
        Text2.Text = Text2.Text & i & ","
    End If
Next i
End Sub
