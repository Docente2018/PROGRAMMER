Imports System
Imports Colores

Module Program
    Sub Main(args As String())
        Dim a As Boolean
        Dim Color As Integer
        Dim am As Amarillo = New Amarillo
        Dim b As blue = New blue
        Dim c As Cian = New Cian
        Dim r As Rojo = New Rojo
        Dim g As green = New green
        Dim gr As gray = New gray
        Dim N As Negro = New Negro

        a = True
        While a
            Console.WriteLine("Eligue un color")
            Console.WriteLine("1 = Amarillo")
            Console.WriteLine("2 = Blue")
            Console.WriteLine("3 = Cielo")
            Console.WriteLine("4 = Rojo")
            Console.WriteLine("5 = Verde")
            Console.WriteLine("6 = Gris")
            Console.WriteLine("7-9 = Negro")
            Console.WriteLine("0 = Salir")

            Try
                Color = Console.ReadLine
                Select Case Color
                    Case 0 : a = False
                    Case 1 : MostrarColor(am)
                    Case 2 : MostrarColor(b)
                    Case 3 : MostrarColor(c)
                    Case 4 : MostrarColor(r)
                    Case 5 : MostrarColor(g)
                    Case 6 : MostrarColor(gr)
                    Case 7, 8, 9 : MostrarColor(N)
                End Select

            Catch ex As Exception
                Console.WriteLine("Caracter invalido!!!!!!!")
                Console.WriteLine("Intente de nuevo")
                Console.WriteLine("")
            End Try


        End While

        Console.WriteLine("Eso fue todo")
        Console.ReadLine()

    End Sub
    Public Sub MostrarColor(c As Colores)
        c.Primario()
    End Sub

    Class Negro
        Implements Colores
        Sub Color() Implements Colores.Primario
            Console.BackgroundColor = ConsoleColor.Black
            Console.ForegroundColor = ConsoleColor.White
            Console.WriteLine("Negro")
        End Sub
    End Class
    Class Amarillo
        Implements Colores
        Sub Color() Implements Colores.Primario
            Console.BackgroundColor = ConsoleColor.Yellow
            Console.ForegroundColor = ConsoleColor.Black
            Console.WriteLine("Amarillo")
        End Sub
    End Class

    Class blue
        Implements Colores
        Sub Color() Implements Colores.Primario
            Console.BackgroundColor = ConsoleColor.Blue
            Console.ForegroundColor = ConsoleColor.Black
            Console.WriteLine("Azul")
        End Sub
    End Class

    Class Cian
        Implements Colores
        Sub Color() Implements Colores.Primario
            Console.BackgroundColor = ConsoleColor.Cyan
            Console.ForegroundColor = ConsoleColor.Black
            Console.WriteLine("Cian")
        End Sub
    End Class

    Class Rojo
        Implements Colores
        Sub Color() Implements Colores.Primario
            Console.BackgroundColor = ConsoleColor.Red
            Console.ForegroundColor = ConsoleColor.Black
            Console.WriteLine("Rojo")
        End Sub
    End Class

    Class green
        Implements Colores
        Sub Color() Implements Colores.Primario
            Console.BackgroundColor = ConsoleColor.Green
            Console.ForegroundColor = ConsoleColor.Black
            Console.WriteLine("Verde")
        End Sub
    End Class

    Class gray
        Implements Colores
        Sub Color() Implements Colores.Primario
            Console.BackgroundColor = ConsoleColor.Gray
            Console.ForegroundColor = ConsoleColor.Black
            Console.WriteLine("Gris")
        End Sub
    End Class
End Module
