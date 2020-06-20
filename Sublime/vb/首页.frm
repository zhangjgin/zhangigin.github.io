VERSION 5.00
Begin VB.Form Form2 
   Caption         =   "首页"
   ClientHeight    =   6510
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   10050
   LinkTopic       =   "Form2"
   ScaleHeight     =   6510
   ScaleWidth      =   10050
   StartUpPosition =   3  '窗口缺省
   Begin VB.Label Label2 
      AutoSize        =   -1  'True
      Caption         =   "第二张"
      BeginProperty Font 
         Name            =   "宋体"
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
      Caption         =   "第一张"
      BeginProperty Font 
         Name            =   "宋体"
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
      Picture         =   "首页.frx":0000
      Stretch         =   -1  'True
      Top             =   240
      Visible         =   0   'False
      Width           =   3840
   End
   Begin VB.Image Image1 
      Height          =   3825
      Left            =   240
      Picture         =   "首页.frx":5F8F
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
Open App.Path & "/文本/config.txt" For Input As #1
    Do Until EOF(1)
        Dim t$
        Line Input #1, t
        Dim s() As String
        s = Split(t, "：")
        If s(0) = "游客" Then
            If InStr(1, s(1), ",第一张,", vbBinaryCompare) > 0 Then
                Image1.Visible = True
                Label1.Visible = True
            End If
            If InStr(1, s(1), ",第二张,", vbBinaryCompare) > 0 Then
                Image2.Visible = True
                Label2.Visible = True
            End If
            Exit Do
        End If
    Loop
Close #1
End Sub


