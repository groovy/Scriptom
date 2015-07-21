Option Explicit On
Option Strict On
Option Compare Binary

<Microsoft.VisualBasic.ComClass()> Public Class TestArrays
    Public Function Pass1DStringArray(ByVal A As String()) As String()
        For I As Integer = A.GetLowerBound(0) To A.GetUpperBound(0)
            A(I) = "VB:" + A(I)
        Next I
        Return A
    End Function

    Public Sub Pass1DStringArrayByref(ByVal A As String())
        For I As Integer = A.GetLowerBound(0) To A.GetUpperBound(0)
            A(I) = "VB:" + A(I)
        Next I
    End Sub
End Class
