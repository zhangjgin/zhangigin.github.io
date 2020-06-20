VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "穷举法求素数"
   ClientHeight    =   7695
   ClientLeft      =   6780
   ClientTop       =   2100
   ClientWidth     =   5970
   LinkTopic       =   "Form1"
   ScaleHeight     =   7695
   ScaleWidth      =   5970
   Begin VB.TextBox Text2 
      Height          =   5295
      Left            =   120
      MultiLine       =   -1  'True
      TabIndex        =   3
      Top             =   2280
      Width           =   5535
   End
   Begin VB.Frame Frame1 
      Caption         =   "请输入素数范围"
      Height          =   1935
      Left            =   120
      TabIndex        =   0
      Top             =   120
      Width           =   5535
      Begin VB.CommandButton Command1 
         Caption         =   "求素数"
         Height          =   615
         Left            =   3240
         TabIndex        =   2
         Top             =   720
         Width           =   1695
      End
      Begin VB.TextBox Text1 
         Height          =   735
         Left            =   240
         TabIndex        =   1
         Text            =   "100"
         Top             =   600
         Width           =   2535
      End
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
Dim n As Long
n = Val(Text1.Text)
Dim i%, j%

For i = 2 To n Step 1
    Dim flag As Boolean
    flag = True
    For j = 2 To i - 1 Step 1
    If i Mod j = 0 Then flag = False
    Exit For
    Next j
    If flag = False Then Text2.Text = Text2.Text & i & ","
Next i
End Sub

