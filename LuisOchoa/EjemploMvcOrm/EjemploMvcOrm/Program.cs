using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EjemploOrmLinq
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ejercicio aplicando ORM - LINQ");

            string[] arreglo = { "Paco","Hugo","Luis" };

            Console.WriteLine(string.Join(",", arreglo));

            var nombresOrdenados =
                from num in arreglo
                orderby num ascending
                select num;

            Console.WriteLine("Ordenando...");
            foreach (string n in nombresOrdenados)
            {
                Console.WriteLine("{0}", n);
            }

            Console.ReadLine();
        }
    }
}
