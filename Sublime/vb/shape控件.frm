VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "小球运动实验"
   ClientHeight    =   6300
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   10500
   LinkTopic       =   "Form1"
   ScaleHeight     =   6300
   ScaleWidth      =   10500
   StartUpPosition =   3  '窗口缺省
   Begin VB.Timer Timer1 
      Interval        =   10
      Left            =   840
      Top             =   5280
   End
   Begin VB.Shape Shape1 
      BackColor       =   &H80000008&
      BackStyle       =   1  'Opaque
      Height          =   1935
      Left            =   0
      Shape           =   3  'Circle
      Top             =   1920
      Width           =   2200
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim dirct As Integer

Private Sub Timer1_Timer()
If Shape1.Left + Shape1.Width >= Form1.Width Then
dirct = 1
End If

If dirct = 0 Then
Shape1.Left = Shape1.Left + 100
Else
Shape1.Left = Shape1.Left - 100
End If
If Shape1.Left <= 0 Then
 dirct = 0
End If

End Sub
