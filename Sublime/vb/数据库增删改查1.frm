VERSION 5.00
Begin VB.Form Form2 
   Caption         =   "Form2"
   ClientHeight    =   3570
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   6060
   LinkTopic       =   "Form2"
   ScaleHeight     =   3570
   ScaleWidth      =   6060
   StartUpPosition =   3  '窗口缺省
End
Attribute VB_Name = "Form2"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim conn As New ADODB.Connection '声明并创建连接对象
Dim rs As ADODB.Recordset '声明连接对象
Dim sql$
Private Sub Form_Load()
Show
If conn.State = 0 Then
    conn.ConnectionString = "Provider=Microsoft.jet.OLEDB.4.0;Data Source=" & App.Path & "\数据库\Test.mdb;Persist Security Info=False"
    conn.Open '打开数据库
 End If
 'SQL插入语句
 
  sql = "select*from[users]"
  '创建数据集对象的连接
  Set rs = New ADODB.Recordset
  rs.Open sql, conn, adOpenKeyset, adLockBatchOptimistic
  Dim i%
  Do While Not rs.EOF
  '输出一行记录
    i = 0
    Do While i <= 2
    '将每一列记录输出
        Print rs(i).Name & ":" & rs(i).Value
        i = i + 1
    Loop
    
    Print
    '将指针下移
    rs.MoveNext
  Loop
  
End Sub
