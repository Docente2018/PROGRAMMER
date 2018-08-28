using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Interfaces
{
    public class Circulo : FiguraGeometrica
    {
        private Punto centro;
        private double radio;

        public Circulo(List<Punto> puntos) :base("circulo")
        {
            Punto puntoEnCircunferencia;
            double diferenciaEnX;
            double diferenciaEnY;
            if (puntos.Count == 2)
            {
                this.centro = puntos[0];
                puntoEnCircunferencia = puntos[1];
                diferenciaEnX = puntoEnCircunferencia.X - this.centro.X;
                diferenciaEnY = puntoEnCircunferencia.Y - this.centro.Y;
                this.radio = Math.Sqrt(Math.Pow(diferenciaEnX, 2) + Math.Pow(diferenciaEnY, 2));
            }
        }

        public override double Area()
        {
            return Math.PI * Math.Pow(this.radio, 2);
        }

        public override double Perimetro()
        {
            return 2 * Math.PI * this.radio;
        }
    }
}
