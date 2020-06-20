VERSION 5.00
Begin VB.Form Form1 
   AutoRedraw      =   -1  'True
   Caption         =   "Form1"
   ClientHeight    =   5070
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   9255
   LinkTopic       =   "Form1"
   ScaleHeight     =   5070
   ScaleWidth      =   9255
   StartUpPosition =   3  '窗口缺省
   Begin VB.TextBox Text1 
      Alignment       =   2  'Center
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   18
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   6240
      TabIndex        =   3
      Top             =   2280
      Width           =   1815
   End
   Begin VB.CommandButton Command2 
      Caption         =   "求和"
      Height          =   1095
      Left            =   6960
      TabIndex        =   1
      Top             =   3480
      Width           =   1935
   End
   Begin VB.CommandButton Command1 
      Caption         =   "清屏"
      Height          =   975
      Left            =   6960
      TabIndex        =   0
      Top             =   720
      Width           =   1935
   End
   Begin VB.Label Label1 
      Alignment       =   2  'Center
      AutoSize        =   -1  'True
      Caption         =   "n="
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   26.25
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   525
      Left            =   5625
      TabIndex        =   2
      Top             =   2280
      Width           =   540
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
Cls
End Sub

Private Sub Command2_Click()
Dim n As Integer
Dim sum As Long
For n = 1 To Val(Text1.Text) Step 1
sum = sum + n
Next n
Print sum
End Sub

Private Sub Form_Load()
Dim i As Integer
For i = 0 To 10 Step 1
Print i
Next i
Print "最后的值" & i
End Sub
