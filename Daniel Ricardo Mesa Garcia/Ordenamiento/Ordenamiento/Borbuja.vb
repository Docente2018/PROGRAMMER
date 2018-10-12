Public Class Borbuja
    Public Function metodoburbuja(ByVal numeros() As Integer)
        'Declaramos los datos que vamos a usar
        Dim aux As Double
        Dim i, j As Integer

        'Recoriendo el vector en cada posicion
        For i = 1 To numeros.Length - 1
            For j = 0 To numeros.Length - i - 1
                ' Si el numero del vector que esta en la posicion j es mayar la la sigugiente posicion
                ' el numero de la siguiente posicion es  almacenado e una variable auxiliar
                ' el vector de la siguiente pocicion sera ifual al de la pocicion actual
                ' y por ultimo el varctor de la pocicion actual sera igual a numero que se almaceno
                '  en la variable aux
                If (numeros(j) > numeros(j + 1)) Then
                    aux = numeros(j + 1)
                    numeros(j + 1) = numeros(j)
                    numeros(j) = aux
                End If
            Next
        Next
        Return numeros
    End Function
End Class
