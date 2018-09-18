using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ParcialOchoaLuis
{
    public class Program
    {
        string opcion, resultado, operacion;
        double altura, baseT, lado, radio;

        public static void Main(string[] args)
        {
            Program opci = new Program();
            opci.Menu();
        }

        public void Menu()
        {
            Console.WriteLine("AREAS Y PERIMETROS DE FIGURAS GEOMETRICAS");
            Console.WriteLine("1. TRIANGULO");
            Console.WriteLine("2.CUADRADO");
            Console.WriteLine("3.RECTANGULO");
            Console.WriteLine("4.CIRCULO");
            Console.WriteLine("5.FIN");
            Console.WriteLine("ESCOGER OPCION: ");
            opcion = Console.ReadLine();

            while (opcion != "1" && opcion != "2" && opcion != "3" && opcion != "4" && opcion != "5")
            {
                Console.WriteLine("Digite una opcion valida");
                opcion = Console.ReadLine();
            }

            Console.WriteLine("1. PARA HALLAR AREA");
            Console.WriteLine("2. PARA HALLAR PERIMETRO");
            operacion = Console.ReadLine();

            while (operacion != "1" && operacion != "2" && operacion != "3" && operacion != "4" && operacion != "5")
            {
                Console.WriteLine("Digite una opcion valida");
                operacion = Console.ReadLine();
            }

            switch (operacion)
            {
                case "1":
                    Area(opcion);
                    Console.WriteLine(resultado);
                    Console.ReadKey();
                    break;
                case "2":
                    Perimetro(opcion);
                    Console.WriteLine(resultado);
                    Console.ReadKey();
                    break;
                case "5":
                    System.Environment.Exit(-1);
                    break;
                default:
                    break;
            }

        }

        public string Area(string opc)
        {
            switch (opc)
            {
                case "1":
                    Console.WriteLine("Digite Base");
                    baseT = Convert.ToDouble(Console.ReadLine());
                    Console.WriteLine("Digite Altura");
                    altura = Convert.ToDouble(Console.ReadLine());
                    resultado = "El area del triangulo es: " + (baseT * altura) / 2;
                    break;
                case "2":
                    Console.WriteLine("Digite Lado");
                    lado = Convert.ToDouble(Console.ReadLine());
                    resultado = "El area del cuadrado es: " + lado * lado;
                    break;
                case "3":
                    Console.WriteLine("Digite Base");
                    baseT = Convert.ToDouble(Console.ReadLine());
                    Console.WriteLine("Digite Altura");
                    altura = Convert.ToDouble(Console.ReadLine());
                    resultado = "El area del rectangulo es: " + (baseT * altura);
                    break;
                case "4":
                    Console.WriteLine("Digite Radio");
                    radio = Convert.ToDouble(Console.ReadLine());
                    resultado = "El area del circulo es: " + (radio * radio) * 3.1416;
                    break;
                default:
                    break;
            }

            return resultado;
        }

        public string Perimetro(string opc)
        {
            switch (opc)
            {
                case "1":
                    Console.WriteLine("Digite Lado 1");
                    baseT = Convert.ToDouble(Console.ReadLine());
                    Console.WriteLine("Digite Lado 2");
                    altura = Convert.ToDouble(Console.ReadLine());
                    Console.WriteLine("Digite Lado 3");
                    lado = Convert.ToDouble(Console.ReadLine());
                    resultado = "El perimetro del triangulo es: " + baseT + altura + lado;
                    break;
                case "2":
                    Console.WriteLine("Digite Lado");
                    lado = Convert.ToDouble(Console.ReadLine());
                    resultado = "El perimetro del cuadrado es: " + lado * 4;
                    break;
                case "3":
                    Console.WriteLine("Digite Base");
                    baseT = Convert.ToDouble(Console.ReadLine());
                    Console.WriteLine("Digite Altura");
                    altura = Convert.ToDouble(Console.ReadLine());
                    resultado = "El perimetro del rectangulo es: " + (baseT + altura) * 2;
                    break;
                case "4":
                    Console.WriteLine("Digite Radio");
                    radio = Convert.ToDouble(Console.ReadLine());
                    resultado = "El perimetro del circulo es: " + (2 * 3.1416) * radio;
                    break;
                default:
                    break;
            }

            return resultado;
        }



    }
}
