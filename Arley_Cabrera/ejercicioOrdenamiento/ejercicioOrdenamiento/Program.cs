using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ejercicioOrdenamiento
{
    class Program
    {
       

        static void Main(string[] args)
        {
            while (true)
            {
                Console.WriteLine("Seleccione el metodo de ordenamiento \n");

                Console.WriteLine("Escriba (1) para metodo por Sort, (2) para metodo por Quick Short, (3) metodo por burbuja \n");

                try
                {
                    int num = int.Parse(Console.ReadLine());
                    switch (num)
                    {
                        case 1:
                            ordenarPorMetodoSort();
                            break;

                        case 2:
                            MetodoPorQuickShort metodoQuick = new MetodoPorQuickShort();
                            int n;
                            Console.WriteLine("Metodo de Quick Sort");
                            Console.Write("Cuantos longitud del vector: ");
                            n = Int32.Parse(Console.ReadLine());

                            metodoQuick.llenar(n);

                            break;

                        case 3:
                            break;
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine("Ingrese solo valores númericos \n");
                }
                
            }


        }

        public static void ordenarPorMetodoSort()
        {
            //ordenamiento por el primer metodo
            Console.WriteLine("Ingrese 10 Números en desorden \n");
            //Creamos un vector (Array) de enteros con una longitud de 10 elementos
            int[] numeros = new int[10];


            //Solicitamos al usuario los 10 valores (desordenados)
            for (int i = 0; i < 10; i++)
            {
                Console.WriteLine("Ingrese un número:");
                numeros[i] = int.Parse(Console.ReadLine());
            }

            //Ordenamos la lista e imprimimos los valores.
            Array.Sort(numeros);

            Console.WriteLine("\nLos números ordenados son:");

            for (int i = 0; i < 10; i++)
            {
                Console.WriteLine(numeros[i]);
            }

            //Para mantener la consola abierta
            Console.ReadKey();
        }

        public static void ordenarNumeros(int[] numerosDesorden)
        {
            
            

           
        }
    }
}
