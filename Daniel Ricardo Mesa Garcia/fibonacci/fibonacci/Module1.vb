Module Module1
    Sub fibonacci(cantidad As Integer)
        Dim A As Integer = 1
        Dim B As Integer
        Dim C As Integer

        Console.WriteLine("----------------")
        For X = 1 To cantidad
            Console.WriteLine(C & "  -" & X)
            C = A + B
            A = B
            B = C
        Next
        Console.WriteLine("----------------")

    End Sub
    Sub Main()
        Dim cantidad
        Dim cont As Integer
        Dim a As Boolean = True
        Console.WriteLine("Digita la cantidad de numeros a mostrar de la serie de fibonacci")
        While a = True
            Try
                Console.WriteLine("")
                Console.WriteLine("Digita un numero:")
                cantidad = Console.ReadLine
                Console.WriteLine("")
                If IsNumeric(cantidad) And cantidad > 0 And cantidad < 47 Then
                    fibonacci(cantidad)
                ElseIf cantidad >= 47 Then
                    cont = cont + 1
                    Console.WriteLine("Excediste el maximo")
                    Console.WriteLine("Te quedad " & 3 - cont & " Intento")
                Else
                    cont = cont + 1
                    Console.WriteLine("Te quedad " & 3 - cont & " Intento")
                End If
            Catch ex As Exception
                cont = cont + 1
                Console.WriteLine("Te quedad " & 3 - cont & " Intento")
            End Try

            If cont = 3 Then
                a = False
                Console.WriteLine("Agotaste tu cantidad de intentos")
            End If

        End While
        Console.WriteLine("Adios")
        Console.ReadLine()
    End Sub



End Module
