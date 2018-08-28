using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Practica_2ejercicio
{
    class Program
    {
        static void Main(string[] args)
        {
            Niño n = new Niño();
            Joven j = new Joven();

            estudiantes(n);
            estudiantes(j);


        }

         public static void estudiantes(Estudiante a)
        {
            a.estudia();

            Console.ReadKey();
        }
    }
}
