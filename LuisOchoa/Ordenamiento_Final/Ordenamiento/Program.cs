﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ordenamiento
{
    public class Program
    {
        public static void Main(string[] args)
        {
            int n = 0;

            PruebaVector pv = new PruebaVector();
            pv.Cargar();
            pv.Shell();
            pv.Imprimir();
            Console.WriteLine("Metodo de Quick Sort");
            Console.Write("Cuantos longitud del vector: ");
            try
            {
                n = Int32.Parse(Console.ReadLine());
            }
            catch (Exception)
            {

                Console.WriteLine("Digito algo incorrecto, intenta nuevamente...");
                Console.ReadKey();
                Environment.Exit(0);
            }
            llenar b = new llenar(n);
            Burbuja pvv = new Burbuja();
            pvv.Cargar();
            pvv.MetodoBurbuja();
            pvv.Imprimir();

        }

        //************************Shell Sort

        public class PruebaVector
        {
            public int[] vector;

            public void Cargar()
            {
                Console.WriteLine("Metodo de Shell Sort");
                Console.Write("Cuantos longitud del vector:");
                string linea="";
                int cant = 0;
                try
                {
                    linea = Console.ReadLine();
                    cant = int.Parse(linea);
                }
                catch (Exception)
                {

                    Console.WriteLine("Digito algo incorrecto, intenta nuevamente...");
                    Console.ReadKey();
                    Environment.Exit(0);
                }
             
                vector = new int[cant];
                    for (int f = 0; f < vector.Length; f++)
                    {
                        Console.Write("Ingrese elemento " + (f + 1) + ": ");
                        try
                        {
                            linea = Console.ReadLine();
                            vector[f] = int.Parse(linea);
                        }
                        catch (Exception)
                        {

                            Console.WriteLine("Digito algo incorrecto, intenta nuevamente...");
                            Console.ReadKey();
                            Environment.Exit(0);
                        }
                        
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
                Console.WriteLine("Vector ordenados en forma ascendente");
                for (int f = 0; f < vector.Length; f++)
                {
                    Console.Write(vector[f] + " \n");
                }
                Console.ReadKey();
                // Console.Write("{0} ", vector[i]);
            }
        }
        //************************Quick Sort 

        public class llenar
        {
            int h;
            int[] vector;
            public llenar(int n)
            {
                h = n;
                vector = new int[h];
                for (int i = 0; i < h; i++)
                {
                    Console.Write("ingrese valor {0}: ", i + 1);
                    try
                    {
                        vector[i] = Int32.Parse(Console.ReadLine());
                    }
                    catch (Exception)
                    {
                        Console.WriteLine("Digito algo incorrecto, intenta nuevamente...");
                        Console.ReadKey();
                        Environment.Exit(0);
                    }
                    
                }
                quicksort(vector, 0, h - 1);
                mostrar();
            }

            public void quicksort(int[] vector, int primero, int ultimo)
            {
                int i, j, central;
                double pivote;
                central = (primero + ultimo) / 2;
                pivote = vector[central];
                i = primero;
                j = ultimo;
                do
                {
                    while (vector[i] < pivote) i++;
                    while (vector[j] > pivote) j--;
                    if (i <= j)
                    {
                        int temp;
                        temp = vector[i];
                        vector[i] = vector[j];
                        vector[j] = temp;
                        i++;
                        j--;
                    }
                } while (i <= j);

                if (primero < j)
                {
                    quicksort(vector, primero, j);
                }
                if (i < ultimo)
                {
                    quicksort(vector, i, ultimo);
                }
            }

            public void mostrar()
            {
                Console.WriteLine("Vector ordenados en forma ascendente");
                for (int i = 0; i < h; i++)
                {
                    Console.Write("{0} ", vector[i]);
                }
                Console.ReadLine();
            }
        }
        //************************************Burbuja

        public class Burbuja
        {
            public int[] vector;

            public void Cargar()
            {
                Console.WriteLine("Metodo de Burbuja");
                Console.Write("Cuantos longitud del vector: ");
                string linea = "";
                int cant = 0; 

                try
                {
                    linea = Console.ReadLine();
                    cant = int.Parse(linea);
                }
                catch (Exception)
                {
                    Console.WriteLine("Digito algo incorrecto, intenta nuevamente...");
                    Console.ReadKey();
                    Environment.Exit(0);
                }
                
                vector = new int[cant];

                for (int f = 0; f < vector.Length; f++)
                {
                    Console.Write("Ingrese elemento " + (f + 1) + ": ");
                    try
                    {
                        linea = Console.ReadLine();
                        vector[f] = int.Parse(linea);
                    }
                    catch (Exception)
                    {
                        Console.WriteLine("Digito algo incorrecto, intenta nuevamente...");
                        Console.ReadKey();
                        Environment.Exit(0);
                    }

                    
                }
            }

            public void MetodoBurbuja()
            {
                int t;
                for (int a = 1; a < vector.Length; a++)
                    for (int b = vector.Length - 1; b >= a; b--)
                    {
                        if (vector[b - 1] > vector[b])
                        {
                            t = vector[b - 1];
                            vector[b - 1] = vector[b];
                            vector[b] = t;
                        }
                    }
            }

            public void Imprimir()
            {
                Console.WriteLine("Vector ordenados en forma ascendente");
                for (int f = 0; f < vector.Length; f++)
                {
                    Console.Write(vector[f] + "  ");
                }
                Console.ReadKey();
            }

        }


    }
}