VERSION 5.00
Begin VB.Form Form3 
   Caption         =   "Form3"
   ClientHeight    =   5085
   ClientLeft      =   6765
   ClientTop       =   3915
   ClientWidth     =   9075
   LinkTopic       =   "Form3"
   ScaleHeight     =   5085
   ScaleWidth      =   9075
   Begin VB.Timer Timer1 
      Interval        =   100
      Left            =   2640
      Top             =   4080
   End
   Begin VB.Label Label1 
      BackColor       =   &H00FF8080&
      Height          =   1935
      Left            =   360
      TabIndex        =   0
      Top             =   1080
      Width           =   975
   End
End
Attribute VB_Name = "Form3"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Form_Load()
Unload Form1
End Sub

Private Sub Timer1_Timer()
If Label1.Width > 8655 Then
Form2.Show
Timer1.Enabled = False

Else
Label1.Width = Label1.Width + 200
End If
End Sub
