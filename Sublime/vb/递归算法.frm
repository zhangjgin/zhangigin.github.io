VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   4995
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   8550
   LinkTopic       =   "Form1"
   ScaleHeight     =   4995
   ScaleWidth      =   8550
   StartUpPosition =   3  '窗口缺省
   Begin VB.CommandButton Command3 
      Caption         =   "递归"
      Height          =   615
      Left            =   5040
      TabIndex        =   4
      Top             =   3360
      Width           =   1935
   End
   Begin VB.CommandButton Command2 
      Caption         =   "do until"
      Height          =   615
      Left            =   3000
      TabIndex        =   3
      Top             =   3360
      Width           =   1935
   End
   Begin VB.TextBox Text1 
      Height          =   2535
      Left            =   240
      MultiLine       =   -1  'True
      ScrollBars      =   2  'Vertical
      TabIndex        =   2
      Top             =   360
      Width           =   8055
   End
   Begin VB.CommandButton Command1 
      Caption         =   "for"
      Height          =   615
      Left            =   960
      TabIndex        =   0
      Top             =   3360
      Width           =   1935
   End
   Begin VB.Label Label1 
      Caption         =   "输出1-100的所有自然数"
      Height          =   615
      Left            =   3000
      TabIndex        =   1
      Top             =   4080
      Width           =   1935
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim a%
Private Sub Command1_Click()
Dim i As Integer
For i = 1 To 100 Step 1
    Text1.Text = Text1.Text & i & ","
Next i
End Sub

Private Sub Command2_Click()
Text1.Text = ""
Dim i%
Do Until i = 100
    i = i + 1
    Text1.Text = Text1.Text & i & ","

Loop
End Sub

Private Sub Command3_Click()
If a < 100 Then
    a = a + 1
    Text1.Text = Text1.Text & a & ","
    Call Command3_Click
End If
End Sub
