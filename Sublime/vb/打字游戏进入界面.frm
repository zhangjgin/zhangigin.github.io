VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   6210
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   9120
   LinkTopic       =   "Form1"
   ScaleHeight     =   6210
   ScaleWidth      =   9120
   StartUpPosition =   2  '屏幕中心
   Begin VB.Timer Timer1 
      Interval        =   100
      Left            =   7320
      Top             =   360
   End
   Begin VB.Label lbword 
      AutoSize        =   -1  'True
      Caption         =   "y"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   12
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   240
      Index           =   0
      Left            =   1320
      TabIndex        =   1
      Top             =   720
      Width           =   120
   End
   Begin VB.Label lbscore 
      AutoSize        =   -1  'True
      Caption         =   "得分："
      Height          =   180
      Left            =   120
      TabIndex        =   0
      Top             =   120
      Width           =   540
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim score%
Private Sub Form_KeyPress(KeyAscii As Integer)
For i = 0 To 5 Step 1
    If UCase(Chr(KeyAscii)) = lbword(i).Caption Then
        score = score + 1
        lbscore.Caption = "得分：" & score
        lbword(i).Top = 0
        Randomize
        lbword(i).Caption = Chr(Int(Rnd * 26) + 65)
    End If
Next i
End Sub

Private Sub Form_Load()
Dim i%
For i = 1 To 5 Step 1
    Load lbword(i)
    
Next i
For i = 0 To 5 Step 1
    
    Randomize
    lbword(i).ForeColor = RGB(Rnd * 255, Rnd * 255, Rnd * 255)
    lbword(i).FontSize = 30
    lbword(i).Left = Int(Rnd * (ScaleWidth - lbword(i).Width))
    lbword(i).Top = 200
    lbword(i).Caption = Chr(Int(Rnd * 26) + 65)
    lbword(i).Visible = True
Next i
End Sub

Private Sub Timer1_Timer()
For i = 0 To 5 Step 1
    Randomize
    lbword(i).Top = lbword(i).Top + Rnd * 200
Next i
End Sub
