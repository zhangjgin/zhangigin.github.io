VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   5160
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   8865
   LinkTopic       =   "Form1"
   ScaleHeight     =   5160
   ScaleWidth      =   8865
   StartUpPosition =   3  '窗口缺省
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Form_Load()
Show
Dim n As Integer
n = 567
Print "数值是 " & n

Dim n1%, n2%, n3%
n1 = n \ 100
n2 = (n Mod 100) \ 10
n3 = n Mod 100 Mod 10
Print n1, n2, n3
End Sub
