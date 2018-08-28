using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Interfaces
{
    public abstract class FiguraGeometrica : IArea, IPerimetro
    {
        private string nombre;
        List<Punto> puntos;

        public FiguraGeometrica(string nombre)
        {
            this.nombre = nombre;
        }

        public string Nombre { get => nombre; set => nombre = value; }
        internal List<Punto> Puntos { get => puntos; set => puntos = value; }

        public abstract double Area();
        public abstract double Perimetro();
    }
}
