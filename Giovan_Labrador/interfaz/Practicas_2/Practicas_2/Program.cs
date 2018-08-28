using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Practicas_2
{
    class Program
    {
        static void Main(string[] args)
        {
            Persona p = new Persona();
            Canario c = new Canario();

            hacerCantar(c);
            hacerCantar(p);
        }

        public static void hacerCantar(Cantante c)
        {
            c.cantar();
        }
    }
}
