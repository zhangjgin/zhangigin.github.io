VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "模拟超市储物柜是数量"
   ClientHeight    =   6315
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   10125
   LinkTopic       =   "Form1"
   ScaleHeight     =   6315
   ScaleMode       =   0  'User
   ScaleWidth      =   10000
   StartUpPosition =   3  '窗口缺省
   Begin VB.Label lbbox 
      Alignment       =   2  'Center
      BackColor       =   &H000080FF&
      Caption         =   "1"
      Height          =   1005
      Index           =   0
      Left            =   1800
      TabIndex        =   0
      Top             =   0
      Width           =   915
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Form_Load()
Dim i%
For i = 1 To 39 Step 1
    Load lbbox(i)
Next i

For i = 0 To 39 Step 1
    lbbox(i).Left = (i Mod 10) * 1000
    lbbox(i).Top = (i \ 10) * 1100
    lbbox(i).Caption = i + 1
    lbbox(i).Visible = True
    Randomize
    lbbox(i).BackColor = RGB(Rnd * 255, Rnd * 255, Rnd * 255)
Next i
End Sub
