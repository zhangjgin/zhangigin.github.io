VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "运动界限"
   ClientHeight    =   7170
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   12360
   LinkTopic       =   "Form1"
   ScaleHeight     =   7170
   ScaleWidth      =   12360
   StartUpPosition =   3  '窗口缺省
   Begin VB.Timer Timer2 
      Interval        =   100
      Left            =   120
      Top             =   1320
   End
   Begin VB.Timer Timer1 
      Interval        =   100
      Left            =   120
      Top             =   960
   End
   Begin VB.Shape Shape1 
      FillColor       =   &H000080FF&
      FillStyle       =   0  'Solid
      Height          =   735
      Left            =   9720
      Shape           =   3  'Circle
      Top             =   3120
      Width           =   735
   End
   Begin VB.Line Line2 
      BorderWidth     =   5
      X1              =   360
      X2              =   11760
      Y1              =   6480
      Y2              =   6480
   End
   Begin VB.Line Line1 
      BorderWidth     =   5
      X1              =   360
      X2              =   4080
      Y1              =   720
      Y2              =   720
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim d As Integer
Private Sub Timer1_Timer()
If Line1.X2 < Form1.ScaleWidth - 200 Then
    Line1.X2 = Line1.X2 + 100
Else
    Timer1.Enabled = False
End If
End Sub

Private Sub Timer2_Timer()
If d = 0 And Shape1.Top + Shape1.Height + 1 >= Line2.Y1 Then
    d = 1
ElseIf d = 1 And Shape1.Top <= Line1.Y1 + Line1.BorderWidth Then
    d = 0
End If
If d = 0 Then
    If Shape1.Top + 100 > Line2.Y1 Then
        Shape1.Top = Line2.Y1
    Else
    Shape1.Top = Shape1.Top + 100
    End If
ElseIf d = 1 Then
    If Shape1.Top - 100 < Line1.Y1 Then
        Shape1.Top = Line1.Y1
    Else
    Shape1.Top = Shape1.Top - 100
    End If
End If
End Sub
