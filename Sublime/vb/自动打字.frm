VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   4785
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   8985
   LinkTopic       =   "Form1"
   ScaleHeight     =   4785
   ScaleWidth      =   8985
   StartUpPosition =   3  '窗口缺省
   Begin VB.CommandButton Command2 
      Caption         =   "文字变大"
      Height          =   375
      Left            =   6840
      TabIndex        =   3
      Top             =   4320
      Width           =   1095
   End
   Begin VB.Timer Timer1 
      Enabled         =   0   'False
      Interval        =   300
      Left            =   4080
      Top             =   4320
   End
   Begin VB.TextBox Text1 
      Height          =   615
      Left            =   2760
      TabIndex        =   1
      Text            =   "编程创造城市"
      Top             =   3480
      Width           =   3495
   End
   Begin VB.CommandButton Command1 
      Caption         =   "开始打字"
      Height          =   495
      Index           =   0
      Left            =   6600
      TabIndex        =   0
      Top             =   3600
      Width           =   1215
   End
   Begin VB.Label Label1 
      Alignment       =   2  'Center
      Caption         =   "请输入文字"
      Height          =   375
      Left            =   600
      TabIndex        =   2
      Top             =   3600
      Width           =   1695
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim i As Integer
Private Sub Command1_Click(Index As Integer)
If Timer1.Enabled = False Then
    Timer1.Enabled = True
    Text1.Enabled = False
    Command1(0).Caption = "停止打字"
Else
    Timer1.Enabled = False
    Text1.Enabled = True
    Command1(0).Caption = "开始打字"

End If
End Sub

Private Sub Command2_Click()
Form1.FontSize = FontSize + 10

End Sub

Private Sub Timer1_Timer()

i = i + 1
If i > Len(Text1.Text) Then
    Timer1.Enabled = False
    Exit Sub
    End If
    Cls
Print Mid(Text1.Text, 1, i) & "_"
End Sub
