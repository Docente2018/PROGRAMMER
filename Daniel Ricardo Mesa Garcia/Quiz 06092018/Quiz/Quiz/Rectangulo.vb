Imports Quiz

Public Class Rectangulo
    Implements AREA_PERIMETRO

    Public Function AREA(num1 As Double, Optional num2 As Double = 0) As Object Implements AREA_PERIMETRO.AREA
        Return num1 * num2
    End Function

    Public Function PERIMETRO(ladoA As Double, Optional ladob As Double = 0, Optional ladoc As Double = 0) As Object Implements AREA_PERIMETRO.PERIMETRO
        Return 2 * (ladoA + ladob)
    End Function
End Class
