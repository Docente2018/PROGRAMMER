using System;

namespace Figuras
{
    class Figuras
    {
        public static void Main()
        {
            Cuadrado areacua = new Cuadrado();
            areacua.Ancho = 20;
            areacua.Alto = 20; 
            Console.WriteLine(value: "Area del cuadrado es " + areacua.Ancho * areacua.Alto + " cm2");
            Console.ReadKey();

            Reactangulo arearec = new Reactangulo();
            arearec.Ancho = 60;
            arearec.Alto = 30;
            Console.WriteLine(value: "Area del rectangulo es " + arearec.Ancho * arearec.Alto + " cm2");
            Console.ReadKey();

            Triangulo areatri = new Triangulo();
            areatri.Base = 50;
            areatri.Alto = 60;
            Console.WriteLine(value: "Area del triangulo es " + (areatri.Base * areatri.Alto)/2 + " cm2");
            Console.ReadKey();
        }
    }

    class Cuadrado
    {
        public int Ancho { get; set; }
        public int Alto { get; set; }
    }

    class Reactangulo
    {
        public int Ancho { get; set; }
        public int Alto { get; set; }
    }

    class Triangulo
    {
        public int Base { get; set; }
        public int Alto { get; set; }
    }
}
