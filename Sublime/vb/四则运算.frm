VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   6930
   ClientLeft      =   120
   ClientTop       =   465
   ClientWidth     =   12510
   LinkTopic       =   "Form1"
   ScaleHeight     =   6930
   ScaleWidth      =   12510
   StartUpPosition =   3  '窗口缺省
   Begin VB.CommandButton Command3 
      Caption         =   "清除"
      Height          =   495
      Left            =   10080
      TabIndex        =   13
      Top             =   5040
      Width           =   1815
   End
   Begin VB.CommandButton Command2 
      Caption         =   "评分"
      Height          =   495
      Left            =   7440
      TabIndex        =   12
      Top             =   5040
      Width           =   1935
   End
   Begin VB.CommandButton Command1 
      Caption         =   "抽题目"
      Height          =   495
      Left            =   4920
      TabIndex        =   11
      Top             =   5040
      Width           =   1695
   End
   Begin VB.TextBox Text5 
      Height          =   735
      Left            =   7320
      TabIndex        =   10
      Top             =   3600
      Width           =   3375
   End
   Begin VB.TextBox Text4 
      Height          =   735
      Left            =   7320
      TabIndex        =   9
      Top             =   2400
      Width           =   3375
   End
   Begin VB.TextBox Text3 
      Height          =   735
      Left            =   7320
      TabIndex        =   8
      Top             =   1440
      Width           =   3375
   End
   Begin VB.TextBox Text2 
      Height          =   735
      Left            =   7320
      TabIndex        =   7
      Top             =   360
      Width           =   3375
   End
   Begin VB.TextBox Text1 
      Height          =   375
      Left            =   3240
      TabIndex        =   2
      Top             =   5040
      Width           =   1095
   End
   Begin VB.Label Label6 
      Caption         =   "正确率"
      Height          =   615
      Left            =   4680
      TabIndex        =   6
      Top             =   3600
      Width           =   2055
   End
   Begin VB.Label Label5 
      Caption         =   "总题数"
      Height          =   615
      Left            =   4680
      TabIndex        =   5
      Top             =   2400
      Width           =   2055
   End
   Begin VB.Label Label4 
      Caption         =   "错误数"
      Height          =   615
      Left            =   4800
      TabIndex        =   4
      Top             =   1440
      Width           =   1935
   End
   Begin VB.Label Label3 
      Caption         =   "正确数"
      Height          =   615
      Left            =   4800
      TabIndex        =   3
      Top             =   360
      Width           =   1935
   End
   Begin VB.Label Label2 
      BorderStyle     =   1  'Fixed Single
      Height          =   375
      Left            =   360
      TabIndex        =   1
      Top             =   5040
      Width           =   2415
   End
   Begin VB.Label Label1 
      BorderStyle     =   1  'Fixed Single
      Height          =   4095
      Left            =   360
      TabIndex        =   0
      Top             =   240
      Width           =   3855
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim result As Integer
Dim dui As Integer
Dim cuo As Integer
Private Sub Command1_Click()
Dim a As Integer
Dim b As Integer
Dim f As Integer


a = Int(Rnd * 89) + 10
b = Int(Rnd * 9) + 10
f = Int(Rnd * 4) + 1

Select Case f
    Case 1
        Label2.Caption = a & "+" & b & "="
        result = a + b
    Case 2
        Label2.Caption = a & "-" & b & "="
        result = a - b
    Case 3
        Label2.Caption = a & "×" & b & "="
        result = a * b
    Case 4
        Label2.Caption = a & "÷" & b & "="
        result = a / b
    





End Select




End Sub

Private Sub Command2_Click()

Dim answ As Integer
answ = Text1.Text
If answ = result Then
    dui = dui + 1
    Label1.Caption = Label1.Caption & Label2.Caption & Text1.Text & " √ " & vbCrLf
Else
    cuo = cuo + 1
    Label1.Caption = Label1.Caption & Label2.Caption & Text1.Text & " X " & vbCrLf
End If
Text2.Text = dui
Text3.Text = cuo
Text4.Text = dui + cuo
Text5.Text = Format(dui / (dui + cuo), "0.00%")
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
End Sub

Private Sub Command3_Click()
Label1.Caption = " "
End Sub
