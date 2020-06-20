VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   7530
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   11325
   LinkTopic       =   "Form1"
   ScaleHeight     =   7530
   ScaleWidth      =   11325
   StartUpPosition =   3  '窗口缺省
   Begin VB.Frame Frame3 
      Caption         =   "课程"
      Height          =   1095
      Left            =   600
      TabIndex        =   11
      Top             =   5400
      Width           =   5535
      Begin VB.CheckBox Check1 
         Caption         =   "C++"
         Height          =   375
         Index           =   2
         Left            =   3360
         TabIndex        =   14
         Top             =   480
         Width           =   975
      End
      Begin VB.CheckBox Check1 
         Caption         =   "java"
         Height          =   375
         Index           =   1
         Left            =   1560
         TabIndex        =   13
         Top             =   480
         Width           =   975
      End
      Begin VB.CheckBox Check1 
         Caption         =   "VB"
         Height          =   375
         Index           =   0
         Left            =   240
         TabIndex        =   12
         Top             =   480
         Width           =   975
      End
   End
   Begin VB.Frame Frame2 
      Caption         =   "颜色"
      Height          =   1095
      Left            =   600
      TabIndex        =   7
      Top             =   3960
      Width           =   5535
      Begin VB.OptionButton opcolor 
         Caption         =   "蓝色"
         ForeColor       =   &H00C00000&
         Height          =   495
         Index           =   3
         Left            =   4200
         TabIndex        =   10
         Top             =   360
         Width           =   855
      End
      Begin VB.OptionButton opcolor 
         Caption         =   "绿色"
         ForeColor       =   &H0000C000&
         Height          =   495
         Index           =   2
         Left            =   2760
         TabIndex        =   9
         Top             =   360
         Width           =   1095
      End
      Begin VB.OptionButton opcolor 
         Caption         =   "红色"
         ForeColor       =   &H000000FF&
         Height          =   495
         Index           =   5
         Left            =   1560
         TabIndex        =   1
         Top             =   360
         Width           =   855
      End
      Begin VB.OptionButton opcolor 
         Caption         =   "黄色"
         ForeColor       =   &H0000C0C0&
         Height          =   495
         Index           =   0
         Left            =   360
         TabIndex        =   8
         Top             =   360
         Width           =   855
      End
   End
   Begin VB.Frame Frame1 
      Caption         =   "字体"
      Height          =   1095
      Left            =   600
      TabIndex        =   2
      Top             =   2400
      Width           =   5535
      Begin VB.OptionButton Option1 
         Caption         =   "宋体"
         Height          =   495
         Index           =   0
         Left            =   360
         TabIndex        =   6
         Top             =   360
         Width           =   855
      End
      Begin VB.OptionButton Option1 
         Caption         =   "隶书"
         Height          =   495
         Index           =   1
         Left            =   1560
         TabIndex        =   5
         Top             =   360
         Width           =   855
      End
      Begin VB.OptionButton Option1 
         Caption         =   "微软雅黑"
         Height          =   495
         Index           =   2
         Left            =   2760
         TabIndex        =   4
         Top             =   360
         Width           =   1095
      End
      Begin VB.OptionButton Option1 
         Caption         =   "幼圆"
         Height          =   495
         Index           =   3
         Left            =   4200
         TabIndex        =   3
         Top             =   360
         Width           =   855
      End
   End
   Begin VB.TextBox Text1 
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   36
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   1815
      Left            =   240
      MultiLine       =   -1  'True
      ScrollBars      =   2  'Vertical
      TabIndex        =   0
      Text            =   "单选框与复选框.frx":0000
      Top             =   360
      Width           =   6975
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False


Private Sub Check1_Click(Index As Integer)
Text1.Text = Text1.Text & "," & Check1(Index).Caption
If InStr(1, Check1(Index).Caption, "java", vbBinaryCompare) > 0 Then
    MsgBox "选中了java课程"
End If
End Sub

Private Sub opcolor_Click(Index As Integer)
    Text1.ForeColor = opcolor(Index).ForeColor
End Sub

Private Sub Option1_Click(Index As Integer)
    Text1.FontName = Option1(Index).Caption
End Sub
