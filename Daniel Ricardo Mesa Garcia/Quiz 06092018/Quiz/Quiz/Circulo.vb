Imports Quiz

Public Class Circulo
    Implements AREA_PERIMETRO
    Private Pi As Double = 3.1415926535897931
    Public Function AREA(base As Double, Optional altura As Double = 0) As Object Implements AREA_PERIMETRO.AREA
        Return (base ^ 2) * Pi
    End Function

    Public Function PERIMETRO(ladoA As Double, Optional ladob As Double = 0, Optional ladoc As Double = 0) As Object Implements AREA_PERIMETRO.PERIMETRO
        Return (2 * Pi) * ladoA
    End Function
End Class
