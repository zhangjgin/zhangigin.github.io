VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   4770
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   7575
   LinkTopic       =   "Form1"
   ScaleHeight     =   4770
   ScaleWidth      =   7575
   StartUpPosition =   3  '窗口缺省
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Form_Load()
Show
'打印菱形
'Dim i%, j%
'For i = 0 To 5 Step 1
'    '输出空格
'    For j = 1 To 5 - i Step 1
'        Print " ";
'    Next j
'
'    '输出*
'    For j = 1 To 2 * i + 1 Step 1
'        Print "*";
'    Next j
'    Print
'Next i
'
'For i = 4 To 0 Step -1
'    '输出空格
'    For j = 1 To 5 - i Step 1
'        Print " ";
'    Next j
'
'    '输出*
'    For j = 1 To 2 * i + 1 Step 1
'        Print "*";
'    Next j
'    Print
'Next i
'打印数字菱形
Dim i&, j&
For i = 0 To 5 Step 1
    '输出空格
    For j = 1 To 5 - i Step 1
        Print " ";
    Next j
    
    '输出*
    Dim k&
    k = 1
    For j = 1 To 2 * i + 1 Step 1
        Print Format(k, "@");
        
        If j <= Int((2 * i + 1) / 2) Then
            k = k + 1
        Else
            k = k - 1
        End If
    Next j
    Print
Next i


For i = 4 To 0 Step -1
    '输出空格
    For j = 1 To 5 - i Step 1
        Print " ";
    Next j
    
    '输出*
    Dim p&
    p = 1
    For j = 1 To 2 * i + 1 Step 1
        Print Format(p, "@");
        
        If j <= Int((2 * i + 1) / 2) Then
            p = p + 1
        Else
            p = p - 1
        End If
    Next j
    Print
Next i
End Sub
