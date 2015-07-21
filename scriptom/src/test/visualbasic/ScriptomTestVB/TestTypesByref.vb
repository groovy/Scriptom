Public Class TestTypesByref
    Public Sub TestBoolean(ByRef A As Boolean)
        A = Not A
    End Sub

    Public Sub TestByte(ByRef A As Byte)
        A = A And &HF
    End Sub

    Public Sub TestShort(ByRef A As Short, Optional ByVal Addend As Integer = 1)
        A = A + Addend
    End Sub

    Public Sub TestUShort(ByRef A As UShort, Optional ByVal Addend As Integer = 1)
        A = A + Addend
    End Sub

    Public Sub TestInteger(ByRef A As Integer, Optional ByVal Addend As Integer = 1)
        A = A + Addend
    End Sub

    Public Sub TestUInteger(ByRef A As UInteger, Optional ByVal Addend As Integer = 1)
        A = A + Addend
    End Sub

    Public Sub TestLong(ByRef A As Long, Optional ByVal Addend As Long = 1)
        A = A + Addend
    End Sub

    Public Sub TestULong(ByRef A As ULong, Optional ByVal Addend As Long = 1)
        A = A + Addend
    End Sub

    Public Sub TestSingle(ByRef A As Single, Optional ByVal Addend As Double = 1.0)
        A = A + Addend
    End Sub

    Public Sub TestDouble(ByRef A As Double, Optional ByVal Addend As Double = 1.0)
        A = A + Addend
    End Sub

    Public Sub TestDecimal(ByRef A As Decimal, Optional ByVal Addend As Decimal = 1)
        A = A + Addend
    End Sub

    Public Sub TestDate(ByRef A As Date)
        A = DateAdd(DateInterval.Day, 1, A)
    End Sub

    Public Sub TestString(ByRef A As String)
        A = "VB:" & A
    End Sub

    Public Sub TestObject(ByRef A As TestComObject)
        A = New TestComObject().Init("VB:" & A.Value)
        Console.WriteLine("New value is '" & A.Value & "'")
    End Sub
End Class

