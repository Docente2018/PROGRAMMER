using System;

namespace CantanteInterfaz
{
    using System;

    namespace ClaseInterfaz
    {
        public class Program
        {
            static void Main(string[] args)
            {
                Persona per = new Persona();
                Canario can = new Canario();
                PruebaCanto(per);
                PruebaCanto(can);
                Console.ReadKey();
            }

            public static void PruebaCanto (ICantante canta)
            {
                canta.Cantar();
            }
        }

        public interface ICantante
        {
            void Cantar();
        }

        public class Persona : ICantante
        {
            void ICantante.Cantar()
            {
                Console.WriteLine("El cantante dice: la la lalala...");
            }
        }

        public class Canario : ICantante
        {
            void ICantante.Cantar()
            {
                Console.WriteLine("El canario dice: Piiiooo...");
            }
        }
    }
}
