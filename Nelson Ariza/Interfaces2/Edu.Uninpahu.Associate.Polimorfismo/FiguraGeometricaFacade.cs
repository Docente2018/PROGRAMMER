using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Interfaces
{
    class FiguraGeometricaFacade
    {
        public enum TipoFigura { circulo, triangulo, cuadrilatero };

        public static FiguraGeometrica GetFigura(TipoFigura tipoFigura)
        {
            return FiguraGeometricaFactory.GetFigura(SolicitarInformacion(tipoFigura));
        }

        public static List<Punto> SolicitarInformacion(TipoFigura tipoFigura)
        {
            List<Punto> puntos = new List<Punto>();
            switch (tipoFigura)
            {
                case TipoFigura.circulo:
                    return SolicitarInformacionCirculo();
                case TipoFigura.triangulo:
                    return SolicitarInformacionTriangulo();
                case TipoFigura.cuadrilatero:
                    return SolicitarInformacionCuadrilatero();
            }
            return null;
        }

        public static List<Punto> SolicitarInformacionCirculo()
        {
            List<Punto> puntos = new List<Punto>();
            Console.WriteLine("Por favor ingrese el punto centro del circulo");
            puntos.Add(IngresarPunto());
            Console.WriteLine("Por favor ingrese un punto que esté sobre la circunferencia del circulo");
            puntos.Add(IngresarPunto());
            return puntos;
        }

        public static List<Punto> SolicitarInformacionTriangulo()
        {
            List<Punto> puntos = new List<Punto>();
            Console.WriteLine("Por favor ingrese el punto del vertice A");
            puntos.Add(IngresarPunto());
            Console.WriteLine("Por favor ingrese el punto del vertice B");
            puntos.Add(IngresarPunto());
            Console.WriteLine("Por favor ingrese el punto del vertice C");
            puntos.Add(IngresarPunto());
            return puntos;
        }

        public static List<Punto> SolicitarInformacionCuadrilatero()
        {
            List<Punto> puntos = new List<Punto>();
            Console.WriteLine("Por favor ingrese los vertices del cuadrilatero en la manera en que se dibuja");
            Console.WriteLine("Por favor ingrese el punto del vertice A");
            puntos.Add(IngresarPunto());
            Console.WriteLine("Por favor ingrese el punto del vertice B");
            puntos.Add(IngresarPunto());
            Console.WriteLine("Por favor ingrese el punto del vertice C");
            puntos.Add(IngresarPunto());
            Console.WriteLine("Por favor ingrese el punto del vertice D");
            puntos.Add(IngresarPunto());
            return puntos;
        }

        public static Punto IngresarPunto()
        {
            Boolean fallo = true;
            double x=0, y=0;
            do
            {
                try
                {
                    Console.WriteLine("Ingrese la coordenada X del punto");
                    x = Convert.ToDouble(Console.ReadLine());
                    Console.WriteLine("Ingrese la coordenada Y del punto");
                    y = Convert.ToDouble(Console.ReadLine());
                    fallo = false;
                }
                catch (Exception e)
                {
                    Console.Write(e.Message);
                    fallo = true;
                }
            } while (fallo);
            return new Punto(x, y);
        }
    }
}