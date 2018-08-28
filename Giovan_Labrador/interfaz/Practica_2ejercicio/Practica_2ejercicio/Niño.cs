using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Practica_2ejercicio
{
    class Niño : Estudiante
    {
        int edad = 0;
        int sexo = 0;
        int clase = 0;
        public void estudia()
        {
            Console.WriteLine("El niño estudia en la universidad");
        }
    }
}
