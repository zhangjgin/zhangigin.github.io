VERSION 5.00
Begin VB.Form Form2 
   Caption         =   "��ҳ"
   ClientHeight    =   6510
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   10050
   LinkTopic       =   "Form2"
   ScaleHeight     =   6510
   ScaleWidth      =   10050
   StartUpPosition =   3  '����ȱʡ
   Begin VB.Label Label2 
      AutoSize        =   -1  'True
      Caption         =   "�ڶ���"
      BeginProperty Font 
         Name            =   "����"
         Size            =   10.5
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   210
      Left            =   6600
      TabIndex        =   1
      Top             =   4320
      Visible         =   0   'False
      Width           =   630
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      Caption         =   "��һ��"
      BeginProperty Font 
         Name            =   "����"
         Size            =   10.5
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   210
      Left            =   1080
      TabIndex        =   0
      Top             =   4320
      Visible         =   0   'False
      Width           =   630
   End
   Begin VB.Image Image2 
      Height          =   3825
      Left            =   5160
      Picture         =   "��ҳ.frx":0000
      Stretch         =   -1  'True
      Top             =   240
      Visible         =   0   'False
      Width           =   3840
   End
   Begin VB.Image Image1 
      Height          =   3825
      Left            =   240
      Picture         =   "��ҳ.frx":5F8F
      Stretch         =   -1  'True
      Top             =   240
      Visible         =   0   'False
      Width           =   3840
   End
End
Attribute VB_Name = "Form2"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Form_Load()
Open App.Path & "/�ı�/config.txt" For Input As #1
    Do Until EOF(1)
        Dim t$
        Line Input #1, t
        Dim s() As String
        s = Split(t, "��")
        If s(0) = "�ο�" Then
            If InStr(1, s(1), ",��һ��,", vbBinaryCompare) > 0 Then
                Image1.Visible = True
                Label1.Visible = True
            End If
            If InStr(1, s(1), ",�ڶ���,", vbBinaryCompare) > 0 Then
                Image2.Visible = True
                Label2.Visible = True
            End If
            Exit Do
        End If
    Loop
Close #1
End Sub


