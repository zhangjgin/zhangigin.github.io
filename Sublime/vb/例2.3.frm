VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   3090
   ClientLeft      =   60
   ClientTop       =   450
   ClientWidth     =   4680
   LinkTopic       =   "Form1"
   ScaleHeight     =   3090
   ScaleWidth      =   4680
   StartUpPosition =   3  '����ȱʡ
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Form_Click()
    Dim x As String, a As String, b As String, y As String
    x = "computer"                       '������ַ���x����Ϊ"computer"
    a = Left(x, 1)                       'ȡ���һ���ַ�
    b = Right(x, 1)                      'ȡ�ұ�һ���ַ�
    y = a & b                            '��������
    Print "����ɵ��ַ���: " & y         '��ʾ����Ľ��
End Sub

