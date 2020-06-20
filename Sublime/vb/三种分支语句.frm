VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "三种分支语句"
   ClientHeight    =   6360
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   9435
   LinkTopic       =   "Form1"
   ScaleHeight     =   6360
   ScaleWidth      =   9435
   StartUpPosition =   3  '窗口缺省
   Begin VB.CommandButton Command4 
      Caption         =   "？"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   21.75
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   1215
      Left            =   600
      TabIndex        =   4
      Top             =   2400
      Width           =   3015
   End
   Begin VB.CommandButton Command3 
      Caption         =   "select case"
      Height          =   1215
      Left            =   4680
      TabIndex        =   3
      Top             =   4080
      Width           =   3015
   End
   Begin VB.CommandButton Command2 
      Caption         =   "elseif"
      Height          =   1215
      Left            =   4680
      TabIndex        =   2
      Top             =   2160
      Width           =   3015
   End
   Begin VB.CommandButton Command1 
      Caption         =   "if"
      Height          =   1215
      Left            =   4680
      TabIndex        =   1
      Top             =   240
      Width           =   3015
   End
   Begin VB.TextBox Text1 
      Height          =   1095
      Left            =   720
      TabIndex        =   0
      Top             =   360
      Width           =   2895
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
Dim n%
n = Val(Text1.Text)
If n >= 90 And n <= 100 Then
    MsgBox "优秀"
End If
If n >= 60 And n < 90 Then
    MsgBox "及格"
End If
If n >= 0 And n < 60 Then
    MsgBox "不及格"
End If
If n > 100 Then
    MsgBox "不合法"
End If
End Sub

Private Sub Command2_Click()
Dim n%
n = Val(Text1.Text)
If n >= 90 And n <= 100 Then
    MsgBox "优秀"
ElseIf n >= 60 And n < 90 Then
    MsgBox "及格"
ElseIf n >= 0 And n < 60 Then
    MsgBox "不及格"
Else
    MsgBox "不合法"
End If
End Sub

Private Sub Command3_Click()
Dim n%
n = Val(Text1.Text)
Select Case n
    Case 90, 100
        MsgBox "优秀"
    Case 60 To 90
        MsgBox "及格"
    Case 0 To 60
        MsgBox "不及格"
    Case Is > 100
        MsgBox "不合法"
End Select
End Sub

Private Sub Command4_Click()
Dim str$
str = Text1.Text
Select Case str
    Case "a" To "z"
        MsgBox "小写字母"
    Case "A" To "Z"
        MsgBox "大写字母"
    Case "0" To "100000000000"
        MsgBox "数字"
    Case Else
        MsgBox "What?"
End Select
End Sub
