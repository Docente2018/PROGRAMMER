using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace fibonche
{
    class Program

    {
        public static bool validar(String cadena)//metodo que me pide un validación para que me de tres errores y se cierre el programa
        {
            bool retorno;
            try// valida si es numerica 
            {
                Convert.ToInt16(cadena);
                retorno = true;
            }catch(Exception e)// si no lo es comienza la sentencia while
            {
                retorno = false;
            }
            return retorno;
        }

        static void Main(string[] args)//variables e inicio del programa
        {
            variables variables = new variables();// llama la calse variables 
            variables.c = 0;
            variables.d = 0;
            variables.a = 0;
             variables.acumular = 0;


            Console.WriteLine("              Programa de fibonacci");// inicio del programa por metodo de impresion de consola 
            Console.WriteLine("              digite el numero ");

            String serie = Console.ReadLine(); // se utiliza para que permanezca en pantalla el error y continue ejecutandose 

            while (variables.acumular < 3) // sentencia  while para poder acumular tres errores y que el programa salga
            {
                if (validar(serie)) //comienza a validar el programa

                {
                    if (Convert.ToInt16(serie) > 0)
                    {
                        for (variables.c = 0; variables.c < Convert.ToInt16(serie); variables.c++)// la sentencia for para iniciar el ciclo fibonacci 
                        {
                            if (variables.c == 0)
                            {
                                Console.WriteLine("0");
                            }

                            variables.d = variables.a;
                            variables.a = variables.b;
                            variables.b = variables.d + variables.a;


                            Console.WriteLine(variables.a);

                        }

                        Console.ReadKey();
                    }
                    else //permite que el error menor o igual a cero se muestre en pantalla 
                    {
                        Console.WriteLine("es menos o igual a 0");
                        Console.ReadKey();
                    }
                }
                else // permite que el error cuando se escribe una letra o un simbolo y se muestre en pantalla
                {
                    Console.WriteLine("No es numerico");
                    Console.ReadKey();
                }
                variables.acumular++;

            }
            Console.Clear();// limpia la pantalla y deja ver solo lo que digitamos 
            Console.WriteLine("fin"); // fin del programa cuando termina o digitamos tres errores diferentes
            Console.ReadKey();
        }
    }
}
