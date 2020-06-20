VERSION 5.00
Object = "{6BF52A50-394A-11D3-B153-00C04F79FAA6}#1.0#0"; "wmp.dll"
Begin VB.Form Form1 
   Caption         =   "Mp3音乐闹钟"
   ClientHeight    =   8190
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   8325
   LinkTopic       =   "Form1"
   ScaleHeight     =   8190
   ScaleWidth      =   8325
   StartUpPosition =   3  '窗口缺省
   Begin VB.CommandButton Command3 
      Caption         =   "暂停"
      Height          =   615
      Left            =   3600
      TabIndex        =   9
      Top             =   7080
      Width           =   1695
   End
   Begin VB.TextBox Text1 
      Height          =   615
      Left            =   2640
      TabIndex        =   8
      Top             =   2160
      Width           =   4575
   End
   Begin VB.OptionButton Option3 
      Caption         =   "自定义时间"
      Height          =   495
      Left            =   480
      TabIndex        =   7
      Top             =   2160
      Width           =   1815
   End
   Begin VB.PictureBox Picture1 
      Height          =   2655
      Left            =   360
      ScaleHeight     =   2595
      ScaleWidth      =   7155
      TabIndex        =   6
      Top             =   3000
      Width           =   7215
   End
   Begin VB.CommandButton Command2 
      Caption         =   "设置时间"
      Height          =   495
      Left            =   5160
      TabIndex        =   5
      Top             =   1440
      Width           =   2055
   End
   Begin VB.OptionButton Option2 
      Caption         =   "十秒后开始"
      Height          =   495
      Left            =   2760
      TabIndex        =   4
      Top             =   1440
      Width           =   1815
   End
   Begin VB.OptionButton Option1 
      Caption         =   "五秒后开始"
      Height          =   495
      Left            =   480
      TabIndex        =   3
      Top             =   1440
      Width           =   1815
   End
   Begin VB.Timer Timer1 
      Interval        =   1000
      Left            =   2760
      Top             =   7200
   End
   Begin VB.CommandButton Command1 
      Caption         =   "播放音乐"
      Height          =   615
      Left            =   600
      TabIndex        =   1
      Top             =   7080
      Width           =   1695
   End
   Begin VB.Label Label1 
      Caption         =   "现在时间："
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   14.25
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   1095
      Left            =   360
      TabIndex        =   2
      Top             =   0
      Width           =   7095
   End
   Begin WMPLibCtl.WindowsMediaPlayer WindowsMediaPlayer1 
      Height          =   615
      Left            =   480
      TabIndex        =   0
      Top             =   6000
      Width           =   6735
      URL             =   ""
      rate            =   1
      balance         =   0
      currentPosition =   0
      defaultFrame    =   ""
      playCount       =   1
      autoStart       =   -1  'True
      currentMarker   =   0
      invokeURLs      =   -1  'True
      baseURL         =   ""
      volume          =   50
      mute            =   0   'False
      uiMode          =   "full"
      stretchToFit    =   0   'False
      windowlessVideo =   0   'False
      enabled         =   -1  'True
      enableContextMenu=   -1  'True
      fullScreen      =   0   'False
      SAMIStyle       =   ""
      SAMILang        =   ""
      SAMIFilename    =   ""
      captioningID    =   ""
      enableErrorDialogs=   0   'False
      _cx             =   11880
      _cy             =   1085
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Option Explicit
Dim start As Date
Private Sub Command1_Click()
 WindowsMediaPlayer1.URL = App.Path & "/音乐/a.mp3"
End Sub



Private Sub Command2_Click()
If Command2.Caption = "重新设置" Then
    Option1.Enabled = True
    Option2.Enabled = True
    Option3.Enabled = True
    Command2.Caption = "设置时间"
    Picture1.Cls
    Exit Sub
   
End If
If Option1.Value = True Then
    start = DateAdd("s", 5, Now)
    Picture1.Print start & "开始播放音乐"
ElseIf Option2.Value = True Then
    start = DateAdd("s", 10, Now)
    Picture1.Print start & "开始播放音乐"
ElseIf Option3.Value = True Then
    start = CDate(Text1.Text)
    Picture1.Print start & "开始播放音乐"
Else
    MsgBox "请选择时间"
    Exit Sub
End If
Option1.Enabled = False
Option2.Enabled = False
Option3.Enabled = True
Command2.Caption = "重新设置"
End Sub

Private Sub Command3_Click()
If Command3.Caption = "暂停" Then
    WindowsMediaPlayer1.Controls.pause
    Command3.Caption = "继续播放"
ElseIf Command3.Caption = "继续播放" Then
    WindowsMediaPlayer1.Controls.play
    Command3.Caption = "暂停"
End If
End Sub

Private Sub Option3_Click()
    Text1.Text = Now
End Sub

Private Sub Timer1_Timer()
    Label1.Caption = "现在时间：" & Now
    If Now = start Then
        WindowsMediaPlayer1.URL = App.Path & "/音乐/a.mp3"
    End If
End Sub
