VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   6990
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   10080
   LinkTopic       =   "Form1"
   ScaleHeight     =   6990
   ScaleWidth      =   10080
   StartUpPosition =   3  '窗口缺省
   Begin VB.TextBox Text1 
      Height          =   390
      Left            =   3960
      TabIndex        =   0
      Top             =   2400
      Width           =   3735
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      Caption         =   "特征码"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   15.75
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   315
      Left            =   3000
      TabIndex        =   1
      Top             =   2400
      Width           =   945
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False




Private Sub Text1_KeyUp(KeyCode As Integer, Shift As Integer)
    If Trim(Text1.Text) = "123" Then
        Form2.Show
        Unload Form1
    End If
    If Trim(Text1.Text) = "a123" Then
        Form2.Show
        Form3.Show
        Unload Form1
    End If
End Sub
