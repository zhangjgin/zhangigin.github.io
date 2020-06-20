VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   6645
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   10575
   LinkTopic       =   "Form1"
   ScaleHeight     =   6645
   ScaleWidth      =   10575
   StartUpPosition =   3  '窗口缺省
   Begin VB.CommandButton Command3 
      Caption         =   "获取第几项"
      Height          =   375
      Left            =   2040
      TabIndex        =   4
      Top             =   3480
      Width           =   1575
   End
   Begin VB.CommandButton Command2 
      Caption         =   "添加"
      Height          =   375
      Left            =   3960
      TabIndex        =   3
      Top             =   2160
      Width           =   1095
   End
   Begin VB.TextBox Text1 
      Height          =   375
      Left            =   1920
      TabIndex        =   2
      Text            =   "Text1"
      Top             =   2160
      Width           =   1575
   End
   Begin VB.CommandButton Command1 
      Caption         =   "提交"
      Height          =   255
      Left            =   4560
      TabIndex        =   1
      Top             =   1320
      Width           =   1095
   End
   Begin VB.ComboBox Combo1 
      Height          =   300
      ItemData        =   "ComboBox.frx":0000
      Left            =   1920
      List            =   "ComboBox.frx":000D
      TabIndex        =   0
      Text            =   "Combo1"
      Top             =   1320
      Width           =   2295
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False

Private Sub Combo1_KeyUp(KeyCode As Integer, Shift As Integer)
Call Command3_Click
End Sub

Private Sub Command1_Click()
Print Combo1.Text
End Sub

Private Sub Command2_Click()
Combo1.AddItem Text1.Text
End Sub

Private Sub Command3_Click()
Dim i%
For i = 0 To Combo1.ListCount - 1 Step 1
    If InStr(1, Combo1.List(i), Combo1.Text, vbBinaryCompare) > 0 Then
         Print i
        Combo1.ListIndex = i
        Exit For
    End If
Next i
End Sub
