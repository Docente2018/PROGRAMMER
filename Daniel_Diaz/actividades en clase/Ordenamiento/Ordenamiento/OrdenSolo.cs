using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ordenamiento
{
    class OrdenSolo
    {
        public  void solo()
        {
            Console.WriteLine(" \n Ordenamiento Directo ");
            int[] numeros = { 34, 56, 76, 87, 90, 1 };
            int i, j, min, auxiliar;
            for (i = 0; i < numeros.Length - 1; i++)
            {
                min = i;
                for (j = i + 1; j < numeros.Length; j++)
                    if (numeros[j] < numeros[min])
                    {
                        auxiliar = numeros[j];
                        numeros[j] = numeros[min];
                        numeros[min] = auxiliar;
                    }
                foreach (int pantalla in numeros)
                {
                    Console.Write(pantalla);
                    Console.WriteLine();
                }
            }
            for (i = 0; i < numeros.Length; i++)
                Console.WriteLine(numeros[i]);
        }
    }
}

