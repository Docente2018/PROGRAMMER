using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Serie_Finnacci
{
    public class Program
    {
        static void Main(string[] args)
        {
            //el USUARIO DARA UN NUMERO Y DE AHI SE HARA UNA SERIE DE FIBONACCI
            int a, b, n, i, aux, intentos = 3; //declaramos las variables, aux me sirve para hacer cambios
            Console.WriteLine("----------SERIE DE FIBONACCI--------------------");
            Console.WriteLine("-----------NICOLAS DANIEL DIAZ --------------------");
            Console.WriteLine("----------GRUPO 800--------------------");
            Console.WriteLine("¿Cantidad de series que quieres ver?");
            try
            {
                n = int.Parse(Console.ReadLine()); //leemos el número de términos
                a = 1;
                b = 0; //inicializamos

                for (i = 0; i < n; i++)  //se repite para el número de veces deseado
                {
                    aux = a;
                    a = b; //intercambio valores
                    b = aux + a; //cailculo el nuevo valor
                    Console.WriteLine("RESULTADO :");
                    Console.WriteLine(a);//imprimo el valor
                }
                if (n <= 0)
                {
                    Console.WriteLine("No se pueden ni cero ni numeros negatvios");
                }





                Console.ReadKey(); //para que se quede esperando a que presione una tecla

            }
            catch (Exception)
            {
                int intentar = 0;
                intentar = intentos - 1;


                Console.WriteLine("no se aceptan letras te queda " + intentar + "  intentos ");


                Console.WriteLine("------------------------------------------");
                // SEGUNDA PARTE 
                intentos = 2;

                Console.WriteLine("¿Cantidad de series que quieres ver?");
                try
                {
                    n = int.Parse(Console.ReadLine()); //leemos el número de términos
                    a = 1;
                    b = 0; //inicializamos

                    for (i = 0; i < n; i++)  //se repite para el número de veces deseado
                    {
                        aux = a;
                        a = b; //intercambio valores
                        b = aux + a; //cailculo el nuevo valor
                        Console.WriteLine("RESULTADO :");
                        Console.WriteLine(a);//imprimo el valor
                    }
                    if (n <= 0)
                    {
                        Console.WriteLine("No se pueden ni cero ni numeros negatvios");
                    }





                    Console.ReadKey(); //para que se quede esperando a que presione una tecla

                }
                catch (Exception)
                {

                    intentar = intentos - 1;


                    Console.WriteLine("no se aceptan letras te queda " + intentar + "  intentos ");

                }


                Console.WriteLine("------------------------------------------");
                // tercer intento
                intentos = 1;

                Console.WriteLine("¿Cantidad de series que quieres ver?");
                try
                {
                    n = int.Parse(Console.ReadLine()); //leemos el número de términos
                    a = 1;
                    b = 0; //inicializamos

                    for (i = 0; i < n; i++)  //se repite para el número de veces deseado
                    {
                        aux = a;
                        a = b; //intercambio valores
                        b = aux + a; //cailculo el nuevo valor
                        Console.WriteLine("RESULTADO :");
                        Console.WriteLine(a);//imprimo el valor
                    }
                    if (n <= 0)
                    {
                        Console.WriteLine("No se pueden ni cero ni numeros negatvios");
                    }





                    Console.ReadKey(); //para que se quede esperando a que presione una tecla

                }
                catch (Exception)
                {

                    intentar = intentos - 1;


                    Console.WriteLine("no se aceptan letras te queda " + intentar + "  intentos ");
                    Console.WriteLine("no tienes mas intentos, el sistemas se cerrara...");

                }



                Console.ReadKey(); //para que se quede esperando a que presione una tecla
            }

        }
    }
}




