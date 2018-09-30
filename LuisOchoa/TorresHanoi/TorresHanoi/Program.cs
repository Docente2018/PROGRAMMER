using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TorresHanoi
{
    public class Program
    {
        public static void Main(string[] args)
        {
            string disco;
            Program hanoi = new Program();
            Console.WriteLine("Digite cantidad de discos");
            disco = Console.ReadLine();
            hanoi.Hanoi(disco,1,2,3);
            Console.WriteLine("Fin del juego");
            Console.ReadKey();
        }

        public void Hanoi(string num, int inicio, int temp, int fin)
        {
            bool esnum = true;
            int discos = 0;
            string disco;

            try //valida que el valor sea numero
            {
                discos = Int32.Parse(num);
            }
            catch (Exception)
            {
                esnum = false;
            }

            if (discos < 0) //valida que el valor no sea negativo
            {
                esnum = false;
            }

            while (esnum == false) //valida que el nuevo valor sea numero
            {
                Console.WriteLine("Digite cantidad de discos valida: ");
                num = Console.ReadLine();//pide cantidad de discos
                try
                {
                    discos = Int32.Parse(num);
                    esnum = true;
                }
                catch (Exception)
                {
                    esnum = false;
                }
                if (discos < 0) //valida que el nuevo valor no sea negativo
                {
                    esnum = false;
                }
            }

            if (discos == 1)
                {
                    Console.WriteLine("Moviendo de la torre: " + inicio + " a la torre: " + fin);
                }
            else
                {
                discos = discos - 1;
                disco = Convert.ToString(discos);
                Hanoi(disco, inicio, fin, temp);
                Console.WriteLine("Moviendo de la torre: " + inicio + " a la torre: " + fin);
                Hanoi(disco, temp, inicio, fin);
            }
        }
    }
}
