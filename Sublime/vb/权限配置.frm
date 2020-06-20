VERSION 5.00
Begin VB.Form Form3 
   Caption         =   "权限配置"
   ClientHeight    =   5160
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   10335
   LinkTopic       =   "Form3"
   ScaleHeight     =   5160
   ScaleWidth      =   10335
   StartUpPosition =   3  '窗口缺省
   Begin VB.Frame Frame1 
      Caption         =   "游客权限配置"
      Height          =   3015
      Left            =   1320
      TabIndex        =   0
      Top             =   600
      Width           =   5055
      Begin VB.CheckBox Check1 
         Caption         =   "第二张"
         Height          =   375
         Index           =   1
         Left            =   1680
         TabIndex        =   2
         Top             =   840
         Width           =   1335
      End
      Begin VB.CheckBox Check1 
         Caption         =   "第一张"
         Height          =   375
         Index           =   0
         Left            =   360
         TabIndex        =   1
         Top             =   840
         Width           =   1335
      End
   End
End
Attribute VB_Name = "Form3"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Check1_Click(Index As Integer)

    Open App.Path & "/文本/config.txt" For Output As #3
        Dim i%
        Dim s$, p$
        s = "游客："
        For i = 0 To Check1.ubound Step 1
            If Check1(i).Value = 1 Then
                p = p & Check1(i).Caption & ","
            End If
        Next i
        p = "," & p
        Print #3, s & p
    Close #3
End Sub



Private Sub Form_Load()
Dim m As String

Open App.Path & "/文本/config.txt" For Input As #2
    Do Until EOF(2)
        Dim t$
        Line Input #2, t
        Dim s() As String
        s = Split(t, "：")
        If s(0) = "游客" Then
            Dim i%
            For i = 0 To Check1.ubound Step 1
            Dim a$
            a = "," & Check1(i).Caption & ","
                If InStr(1, s(1), a, vbBinaryCompare) > 0 Then
                    m = m & CStr(i) & ","
                End If
            Next i
        End If
    Loop
Close #2
z = Split(m, ",")
Dim j%
For j = o To UBound(z) - 1 Step 1
    Check1(j).Value = 1
Next j

End Sub
