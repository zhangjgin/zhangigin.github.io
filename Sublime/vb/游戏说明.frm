VERSION 5.00
Begin VB.Form Form2 
   Caption         =   "游戏说明"
   ClientHeight    =   4920
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   7995
   LinkTopic       =   "Form2"
   ScaleHeight     =   4920
   ScaleWidth      =   7995
   StartUpPosition =   2  '屏幕中心
   Begin VB.CommandButton Command1 
      Caption         =   "开始游戏"
      Height          =   855
      Left            =   2280
      TabIndex        =   1
      Top             =   2400
      Width           =   2175
   End
   Begin VB.Label Label1 
      Caption         =   "拖动绿色方块并吃掉红色方块游戏胜利！！！"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   15
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   1695
      Left            =   1440
      TabIndex        =   0
      Top             =   120
      Width           =   3975
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
