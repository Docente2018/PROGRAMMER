using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ejercicioOrdenamiento
{
    public class MetodoPorQuickShort
    {
        int h;
        int[] vector;

        public void llenar(int n)
        {
            h = n;

            Random numAleatorio = new Random();
            vector = new int[h];

            for (int i = 0; i < h; i++)
            {
                int numero = numAleatorio.Next(1, h);

                Console.Write("ingrese valor {0} \n: ", i + 1 + ": " +  numero);
                vector[i] = Convert.ToInt32(numero);
            }
            quicksort(vector, 0, h - 1);
             mostrar();
        }

        public void quicksort(int[] vector, int primero, int ultimo)
        {
            int i, j, central;
            double pivote;
            central = (primero + ultimo) / 2;
            pivote = vector[central];
            i = primero;
            j = ultimo;
            do
            {
                while (vector[i] < pivote) i++;
                while (vector[j] > pivote) j--;
                if (i <= j)
                {
                    int temp;
                    temp = vector[i];
                    vector[i] = vector[j];
                    vector[j] = temp;
                    i++;
                    j--;
                }
            } while (i <= j);

            if (primero < j)
            {
                quicksort(vector, primero, j);
            }
            if (i < ultimo)
            {
                quicksort(vector, i, ultimo);
            }
        }

        private void mostrar()
        {
            Console.WriteLine("Vector ordenados en forma ascendente");
            for (int i = 0; i < h; i++)
            {
                Console.Write("{0} ", vector[i]);
            }
            Console.ReadLine();
        }
    }
}
