VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   5715
   ClientLeft      =   120
   ClientTop       =   465
   ClientWidth     =   8310
   LinkTopic       =   "Form1"
   ScaleHeight     =   5715
   ScaleWidth      =   8310
   StartUpPosition =   3  '窗口缺省
   Begin VB.CommandButton Command1 
      Caption         =   "Command1"
      Height          =   735
      Left            =   2280
      TabIndex        =   0
      Top             =   4680
      Width           =   2655
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False


Private Sub Command1_Click()
Dim x As Integer
x = InputBox("")
If x Mod 2 = 0 Then
MsgBox "偶数"
Else
    MsgBox "奇数"
End If

    

End Sub

