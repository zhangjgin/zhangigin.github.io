VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "vb6 split函数"
   ClientHeight    =   7935
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   11985
   LinkTopic       =   "Form1"
   ScaleHeight     =   7935
   ScaleWidth      =   11985
   StartUpPosition =   3  '窗口缺省
   Begin VB.CommandButton Command10 
      Caption         =   "Second"
      Height          =   615
      Left            =   6360
      TabIndex        =   9
      Top             =   4440
      Width           =   1815
   End
   Begin VB.CommandButton Command9 
      Caption         =   "Minute"
      Height          =   615
      Left            =   6360
      TabIndex        =   8
      Top             =   3720
      Width           =   1815
   End
   Begin VB.CommandButton Command8 
      Caption         =   "Day"
      Height          =   615
      Left            =   6360
      TabIndex        =   7
      Top             =   3000
      Width           =   1815
   End
   Begin VB.CommandButton Command7 
      Caption         =   "Month"
      Height          =   615
      Left            =   6360
      TabIndex        =   6
      Top             =   2280
      Width           =   1815
   End
   Begin VB.CommandButton Command6 
      Caption         =   "Year"
      Height          =   615
      Left            =   6360
      TabIndex        =   5
      Top             =   1560
      Width           =   1815
   End
   Begin VB.Timer Timer1 
      Interval        =   1000
      Left            =   360
      Top             =   4680
   End
   Begin VB.CommandButton Command5 
      Caption         =   "北京时间"
      Height          =   615
      Left            =   2520
      TabIndex        =   4
      Top             =   4440
      Width           =   1815
   End
   Begin VB.CommandButton Command4 
      Caption         =   "datediff"
      Height          =   615
      Left            =   2520
      TabIndex        =   3
      Top             =   3720
      Width           =   1815
   End
   Begin VB.CommandButton Command3 
      Caption         =   "custom time"
      Height          =   615
      Left            =   2520
      TabIndex        =   2
      Top             =   3000
      Width           =   1815
   End
   Begin VB.CommandButton Command2 
      Caption         =   "time"
      Height          =   615
      Left            =   2520
      TabIndex        =   1
      Top             =   2280
      Width           =   1815
   End
   Begin VB.CommandButton Command1 
      Caption         =   "date"
      Height          =   615
      Left            =   2520
      TabIndex        =   0
      Top             =   1560
      Width           =   1815
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
Print Date
End Sub

Private Sub Command10_Click()
Print Second(Now)
End Sub

Private Sub Command2_Click()
Print Time
End Sub

Private Sub Command3_Click()
Dim d1 As Date
d1 = #2/12/2019 5:02:00 AM#
Print d1
Dim d2 As Date
d2 = CDate("2019-3-12 14:13:15")
Print d2
End Sub

Private Sub Command4_Click()
Dim d1 As Date
d1 = #2/12/2019 5:02:00 AM#
Print d1
Dim d2 As Date
d2 = CDate("2019-3-12 14:13:15")
Print d2
Print DateDiff("s", d1, d2)
End Sub

Private Sub Command5_Click()
Cls
Print Now
Print Date & " " & Time
Print "求明天的这个时候" & " " & DateAdd("d", 1, Now)
Print "求今天的这个时候" & " " & DateAdd("d", 0, Now)
Print "求昨天的这个时候" & " " & DateAdd("d", -1, Now)
Print Weekday(Now, vbFriday)
End Sub

Private Sub Command6_Click()
Print Year(Now)
End Sub

Private Sub Command7_Click()
Print Month(Now)
End Sub

Private Sub Command8_Click()
Print Day(Now)
End Sub

Private Sub Command9_Click()
Print Minute(Now)
End Sub

Private Sub Timer1_Timer()
Call Command5_Click
End Sub
