VERSION 5.00
Object = "{0ECD9B60-23AA-11D0-B351-00A0C9055D8E}#6.0#0"; "MSHFLXGD.OCX"
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   7500
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   10800
   LinkTopic       =   "Form1"
   ScaleHeight     =   7500
   ScaleWidth      =   10800
   StartUpPosition =   2  '屏幕中心
   Begin VB.CommandButton Command4 
      Caption         =   "编辑"
      Enabled         =   0   'False
      Height          =   975
      Left            =   840
      TabIndex        =   8
      Top             =   5640
      Width           =   3015
   End
   Begin VB.CommandButton Command3 
      Caption         =   "删除"
      Height          =   975
      Left            =   840
      TabIndex        =   7
      Top             =   4320
      Width           =   3015
   End
   Begin VB.CommandButton Command2 
      Caption         =   "查询"
      Height          =   975
      Left            =   840
      TabIndex        =   6
      Top             =   3000
      Width           =   3015
   End
   Begin MSHierarchicalFlexGridLib.MSHFlexGrid MSHFlexGrid1 
      Height          =   3015
      Left            =   4560
      TabIndex        =   5
      Top             =   120
      Width           =   5895
      _ExtentX        =   10398
      _ExtentY        =   5318
      _Version        =   393216
      FixedCols       =   0
      _NumberOfBands  =   1
      _Band(0).Cols   =   2
   End
   Begin VB.TextBox Text2 
      Height          =   495
      IMEMode         =   3  'DISABLE
      Left            =   1560
      PasswordChar    =   "*"
      TabIndex        =   4
      Top             =   840
      Width           =   2655
   End
   Begin VB.TextBox Text1 
      Height          =   495
      Left            =   1560
      TabIndex        =   2
      Top             =   120
      Width           =   2655
   End
   Begin VB.CommandButton Command1 
      Caption         =   "录入数据"
      Height          =   975
      Left            =   840
      TabIndex        =   0
      Top             =   1680
      Width           =   3015
   End
   Begin VB.Label Label2 
      AutoSize        =   -1  'True
      Caption         =   "密码"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   18
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   360
      Left            =   600
      TabIndex        =   3
      Top             =   840
      Width           =   750
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      Caption         =   "账号"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   18
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   360
      Left            =   600
      TabIndex        =   1
      Top             =   120
      Width           =   750
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Option Explicit
Dim sql As String
Dim conn As New ADODB.Connection
Dim rs As ADODB.Recordset
Private Sub Command1_Click()
    If conn.State = 0 Then
        conn.ConnectionString = "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & App.Path & "\数据库\Database3.mdb;Persist Security Info=False"
        conn.Open
    End If
   
    sql = "insert into [users]([username],[password]) values('" & Text1.Text & "','" & Text2.Text & "')"
    Set rs = New ADODB.Recordset
    rs.Open sql, conn, adOpenKeyset, adLockBatchOptimistic
    'MsgBox "成功"
    
    sql = "select * from users"
    rs.Open sql, conn, adOpenKeyset, adLockBatchOptimistic
    Set MSHFlexGrid1.DataSource = rs
    MSHFlexGrid1.TextMatrix(0, 0) = "唯一编号"
    MSHFlexGrid1.TextMatrix(0, 1) = "账号"
    MSHFlexGrid1.TextMatrix(0, 2) = "密码"
    
    
End Sub


Private Sub Command2_Click()
    If conn.State = 0 Then
    conn.ConnectionString = "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & App.Path & "\数据库\Database3.mdb;Persist Security Info=False"
    conn.Open
    End If
    Set rs = New ADODB.Recordset
    sql = "select * from users"
    rs.Open sql, conn, adOpenKeyset, adLockBatchOptimistic
    Set MSHFlexGrid1.DataSource = rs
    MSHFlexGrid1.TextMatrix(0, 0) = "唯一编号"
    MSHFlexGrid1.TextMatrix(0, 1) = "账号"
    MSHFlexGrid1.TextMatrix(0, 2) = "密码"
    Command4.Enabled = True
End Sub

Private Sub Command3_Click()
          If conn.State = 0 Then
        conn.ConnectionString = "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & App.Path & "\数据库\Database3.mdb;Persist Security Info=False"
        conn.Open
    End If
    Set rs = New ADODB.Recordset
    sql = "delete from [users] where id=" & MSHFlexGrid1.TextMatrix(MSHFlexGrid1.Row, 0)
    'MsgBox sql
    MSHFlexGrid1.RemoveItem MSHFlexGrid1.Row  '方法二
    rs.Open sql, conn, adOpenKeyset, adLockBatchOptimistic
    'Call Command2_Click '方法一 删除后刷新数据库 性能消耗太大
    

End Sub

Private Sub Command4_Click()
    Form2.Show vbModal
End Sub

