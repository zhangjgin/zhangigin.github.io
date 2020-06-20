VERSION 5.00
Begin VB.Form Form3 
   Caption         =   "设置结束时间"
   ClientHeight    =   5460
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   9615
   LinkTopic       =   "Form3"
   ScaleHeight     =   5460
   ScaleWidth      =   9615
   StartUpPosition =   2  '屏幕中心
   Begin VB.CommandButton Command1 
      Caption         =   "确定"
      Height          =   735
      Left            =   2640
      TabIndex        =   1
      Top             =   1320
      Width           =   2175
   End
   Begin VB.TextBox Text1 
      Height          =   735
      Left            =   1560
      TabIndex        =   0
      Top             =   120
      Width           =   4455
   End
End
Attribute VB_Name = "Form3"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False


Private Sub Command1_Click()
Form2.Label4.Caption = CDate(Text1.Text)
End Sub

Private Sub Form_Load()
Text1.Text = DateAdd("h", 3, Now)
End Sub
