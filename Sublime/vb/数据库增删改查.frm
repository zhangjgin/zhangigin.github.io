VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   6675
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   11460
   LinkTopic       =   "Form1"
   ScaleHeight     =   6675
   ScaleWidth      =   11460
   StartUpPosition =   3  '����ȱʡ
   Begin VB.CommandButton Command2 
      Caption         =   "������"
      Height          =   855
      Left            =   5400
      TabIndex        =   7
      Top             =   5160
      Width           =   2055
   End
   Begin VB.ComboBox Combo1 
      Height          =   300
      ItemData        =   "���ݿ���ɾ�Ĳ�.frx":0000
      Left            =   2400
      List            =   "���ݿ���ɾ�Ĳ�.frx":000A
      TabIndex        =   6
      Text            =   "��"
      Top             =   2520
      Width           =   2535
   End
   Begin VB.TextBox Text2 
      Height          =   615
      Left            =   2400
      TabIndex        =   3
      Top             =   1560
      Width           =   2535
   End
   Begin VB.TextBox Text1 
      Height          =   615
      Left            =   2400
      TabIndex        =   1
      Top             =   600
      Width           =   2535
   End
   Begin VB.CommandButton Command1 
      Caption         =   "��������"
      Height          =   855
      Left            =   8280
      TabIndex        =   0
      Top             =   5160
      Width           =   2055
   End
   Begin VB.Label Label3 
      AutoSize        =   -1  'True
      Caption         =   "�Ա�"
      BeginProperty Font 
         Name            =   "����"
         Size            =   12
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   240
      Left            =   1440
      TabIndex        =   5
      Top             =   2520
      Width           =   510
   End
   Begin VB.Label Label2 
      AutoSize        =   -1  'True
      Caption         =   "����"
      BeginProperty Font 
         Name            =   "����"
         Size            =   12
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   240
      Left            =   1440
      TabIndex        =   4
      Top             =   1680
      Width           =   510
   End
   Begin VB.Label Label1 
      AutoSize        =   -1  'True
      Caption         =   "�û���"
      BeginProperty Font 
         Name            =   "����"
         Size            =   12
         Charset         =   134
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   240
      Left            =   1440
      TabIndex        =   2
      Top             =   720
      Width           =   765
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim conn As New ADODB.Connection '�������������Ӷ���
Dim rs As ADODB.Recordset '�������Ӷ���
Dim sql$
Private Sub Command1_Click()
 If conn.State = 0 Then
    conn.ConnectionString = "Provider=Microsoft.jet.OLEDB.4.0;Data Source=" & App.Path & "\���ݿ�\Test.mdb;Persist Security Info=False"
    conn.Open '�����ݿ�
 End If
 'SQL�������
  sql = "insert into [users]([username],[password],[sex]) values('" & Text1.Text & "','" & Text2.Text & "','" & Combo1.Text & "')"
  '�������ݼ����������
  Set rs = New ADODB.Recordset
  rs.Open sql, conn, adOpenKeyset, adLockBatchOptimistic
  
End Sub

Private Sub Command2_Click()
Form2.Show
End Sub
