VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "文件管理"
   ClientHeight    =   5805
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   9990
   LinkTopic       =   "Form1"
   ScaleHeight     =   5805
   ScaleWidth      =   9990
   StartUpPosition =   3  '窗口缺省
   Begin VB.FileListBox File1 
      Height          =   4770
      Left            =   3840
      TabIndex        =   2
      Top             =   600
      Width           =   4575
   End
   Begin VB.DirListBox Dir1 
      Height          =   3240
      Left            =   600
      TabIndex        =   1
      Top             =   840
      Width           =   2775
   End
   Begin VB.DriveListBox Drive1 
      Height          =   300
      Left            =   600
      TabIndex        =   0
      Top             =   480
      Width           =   2775
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Dir1_Change()
File1.Path = Dir1.Path
End Sub

Private Sub Drive1_Change()
'屏蔽报错
On Error Resume Next
Dir1.Path = Drive1.Drive
End Sub
