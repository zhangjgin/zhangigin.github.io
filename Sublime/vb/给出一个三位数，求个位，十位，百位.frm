VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   5085
   ClientLeft      =   120
   ClientTop       =   465
   ClientWidth     =   8355
   LinkTopic       =   "Form1"
   ScaleHeight     =   5085
   ScaleWidth      =   8355
   StartUpPosition =   3  '窗口缺省
   Begin VB.CommandButton Command1 
      Caption         =   "Command1"
      Height          =   855
      Left            =   2400
      TabIndex        =   0
      Top             =   3720
      Width           =   2415
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
'给出一个三位数，求个位，十位，百位
Dim x As Integer
x = InputBox("")
Print x Mod 10 '个位
Print x \ 10 Mod 10 '十位
Print x \ 100 '百位


End Sub

