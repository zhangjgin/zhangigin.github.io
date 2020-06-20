VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "管理统计成绩"
   ClientHeight    =   5955
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   9360
   LinkTopic       =   "Form1"
   ScaleHeight     =   5955
   ScaleWidth      =   9360
   StartUpPosition =   3  '窗口缺省
   Begin VB.Frame Frame1 
      Caption         =   "统计区域"
      Height          =   5295
      Left            =   5760
      TabIndex        =   4
      Top             =   480
      Width           =   3375
      Begin VB.Label Label7 
         Alignment       =   2  'Center
         Caption         =   "不及格"
         BeginProperty Font 
            Name            =   "宋体"
            Size            =   15
            Charset         =   134
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   480
         TabIndex        =   10
         Top             =   3360
         Width           =   2415
      End
      Begin VB.Label Label6 
         Alignment       =   2  'Center
         BackColor       =   &H000080FF&
         BeginProperty Font 
            Name            =   "宋体"
            Size            =   15
            Charset         =   134
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   735
         Left            =   480
         TabIndex        =   9
         Top             =   3840
         Width           =   2415
      End
      Begin VB.Label Label5 
         Alignment       =   2  'Center
         BackColor       =   &H000080FF&
         BeginProperty Font 
            Name            =   "宋体"
            Size            =   15
            Charset         =   134
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   735
         Left            =   480
         TabIndex        =   8
         Top             =   2400
         Width           =   2415
      End
      Begin VB.Label Label3 
         Alignment       =   2  'Center
         BackColor       =   &H000080FF&
         BeginProperty Font 
            Name            =   "宋体"
            Size            =   15
            Charset         =   134
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   735
         Left            =   480
         TabIndex        =   7
         Top             =   960
         Width           =   2415
      End
      Begin VB.Label Label4 
         Alignment       =   2  'Center
         Caption         =   "及格"
         BeginProperty Font 
            Name            =   "宋体"
            Size            =   15
            Charset         =   134
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   480
         TabIndex        =   6
         Top             =   1920
         Width           =   2415
      End
      Begin VB.Label Label2 
         Alignment       =   2  'Center
         Caption         =   "优秀"
         BeginProperty Font 
            Name            =   "宋体"
            Size            =   15
            Charset         =   134
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   600
         TabIndex        =   5
         Top             =   480
         Width           =   1935
      End
   End
   Begin VB.ListBox List1 
      Height          =   4560
      Left            =   240
      TabIndex        =   3
      Top             =   1200
      Width           =   5175
   End
   Begin VB.CommandButton Command1 
      Caption         =   "录入"
      Height          =   615
      Left            =   3960
      TabIndex        =   2
      Top             =   360
      Width           =   1335
   End
   Begin VB.TextBox Text1 
      Height          =   615
      Left            =   1440
      TabIndex        =   1
      Top             =   360
      Width           =   1935
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      Caption         =   "成绩"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   21.75
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   435
      Left            =   240
      TabIndex        =   0
      Top             =   360
      Width           =   870
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
If Val(Text1.Text) <= 100 Then
    List1.AddItem Val(Text1.Text)
End If

Dim i%
Label3.Caption = ""
Label5.Caption = ""
Label6.Caption = ""
For i = 0 To List1.ListCount - 1 Step 1

    Select Case Val(List1.List(i))
        Case 90 To 100
            Label3.Caption = Val(Label3.Caption) + 1
        Case 60 To 89
            Label3.Caption = Val(Label5.Caption) + 1
        Case 0 To 59
            Label3.Caption = Val(Label6.Caption) + 1
    End Select
Next i
End Sub
