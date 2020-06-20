VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   6675
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   11460
   LinkTopic       =   "Form1"
   ScaleHeight     =   6675
   ScaleWidth      =   11460
   StartUpPosition =   3  '窗口缺省
   Begin VB.CommandButton Command2 
      Caption         =   "看数据"
      Height          =   855
      Left            =   5400
      TabIndex        =   7
      Top             =   5160
      Width           =   2055
   End
   Begin VB.ComboBox Combo1 
      Height          =   300
      ItemData        =   "数据库增删改查.frx":0000
      Left            =   2400
      List            =   "数据库增删改查.frx":000A
      TabIndex        =   6
      Text            =   "男"
      Top             =   2520
      Width           =   2535
   End
   Begin VB.TextBox Text2 
      Height          =   615
      Left            =   2400
      TabIndex        =   3
      Top             =   1560
      Width           =   2535
   End
   Begin VB.TextBox Text1 
      Height          =   615
      Left            =   2400
      TabIndex        =   1
      Top             =   600
      Width           =   2535
   End
   Begin VB.CommandButton Command1 
      Caption         =   "增加数据"
      Height          =   855
      Left            =   8280
      TabIndex        =   0
      Top             =   5160
      Width           =   2055
   End
   Begin VB.Label Label3 
      AutoSize        =   -1  'True
      Caption         =   "性别"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   12
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   240
      Left            =   1440
      TabIndex        =   5
      Top             =   2520
      Width           =   510
   End
   Begin VB.Label Label2 
      AutoSize        =   -1  'True
      Caption         =   "密码"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   12
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   240
      Left            =   1440
      TabIndex        =   4
      Top             =   1680
      Width           =   510
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      Caption         =   "用户名"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   12
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   240
      Left            =   1440
      TabIndex        =   2
      Top             =   720
      Width           =   765
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim conn As New ADODB.Connection '声明并创建连接对象
Dim rs As ADODB.Recordset '声明连接对象
Dim sql$
Private Sub Command1_Click()
 If conn.State = 0 Then
    conn.ConnectionString = "Provider=Microsoft.jet.OLEDB.4.0;Data Source=" & App.Path & "\数据库\Test.mdb;Persist Security Info=False"
    conn.Open '打开数据库
 End If
 'SQL插入语句
  sql = "insert into [users]([username],[password],[sex]) values('" & Text1.Text & "','" & Text2.Text & "','" & Combo1.Text & "')"
  '创建数据集对象的连接
  Set rs = New ADODB.Recordset
  rs.Open sql, conn, adOpenKeyset, adLockBatchOptimistic
  
End Sub

Private Sub Command2_Click()
Form2.Show
End Sub
