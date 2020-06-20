VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "小工具"
   ClientHeight    =   7575
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   13650
   LinkTopic       =   "Form1"
   ScaleHeight     =   7575
   ScaleWidth      =   13650
   StartUpPosition =   3  '窗口缺省
   Begin VB.Frame Frame3 
      Caption         =   "信息提示"
      Height          =   1815
      Left            =   8160
      TabIndex        =   8
      Top             =   2640
      Width           =   3375
      Begin VB.Label Label3 
         BackColor       =   &H00000000&
         Height          =   495
         Index           =   0
         Left            =   1920
         TabIndex        =   10
         Top             =   720
         Width           =   1215
      End
      Begin VB.Label Label2 
         Alignment       =   2  'Center
         Caption         =   "当前颜色"
         BeginProperty Font 
            Name            =   "宋体"
            Size            =   18
            Charset         =   134
            Weight          =   700
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Index           =   0
         Left            =   0
         TabIndex        =   9
         Top             =   720
         Width           =   1695
      End
   End
   Begin VB.Frame Frame2 
      Caption         =   "录入区域"
      Height          =   2655
      Left            =   2280
      TabIndex        =   4
      Top             =   4560
      Width           =   8895
      Begin VB.CommandButton Command2 
         Caption         =   "清屏"
         Height          =   495
         Left            =   5880
         TabIndex        =   7
         Top             =   1560
         Width           =   2655
      End
      Begin VB.CommandButton Command1 
         Caption         =   "录入"
         Height          =   615
         Left            =   5880
         TabIndex        =   6
         Top             =   840
         Width           =   2655
      End
      Begin VB.TextBox Text1 
         Height          =   1455
         Left            =   720
         MultiLine       =   -1  'True
         ScrollBars      =   3  'Both
         TabIndex        =   5
         Text            =   "frame控件.frx":0000
         Top             =   840
         Width           =   4815
      End
   End
   Begin VB.Frame Frame1 
      Caption         =   "色块"
      ForeColor       =   &H00FF8080&
      Height          =   2295
      Left            =   8160
      TabIndex        =   0
      Top             =   0
      Width           =   3375
      Begin VB.Label Label3 
         BackColor       =   &H00FF8080&
         Height          =   495
         Index           =   2
         Left            =   2160
         TabIndex        =   3
         Top             =   600
         Width           =   495
      End
      Begin VB.Label Label2 
         BackColor       =   &H0000FF00&
         Height          =   495
         Index           =   1
         Left            =   1320
         TabIndex        =   2
         Top             =   600
         Width           =   495
      End
      Begin VB.Label Label1 
         BackColor       =   &H000080FF&
         Height          =   495
         Index           =   0
         Left            =   600
         TabIndex        =   1
         Top             =   600
         Width           =   495
      End
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
Print Text1.Text
End Sub

Private Sub Frame4_DragDrop(Source As Control, X As Single, Y As Single)

End Sub

Private Sub Command2_Click()
Cls
End Sub

Private Sub Label1_Click(Index As Integer)
ForeColor = Label1(0).BackColor
Label3(0).BackColor = Label1(0).BackColor

End Sub



Private Sub Label2_Click(Index As Integer)
ForeColor = Label2(1).BackColor
Label3(0).BackColor = Label2(1).BackColor
End Sub

Private Sub Label3_Click(Index As Integer)
ForeColor = Label3(2).BackColor
Label3(0).BackColor = Label3(2).BackColor
End Sub
