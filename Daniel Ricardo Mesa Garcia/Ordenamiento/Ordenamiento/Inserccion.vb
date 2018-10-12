Public Class Inserccion
    Public Function insertionSort(ByVal numbers() As Integer) ' Es una función, 
        'debemos pasarle el array de números desde el Sub Main()

        Dim i, j, index As Integer
        i = 1

        'Se recorre todo el arry segun la cantidad de arrglos definidos
        For i = 1 To (UBound(numbers))
            'el index almacenara el dato en esa poscicion del arreglo 
            index = numbers(i)
            'sera la posicion aterior de la variable i
            j = 0
            j = (i - 1)

            'mientras que j sea mayor o igual a cero se ejecutara el while
            If j >= 0 Then
                While (j >= 0) And (numbers(j) > index)
                    ' se van disminullendo j en uno en uno
                    ' y se van organizando si el vector en la pocicion j es mayor al
                    ' index es remplazado
                    numbers(j + 1) = numbers(j)
                    j = j - 1
                    If j < 0 Then Exit While
                End While
            End If
            'al final del ciclo for  el numero que esta almacenado en el idex
            'lo almacenara ahora el vector de la posicion j mas 1
            numbers(j + 1) = index
        Next i

        Return numbers
    End Function
End Class
