Option Explicit On
Option Strict On
Option Compare Binary

<Microsoft.VisualBasic.ComClass()> Public Class TestComObject
    Private _Value As String

    Public Function Init(ByVal V As String) As TestComObject
        _Value = V
        Return Me
    End Function

    Public ReadOnly Property Value() As String
        Get
            Return _Value
        End Get
    End Property
End Class