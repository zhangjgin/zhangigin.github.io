VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   4740
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   7440
   LinkTopic       =   "Form1"
   ScaleHeight     =   4740
   ScaleWidth      =   7440
   StartUpPosition =   3  '窗口缺省
   Begin VB.TextBox Text2 
      Height          =   615
      Left            =   2640
      TabIndex        =   2
      Top             =   600
      Width           =   1455
   End
   Begin VB.TextBox Text1 
      Height          =   615
      Left            =   240
      TabIndex        =   1
      Top             =   600
      Width           =   1455
   End
   Begin VB.CommandButton Command1 
      Caption         =   "sub"
      Height          =   735
      Left            =   4320
      TabIndex        =   0
      Top             =   480
      Width           =   1575
   End
   Begin VB.Label Label1 
      Alignment       =   2  'Center
      Caption         =   "+"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   26.25
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   1800
      TabIndex        =   3
      Top             =   600
      Width           =   615
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
    Dim i%
    i = mul(Val(Text1.Text), Val(Text2.Text))
    Print i
    If i > 20 Then Print "你真棒"
    Exit Sub
    Call calc(Val(Text1.Text), Val(Text2.Text))
    
    Call hello
End Sub
Sub hello()
    Print "HelloWorld"
End Sub
Sub calc(a As Integer, b As Integer)
    Dim c%
    c = a + b
    Print c
End Sub
Function mul(a As Integer, b As Integer) As Integer
    mul = a + b
    
End Function
