VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "QQµÇÂ¼"
   ClientHeight    =   9855
   ClientLeft      =   3825
   ClientTop       =   2175
   ClientWidth     =   16485
   LinkTopic       =   "Form1"
   ScaleHeight     =   9855
   ScaleWidth      =   16485
   StartUpPosition =   2  'ÆÁÄ»ÖÐÐÄ
   Begin VB.TextBox Text2 
      BeginProperty Font 
         Name            =   "ËÎÌå"
         Size            =   26.25
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      IMEMode         =   3  'DISABLE
      Left            =   8760
      PasswordChar    =   "*"
      TabIndex        =   3
      Top             =   3120
      Width           =   5535
   End
   Begin VB.TextBox Text1 
      BeginProperty Font 
         Name            =   "ËÎÌå"
         Size            =   24
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   8760
      TabIndex        =   0
      Top             =   1800
      Width           =   5415
   End
   Begin VB.Label Label4 
      Caption         =   "ÌáÊ¾£º"
      Height          =   1335
      Left            =   8760
      TabIndex        =   5
      Top             =   6480
      Width           =   3375
   End
   Begin VB.Label Label3 
      Alignment       =   2  'Center
      BackColor       =   &H00FF0000&
      Caption         =   "µÇÂ¼"
      BeginProperty Font 
         Name            =   "ËÎÌå"
         Size            =   50.25
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00FFFFFF&
      Height          =   1095
      Left            =   7200
      MousePointer    =   14  'Arrow and Question
      TabIndex        =   4
      Top             =   4680
      Width           =   5415
   End
   Begin VB.Label Label2 
      Alignment       =   2  'Center
      Caption         =   "ÃÜ  Âë"
      BeginProperty Font 
         Name            =   "ËÎÌå"
         Size            =   26.25
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   735
      Left            =   6240
      TabIndex        =   2
      Top             =   3120
      Width           =   1935
   End
   Begin VB.Label Label1 
      Alignment       =   2  'Center
      Caption         =   "QQÕËºÅ"
      BeginProperty Font 
         Name            =   "ËÎÌå"
         Size            =   26.25
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   6240
      TabIndex        =   1
      Top             =   1800
      Width           =   1935
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False


Private Sub Label3_Click()
If Text1.Text = "9210" And Text2.Text = "123" Then
 Form3.Show
Else
Label4.Caption = "ÃÜÂë´íÎó"

End If
End Sub
