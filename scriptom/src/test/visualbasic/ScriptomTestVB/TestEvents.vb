Option Explicit On
Option Strict On
Option Compare Binary

<Microsoft.VisualBasic.ComClass()> Public Class TestEvents
    Public Event OnPassBooleanByref(ByRef Value As Boolean)
    Public Event OnPassIntegerByref(ByRef Value As Integer)
    Public Event OnPassStringByref(ByRef Value As String)
    Public Event OnPassDateByref(ByRef Value As Date)

    Public Function RaisePassBooleanByref(ByVal Value As Boolean) As Boolean
        RaiseEvent OnPassBooleanByref(Value)
        Return Value
    End Function

    Public Function RaisePassIntegerByref(ByVal Value As Integer) As Integer
        RaiseEvent OnPassIntegerByref(Value)
        Return Value
    End Function

    Public Function RaisePassStringByref(ByVal Value As String) As String
        RaiseEvent OnPassStringByref(Value)
        Return Value
    End Function

    Public Function RaisePassDateByref(ByVal Value As Date) As Date
        RaiseEvent OnPassDateByref(Value)
        Return Value
    End Function
End Class
