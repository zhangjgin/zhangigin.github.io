VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "求解最大公约数和最小公倍数 "
   ClientHeight    =   6480
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   9960
   LinkTopic       =   "Form1"
   ScaleHeight     =   6480
   ScaleWidth      =   9960
   StartUpPosition =   3  '窗口缺省
   Begin VB.CommandButton Command2 
      Caption         =   "求最小公倍数"
      Height          =   375
      Left            =   7440
      TabIndex        =   5
      Top             =   360
      Width           =   1575
   End
   Begin VB.CommandButton Command1 
      Caption         =   "求最大公约数"
      Height          =   375
      Left            =   5520
      TabIndex        =   4
      Top             =   360
      Width           =   1575
   End
   Begin VB.TextBox Text2 
      Height          =   375
      Left            =   3480
      TabIndex        =   3
      Top             =   360
      Width           =   1455
   End
   Begin VB.TextBox Text1 
      Height          =   375
      Left            =   960
      TabIndex        =   1
      Top             =   360
      Width           =   1455
   End
   Begin VB.Label Label2 
      AutoSize        =   -1  'True
      Caption         =   "数B"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   15
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   300
      Left            =   2760
      TabIndex        =   2
      Top             =   360
      Width           =   450
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      Caption         =   "数A"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   15
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   300
      Left            =   240
      TabIndex        =   0
      Top             =   360
      Width           =   450
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False


Private Sub Command1_Click()
Dim A As Long
Dim B As Long
A = Val(Text1.Text)
B = Val(Text2.Text)
Dim Z As Long
Z = func(A, B)
MsgBox "最大公约数为 " & CStr(Z)

End Sub

Private Sub Command2_Click()
'最小公倍数
Dim A As Long
Dim B As Long
A = Val(Text1.Text)
B = Val(Text2.Text)
Dim Z As Long
Z = func(A, B)
MsgBox Val(Text1.Text) * Val(Text2.Text) / Z
End Sub
Function func(A As Long, B As Long) As Long
'求解最大公约数
'假设最终存放的数，A中是较大的数，B中是较小的数
    If A < B Then
        Dim t As Long
        t = A
        A = B
        B = t
    End If

Dim R As Long
'使用辗转相除法或欧几里得算法
R = A Mod B
Do While R <> 0
    A = R
    If A < B Then
        Dim t1 As Long
        t1 = A
        A = B
        B = t1
    End If
    R = A Mod B
Loop
func = B
End Function
