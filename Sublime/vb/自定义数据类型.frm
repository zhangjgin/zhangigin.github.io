VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   7065
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   11790
   LinkTopic       =   "Form1"
   ScaleHeight     =   7065
   ScaleWidth      =   11790
   StartUpPosition =   3  '����ȱʡ
   Begin VB.CommandButton Command2 
      Caption         =   "���ѧ����Ϣ"
      Height          =   1815
      Left            =   1680
      TabIndex        =   1
      Top             =   3960
      Width           =   3855
   End
   Begin VB.CommandButton Command1 
      Caption         =   "����ѧ��"
      Height          =   1815
      Left            =   1560
      TabIndex        =   0
      Top             =   1200
      Width           =   3855
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Type Student
    num As Long
    name As String
    sex As String
    age As Integer
End Type
Dim s() As Student

Private Sub Command1_Click()
ReDim s(2) As Student
s(0).num = 180236
s(0).age = 19
s(0).name = "ׯ���"
s(0).sex = "Ů"

s(1).num = 180237
s(1).age = 19
s(1).name = "ĪС��"
s(1).sex = "Ů"

s(2).num = 180238
s(2).age = 28
s(2).name = "�⾰�"
s(2).sex = "��"
MsgBox "ѧ������ɹ���", vbAbortRetryIgnore, "��Ϣ"
End Sub

Private Sub Command2_Click()
On Error GoTo catch
try:
Dim i%
For i = 0 To UBound(s) Step 1
    Print "ѧ�ţ�" & s(i).num _
    & "������" & s(i).name _
    & "���䣺" & s(i).age _
    & "�Ա�" & s(i).sex
Next i
GoTo finally
catch:
MsgBox "��������ѧ����", vbCritical, "��Ϣ"
finally:
End Sub
