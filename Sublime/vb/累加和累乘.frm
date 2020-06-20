VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   7680
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   13470
   LinkTopic       =   "Form1"
   ScaleHeight     =   7680
   ScaleWidth      =   13470
   StartUpPosition =   3  '窗口缺省
   Begin VB.TextBox Text1 
      Height          =   615
      Left            =   5160
      TabIndex        =   1
      Top             =   2160
      Width           =   1695
   End
   Begin VB.CommandButton Command1 
      Caption         =   "计算"
      Height          =   855
      Left            =   7080
      TabIndex        =   0
      Top             =   2040
      Width           =   1695
   End
   Begin VB.Image Image1 
      Height          =   2910
      Left            =   720
      Picture         =   "累加和累乘.frx":0000
      Top             =   3960
      Width           =   11940
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      Caption         =   "x="
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   15
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   300
      Left            =   4560
      TabIndex        =   2
      Top             =   2280
      Width           =   300
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()

Dim x As Double
x = Val(Text1.Text)
If Not (x > 0 And x <= 100) Then
    MsgBox "不在合法范围内"
    Text1.Text = ""
    Exit Sub
End If
Dim ex As Double
ex = 1
Dim i%, j%
'循环次数
For i = 1 To x Step 1
'分子
    Dim fz As Double
    fz = 1
    For j = 1 To i Step 1
        fz = fz * x
    Next j
'分母
    Dim fm As Double
    fm = 1
    For j = 1 To i Step 1
        fm = fm * j
    Next j
'结果
    Dim c As Double
    c = fz / fm
    ex = ex + c
Next i
'打印
Print ex
End Sub


Private Sub Text1_KeyUp(KeyCode As Integer, Shift As Integer)
If Not (Chr(KeyCode) >= "0" And Chr(KeyCode) <= "9") Then
    Text1.Text = ""
End If
End Sub
