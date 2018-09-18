using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SerieFibonacci
{
    public class Program
    {

        public static void Main(string[] args)
        {
            string ciclo;
            Console.WriteLine("Digite cantidad de ciclos a calcular:");
            ciclo = Console.ReadLine();//pide cantidad de veces de la serie
            Program serie = new Program();
            serie.Serie(ciclo);//imprime resultado de la serie
            Console.ReadKey();
        }

        public void Serie(string cantidad)
        {
            int repeticion = 0, valor = 0, acumulado = 1, total = 0, contador = 0;
            bool esnum = true;

            try //valida que el valor sea numero
            {
                repeticion = Int32.Parse(cantidad);
            }
            catch (Exception)
            {
                contador = 1;
                esnum = false;
            }

            if (repeticion < 0) //valida que el valor no sea negativo
            {
                contador += 1;
                esnum = false;
            }

            while (esnum == false) //valida que el nuevo valor sea numero
            {
                if (contador == 3) //cantidad de intentos
                {
                    Console.WriteLine("Supero cantidad de intentos");
                    Console.ReadKey();
                    Environment.Exit(0);
                }
                Console.WriteLine("Digite opcion valida");
                cantidad = Console.ReadLine();//pide cantidad de veces de la serie
                try
                {
                    repeticion = Int32.Parse(cantidad);
                    esnum = true;
                }
                catch (Exception)
                {
                    contador += 1;
                    esnum = false;
                }
                if (repeticion < 0) //valida que el nuevo valor no sea negativo
                {
                    contador += 1;
                    esnum = false;
                }
            }

            Console.WriteLine("La serie es:");
            Console.WriteLine("0");//inicializa serie

            for (int i = 0; i < repeticion; i++)
            {
                total = valor;
                valor = acumulado; //intercambio valores
                acumulado = total + valor; //cailculo el nuevo valor
                Console.WriteLine(valor); //imprimo el valor
            }

        }

    }
}