using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Interfaces

{
    class Program
    {
        static void Main(string[] args)
        {
            int opcion;
            FiguraGeometrica figura=null;
            do
            {
                Console.WriteLine("Seleccione el tipo de figura que desea crear:");
                Console.WriteLine("1). Circulo");
                Console.WriteLine("2). Triángulo");
                Console.WriteLine("3). Cuadrilátero");
                Console.WriteLine("0). Salir");
                try
                {
                    opcion = Convert.ToInt32(Console.ReadLine());
                } catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                    opcion = -1;
                }
                if (opcion < 0 || opcion > 3)
                {
                    Console.WriteLine("Por favor seleccione una opción válida");
                } else if (opcion !=0 )
                {
                    switch (opcion)
                    {
                        case 1:
                            figura = FiguraGeometricaFacade.GetFigura(FiguraGeometricaFacade.TipoFigura.circulo);
                            break;
                        case 2:
                            figura = FiguraGeometricaFacade.GetFigura(FiguraGeometricaFacade.TipoFigura.triangulo);
                            break;
                        case 3:
                            figura = FiguraGeometricaFacade.GetFigura(FiguraGeometricaFacade.TipoFigura.cuadrilatero);
                            break;
                        default:
                            break;
                    }
                    Console.WriteLine("El área del "+figura.Nombre+" es de :"+ figura.Area());
                    Console.WriteLine("El perímetro del " + figura.Nombre + " es de :" + figura.Perimetro());
                }
            } while (opcion!=0);
        }


    }
}
