using System;

namespace Ejercicio_1
{
    public class Clase_Animal
    {
        static void Main(string[] args)
        {
            Accion animal = new Accion();
            animal.nace();
            animal.rugir();
        }
    }

    public class Animal
    {
        public void nace()
        {
            Console.WriteLine("Ha nacido un animal");
            Console.ReadKey();
        }

        public void rugir()
        {
            Console.WriteLine("Hace algun ruido");
            Console.ReadKey();
        }  
    }

    public class Accion : Animal
    { }
}
