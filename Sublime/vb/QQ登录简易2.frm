VERSION 5.00
Begin VB.Form Form2 
   Caption         =   "Form2"
   ClientHeight    =   9390
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   16260
   LinkTopic       =   "Form2"
   ScaleHeight     =   9390
   ScaleWidth      =   16260
   StartUpPosition =   3  '窗口缺省
   Begin VB.Label Label1 
      Alignment       =   2  'Center
      BackColor       =   &H000000FF&
      Caption         =   "成功登录"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   99.75
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   4095
      Left            =   2640
      TabIndex        =   0
      Top             =   1440
      Width           =   9855
   End
End
Attribute VB_Name = "Form2"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Form_Load()
Unload Form1
End Sub
