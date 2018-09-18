Module Module1

    'Se crea funcion fibonacci en cual recibe la cantidad de numeros a mostrar de la seria fibonacci
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
        Dim cantidad 'Almacena la cantidad de numeros de la serie de fibonacci a mostrar
        Dim cont As Integer 'contador en cual es usado para los intentos que le quedan al usuario
        Dim a As Boolean = True 'Almacena True para repetir sin fin el bucle while, si llegara ser false se terminara el bucle
        Console.WriteLine("Digita la cantidad de numeros a mostrar de la serie de fibonacci")
        While a = True
            Try
                Console.WriteLine("")
                Console.WriteLine("Digita un numero:")
                cantidad = Console.ReadLine
                Console.WriteLine("")
                'si es numerico, mayor a 0 y menor a 47 entrara a la funcion fibonacci
                If IsNumeric(cantidad) And cantidad > 0 And cantidad < 47 Then
                    fibonacci(cantidad) 'se llama la funcion enviado el valor
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

            'si el contador llegara ser igual a 3 se acaba el bucle while
            If cont = 3 Then
                a = False
                Console.WriteLine("Agotaste tu cantidad de intentos")
            End If

        End While
        Console.WriteLine("Adios")
        Console.ReadLine()
    End Sub



End Module
