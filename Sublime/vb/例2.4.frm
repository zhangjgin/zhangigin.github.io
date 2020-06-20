VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   3090
   ClientLeft      =   60
   ClientTop       =   450
   ClientWidth     =   4680
   LinkTopic       =   "Form1"
   ScaleHeight     =   3090
   ScaleWidth      =   4680
   StartUpPosition =   3  '窗口缺省
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Form_Click()
   Dim a As Integer, b As Integer, c As Integer
   Randomize
   a = Int(90 * Rnd + 10)      '产生[10,99]区间内的随机整数
   b = Int(90 * Rnd + 10)
   c = a + b                   '求两数之和
   Print "产生的两个随机数: "; a, b
   Print "和数: "; c
End Sub

