using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Interfaces
{
    public class Triangulo : FiguraGeometrica
    {
        private Punto verticeA;
        private Punto verticeB;
        private Punto verticeC;
        private double ladoA;
        private double ladoB;
        private double ladoC;

        public Triangulo(List<Punto> puntos) : base("triangulo")
        {
            if (puntos.Count == 3) 
            {
                this.verticeA = puntos[0];
                this.verticeB = puntos[1];
                this.verticeC = puntos[2];
                this.ladoA = Math.Sqrt(Math.Pow(verticeB.X - verticeC.X, 2) + Math.Pow(verticeB.Y - verticeC.Y, 2));
                this.ladoB = Math.Sqrt(Math.Pow(verticeA.X - verticeC.X, 2) + Math.Pow(verticeA.Y - verticeC.Y, 2));
                this.ladoC = Math.Sqrt(Math.Pow(verticeA.X - verticeB.X, 2) + Math.Pow(verticeA.Y - verticeB.Y, 2));
            }
        }

        public override double Area()
        {
            double semiperimetro = Perimetro() / 2;
            return Math.Sqrt((semiperimetro) * (semiperimetro - ladoA) * (semiperimetro - ladoB) * (semiperimetro - ladoC));
        }

        public override double Perimetro()
        {
            return this.ladoA + this.ladoB + this.ladoC;
        }
    }
}
