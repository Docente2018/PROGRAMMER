using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ejercisio_2
{
    class Program
    {
        static void Main(string[] args)
        {
            FiguraRegular figuraRegular = new FiguraRegular(); 
            Console.WriteLine("programa para hallar un area");
            Console.ReadKey();
            Console.WriteLine("digite 1 para dos lados");
            Console.WriteLine("digite 2 para tres lados ");
            figuraRegular.lados = Convert.ToInt32(Console.ReadLine());

            Console.Clear();
            if (figuraRegular.lados == 1)
            {
                Console.WriteLine("hallar el area de dos lados");
                Console.WriteLine("digite lado 1");
                figuraRegular.lado1 = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("digite lado 2");
                figuraRegular.lado2 = Convert.ToInt32(Console.ReadLine());

                figuraRegular.area = figuraRegular.lado1 + figuraRegular.lado2;
            }

            else
            {
                if (figuraRegular.lados == 2)
                {
                    Console.WriteLine("hallar el area de tres lados");
                    Console.WriteLine("digite lado 1");
                    figuraRegular.lado1 = Convert.ToInt32(Console.ReadLine());
                    Console.WriteLine("digite lado 2");
                    figuraRegular.lado2 = Convert.ToInt32(Console.ReadLine());
                    Console.WriteLine("digite lado 3");
                    figuraRegular.lado3 = Convert.ToInt32(Console.ReadLine());




                    figuraRegular.area = figuraRegular.lado1 + figuraRegular.lado2+ figuraRegular.lado3;
                }

                Console.Clear();


                Console.WriteLine("el resultado del area es=" + figuraRegular.area);
                Console.ReadKey();


            }


        }








        }
    }


