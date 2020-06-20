VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "语音闹钟"
   ClientHeight    =   7080
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   12495
   LinkTopic       =   "Form1"
   ScaleHeight     =   7080
   ScaleWidth      =   12495
   StartUpPosition =   3  '窗口缺省
   Begin VB.Timer Timer1 
      Interval        =   1000
      Left            =   10800
      Top             =   240
   End
   Begin VB.CommandButton Command2 
      Caption         =   "重新设置"
      Height          =   1455
      Left            =   9000
      TabIndex        =   7
      Top             =   2640
      Width           =   1815
   End
   Begin VB.CommandButton Command1 
      Caption         =   "确定设置"
      Height          =   1455
      Left            =   6720
      TabIndex        =   5
      Top             =   2640
      Width           =   1815
   End
   Begin VB.TextBox textclock 
      Height          =   495
      Index           =   1
      Left            =   2520
      TabIndex        =   4
      Top             =   3480
      Width           =   3495
   End
   Begin VB.TextBox textclock 
      Height          =   495
      Index           =   0
      Left            =   2520
      TabIndex        =   2
      Top             =   2640
      Width           =   3495
   End
   Begin VB.TextBox Text1 
      Height          =   2175
      Left            =   600
      TabIndex        =   0
      Text            =   "请输入语音文本..."
      Top             =   240
      Width           =   10215
   End
   Begin VB.Label Label3 
      Alignment       =   2  'Center
      Caption         =   "现在时间：2020/5/7 9:34"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   42
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   1575
      Left            =   720
      TabIndex        =   6
      Top             =   4320
      Width           =   10095
   End
   Begin VB.Label Label2 
      AutoSize        =   -1  'True
      Caption         =   "第二个闹钟"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   14.25
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   285
      Left            =   840
      TabIndex        =   3
      Top             =   3600
      Width           =   1425
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      Caption         =   "第一个闹钟"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   14.25
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   285
      Left            =   840
      TabIndex        =   1
      Top             =   2760
      Width           =   1425
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False

Private Sub Command1_Click()
textclock(0).Enabled = False
textclock(1).Enabled = False
Text1.Enabled = False
Timer1.Enabled = True
End Sub

Private Sub Command2_Click()
textclock(0).Enabled = True
textclock(1).Enabled = True
Text1.Enabled = True
Timer1.Enabled = False
End Sub

Private Sub Form_Load()
textclock(0).Text = DateAdd("n", 1, Now)
textclock(1).Text = DateAdd("h", 6, Now)
End Sub

Private Sub Timer1_Timer()
Label3.Caption = "现在时间:" & Now
Dim i%
For i = 0 To textclock.UBound Step 1
    If textclock(i).Text = CStr(Now) Then
'        MsgBox "第" & i + 1 & "个闹钟开始"
    Dim o As Object
    Set o = CreateObject("SAPI.SpVoice")
    o.speak (Text1.Text)
    End If
Next i
End Sub
