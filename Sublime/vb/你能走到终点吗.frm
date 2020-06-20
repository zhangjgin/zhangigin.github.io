VERSION 5.00
Begin VB.Form Form1 
   BorderStyle     =   0  'None
   Caption         =   "你能走到终点吗"
   ClientHeight    =   7950
   ClientLeft      =   0
   ClientTop       =   0
   ClientWidth     =   15360
   ControlBox      =   0   'False
   LinkTopic       =   "Form1"
   ScaleHeight     =   7950
   ScaleWidth      =   15360
   ShowInTaskbar   =   0   'False
   StartUpPosition =   2  '屏幕中心
   Begin VB.CommandButton Command1 
      Caption         =   "退出"
      Height          =   495
      Left            =   14400
      TabIndex        =   7
      Top             =   0
      Width           =   975
   End
   Begin VB.Label Label1 
      BackColor       =   &H0080FF80&
      Height          =   375
      Left            =   0
      TabIndex        =   8
      Top             =   1080
      Width           =   375
   End
   Begin VB.Shape Shape2 
      FillColor       =   &H000000FF&
      FillStyle       =   0  'Solid
      Height          =   255
      Left            =   14880
      Top             =   7560
      Width           =   255
   End
   Begin VB.Label lbwall 
      BackColor       =   &H00000000&
      Height          =   4095
      Index           =   6
      Left            =   2880
      TabIndex        =   6
      Top             =   3840
      Width           =   4095
   End
   Begin VB.Label lbwall 
      BackColor       =   &H00000000&
      Height          =   1095
      Index           =   5
      Left            =   8400
      TabIndex        =   5
      Top             =   4200
      Width           =   6975
   End
   Begin VB.Label lbwall 
      BackColor       =   &H00000000&
      Height          =   1935
      Index           =   4
      Left            =   8400
      TabIndex        =   4
      Top             =   6000
      Width           =   6375
   End
   Begin VB.Label lbwall 
      BackColor       =   &H00000000&
      ForeColor       =   &H00FFFFFF&
      Height          =   855
      Index           =   3
      Left            =   0
      TabIndex        =   3
      Top             =   0
      Width           =   8535
   End
   Begin VB.Label lbwall 
      BackColor       =   &H00000000&
      Height          =   3855
      Index           =   2
      Left            =   480
      TabIndex        =   2
      Top             =   1800
      Width           =   1335
   End
   Begin VB.Label lbwall 
      BackColor       =   &H00000000&
      Height          =   3015
      Index           =   1
      Left            =   13800
      TabIndex        =   1
      Top             =   0
      Width           =   1575
   End
   Begin VB.Label lbwall 
      BackColor       =   &H00000000&
      Height          =   855
      Index           =   0
      Left            =   3000
      TabIndex        =   0
      Top             =   1800
      Width           =   8535
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim canmove As Boolean
Dim x1 As Single
Dim y1 As Single
Dim firstleft As Single
Dim firsttop As Single

Private Sub Command1_Click()
Form2.Show
Unload Form1
End Sub



Private Sub Form_Load()
firstleft = Label1.Left
firsttop = Label1.Top
End Sub

Private Sub Label1_MouseDown(Button As Integer, Shift As Integer, X As Single, Y As Single)
    canmove = True
    x1 = X
    y1 = Y
End Sub

Private Sub Label1_MouseMove(Button As Integer, Shift As Integer, X As Single, Y As Single)
    'lbwall(3).Caption = "x = " & X & ",y = " & Y
    If canmove Then
        Label1.Left = Label1.Left + (X - x1)
        Label1.Top = Label1.Top + (Y - y1)
        '调用碰撞模型
        Dim i%
        For i = 0 To lbwall.UBound Step 1
            If func(Label1, lbwall(i)) Then
                MsgBox "游戏结束"
                Label1.Left = firstleft
                Label1.Top = firsttop
                canmove = False
            End If
        Next i
        If func(Label1, Shape2) Then
                MsgBox "成功"
                
                canmove = False
            End If
    End If
End Sub

Private Sub Label1_MouseUp(Button As Integer, Shift As Integer, X As Single, Y As Single)
    canmove = False
End Sub
Function func(A As Label, B As Object) As Boolean
    Dim f As Boolean
    If A.Left + A.Width >= B.Left _
    And A.Left <= B.Left + B.Width _
    And A.Top + A.Height >= B.Top _
    And A.Top <= B.Top + B.Height Then
    
    f = True
    func = f
    
    End If
    
End Function
