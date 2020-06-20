VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   5460
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   10260
   LinkTopic       =   "Form1"
   ScaleHeight     =   5460
   ScaleWidth      =   10260
   StartUpPosition =   3  '窗口缺省
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim WithEvents label1 As Label
Attribute label1.VB_VarHelpID = -1
'引入windows api 睡眠函数，暂停多少时间
Private Declare Sub Sleep Lib "kernel32" (ByVal dwMilliseconds As Long)

Private Sub Form_Click()
    Dim i As Long
    For i = 10 To 0 Step -1
        label1.Caption = i
        Sleep (1000)
        DoEvents
    Next i
End Sub

Private Sub Form_Load()
    Set label1 = Controls.Add("vb.label", "label1")
    label1.AutoSize = True
    label1.Caption = "10"
    label1.FontSize = 40
    label1.Left = ScaleWidth / 2 - label1.Width / 2
    label1.Top = ScaleHeight / 2 - label1.Height / 2
    
    label1.Visible = True
    
    
End Sub
