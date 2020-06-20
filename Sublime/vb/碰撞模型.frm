VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "碰撞模型"
   ClientHeight    =   5490
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   9825
   LinkTopic       =   "Form1"
   ScaleHeight     =   5490
   ScaleWidth      =   9825
   StartUpPosition =   3  '窗口缺省
   Begin VB.Timer Timer1 
      Interval        =   70
      Left            =   840
      Top             =   3120
   End
   Begin VB.Shape Shape2 
      BorderColor     =   &H0080FF80&
      FillColor       =   &H0000FFFF&
      FillStyle       =   0  'Solid
      Height          =   255
      Left            =   6360
      Top             =   600
      Width           =   255
   End
   Begin VB.Shape ball 
      FillStyle       =   0  'Solid
      Height          =   735
      Left            =   1320
      Shape           =   3  'Circle
      Top             =   1440
      Width           =   735
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim Direction As Integer
'0上，1下，2左，3右
Private Sub Form_KeyDown(KeyCode As Integer, Shift As Integer)
If KeyCode = vbKeyUp Then
    Direction = 0
ElseIf KeyCode = vbKeyLeft Then
    Direction = 3
ElseIf KeyCode = vbKeyDown Then
    Direction = 1
ElseIf KeyCode = vbKeyRight Then
    Direction = 2
End If
End Sub



Private Sub Timer1_Timer()
Dim speed As Integer
speed = 100
If Direction = 2 Then
    ball.Left = ball.Left + speed
ElseIf Direction = 1 Then
    ball.Top = ball.Top + speed
ElseIf Direction = 3 Then
    ball.Left = ball.Left - speed
ElseIf Direction = 0 Then
    ball.Top = ball.Top - speed
End If
If crash(ball, Shape2) Then
    ball.FillColor = Shape2.FillColor
    ball.Width = ball.Width + 80
    ball.Height = ball.Height + 80
    Randomize
    Shape2.Left = Rnd * Form1.ScaleWidth
    Shape2.Top = Rnd * Form1.ScaleHeight
    Shape2.FillColor = RGB(Rnd * 255, Rnd * 255, Rnd * 255)
End If
End Sub
Function crash(A As Shape, B As Shape) As Boolean
    Dim f As Boolean
    f = False
If A.Left + A.Width >= B.Left _
And A.Left <= B.Left + B.Width _
And A.Top + A.Height > B.Top _
And A.Top <= B.Top + B.Height Then
        f = True
End If
    crash = f
        
    
End Function
