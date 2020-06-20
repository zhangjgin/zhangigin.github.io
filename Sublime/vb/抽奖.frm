VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   7995
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   12525
   LinkTopic       =   "Form1"
   ScaleHeight     =   7995
   ScaleWidth      =   12525
   StartUpPosition =   3  '窗口缺省
   Begin VB.Timer Timer1 
      Enabled         =   0   'False
      Interval        =   1
      Left            =   7440
      Top             =   720
   End
   Begin VB.Label Label3 
      Alignment       =   2  'Center
      BackColor       =   &H000000C0&
      Caption         =   "停止"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   50.25
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   975
      Left            =   1080
      TabIndex        =   2
      Top             =   5040
      Width           =   3495
   End
   Begin VB.Label Label2 
      Alignment       =   2  'Center
      BackColor       =   &H00FF8080&
      Caption         =   "0"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   200.25
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00C00000&
      Height          =   4455
      Left            =   4800
      TabIndex        =   1
      Top             =   1560
      Width           =   5895
   End
   Begin VB.Label Label1 
      Alignment       =   2  'Center
      BackColor       =   &H000080FF&
      Caption         =   "点击变化"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   80.25
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H0080C0FF&
      Height          =   3255
      Left            =   1080
      TabIndex        =   0
      Top             =   1560
      Width           =   3495
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False


Private Sub Label1_Click()
Timer1.Enabled = True




End Sub



Private Sub Label2_Click()

End Sub

Private Sub Label3_Click()
Timer1.Enabled = False
End Sub

Private Sub Timer1_Timer()
Randomize
Label2.Caption = Int(Rnd * 100) + 1

End Sub
