VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   5655
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   10020
   LinkTopic       =   "Form1"
   ScaleHeight     =   5655
   ScaleWidth      =   10020
   StartUpPosition =   3  '����ȱʡ
   Begin VB.CommandButton Command3 
      Caption         =   "Command1"
      Height          =   735
      Left            =   4560
      TabIndex        =   2
      Top             =   3840
      Width           =   1095
   End
   Begin VB.CommandButton Command2 
      Caption         =   "Command1"
      Height          =   735
      Left            =   4560
      TabIndex        =   1
      Top             =   2760
      Width           =   1095
   End
   Begin VB.CommandButton Command1 
      Caption         =   "Command1"
      Height          =   735
      Left            =   4560
      TabIndex        =   0
      Top             =   1560
      Width           =   1095
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
Dim a As Long
Dim b As Long
a = CLng(InputBox("����������..."))
b = CLng(InputBox("����������..."))
Dim c As Long
c = a - b
If Sgn(c) = 1 Then
    MsgBox "��"
ElseIf Sgn(c) = -1 Then
    MsgBox "С"
ElseIf Sgn(c) = 0 Then
    MsgBox "���"
End If
End Sub

Private Sub Command2_Click()
Print CInt("12" & "2")
End Sub

Private Sub Command3_Click()
Print Round(Val(InputBox("���������֣�")), 2)
End Sub
