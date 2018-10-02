using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PruebaCorte1
{
    class Program
    {
        static void Main(string[] args)
        {
            Triangulo triangulo = new Triangulo();
            Cuadrado cuadrado = new Cuadrado();
            Circulo circulo = new Circulo();
            Rectangulo rectangulo = new Rectangulo();
            
            Console.WriteLine("Areas y perimetros de figuras geometricas");
            Console.WriteLine("1. Triangulo");
            Console.WriteLine("2. Cuadrado");
            Console.WriteLine("3. Circulo");
            Console.WriteLine("4. Rectangulo");
            Console.WriteLine("5. Fin");
            triangulo.Res = 0;
            triangulo.Base = 0;
            triangulo.Altura = 0;
            triangulo.Res2 = 0;
            triangulo.Res3 = 0;
            

            triangulo.Res = Convert.ToInt32(Console.ReadLine());
            


            Console.Clear();

            if (triangulo.Res==1)
            {
                Console.WriteLine("Area de un triangulo");
                Console.WriteLine("Digite Base");
                triangulo.Base = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Digite Altura");
                triangulo.Altura = Convert.ToInt32(Console.ReadLine());

                triangulo.Res2 = triangulo.Base * triangulo.Altura / 2;

                Console.WriteLine("Perimetro de un triangulo");
                Console.WriteLine("Digite lado 1");
                triangulo.Lado1 = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Digite lado 2");
                triangulo.Lado2 = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Digite lado 3");
                triangulo.Lado3 = Convert.ToInt32(Console.ReadLine());

                triangulo.Res3 = triangulo.Lado1 + triangulo.Lado2 + triangulo.Lado3;

                Console.Clear();
                Console.WriteLine("El Area del triangulo es =" + triangulo.Res2);
                Console.WriteLine("El Perimetro del triangulo es =" + triangulo.Res3);

            }

            cuadrado.Lado4 =0;
            cuadrado.Lado1 = 0;
            cuadrado.Lado2 = 0;
            cuadrado.Lado3 = 0;
            cuadrado.Res2 = 0;
            cuadrado.Res3 = 0;


            if (triangulo.Res==2)
            {
                Console.WriteLine("Area de un cuadrado");
                Console.WriteLine("Digite Lado 1");
                cuadrado.Lado1 = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Digite Lado 2");
                cuadrado.Lado2 = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Digite Lado 3");
                cuadrado.Lado3 = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Digite Lado 4");
                cuadrado.Lado4 = Convert.ToInt32(Console.ReadLine());

                cuadrado.Res2 = cuadrado.Lado1 + cuadrado.Lado2 + cuadrado.Lado3 + cuadrado.Lado4;
                cuadrado.Res3 = cuadrado.Lado1 * cuadrado.Lado2;

                Console.Clear();

                Console.WriteLine("El Area de un Cuadrado es=" + cuadrado.Res3);
                Console.WriteLine("El Perimetro de un Cuadrado es=" + cuadrado.Res2);


            }

            circulo.Radial = 0;
            



            if(triangulo.Res==3)
            {
                Console.WriteLine("Area de un Circulo y Perimetro");
                Console.WriteLine("Digite Radial del Circulo");
                circulo.Radial= Convert.ToInt16 (Console.ReadLine());

                circulo.Res = circulo.Radial*3.14;
                circulo.Res2 = circulo.Radial * 3.14 * 2;


                Console.WriteLine("Area de un Circulo =" + circulo.Res);
                Console.WriteLine("Perimetro de un Circulo =" + circulo.Res2);




            }
            if(triangulo.Res==4)
            {
                Console.WriteLine("Area y perimetro de un rectangulo");
                Console.WriteLine("Digite base");
                rectangulo.Base = Convert.ToInt16(Console.ReadLine());
                Console.WriteLine("Digite Altura");
                rectangulo.Altura = Convert.ToInt16(Console.ReadLine());

                rectangulo.Area = rectangulo.Base * rectangulo.Altura;  
                rectangulo.Perimetro = (rectangulo.Base + rectangulo.Altura) * 2;



                Console.WriteLine("Area del rectangulo =" + rectangulo.Area);
                Console.WriteLine("Perimetro del rectangulo =" + rectangulo.Perimetro);


            }



            if (triangulo.Res==5)
            {
                Console.WriteLine("salir del programa");
                


            }



            Console.ReadKey();
        }
    }
}
