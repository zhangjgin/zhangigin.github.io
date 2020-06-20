VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "异常捕获模拟"
   ClientHeight    =   5190
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   8760
   LinkTopic       =   "Form1"
   ScaleHeight     =   5190
   ScaleWidth      =   8760
   StartUpPosition =   3  '窗口缺省
   Begin VB.PictureBox Picture1 
      Height          =   3135
      Left            =   240
      ScaleHeight     =   3075
      ScaleWidth      =   7275
      TabIndex        =   4
      Top             =   1440
      Width           =   7335
   End
   Begin VB.TextBox Text2 
      Height          =   615
      Left            =   2520
      TabIndex        =   2
      Top             =   480
      Width           =   1335
   End
   Begin VB.TextBox Text1 
      Height          =   615
      Left            =   240
      TabIndex        =   1
      Top             =   480
      Width           =   1335
   End
   Begin VB.CommandButton Command1 
      Caption         =   "结果"
      Height          =   615
      Left            =   5280
      TabIndex        =   0
      Top             =   480
      Width           =   1695
   End
   Begin VB.Label Label1 
      Alignment       =   2  'Center
      Caption         =   "÷"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   15
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   375
      Left            =   1680
      TabIndex        =   3
      Top             =   600
      Width           =   735
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
Dim a As Double
Dim b As Double
a = Val(Text1.Text)
b = Val(Text2.Text)
Text1.Text = ""
Text2.Text = ""
'开始捕获
On Error GoTo catch
try:
MsgBox a / b
Picture1.Print "除法结果已得出"
GoTo finally
catch:
MsgBox "您的输入法有误！无法计算"
finally:
Picture1.Print "请继续输入"
End Sub
