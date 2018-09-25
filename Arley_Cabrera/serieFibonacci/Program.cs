using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace serieFibonacci
{
    class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {

            
            //Programa que desarrolla la serie de Fibonacci hasta un número dado
            int num_1, num_2, n, i, aux; 
            Console.WriteLine("Ingrese cuantos numero quiere \n\n");
                      

            try
            {
                n = int.Parse(Console.ReadLine()); //leemos el número de términos
                num_1 = 0;
                num_2 = 1;

                Console.WriteLine(num_1);
                for (i = 0; i <= n; i++)  //se repite para el número de veces deseado
                {
                    aux = num_1;
                    num_1 = num_2; //intercambio valores
                    num_2 = aux + num_1; //cailculo el nuevo valor
                    Console.WriteLine(num_1); //imprimo el valor
                }
                Console.ReadKey(); //para ue se quede esperando a que presione una tecla

                
            }
            catch (Exception)
            {
                Console.WriteLine("Solo se aceptan valores numericos. \n");

                    Console.WriteLine("Desea continuar? (Y)(N)");
                    Console.ReadKey(); 
            }

            }

        }
    }
}
