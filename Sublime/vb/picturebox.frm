VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   8310
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   14730
   LinkTopic       =   "Form1"
   ScaleHeight     =   8310
   ScaleWidth      =   14730
   StartUpPosition =   3  '¥∞ø⁄»± °
   Begin VB.CommandButton Command1 
      Caption         =   " ‰»Î"
      Height          =   495
      Left            =   9480
      TabIndex        =   2
      Top             =   2520
      Width           =   2415
   End
   Begin VB.TextBox Text1 
      Height          =   1335
      Left            =   8400
      TabIndex        =   1
      Text            =   "Text1"
      Top             =   600
      Width           =   4815
   End
   Begin VB.PictureBox Picture1 
      Height          =   4335
      Left            =   960
      Picture         =   "picturebox.frx":0000
      ScaleHeight     =   4275
      ScaleWidth      =   5955
      TabIndex        =   0
      Top             =   480
      Width           =   6015
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
Dim n%
n = n + 1
If n Mod 2 = 0 Then
    
Else
    Picture1.Print ""
End If
 Picture1.Print Text1.Text
End Sub
