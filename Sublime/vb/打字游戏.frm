VERSION 5.00
Begin VB.Form Form2 
   Caption         =   "打字游戏"
   ClientHeight    =   6675
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   9705
   LinkTopic       =   "Form2"
   ScaleHeight     =   6675
   ScaleWidth      =   9705
   StartUpPosition =   3  '窗口缺省
   Begin VB.CommandButton Command1 
      Caption         =   "开始"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   15.75
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   1095
      Left            =   2880
      TabIndex        =   0
      Top             =   2040
      Width           =   3135
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      Caption         =   "百度一下，你就知道"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   26.25
         Charset         =   134
         Weight          =   400
         Underline       =   -1  'True
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00FF0000&
      Height          =   525
      Left            =   2160
      TabIndex        =   1
      Top             =   4080
      Width           =   4725
   End
End
Attribute VB_Name = "Form2"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
Form1.Show
Unload Form2
End Sub

Private Sub Label1_Click()
Shell "explorer https://www.baidu.com"
End Sub
