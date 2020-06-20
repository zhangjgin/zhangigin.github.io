VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   5925
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   9630
   LinkTopic       =   "Form1"
   ScaleHeight     =   5925
   ScaleWidth      =   9630
   StartUpPosition =   3  '´°¿ÚÈ±Ê¡
   Begin VB.CommandButton Command2 
      Caption         =   "goto"
      Height          =   855
      Left            =   5040
      TabIndex        =   1
      Top             =   2640
      Width           =   2655
   End
   Begin VB.CommandButton Command1 
      Caption         =   "Command1"
      Height          =   855
      Left            =   5040
      TabIndex        =   0
      Top             =   840
      Width           =   2655
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
On Error Resume Next
Print 1 / 0
Print "×¯´ï·Æ"
End Sub

Private Sub Command2_Click()
GoTo web:
Print "º«·Æ"
web:
Print "×¯´ï·Æ"
End Sub
