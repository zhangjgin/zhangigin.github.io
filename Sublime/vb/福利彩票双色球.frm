VERSION 5.00
Begin VB.Form Form2 
   Caption         =   "0"
   ClientHeight    =   8985
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   16065
   LinkTopic       =   "Form2"
   Picture         =   "福利彩票双色球.frx":0000
   ScaleHeight     =   8985
   ScaleWidth      =   16065
   StartUpPosition =   3  '窗口缺省
   Begin VB.Timer Timer1 
      Enabled         =   0   'False
      Interval        =   1
      Left            =   1680
      Top             =   6600
   End
   Begin VB.CommandButton Command1 
      Caption         =   "开奖"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   42
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   1215
      Left            =   5400
      TabIndex        =   7
      Top             =   5760
      Width           =   4575
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      BackStyle       =   0  'Transparent
      Caption         =   "0"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   60
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00FFFFFF&
      Height          =   1200
      Index           =   6
      Left            =   14160
      TabIndex        =   6
      Top             =   2400
      Width           =   615
   End
   Begin VB.Shape Shape1 
      BackColor       =   &H00FF0000&
      BackStyle       =   1  'Opaque
      Height          =   1815
      Index           =   6
      Left            =   13320
      Shape           =   3  'Circle
      Top             =   2160
      Width           =   2295
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      BackStyle       =   0  'Transparent
      Caption         =   "0"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   60
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00FFFFFF&
      Height          =   1200
      Index           =   5
      Left            =   12000
      TabIndex        =   5
      Top             =   2520
      Width           =   615
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      BackStyle       =   0  'Transparent
      Caption         =   "0"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   60
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00FFFFFF&
      Height          =   1200
      Index           =   4
      Left            =   9840
      TabIndex        =   4
      Top             =   2400
      Width           =   615
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      BackStyle       =   0  'Transparent
      Caption         =   "0"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   60
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00FFFFFF&
      Height          =   1200
      Index           =   3
      Left            =   7560
      TabIndex        =   3
      Top             =   2520
      Width           =   615
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      BackStyle       =   0  'Transparent
      Caption         =   "0"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   60
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00FFFFFF&
      Height          =   1200
      Index           =   2
      Left            =   5400
      TabIndex        =   2
      Top             =   2400
      Width           =   615
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      BackStyle       =   0  'Transparent
      Caption         =   "0"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   60
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00FFFFFF&
      Height          =   1200
      Index           =   1
      Left            =   3240
      TabIndex        =   1
      Top             =   2400
      Width           =   615
   End
   Begin VB.Shape Shape1 
      BackColor       =   &H000000FF&
      BackStyle       =   1  'Opaque
      Height          =   1815
      Index           =   5
      Left            =   11160
      Shape           =   3  'Circle
      Top             =   2160
      Width           =   2295
   End
   Begin VB.Shape Shape1 
      BackColor       =   &H000000FF&
      BackStyle       =   1  'Opaque
      Height          =   1815
      Index           =   4
      Left            =   8880
      Shape           =   3  'Circle
      Top             =   2160
      Width           =   2295
   End
   Begin VB.Shape Shape1 
      BackColor       =   &H000000FF&
      BackStyle       =   1  'Opaque
      Height          =   1815
      Index           =   3
      Left            =   6720
      Shape           =   3  'Circle
      Top             =   2160
      Width           =   2295
   End
   Begin VB.Shape Shape1 
      BackColor       =   &H000000FF&
      BackStyle       =   1  'Opaque
      Height          =   1815
      Index           =   2
      Left            =   4560
      Shape           =   3  'Circle
      Top             =   2160
      Width           =   2295
   End
   Begin VB.Shape Shape1 
      BackColor       =   &H000000FF&
      BackStyle       =   1  'Opaque
      Height          =   1815
      Index           =   1
      Left            =   2400
      Shape           =   3  'Circle
      Top             =   2160
      Width           =   2295
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      BackStyle       =   0  'Transparent
      Caption         =   "0"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   60
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00FFFFFF&
      Height          =   1200
      Index           =   0
      Left            =   960
      TabIndex        =   0
      Top             =   2280
      Width           =   615
   End
   Begin VB.Shape Shape1 
      BackColor       =   &H000000FF&
      BackStyle       =   1  'Opaque
      Height          =   1815
      Index           =   0
      Left            =   240
      Shape           =   3  'Circle
      Top             =   2160
      Width           =   2295
   End
End
Attribute VB_Name = "Form2"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False

Private Sub Command1_Click()
If Command1.Caption = "开奖" Then
Timer1.Enabled = True
Command1.Caption = "停止"
Else
Timer1.Enabled = False
Command1.Caption = "开奖"
End If
End Sub

Private Sub Timer1_Timer()
Randomize
'红球
Label1(0).Caption = Int(Rnd * 33) + 1
Label1(1).Caption = Int(Rnd * 33) + 1
Label1(2).Caption = Int(Rnd * 33) + 1
Label1(3).Caption = Int(Rnd * 33) + 1
Label1(4).Caption = Int(Rnd * 33) + 1
Label1(5).Caption = Int(Rnd * 33) + 1

'蓝球
Label1(6).Caption = Int(Rnd * 16) + 1
End Sub
