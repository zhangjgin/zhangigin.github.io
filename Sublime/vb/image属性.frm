VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   8130
   ClientLeft      =   60
   ClientTop       =   405
   ClientWidth     =   13890
   LinkTopic       =   "Form1"
   ScaleHeight     =   8130
   ScaleWidth      =   13890
   StartUpPosition =   3  '¥∞ø⁄»± °
   Begin VB.CommandButton Command2 
      Caption         =   "Ωªªª2"
      Height          =   975
      Left            =   5880
      TabIndex        =   1
      Top             =   2760
      Width           =   1455
   End
   Begin VB.CommandButton Command1 
      Caption         =   "Ωªªª1"
      Height          =   975
      Left            =   5880
      TabIndex        =   0
      Top             =   720
      Width           =   1455
   End
   Begin VB.Image Image3 
      Height          =   3375
      Left            =   0
      Stretch         =   -1  'True
      Top             =   4680
      Visible         =   0   'False
      Width           =   5295
   End
   Begin VB.Image Image2 
      Height          =   4035
      Left            =   7800
      Picture         =   "image Ù–‘.frx":0000
      Stretch         =   -1  'True
      Top             =   360
      Width           =   5250
   End
   Begin VB.Image Image1 
      BorderStyle     =   1  'Fixed Single
      Height          =   3840
      Left            =   0
      Picture         =   "image Ù–‘.frx":17558
      Stretch         =   -1  'True
      Top             =   360
      Width           =   5295
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim n As Integer
Private Sub Command1_Click()
Image3.Picture = Image1.Picture
Image1.Picture = Image2.Picture
Image2.Picture = Image3.Picture
End Sub

Private Sub Command2_Click()
If n = 0 Then
Image1.Picture = LoadPicture(App.Path & "/Õº∆¨/360.jpg")
Image2.Picture = LoadPicture(App.Path & "/Õº∆¨/qq.jpg")
n = 1
Else
Image1.Picture = LoadPicture(App.Path & "/Õº∆¨/qq.jpg")
Image2.Picture = LoadPicture(App.Path & "/Õº∆¨/360.jpg")
n = 0
End If
End Sub
