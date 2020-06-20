VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   6525
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   11175
   LinkTopic       =   "Form1"
   ScaleHeight     =   6525
   ScaleWidth      =   11175
   StartUpPosition =   3  '´°¿ÚÈ±Ê¡
   Begin VB.TextBox Text1 
      Height          =   495
      Left            =   2760
      TabIndex        =   1
      Top             =   1320
      Width           =   3495
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      Caption         =   "µÇÂ½Âë"
      BeginProperty Font 
         Name            =   "ËÎÌå"
         Size            =   12
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   240
      Left            =   1920
      TabIndex        =   0
      Top             =   1440
      Width           =   720
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False


Private Sub Text1_KeyUp(KeyCode As Integer, Shift As Integer)
Open App.Path & "/ÎÄ±¾/µÇÂ½Æ÷.txt" For Input As #1
    Do Until EOF(1)
        Dim t$
        Line Input #1, t
        If t = Trim(Text1.Text) Then
            Shell "explorer https://www.baidu.com"
            Exit Do
        End If
    Loop
Close #1

End Sub
