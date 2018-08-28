using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Interfaces
{
    public class FiguraGeometricaFactory
    {

        public static FiguraGeometrica GetFigura(List<Punto> puntos)
        {
            int cantidadPuntos = puntos.Count;
            switch (cantidadPuntos)
            {
                case 2:
                    return new Circulo(puntos);
                case 3:
                    return new Triangulo(puntos);
                case 4:
                    return new Cuadrilatero(puntos);
            }
            return null;
        }
    }
}
