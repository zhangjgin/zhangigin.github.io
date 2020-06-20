VERSION 5.00
Begin VB.Form Form1 
   ClientHeight    =   6750
   ClientLeft      =   120
   ClientTop       =   465
   ClientWidth     =   9495
   LinkTopic       =   "Form1"
   ScaleHeight     =   6750
   ScaleWidth      =   9495
   StartUpPosition =   3  '窗口缺省
   Begin VB.CommandButton Command2 
      Caption         =   "蓝色"
      Height          =   735
      Left            =   6000
      TabIndex        =   2
      Top             =   4920
      Width           =   2415
   End
   Begin VB.TextBox Text1 
      Height          =   1335
      Left            =   2160
      TabIndex        =   1
      Top             =   1680
      Width           =   3855
   End
   Begin VB.CommandButton Command1 
      Caption         =   "绿色"
      Height          =   855
      Left            =   600
      TabIndex        =   0
      Top             =   4800
      Width           =   3375
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
Text1.BackColor = vbGreen

End Sub

Private Sub Command2_Click()
Text1.BackColor = vbBlue

End Sub
