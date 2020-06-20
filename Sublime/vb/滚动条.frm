VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   6570
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   9360
   LinkTopic       =   "Form1"
   ScaleHeight     =   6570
   ScaleWidth      =   9360
   StartUpPosition =   3  '窗口缺省
   Begin VB.VScrollBar VScroll1 
      Height          =   3615
      Left            =   5520
      Max             =   255
      TabIndex        =   1
      Top             =   360
      Width           =   255
   End
   Begin VB.HScrollBar HScroll1 
      Height          =   255
      Left            =   1080
      Max             =   255
      TabIndex        =   0
      Top             =   3720
      Width           =   4455
   End
   Begin VB.Label lbwords 
      Caption         =   "张靖"
      Height          =   3255
      Left            =   1320
      TabIndex        =   4
      Top             =   480
      Width           =   4335
   End
   Begin VB.Label Label2 
      Caption         =   "字体"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   10.5
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   255
      Left            =   1200
      TabIndex        =   3
      Top             =   4080
      Width           =   495
   End
   Begin VB.Label Label1 
      Caption         =   "颜色"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   12
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   600
      Left            =   5880
      TabIndex        =   2
      Top             =   360
      Width           =   360
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub HScroll1_Change()
lbwords.FontSize = HScroll1.Value
End Sub

Private Sub VScroll1_Change()
lbwords.ForeColor = RGB(0, 0, VScroll1.Value)
End Sub
