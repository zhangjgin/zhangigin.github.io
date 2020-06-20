VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   5250
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   8595
   LinkTopic       =   "Form1"
   ScaleHeight     =   5250
   ScaleWidth      =   8595
   StartUpPosition =   3  '窗口缺省
   Begin VB.CommandButton Command2 
      Caption         =   "结束"
      Height          =   615
      Left            =   5520
      TabIndex        =   3
      Top             =   1560
      Width           =   1695
   End
   Begin VB.CommandButton Command1 
      Caption         =   "开始"
      Height          =   615
      Left            =   5520
      TabIndex        =   2
      Top             =   480
      Width           =   1695
   End
   Begin VB.TextBox Text1 
      Height          =   495
      Left            =   2640
      TabIndex        =   0
      Text            =   "1000"
      Top             =   480
      Width           =   2415
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      Caption         =   "天猫交易额"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   15.75
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   315
      Left            =   720
      TabIndex        =   1
      Top             =   600
      Width           =   1650
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim flag As Boolean
Private Sub Command1_Click()
flag = True
Dim i As Double
While flag
Text1.Text = Val(Text1.Text) + 1
DoEvents
Wend
End Sub

Private Sub Command2_Click()
    flag = False
End Sub
