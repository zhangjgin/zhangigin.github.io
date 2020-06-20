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
    Dim x As String, a As String, b As String, y As String
    x = "computer"                       '假设该字符串x内容为"computer"
    a = Left(x, 1)                       '取左边一个字符
    b = Right(x, 1)                      '取右边一个字符
    y = a & b                            '连接起来
    Print "新组成的字符串: " & y         '显示处理的结果
End Sub

