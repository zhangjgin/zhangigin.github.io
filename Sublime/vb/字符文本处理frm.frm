VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   6360
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   15045
   LinkTopic       =   "Form1"
   ScaleHeight     =   6360
   ScaleWidth      =   15045
   StartUpPosition =   2  '��Ļ����
   Begin VB.Frame Frame3 
      Caption         =   "�޸�����"
      Height          =   5175
      Left            =   10200
      TabIndex        =   12
      Top             =   960
      Width           =   4215
      Begin VB.TextBox Text5 
         Height          =   615
         Left            =   600
         TabIndex        =   18
         Top             =   960
         Width           =   2535
      End
      Begin VB.CommandButton Command3 
         Caption         =   "ȷ��"
         Height          =   735
         Left            =   1080
         TabIndex        =   15
         Top             =   3960
         Width           =   1695
      End
      Begin VB.TextBox Text4 
         Height          =   615
         IMEMode         =   3  'DISABLE
         Left            =   600
         PasswordChar    =   "*"
         TabIndex        =   14
         Top             =   3240
         Width           =   2535
      End
      Begin VB.TextBox Text3 
         Height          =   615
         IMEMode         =   3  'DISABLE
         Left            =   600
         PasswordChar    =   "*"
         TabIndex        =   13
         Top             =   2160
         Width           =   2535
      End
      Begin VB.Label Label7 
         Alignment       =   2  'Center
         Caption         =   "ԭ����"
         BeginProperty Font 
            Name            =   "����"
            Size            =   15
            Charset         =   134
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   840
         TabIndex        =   19
         Top             =   1680
         Width           =   1935
      End
      Begin VB.Label Label6 
         Alignment       =   2  'Center
         Caption         =   "������"
         BeginProperty Font 
            Name            =   "����"
            Size            =   12
            Charset         =   134
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   720
         TabIndex        =   17
         Top             =   2880
         Width           =   2175
      End
      Begin VB.Label Label5 
         Alignment       =   2  'Center
         Caption         =   "�û���"
         BeginProperty Font 
            Name            =   "����"
            Size            =   12
            Charset         =   134
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   375
         Left            =   720
         TabIndex        =   16
         Top             =   600
         Width           =   2295
      End
   End
   Begin VB.Frame Frame2 
      Caption         =   "��½��"
      Height          =   5175
      Left            =   5520
      TabIndex        =   6
      Top             =   960
      Width           =   4215
      Begin VB.TextBox textuser 
         Height          =   615
         Left            =   600
         TabIndex        =   9
         Top             =   960
         Width           =   2535
      End
      Begin VB.TextBox textpassword 
         Height          =   615
         IMEMode         =   3  'DISABLE
         Left            =   600
         PasswordChar    =   "*"
         TabIndex        =   8
         Top             =   2160
         Width           =   2535
      End
      Begin VB.CommandButton Command2 
         Caption         =   "��½"
         Height          =   735
         Left            =   1080
         TabIndex        =   7
         Top             =   3120
         Width           =   1695
      End
      Begin VB.Label Label4 
         Alignment       =   2  'Center
         Caption         =   "�û���"
         BeginProperty Font 
            Name            =   "����"
            Size            =   12
            Charset         =   134
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   375
         Left            =   720
         TabIndex        =   11
         Top             =   600
         Width           =   2295
      End
      Begin VB.Label Label3 
         Alignment       =   2  'Center
         Caption         =   "����"
         BeginProperty Font 
            Name            =   "����"
            Size            =   12
            Charset         =   134
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   720
         TabIndex        =   10
         Top             =   1680
         Width           =   2175
      End
   End
   Begin VB.Frame Frame1 
      Caption         =   "ע����"
      Height          =   5175
      Left            =   360
      TabIndex        =   0
      Top             =   960
      Width           =   4215
      Begin VB.CommandButton Command1 
         Caption         =   "ע��"
         Height          =   735
         Left            =   1080
         TabIndex        =   5
         Top             =   3120
         Width           =   1695
      End
      Begin VB.TextBox Text2 
         Height          =   615
         IMEMode         =   3  'DISABLE
         Left            =   600
         PasswordChar    =   "*"
         TabIndex        =   3
         Top             =   2160
         Width           =   2535
      End
      Begin VB.TextBox Text1 
         Height          =   615
         Left            =   600
         TabIndex        =   2
         Top             =   960
         Width           =   2535
      End
      Begin VB.Label Label2 
         Alignment       =   2  'Center
         Caption         =   "����"
         BeginProperty Font 
            Name            =   "����"
            Size            =   12
            Charset         =   134
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   495
         Left            =   720
         TabIndex        =   4
         Top             =   1680
         Width           =   2175
      End
      Begin VB.Label Label1 
         Alignment       =   2  'Center
         Caption         =   "�û���"
         BeginProperty Font 
            Name            =   "����"
            Size            =   12
            Charset         =   134
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   375
         Left            =   720
         TabIndex        =   1
         Top             =   600
         Width           =   2295
      End
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False

Private Sub Command1_Click()
Dim user$
user = Trim(Text1.Text) & "," & Trim(Text2.Text)
Open App.Path & "/�ı�/usertable.txt" For Append As #1
    Print #1, user
Close #1

End Sub

Private Sub Command2_Click()
Open App.Path & "/�ı�/usertable.txt" For Input As #1
    Dim canlogin As Boolean
        Do Until EOF(1)
        Dim t$
        Line Input #1, t
'        Print t
        Dim u() As String
        u = Split(t, ",")
'        u = Split(t, Chr(9))
'        Print u(0)
        If u(0) = Trim(textuser.Text) _
            And u(1) = Trim(textpassword.Text) Then
            Form2.Show
            Unload Form1
            canlogin = True
            Exit Do
        End If
    Loop
    If Not canlogin Then MsgBox "�û�����������󣡣���"
Close #1
End Sub

Private Sub Command3_Click()
Dim s$
Dim canlogin As Boolean
Open App.Path & "/�ı�/usertable.txt" For Input As #1
    
    Do Until EOF(1)
        Dim t$
        Line Input #1, t
'        Print t
        Dim u() As String
        u = Split(t, ",")
'        Print u(0)
        If u(0) = Trim(Text5.Text) _
            And u(1) = Trim(Text3.Text) Then
'            Form2.Show
'            Unload Form1
            canlogin = True
            u(1) = Trim(Text4.Text)
        End If
        t = Join(u, ",")
        s = s & t & vbCrLf
    Loop
Close #1
    If Not canlogin Then
        MsgBox "ԭ������󣡣���"
    Else
        Open App.Path & "/�ı�/usertable.txt" For Output As #2
            Print #2, s
        Close #2
        MsgBox "�û���" & Text5.Text & "�����޸ĳɹ�"
    End If
End Sub
