VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "统计字母数字"
   ClientHeight    =   5685
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   13365
   LinkTopic       =   "Form1"
   ScaleHeight     =   5685
   ScaleWidth      =   13365
   StartUpPosition =   3  '窗口缺省
   Begin VB.Frame Frame4 
      Caption         =   "其他"
      Height          =   2775
      Left            =   9960
      TabIndex        =   13
      Top             =   2640
      Width           =   2775
      Begin VB.TextBox textother 
         Height          =   1575
         Left            =   240
         MultiLine       =   -1  'True
         ScrollBars      =   2  'Vertical
         TabIndex        =   14
         Top             =   840
         Width           =   2295
      End
      Begin VB.Label Label3 
         AutoSize        =   -1  'True
         Caption         =   "个数"
         Height          =   180
         Left            =   240
         TabIndex        =   16
         Top             =   360
         Width           =   360
      End
      Begin VB.Label lbother 
         AutoSize        =   -1  'True
         Caption         =   "0"
         Height          =   180
         Left            =   960
         TabIndex        =   15
         Top             =   360
         Width           =   1290
      End
   End
   Begin VB.Frame Frame3 
      Caption         =   "大写字母"
      Height          =   2775
      Left            =   6960
      TabIndex        =   9
      Top             =   2640
      Width           =   2775
      Begin VB.TextBox textcapital 
         Height          =   1575
         Left            =   240
         MultiLine       =   -1  'True
         ScrollBars      =   2  'Vertical
         TabIndex        =   10
         Top             =   840
         Width           =   2295
      End
      Begin VB.Label lbcapital 
         AutoSize        =   -1  'True
         Caption         =   "0"
         Height          =   180
         Left            =   960
         TabIndex        =   12
         Top             =   360
         Width           =   1290
      End
      Begin VB.Label Label5 
         AutoSize        =   -1  'True
         Caption         =   "个数"
         Height          =   180
         Left            =   240
         TabIndex        =   11
         Top             =   360
         Width           =   360
      End
   End
   Begin VB.Frame Frame2 
      Caption         =   "小写字母"
      Height          =   2775
      Left            =   3960
      TabIndex        =   5
      Top             =   2640
      Width           =   2775
      Begin VB.TextBox textlower 
         Height          =   1575
         Left            =   240
         MultiLine       =   -1  'True
         ScrollBars      =   2  'Vertical
         TabIndex        =   6
         Top             =   840
         Width           =   2295
      End
      Begin VB.Label Label4 
         AutoSize        =   -1  'True
         Caption         =   "个数"
         Height          =   180
         Left            =   240
         TabIndex        =   8
         Top             =   360
         Width           =   360
      End
      Begin VB.Label lblower 
         AutoSize        =   -1  'True
         Caption         =   "0"
         Height          =   180
         Left            =   960
         TabIndex        =   7
         Top             =   360
         Width           =   1170
      End
   End
   Begin VB.Frame Frame1 
      Caption         =   "数字"
      Height          =   2775
      Left            =   960
      TabIndex        =   1
      Top             =   2640
      Width           =   2775
      Begin VB.TextBox textnum 
         Height          =   1575
         Left            =   240
         MultiLine       =   -1  'True
         ScrollBars      =   2  'Vertical
         TabIndex        =   4
         Top             =   840
         Width           =   2295
      End
      Begin VB.Label lbnum 
         AutoSize        =   -1  'True
         Caption         =   "0"
         Height          =   180
         Left            =   960
         TabIndex        =   3
         Top             =   360
         Width           =   1290
      End
      Begin VB.Label Label1 
         AutoSize        =   -1  'True
         Caption         =   "个数"
         Height          =   180
         Left            =   240
         TabIndex        =   2
         Top             =   360
         Width           =   360
      End
   End
   Begin VB.TextBox Text1 
      Height          =   2175
      Left            =   840
      MultiLine       =   -1  'True
      ScrollBars      =   2  'Vertical
      TabIndex        =   0
      Top             =   240
      Width           =   11895
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim n As Long
Dim l As Long
Dim c As Long
Dim o As Long


Private Sub Text1_KeyPress(KeyAscii As Integer)
If KeyAscii >= 48 And KeyAscii <= 57 Then
    textnum.Text = textnum.Text & Chr(KeyAscii)
    lbnum.Caption = Len(textnum.Text)
ElseIf KeyAscii >= 97 And KeyAscii <= 122 Then
    textlower.Text = textlower.Text & Chr(KeyAscii)
    lblower.Caption = Len(textlower.Text)
ElseIf KeyAscii >= 65 And KeyAscii <= 90 Then
    textcapital.Text = textcapital.Text & Chr(KeyAscii)
    lbcapital.Caption = Len(textcapital.Text)
Else
    textother.Text = textother.Text & Chr(KeyAscii)
    lbother.Caption = Len(textother.Text)
End If

End Sub
