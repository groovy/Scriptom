Option Explicit On
Option Strict On
Option Compare Binary

<Microsoft.VisualBasic.ComClass()> Public Class TestTypes
    Public Function AddDecimals(ByVal A As Decimal, ByVal B As Decimal) As Decimal
        Return A + B
    End Function

    Public Function AddLongs(ByVal A As Long, ByVal B As Long) As Long
        Return A + B
    End Function

    Public Function AddULongs(ByVal A As ULong, ByVal B As ULong) As ULong
        Return A + B
    End Function

    Public Function AddIntegers(ByVal A As Integer, ByVal B As Integer) As Integer
        Return A + B
    End Function

    Public Function AddUIntegers(ByVal A As UInteger, ByVal B As UInteger) As UInteger
        Return A + B
    End Function

    Public Function AddShorts(ByVal A As Short, ByVal B As Short) As Short
        Return A + B
    End Function

    Public Function AddUShorts(ByVal A As UShort, ByVal B As UShort) As UShort
        Return A + B
    End Function

    Public Function AddSBytes(ByVal A As SByte, ByVal B As SByte) As SByte
        Return A + B
    End Function

    Public Function AddSingles(ByVal A As Single, ByVal B As Single) As Single
        Return A + B
    End Function

    Public Function AddDoubles(ByVal A As Double, ByVal B As Double) As Double
        Return A + B
    End Function

    Public Function Invert(ByVal A As Boolean) As Boolean
        Return Not A
    End Function

    Public Function PassDate(ByVal A As Date) As Date
        Return A
    End Function

    Public Function PassString(ByVal A As String) As String
        Return "VB:" & A
    End Function

    Public Function PassObject(ByVal A As TestComObject) As TestComObject
        Return New TestComObject().Init("VB:" & A.Value)
    End Function
End Class


