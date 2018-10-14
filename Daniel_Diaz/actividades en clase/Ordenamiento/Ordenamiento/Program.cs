using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ordenamiento
{
    class Program
    {
        static void Main(string[] args)
        {
            // declarando variable que revisra respuesta del usuario   
            try// inicia toma de errores, en este caso todo aquello que no sea un numero 
            {
                
           
                int numero;
            Console.WriteLine("ORDENAMIENTO DE VECTORES");// pregunta usuario sobre la seccion que desea
            Console.WriteLine("Seleccione una opcion");
            Console.WriteLine("\n1- Metodo de Shell Sort");
            Console.WriteLine("------------------------");
            Console.WriteLine("\n2- Ordenamiento Directo ");
            Console.WriteLine("-------------------------");
            Console.WriteLine("\n3- Metddo Burbuja ");
            Console.WriteLine("-------------------------");
            Console.WriteLine("\n4- Informacion Estudiante ");
            Console.WriteLine("-------------------------");

            numero = Convert.ToInt32(Console.ReadLine());//  recibe el valor del usuario, y l convierte en un tipo int 

            switch (numero)// se inicia el swicth con el valor del usario.
            {
                case 1:// agregar opciones 
                    Console.WriteLine("-------------------------");//inicia el swicth con un el caso 1, shell sorth
                    Console.WriteLine("\n Has escojido la Opcion 1");
                    PruebaVector pruebaVector = new PruebaVector();// se instancia la clase pruebavector
                    pruebaVector.Cargar();// se llaman cada una de las funciones de la clase prueba vector 
                    pruebaVector.Shell();
                    pruebaVector.Imprimir();

                    break;
                case 2:
                    Console.WriteLine("-------------------------");
                    Console.WriteLine(" \n Has escojido la Opcion 2");
                    OrdenSolo ordenSolo = new OrdenSolo();
                    ordenSolo.solo();
                
                
                    
                    
                    break;
                case 3:
                    Console.WriteLine("-------------------------");
                    Console.WriteLine(" \n Has escojido la Opcion 3");
                    Burbuja burbuja = new Burbuja();
                    burbuja.Cargar();
                    burbuja.MetodoBurbuja();
                    burbuja.Imprimir();
                  

                    break;
                case 4:
                    Console.WriteLine("-------------------------");
                    Console.WriteLine("   \n INFORMACION ESTUDIANTE ");
                        Console.WriteLine("  \n NICOLAS DANIEL DIAZ, GRUPO 800, INGENERIA DE SOFTWARE, UNINPAHU ");



                        break;

                default:
                    Console.WriteLine("-------------------------");// CON LA FUNCION DEFAULT SE TOMAN VALORES NUMERICOS QUE NO ESTE
                        // EN EL MENU Y SE ARROJA UNA ALERTA
                    Console.WriteLine(" \n Uyyy!!, tu numero no esta en el menu, intenta otra vez ");
                    break;
            }
            Console.ReadKey();

        }
            catch(Exception e)// TOMA DE VALORES no numericos, arroja una alerta
            {
                Console.WriteLine("-------------------------");
                Console.WriteLine(" \n oye!!, solo se permiten numero intenta otra vez ");
                Console.ReadKey();
            }
           
        }


        public class PruebaVector//
        {
            private int[] vector;// se crea un vector vacio con n capacidad

            public void Cargar()
            {
                Console.WriteLine("\nMetodo de Shell Sort");
                Console.Write("\n Cuantos longitud del vector:");
                string linea;
                linea = Console.ReadLine();
                int cant;
                cant = int.Parse(linea);
                vector = new int[cant];// el vector se llenara´por la cantidad de datos que el usuario ingrese
                for (int f = 0; f < vector.Length; f++)
                {
                    Console.Write(" \n  Ingrese elemento " + (f + 1) + ": ");
                    linea = Console.ReadLine();
                    vector[f] = int.Parse(linea);
                }
            }

            public void Shell()
            {
                int salto = 0;
                int sw = 0;
                int auxi = 0;
                int e = 0;
                salto = vector.Length / 2;
                while (salto > 0)
                {
                    sw = 1;
                    while (sw != 0)
                    {
                        sw = 0;
                        e = 1;
                        while (e <= (vector.Length - salto))
                        {
                            if (vector[e - 1] > vector[(e - 1) + salto])
                            {
                                auxi = vector[(e - 1) + salto];
                                vector[(e - 1) + salto] = vector[e - 1];
                                vector[(e - 1)] = auxi;
                                sw = 1;
                            }
                            e++;
                        }
                    }
                    salto = salto / 2;
                }
            }

            public void Imprimir()
            {
                Console.WriteLine(" \n Vector ordenados en forma ascendente");
                for (int f = 0; f < vector.Length; f++)
                {
                    Console.Write(vector[f] + "  ");
                }
                Console.ReadKey();
            }


            static void Imprimir(string[] args)
            {
                PruebaVector pv = new PruebaVector();
                pv.Cargar();
                pv.Shell();
                pv.Imprimir();
            }
        }
        
    }

}  


    

