VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "���ݹ���"
   ClientHeight    =   6690
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   10860
   LinkTopic       =   "Form1"
   ScaleHeight     =   6690
   ScaleWidth      =   10860
   StartUpPosition =   3  '����ȱʡ
   Begin VB.CommandButton Command4 
      Caption         =   "��ȡ���ֵ"
      BeginProperty Font 
         Name            =   "����"
         Size            =   26.25
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   975
      Left            =   9480
      TabIndex        =   11
      Top             =   3720
      Width           =   3495
   End
   Begin VB.CommandButton Command3 
      Caption         =   "��ǰѡ����"
      Height          =   495
      Left            =   7200
      TabIndex        =   6
      Top             =   5160
      Width           =   1455
   End
   Begin VB.CommandButton Command2 
      Caption         =   "�Ƴ�"
      Height          =   495
      Left            =   5640
      TabIndex        =   5
      Top             =   5160
      Width           =   1455
   End
   Begin VB.CommandButton Command1 
      Caption         =   "¼��"
      Height          =   495
      Left            =   3840
      TabIndex        =   4
      Top             =   5160
      Width           =   1455
   End
   Begin VB.TextBox Text1 
      Height          =   495
      Left            =   1440
      TabIndex        =   2
      Top             =   5160
      Width           =   1935
   End
   Begin VB.Frame Frame1 
      Caption         =   "��������"
      Height          =   4455
      Left            =   360
      TabIndex        =   0
      Top             =   360
      Width           =   8415
      Begin VB.ListBox List1 
         Height          =   2940
         Left            =   240
         TabIndex        =   3
         Top             =   480
         Width           =   3735
      End
   End
   Begin VB.Label Label5 
      Height          =   975
      Left            =   11520
      TabIndex        =   10
      Top             =   2160
      Width           =   2415
   End
   Begin VB.Label Label4 
      Height          =   975
      Left            =   11520
      TabIndex        =   9
      Top             =   600
      Width           =   2415
   End
   Begin VB.Label Label3 
      AutoSize        =   -1  'True
      Caption         =   "��Сֵ"
      BeginProperty Font 
         Name            =   "����"
         Size            =   26.25
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   525
      Left            =   9120
      TabIndex        =   8
      Top             =   2160
      Width           =   1575
   End
   Begin VB.Label Label2 
      AutoSize        =   -1  'True
      Caption         =   "���ֵ"
      BeginProperty Font 
         Name            =   "����"
         Size            =   26.25
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   525
      Left            =   9120
      TabIndex        =   7
      Top             =   600
      Width           =   1575
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      Caption         =   "����"
      BeginProperty Font 
         Name            =   "����"
         Size            =   15.75
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   315
      Left            =   480
      TabIndex        =   1
      Top             =   5280
      Width           =   630
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
List1.AddItem (Text1.Text)
End Sub

Private Sub Command2_Click()
List1.RemoveItem (0)
End Sub

Private Sub Command3_Click()
MsgBox List1.ListIndex
End Sub

Private Sub Command4_Click()
Dim i As Integer
Dim max As Integer
Dim min As Integer
max = Val(List1.List(0))
min = Val(List1.List(0))
For i = 0 To List1.ListCount - 1 Step 1
    If Val(List1.List(i)) > max Then max = Val(List1.List(i))
    If Val(List1.List(i)) < max Then min = Val(List1.List(i))
Next i
Label4.Caption = max
Label5.Caption = min
End Sub
