VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "选择排序"
   ClientHeight    =   7590
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   10860
   LinkTopic       =   "Form1"
   ScaleHeight     =   7590
   ScaleWidth      =   10860
   StartUpPosition =   3  '窗口缺省
   Begin VB.TextBox Text3 
      Height          =   495
      Left            =   3120
      TabIndex        =   10
      Top             =   3360
      Width           =   3255
   End
   Begin VB.TextBox Text2 
      Height          =   495
      Left            =   3120
      TabIndex        =   9
      Top             =   2520
      Width           =   3255
   End
   Begin VB.CommandButton Command1 
      Caption         =   "选择排序"
      Height          =   1215
      Left            =   2520
      TabIndex        =   6
      Top             =   5640
      Width           =   4455
   End
   Begin VB.TextBox Text1 
      Height          =   735
      Index           =   4
      Left            =   8640
      TabIndex        =   5
      Text            =   "2"
      Top             =   1440
      Width           =   1815
   End
   Begin VB.TextBox Text1 
      Height          =   735
      Index           =   3
      Left            =   6480
      TabIndex        =   4
      Text            =   "3"
      Top             =   1440
      Width           =   1815
   End
   Begin VB.TextBox Text1 
      Height          =   735
      Index           =   2
      Left            =   4320
      TabIndex        =   3
      Text            =   "4"
      Top             =   1440
      Width           =   1815
   End
   Begin VB.TextBox Text1 
      Height          =   735
      Index           =   1
      Left            =   2280
      TabIndex        =   2
      Text            =   "8"
      Top             =   1440
      Width           =   1815
   End
   Begin VB.TextBox Text1 
      Height          =   735
      Index           =   0
      Left            =   240
      TabIndex        =   1
      Text            =   "1"
      Top             =   1440
      Width           =   1815
   End
   Begin VB.Label Label3 
      Alignment       =   2  'Center
      AutoSize        =   -1  'True
      Caption         =   "排序后"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   15.75
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   315
      Left            =   1200
      TabIndex        =   8
      Top             =   3480
      Width           =   975
   End
   Begin VB.Label Label2 
      Alignment       =   2  'Center
      AutoSize        =   -1  'True
      Caption         =   "排序前"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   15.75
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   315
      Left            =   1200
      TabIndex        =   7
      Top             =   2520
      Width           =   975
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      Caption         =   "输入五个值"
      BeginProperty Font 
         Name            =   "宋体"
         Size            =   18
         Charset         =   134
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   360
      Left            =   360
      TabIndex        =   0
      Top             =   480
      Width           =   1800
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()

Dim i%, j%
For i = 0 To 3 Step 1 '几次比较
    Dim mindex%
    mindex = i
    For j = i + 1 To 4 Step 1
        If Val(Text1(mindex).Text) > Val(Text1(j).Text) Then
            mindex = j
        End If
    Next j
    Dim t%
    t = Val(Text1(i).Text)
    Text1(i).Text = Val(Text1(mindex).Text)
    Text1(mindex).Text = t
    
    For j = i To 2 Step 1
    Dim s$
'    Print Text1(j).Text
    s = s + Text1(j).Text
    Text2.Text = s
    Next j
Next i
Dim p%
For p = 0 To 4 Step 1
    Dim x$
'    Print Text1(p).Text
    x = x + Text1(p).Text
    Text3.Text = x
Next p


End Sub


