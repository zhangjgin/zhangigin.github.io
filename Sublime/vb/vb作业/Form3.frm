VERSION 5.00
Begin VB.Form Form3 
   Caption         =   "Form3"
   ClientHeight    =   5205
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   9945
   LinkTopic       =   "Form3"
   ScaleHeight     =   5205
   ScaleWidth      =   9945
   StartUpPosition =   3  '����ȱʡ
End
Attribute VB_Name = "Form3"
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
    conn.ConnectionString = "Provider=Microsoft.Jet.OLEDB.3.51;" & "Data Source=" & App.Path & "\ʵ��2.mdb;Persist Security Info=False"
    conn.Open '�����ݿ�
 End If
 'SQL�������
 
  sql = "select*from[ϵͳ�û�]"
  '�������ݼ����������
  Set rs = New ADODB.Recordset
  rs.Open sql, conn, adOpenKeyset, adLockBatchOptimistic
  Dim i%
  Do While Not rs.EOF
  '���һ�м�¼
    i = 0
    Do While i <= 1
    '��ÿһ�м�¼���
        Print rs(i).Name & ":" & rs(i).Value
        i = i + 1
    Loop
    
    Print
    '��ָ������
    rs.MoveNext
  Loop
  
End Sub

