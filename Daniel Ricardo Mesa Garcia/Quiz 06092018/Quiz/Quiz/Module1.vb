Module Module1

    Sub Main()
        Dim Figura As Calcular = New Calcular
        Dim Base, Altura, Radio, LadoA, LadoB, LadoC As Double
        Dim a As Boolean

        a = True

        While a = True
            Try
                Console.WriteLine("AREAS Y PERIMETROS DE FIGURAS GEOMETRICAS")
                Console.WriteLine("1: Triangulo")
                Console.WriteLine("2: Cuadrado")
                Console.WriteLine("3: Rectangulo")
                Console.WriteLine("4: Circulo")
                Console.WriteLine("5: Salir")
                Select Case Console.ReadLine
                    Case 1
                        Console.WriteLine("Digite la base")
                        Base = Console.ReadLine
                        Console.WriteLine("Digite la Altura")
                        Altura = Console.ReadLine
                        Console.WriteLine("Digite el Lado A")
                        LadoA = Console.ReadLine
                        Console.WriteLine("Digite el Lado B")
                        LadoB = Console.ReadLine
                        Console.WriteLine("Digite el Lado C")
                        LadoC = Console.ReadLine
                        Console.WriteLine("Area del triangulo: " & Figura.Tri.AREA(Base, Altura))
                        Console.WriteLine("Perimetro del triangulo: " & Figura.Tri.PERIMETRO(LadoA, LadoB, LadoC))
                    Case 2
                        Console.WriteLine("Digite el Lado del cuadrado")
                        LadoA = Console.ReadLine
                        Console.WriteLine("Area del Cuadrado: " & Figura.Cua.AREA(LadoA))
                        Console.WriteLine("Perimetro del Cuadrado: " & Figura.Cua.PERIMETRO(LadoA))
                    Case 3
                        Console.WriteLine("Digite la Base del Rectangulo")
                        Base = Console.ReadLine
                        Console.WriteLine("Digite la Altura del Rectangulo")
                        Altura = Console.ReadLine
                        Console.WriteLine("Area del Rectangulo: " & Figura.Rec.AREA(Base, Altura))
                        Console.WriteLine("Perimetro del Rectangulo: " & Figura.Rec.PERIMETRO(Base, Altura))
                    Case 4
                        Console.WriteLine("Digite el Radio del Circulo")
                        Radio = Console.ReadLine
                        Console.WriteLine("Area del Circulo: " & Figura.Rec.AREA(Radio))
                        Console.WriteLine("Perimetro del Circulo: " & Figura.Rec.PERIMETRO(Radio))
                    Case 5
                        Console.WriteLine("Adios")
                        a = False
                    Case Else
                        Console.WriteLine("Caracter Invalido")
                End Select
            Catch ex As Exception
                Console.WriteLine("Caracter invalido")
            End Try
            Console.ReadLine()
        End While
    End Sub

    Class Calcular
        Public Tri As TRIANGULO = New TRIANGULO
        Public Cua As Cuadrado = New Cuadrado
        Public Rec As Rectangulo = New Rectangulo
        Public Cir As Circulo = New Circulo
    End Class

End Module
