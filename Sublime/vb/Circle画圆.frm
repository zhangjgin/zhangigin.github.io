VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Circle��Բ"
   ClientHeight    =   6045
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   11160
   LinkTopic       =   "Form1"
   ScaleHeight     =   403
   ScaleMode       =   3  'Pixel
   ScaleWidth      =   744
   StartUpPosition =   3  '����ȱʡ
   Begin VB.Timer Timer1 
      Enabled         =   0   'False
      Interval        =   50
      Left            =   9360
      Top             =   3960
   End
   Begin VB.CommandButton Command2 
      Caption         =   "�̻�ģ��"
      Height          =   855
      Left            =   9600
      TabIndex        =   1
      Top             =   1560
      Width           =   1455
   End
   Begin VB.CommandButton Command1 
      Caption         =   "��Բ"
      Height          =   855
      Left            =   9600
      TabIndex        =   0
      Top             =   240
      Width           =   1455
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
'ʹ�õ����ȸ�����single����ʾ����
Dim x As Single
Dim y As Single
Dim r As Single
x = ScaleWidth / 2
y = ScaleHeight / 2
r = 100

Dim i As Long
'N��ͬ��Բ
For i = 1 To y Step 100
    r = i
    Circle (x, y), r
Next i
End Sub

Private Sub Command2_Click()

Timer1.Enabled = True
End Sub

Private Sub Timer1_Timer()
Dim x As Single
Dim y As Single
Dim r As Single
x = ScaleWidth / 2
y = ScaleHeight / 2
r = 100
Randomize
Dim red%, green%, blue%
red = Int(Rnd * 256)
green = Int(Rnd * 256)
blue = Int(Rnd * 256)
'���������ɫ
Form1.FillStyle = vbSolid
FillColor = RGB(red, green, blue)
'���λ��
x = ScaleWidth * Rnd
y = ScaleHeight * Rnd
'ʹ�뾶���
r = Int(Rnd * y) + 1


Form1.Circle (x, y), r, RGB(red, green, blue)
End Sub
