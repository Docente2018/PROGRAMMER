Public Class Form1
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Call Ordenamiento()
    End Sub

    Sub Ordenamiento()
        Dim num As Integer
        Dim Stnum As String
        Dim numtem() As Integer
        Dim Stnum2 As String
        Dim titulo As String
        Dim ins As Inserccion = New Inserccion
        Dim bor As Borbuja = New Borbuja

        num = CInt(TxtNumero.Text)
        Dim Arr(num - 1) As Integer

        'se repite el ciclo segun la cantidad figitada en el TxtNumero
        For x = 0 To num - 1
            'Arr(x) = InputBox("Digita un numero", num & " de " & x + 1)
            'Genera y almacena numeros aleatorios de uno a 100
            Arr(x) = Int(1 + Rnd() * 100)
        Next

        numtem = Arr

        For i = 0 To num - 1
            Stnum2 = Stnum2 & numtem(i) & ","
        Next

        If Quitsort.Checked = True Then
            'se envia 0 porque es la pocicion inical del vector
            ' y num - 1 que corresponde la pocision final del vector
            qsort(Arr, 0, num - 1)
            For i = 0 To num - 1
                Stnum = Stnum & Arr(i) & ","
            Next
            titulo = "Quitsort"
        End If

        If Insercion.Checked = True Then
            Arr = ins.insertionSort(Arr)
            For i = 0 To num - 1
                Stnum = Stnum & Arr(i) & ","
            Next
            titulo = "Insercion"
        End If

        If Borbuja.Checked = True Then
            Arr = bor.metodoburbuja(Arr)
            For i = 0 To num - 1
                Stnum = Stnum & Arr(i) & ","
            Next
            titulo = "Borbuja"
        End If

        MsgBox("Iniciales:" & vbCrLf & Stnum2 & vbCrLf & "Orfanizados:" & vbCrLf & Stnum,, titulo)
    End Sub

    Function partition(ByRef a As Array, ByVal l As Integer, ByVal r As Integer)
        Dim j As Integer = l
        Dim p As Integer = a(r)

        For i = l To r - 1
            If a(i) < p Then
                Dim tmp As Integer = a(i)
                a(i) = a(j)
                a(j) = tmp
                j = j + 1
            End If
        Next
        a(r) = a(j)
        a(j) = p

        Return j
    End Function

    'a arreglo, l posicion inicial, r pocicion final
    Sub qsort(ByRef a As Array, ByVal l As Integer, ByVal r As Integer)
        If r > l Then
            Dim m As Integer = partition(a, l, r)
            qsort(a, l, m - 1)
            qsort(a, m + 1, r)
        End If
    End Sub




    Private Sub TxtNumero_KeyPress(sender As Object, e As KeyPressEventArgs) Handles TxtNumero.KeyPress
        'valida si la tecla opimida es numerica
        If Not IsNumeric(e.KeyChar) Then
            e.Handled = True
        End If
        'valida si la tecla oprimida es enter para llamar el procedimiento 'Ordenamiento'
        If e.KeyChar = vbCr Then
            If TxtNumero.Text <> "" Then Call Ordenamiento()
        End If
    End Sub

End Class
