Module Module1
    Dim cont As Integer = 0 'Contador
    Dim Pila = "ABC" 'Torres


    Sub Main()
        Dim piezas As Integer 'Almacena cuantas piezas tendra la torre
        Dim A As Boolean = True
        Console.WriteLine("----------TORRE HANOI----------")
        While A
            Try
                Console.WriteLine("Dijita la cantidad de piesas")
                Console.WriteLine("Para salir digita 0")
                piezas = Console.ReadLine
                Select Case piezas
                    Case 0
                        A = False
                    Case Else
                        Torre_Hanoi(piezas, 2, 3)
                        Console.WriteLine("")
                End Select
            Catch ex As Exception
                Console.WriteLine("Caracter Invalido")
            End Try
        End While
        Console.ReadLine()
    End Sub

    'Piesas Cantidad de piesas
    'InicioTorre columna donde iniciara
    'FinTorre columna donde terminara
    Sub Torre_Hanoi(Piesas As Integer, InicioTorre As Integer, FinTorre As Integer)
        If Piesas = 0 Then ' cuando las piesas sen iguales a cero se saldra del procedimiento
            Return
        End If

        'Se calcula proxima columna
        ' El 6 es el doble de las tres torres
        ' se resta con la columna que inicia y se resta con la que termina
        Dim media_pila = 6 - InicioTorre - FinTorre

        'Se vulve a llamar el mismo prosedimiento pero retandole una pieza y 
        'la ultima columna se envia la variale media_pila
        Torre_Hanoi(Piesas - 1, InicioTorre, media_pila)

        'Se suma la cantidad de movimientos
        cont = cont + 1
        'Se Imprime el movimiento que se debe realizar de cada pieza 
        'diciendo en donde esta ubicada y en que columna debera colocarla
        Dim text = String.Format("Pieza {0} de {1} a {2}, movimiento {3}", Piesas, Pila(InicioTorre - 1), Pila(FinTorre - 1), cont)

        Console.WriteLine(text)

        'se llama nuevamente el procedimiento otra ves restando la cantidad de piezas
        'la columna inicila sera la variable media_pila y la columna final se envara la variable
        'FinTorre
        Torre_Hanoi(Piesas - 1, media_pila, FinTorre)


    End Sub

End Module
