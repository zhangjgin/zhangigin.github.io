VERSION 5.00
Begin VB.Form Form1 
   BorderStyle     =   0  'None
   Caption         =   "Form1"
   ClientHeight    =   6150
   ClientLeft      =   0
   ClientTop       =   0
   ClientWidth     =   7980
   LinkTopic       =   "Form1"
   Picture         =   "QQµÇÂ¼.frx":0000
   ScaleHeight     =   6150
   ScaleWidth      =   7980
   ShowInTaskbar   =   0   'False
   StartUpPosition =   3  '´°¿ÚÈ±Ê¡
   Begin VB.PictureBox Picture1 
      Height          =   1335
      Left            =   3360
      Picture         =   "QQµÇÂ¼.frx":4786
      ScaleHeight     =   1275
      ScaleWidth      =   1275
      TabIndex        =   7
      Top             =   1680
      Width           =   1335
   End
   Begin VB.TextBox Text2 
      Height          =   375
      IMEMode         =   3  'DISABLE
      Left            =   1800
      PasswordChar    =   "*"
      TabIndex        =   4
      Text            =   "*"
      Top             =   3960
      Width           =   4575
   End
   Begin VB.TextBox Text1 
      Height          =   495
      Left            =   1800
      TabIndex        =   3
      Text            =   "921095085"
      Top             =   3240
      Width           =   4455
   End
   Begin VB.OptionButton Option2 
      Caption         =   "¼Ç×¡ÃÜÂë"
      Height          =   375
      Left            =   3600
      TabIndex        =   2
      Top             =   4560
      Width           =   1215
   End
   Begin VB.OptionButton Option1 
      Caption         =   "×Ô¶¯µÇÂ¼"
      Height          =   375
      Left            =   1800
      TabIndex        =   1
      Top             =   4560
      Width           =   1335
   End
   Begin VB.CommandButton Command1 
      Caption         =   "µÇÂ¼"
      Height          =   615
      Left            =   1800
      TabIndex        =   0
      Top             =   5160
      Width           =   4455
   End
   Begin VB.Label Label2 
      Caption         =   "ÕÒ»ØÃÜÂë"
      Height          =   375
      Left            =   5280
      TabIndex        =   6
      Top             =   4560
      Width           =   855
   End
   Begin VB.Label Label1 
      Caption         =   "×¢²áÕËºÅ"
      Height          =   375
      Left            =   240
      TabIndex        =   5
      Top             =   5640
      Width           =   975
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
    MsgBox "¹§Ï²ÄãµÇÂ¼³É¹¦£¡"
End Sub

