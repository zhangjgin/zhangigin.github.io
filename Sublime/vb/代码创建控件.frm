VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "代码创建控件"
   ClientHeight    =   8220
   ClientLeft      =   75
   ClientTop       =   405
   ClientWidth     =   14865
   LinkTopic       =   "Form1"
   ScaleHeight     =   8220
   ScaleWidth      =   14865
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private WithEvents Label1 As Label '声明一个带事件的控件
Attribute Label1.VB_VarHelpID = -1
Private WithEvents timer1 As Timer
Attribute timer1.VB_VarHelpID = -1
Dim d As Integer
Private Sub Form_Load()
'对控件进行实例化
Set Label1 = Controls.Add("vb.label", "label1")
'开始配置控件
Label1.Caption = "庄达菲"
Label1.FontSize = 59
Label1.BackColor = vbRed
Label1.AutoSize = True
Label1.ForeColor = vbWhite
Label1.Left = ScaleWidth / 2 - Label1.Width / 2
Label1.Top = ScaleHeight / 2 - Label1.Height / 2
Label1.Visible = True

Set timer1 = Controls.Add("vb.timer", "timer1")
timer1.Interval = 10
timer1.Enabled = True

End Sub

Private Sub label1_Click()
Shell "explorer https://www.google.com"
End Sub

Private Sub timer1_Timer()

If Label1.Left + Label1.Width > ScaleWidth Then
    d = 1
ElseIf Label1.Left < 0 Then
    d = 0
End If
If d = 1 Then
    Label1.Left = Label1.Left - 100
ElseIf d = 0 Then
    Label1.Left = Label1.Left + 100
End If
End Sub
