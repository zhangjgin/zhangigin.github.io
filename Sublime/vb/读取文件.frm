VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   7035
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   12510
   LinkTopic       =   "Form1"
   ScaleHeight     =   7035
   ScaleWidth      =   12510
   StartUpPosition =   3  '窗口缺省
   Begin VB.CommandButton Command5 
      Caption         =   "读取"
      Height          =   975
      Left            =   7680
      TabIndex        =   6
      Top             =   4800
      Width           =   2895
   End
   Begin VB.ListBox List1 
      Height          =   3840
      Left            =   240
      TabIndex        =   5
      Top             =   3000
      Width           =   5655
   End
   Begin VB.CommandButton Command4 
      Caption         =   "覆盖写入"
      Height          =   975
      Left            =   7680
      TabIndex        =   4
      Top             =   3120
      Width           =   2895
   End
   Begin VB.CommandButton Command3 
      Caption         =   "追加写入"
      Height          =   975
      Left            =   7680
      TabIndex        =   3
      Top             =   1560
      Width           =   2895
   End
   Begin VB.TextBox Text1 
      Height          =   975
      Left            =   7680
      TabIndex        =   2
      Top             =   240
      Width           =   3015
   End
   Begin VB.CommandButton Command2 
      Caption         =   "文件路径"
      Height          =   975
      Left            =   240
      TabIndex        =   1
      Top             =   1680
      Width           =   2535
   End
   Begin VB.CommandButton Command1 
      Caption         =   "DO"
      Height          =   975
      Left            =   240
      TabIndex        =   0
      Top             =   360
      Width           =   2535
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
Dim n%
n = 1
Do Until i = 10
    Print i
    i = i + 1
Loop
End Sub

Private Sub Command2_Click()
Print App.Path
End Sub


Private Sub Command3_Click()
Open App.Path & "/zhangjing.text" For Append As #1
    Print #1, Text1.Text
    
Close #1
End Sub

Private Sub Command4_Click()
Open App.Path & "/zhangjing.text" For Output As #1
    Print #1, Text1.Text
    
Close #1
End Sub

Private Sub Command5_Click()
Open App.Path & "/zhangjing.text" For Input As #1
    List1.Clear
    Dim t$
Do Until EOF(1)
    Line Input #1, t
    List1.AddItem t
Loop
Close #1
End Sub
