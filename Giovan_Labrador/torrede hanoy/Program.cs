using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace torrede_hanoy
{
    class Program
    {

        static void torreHanoi(int n, int o, int d, int aux) // se declaran las variables
        {


            if (n > 0) // si la variable de captura es mayor a cero se inicia el programa
            {
                torreHanoi(n - 1, o, aux, d);
                Console.Write(" se meuve anillo desde torre= " + o + " hasta torre= " + d);
                torreHanoi(n - 1, aux, d, o);

            }
        }



        static void Main(string[] args)// metodo para captura la cantidad de anillos 
        {
            int n;
            Console.Write("Favor ingresar la cantidad de anillos");
            n = int.Parse(Console.ReadLine());
            torreHanoi(n, 1, 3, 2);
            Console.ReadKey();

        
                  
        
      }
    }
}
    
    
    



 
        
    


