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
   StartUpPosition =   3  '窗口缺省
   Begin VB.CommandButton Command2 
      Caption         =   "输出学生信息"
      Height          =   1815
      Left            =   1680
      TabIndex        =   1
      Top             =   3960
      Width           =   3855
   End
   Begin VB.CommandButton Command1 
      Caption         =   "载入学生"
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
s(0).name = "庄达菲"
s(0).sex = "女"

s(1).num = 180237
s(1).age = 19
s(1).name = "莫小贝"
s(1).sex = "女"

s(2).num = 180238
s(2).age = 28
s(2).name = "吴景昊"
s(2).sex = "男"
MsgBox "学生载入成功！", vbAbortRetryIgnore, "消息"
End Sub

Private Sub Command2_Click()
On Error GoTo catch
try:
Dim i%
For i = 0 To UBound(s) Step 1
    Print "学号：" & s(i).num _
    & "姓名：" & s(i).name _
    & "年龄：" & s(i).age _
    & "性别：" & s(i).sex
Next i
GoTo finally
catch:
MsgBox "请先载入学生！", vbCritical, "消息"
finally:
End Sub
