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
   StartUpPosition =   3  '����ȱʡ
End
Attribute VB_Name = "Form2"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim conn As New ADODB.Connection '�������������Ӷ���
Dim rs As ADODB.Recordset '�������Ӷ���
Dim sql$
Private Sub Form_Load()
Show
If conn.State = 0 Then
    conn.ConnectionString = "Provider=Microsoft.jet.OLEDB.4.0;Data Source=" & App.Path & "\���ݿ�\Test.mdb;Persist Security Info=False"
    conn.Open '�����ݿ�
 End If
 'SQL�������
 
  sql = "select*from[users]"
  '�������ݼ����������
  Set rs = New ADODB.Recordset
  rs.Open sql, conn, adOpenKeyset, adLockBatchOptimistic
  Dim i%
  Do While Not rs.EOF
  '���һ�м�¼
    i = 0
    Do While i <= 2
    '��ÿһ�м�¼���
        Print rs(i).Name & ":" & rs(i).Value
        i = i + 1
    Loop
    
    Print
    '��ָ������
    rs.MoveNext
  Loop
  
End Sub
