Imports Quiz

Public Class TRIANGULO
    Implements AREA_PERIMETRO

    Public Function AREA(base As Double, Optional altura As Double = 0) As Object Implements AREA_PERIMETRO.AREA
        Return base * altura
    End Function

    Public Function PERIMETRO(ladoA As Double, Optional ladob As Double = 0, Optional ladoc As Double = 0) As Object Implements AREA_PERIMETRO.PERIMETRO
        Return ladoA + ladob + ladoc
    End Function
End Class
