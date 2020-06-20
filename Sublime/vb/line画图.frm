VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "line»­Í¼"
   ClientHeight    =   6570
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   10485
   LinkTopic       =   "Form1"
   ScaleHeight     =   6570
   ScaleWidth      =   10485
   StartUpPosition =   3  '´°¿ÚÈ±Ê¡
   Begin VB.CommandButton Command3 
      Caption         =   "»­ÊµÐÄ¾ØÐÎ"
      Height          =   735
      Left            =   7320
      TabIndex        =   2
      Top             =   4680
      Width           =   1335
   End
   Begin VB.CommandButton Command2 
      Caption         =   "»­¿ÕÐÄ¾ØÐÎ"
      Height          =   735
      Left            =   7320
      TabIndex        =   1
      Top             =   3480
      Width           =   1335
   End
   Begin VB.CommandButton Command1 
      Caption         =   "»­Í¼"
      Height          =   735
      Left            =   7320
      TabIndex        =   0
      Top             =   2280
      Width           =   1335
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
Line (100, 100)-(1000, 1000)
Line (1000, 1000)-(2000, 1000), vbRed
Line (3000, 1000)-(3600, 1000)
Line (3600, 1000)-(4000, 500)
End Sub

Private Sub Command2_Click()
Line (2000, 1000)-(3000, 2000), , B
End Sub

Private Sub Command3_Click()
Line (2200, 1200)-(2400, 1400), vbBlue, BF
Line (2600, 1200)-(2800, 1400), vbBlue, BF
Line (2300, 1600)-(2700, 1700), vbBlue, BF
End Sub
