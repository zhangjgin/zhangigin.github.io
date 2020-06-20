VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   3135
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   4680
   LinkTopic       =   "Form1"
   ScaleHeight     =   3135
   ScaleWidth      =   4680
   StartUpPosition =   3  '窗口缺省
   Begin VB.Label Label1 
      Caption         =   "Label1"
      Height          =   1935
      Left            =   1680
      TabIndex        =   0
      Top             =   1200
      Width           =   3015
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Label1_Click()
Show
Dim text As String
text = "编程创造城市a"
Print text
Print Len(text)
Print LenB(StrConv(text, vbFromUnicode))
Print LenB(text)


Exit Sub


text = text & "张靖"
Print text

Dim author As String
author = "zhangjing"
Print author & "   ," & "biancheng"

End Sub
