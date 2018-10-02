using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TorreHanoi
{
    class Program
    {       
            //SE INICIA UNA CLASE ESTATICA CONTADOR, EL CUAL LLEVARA EL NUMERO DE VECES  QUE SE INTERCAMBIA
            static double cont;
            static void Main(string[] args)
            {
                // INSTANCIANCION DE LA CLASE PROGRAM 
                Program programa = new Program();
                programa.Inicio();
            }
            // se crea un void  sea privado y no retorne valores 
            private void Inicio()
            {
                //se pide un numero el cual se guardara en  una variable decimal 
                // el numero ingresado se transforma a decimal 
                Console.WriteLine("NUMERO DE DISCOS");
                double numero = Convert.ToDouble(Console.ReadLine());
                // LA CLASE ESTATICA CONTADOR  SE INICIARA EN CERO 
                cont = 0;

            // SE TIENE TRES TORRES A, B,C , SE INFORMARA LA CATIDAD DE DISCOS Y MOVIENTOS, 
                moverTorre(numero, 'A', 'B', 'C');
                Console.WriteLine("\n NUMERO DE DISCOS " + numero);
                Console.WriteLine("\n NUMERO DE MOVIENTOS " + cont);
                Console.ReadLine();
            }
        //se crea un contador que valla tomando el numero de movientos ingresados
    
            private void moveUmDisco(char inicio, char fim)
            {
                cont = cont + 1;
                Console.WriteLine(Convert.ToString("\n" + inicio + " " + fim) + " NUMERO DE MOVIENTOS" +
                    " = " + cont);
            }
            private void moverTorre(double n, char inicio, char fim, char temp)
            {
                if (n == 1)
                {
                    moveUmDisco(inicio, fim);
                }
                else
                {
                    moverTorre(n - 1, inicio, temp, fim);
                    moveUmDisco(inicio, fim);
                    moverTorre(n - 1, temp, fim, inicio);
                }
            }
        }
    }
