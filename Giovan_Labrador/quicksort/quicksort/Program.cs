using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace quicksort
{
    class Program
    {
        static void Main(string[] args)
        {
            int n;
            Console.WriteLine("Metodo de Quick Sort");// inicio del programa
            Console.Write("Cuantos numeros desea ingresar ");
            n = Int32.Parse(Console.ReadLine());
            llenar b = new llenar(n);
        }
    }

    class llenar
    {
        int h;
        int[] vector;
        public llenar(int n)
        {
            h = n;
            vector = new int[h];
            for (int i = 0; i < h; i++)
            {
                Console.Write("ingrese valor {0}: ", i + 1);
                vector[i] = Int32.Parse(Console.ReadLine());
            }
            quicksort(vector, 0, h - 1);
            mostrar();
        }

        private void quicksort(int[] vector, int primero, int ultimo)// metodo que utiliza la acomodacion de numeros de izquierda a derecha de menor a mayor
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
            Console.WriteLine("Vector ordenados en forma ascendente");// imprime en pantalla los numeros ingresados en forma ascendente
            for (int i = 0; i < h; i++)
            {
                Console.Write("{0} ", vector[i]);
            }
            Console.ReadLine();
        }
    }
}
        
    

