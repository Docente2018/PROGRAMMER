Imports System
Imports System.Collections

Module Program
    Sub Main(args As String())
        Dim P As Persona = New Persona
        Dim c As Canario = New Canario
        HacerCantar(P)

        HacerCantar(c)
        Console.ReadLine()
    End Sub

    Public Sub HacerCantar(c As Cantante)
        c.Cantante()

    End Sub

End Module
