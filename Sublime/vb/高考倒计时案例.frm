VERSION 5.00
Begin VB.Form Form2 
   Caption         =   "高考倒计时"
   ClientHeight    =   9135
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   14940
   LinkTopic       =   "Form2"
   ScaleHeight     =   9135
   ScaleWidth      =   14940
   StartUpPosition =   3  '窗口缺省
   Begin VB.Timer Timer2 
      Interval        =   1000
      Left            =   0
      Top             =   1680
   End
   Begin VB.CommandButton Command1 
      Caption         =   "设置结束时间"
      Height          =   615
      Left            =   12720
      TabIndex        =   1
      Top             =   0
      Width           =   2295
   End
   Begin VB.Timer Timer1 
      Interval        =   1000
      Left            =   0
      Top             =   1320
   End
   Begin VB.Label Label4 
      Caption         =   "Label4"
      Height          =   495
      Left            =   12720
      TabIndex        =   4
      Top             =   600
      Visible         =   0   'False
      Width           =   2175
   End
   Begin VB.Label Label3 
      AutoSize        =   -1  'True
      Caption         =   "高考倒计时"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   42
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   840
      Left            =   4200
      TabIndex        =   3
      Top             =   1680
      Width           =   4200
   End
   Begin VB.Label Label2 
      Alignment       =   2  'Center
      BackColor       =   &H00FF8080&
      Caption         =   "123"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   72
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00FFFFFF&
      Height          =   5415
      Left            =   0
      TabIndex        =   2
      Top             =   3240
      Width           =   14895
   End
   Begin VB.Label Label1 
      Alignment       =   2  'Center
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   18
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   1320
      Left            =   30
      TabIndex        =   0
      Top             =   0
      Width           =   6795
   End
End
Attribute VB_Name = "Form2"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False


Private Sub Command1_Click()
Form3.Show
End Sub

Private Sub Form_Load()
Label4.Caption = DateAdd("h", 3, Now)
End Sub

Private Sub Timer1_Timer()
Label1.Caption = "现在的时间：" & Now
End Sub

Private Sub Timer2_Timer()
Dim s As Double
s = DateDiff("s", Now, CDate(Label4.Caption))
Dim d As Double
Dim h As Double
Dim m As Double
Dim sec As Double
d = s \ 86400
h = s \ 3600
m = (s - h * 3600) \ 60
sec = s - d * 86400 - h * 3600 - m * 60
Label2.Caption = d & "天" & h & "时" & m & "分" & sec & "秒"
End Sub
