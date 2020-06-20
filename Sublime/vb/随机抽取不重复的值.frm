VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "随机抽取不重复的值"
   ClientHeight    =   7245
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   10350
   LinkTopic       =   "Form1"
   ScaleHeight     =   7245
   ScaleWidth      =   10350
   StartUpPosition =   3  '窗口缺省
   Begin VB.CommandButton Command2 
      Caption         =   "初始化"
      Height          =   495
      Left            =   2880
      TabIndex        =   3
      Top             =   3480
      Width           =   1575
   End
   Begin VB.CommandButton Command1 
      Caption         =   "随机抽取"
      Height          =   495
      Left            =   4920
      TabIndex        =   2
      Top             =   3480
      Width           =   1575
   End
   Begin VB.TextBox Text2 
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   12
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   1200
      TabIndex        =   1
      Text            =   "10"
      Top             =   3480
      Width           =   1455
   End
   Begin VB.TextBox Text1 
      Height          =   2175
      Left            =   240
      TabIndex        =   0
      Top             =   240
      Width           =   9855
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim n() As Long
Private Sub Command1_Click()
Text1.Text = ""
Call Command2_Click


Dim c%
c = UBound(n)
Dim i%
'Dim m() As Long
'Dim m(c)
'Dim k%
'k = 0


For i = 0 To c Step 1
    '随机抽取
    Randomize
    Dim ri%
    ri = Int(Rnd * (UBound(n) + 1))
    '将随机获得是值存储到数组m中
    'm(k) = n(ri)
    Text1.Text = Text1.Text & n(ri) & ","
    'k = k + 1
    '使得数组缩短一位，将抽取过的值从数组中删除
    '原理是将ri后面的所有值往前移动一位，将最后一位删除
    Dim j%
    For j = ri To UBound(n) - 1 Step 1
        n(j) = n(j + 1)
    Next j
    If UBound(n) > 0 Then ReDim Preserve n(UBound(n) - 1)
Next i

End Sub

Private Sub Command2_Click()
Dim num As Long
num = Val(Text2.Text)
ReDim n(num - 1)
Dim i%
'在数组n中存储1至10的十个数
For i = o To num - 1 Step 1
    n(i) = i + 1
    Debug.Print n(i)
Next i
End Sub
