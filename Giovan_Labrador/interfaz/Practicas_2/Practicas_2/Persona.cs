using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Practicas_2
{
    class Persona : Cantante
    {
        public void cantar()
        {
            Console.WriteLine("la persona canta");
            Console.WriteLine("La laa la raa laaa");
            Console.ReadKey();
        }
    }
}
