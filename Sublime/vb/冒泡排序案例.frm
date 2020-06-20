VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "冒泡排序法"
   ClientHeight    =   5835
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   9195
   LinkTopic       =   "Form1"
   ScaleHeight     =   5835
   ScaleWidth      =   9195
   StartUpPosition =   3  '窗口缺省
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Form_Load()
Show

Dim n As Variant
n = Array(45, 78, 23, 12, 67)
'计算数组长度
Dim length As Integer
length = UBound(n) - LBound(n) + 1

Dim str As String
Dim i As Integer
For i = 0 To length - 1 Step 1
    str = str & n(i) & " "
Next i
Print "原数据 " & str
 
 '冒泡排序
Dim j As Integer
Dim m As Integer
m = length - 1 - 1
For i = 1 To length - 1 Step 1
For j = 0 To m Step 1
    If n(j) > n(j + 1) Then
    Dim temp As Integer
    temp = n(j)
    n(j) = n(j + 1)
    n(j + 1) = temp

End If
Next j
m = m - 1

Next i

str = " "
For i = 0 To length - 1 Step 1
    str = str & n(i) & " "
Next i
Print "排序后 " & str
End Sub
