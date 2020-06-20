VERSION 5.00
Object = "{0ECD9B60-23AA-11D0-B351-00A0C9055D8E}#6.0#0"; "MSHFLXGD.OCX"
Begin VB.Form Form1 
   Caption         =   "mshflexgrid表格式数据录入与查询"
   ClientHeight    =   4980
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   8025
   LinkTopic       =   "Form1"
   ScaleHeight     =   4980
   ScaleWidth      =   8025
   StartUpPosition =   3  '窗口缺省
   Begin VB.CommandButton Command1 
      Caption         =   "录入"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   21.75
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   1335
      Left            =   5280
      TabIndex        =   5
      Top             =   240
      Width           =   1935
   End
   Begin VB.TextBox Text2 
      Height          =   615
      Left            =   2400
      TabIndex        =   4
      Top             =   960
      Width           =   2295
   End
   Begin VB.TextBox Text1 
      Height          =   615
      Left            =   2400
      TabIndex        =   2
      Top             =   120
      Width           =   2295
   End
   Begin MSHierarchicalFlexGridLib.MSHFlexGrid MSHFlexGrid1 
      Height          =   2175
      Left            =   360
      TabIndex        =   0
      Top             =   2040
      Width           =   6615
      _ExtentX        =   11668
      _ExtentY        =   3836
      _Version        =   393216
      Rows            =   1
      FixedRows       =   0
      FixedCols       =   0
      _NumberOfBands  =   1
      _Band(0).Cols   =   2
   End
   Begin VB.Label Label2 
      AutoSize        =   -1  'True
      Caption         =   "密码："
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   15
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   300
      Left            =   1080
      TabIndex        =   3
      Top             =   1080
      Width           =   945
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      Caption         =   "用户名："
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   15
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   300
      Left            =   1080
      TabIndex        =   1
      Top             =   240
      Width           =   1260
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False

Private Sub Command1_Click()
    MSHFlexGrid1.TextMatrix(0, 0) = "用户名"
    MSHFlexGrid1.TextMatrix(0, 1) = "密码"
    MSHFlexGrid1.AddItem Text1.Text & vbTab & Text2.Text
End Sub
