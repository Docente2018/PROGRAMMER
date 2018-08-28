using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Interfaces
{
    /// <summary>
    /// Clase que representa un cuadrilatero Simple convexo.
    /// </summary>
    public class Cuadrilatero : FiguraGeometrica
    {

        private Punto verticeA;
        private Punto verticeB;
        private Punto verticeC;
        private Punto verticeD;
        private double ladoAB;
        private double ladoBC;
        private double ladoCD;
        private double ladoDA;
        private double diagonalAC;
        private double diagonalBD;

        /// <summary>
        /// Método constructor que recibe 4 puntos y crea un cuadrilátero
        /// </summary>
        /// <param name="nombre"></param>
        /// <param name="puntos"></param>
        public Cuadrilatero(List<Punto> puntos) : base("cuadrilátero")
        {
            //hace falta implementar cuando no se puede armar un cuadrilatero con los cuatro puntos recibidos
            //hace falta implementar cuando los puntos recibidos forman un cuadrilatero concavo o complejo 
            //ya que para estas situaciones los caluclos de área y perímetro no serían correctos
            if (puntos.Count == 4)
            {
                this.verticeA = puntos[0];
                this.verticeB = puntos[1];
                this.verticeC = puntos[2];
                this.verticeD = puntos[3];
                this.ladoAB = Math.Sqrt(Math.Pow(verticeB.X - verticeA.X, 2) + Math.Pow(verticeB.Y - verticeA.Y, 2));
                this.ladoBC = Math.Sqrt(Math.Pow(verticeC.X - verticeB.X, 2) + Math.Pow(verticeC.Y - verticeB.Y, 2));
                this.ladoCD = Math.Sqrt(Math.Pow(verticeD.X - verticeC.X, 2) + Math.Pow(verticeD.Y - verticeC.Y, 2));
                this.ladoDA = Math.Sqrt(Math.Pow(verticeA.X - verticeD.X, 2) + Math.Pow(verticeA.Y - verticeD.Y, 2));
                this.diagonalAC = Math.Sqrt(Math.Pow(verticeC.X - verticeA.X, 2) + Math.Pow(verticeC.Y - verticeA.Y, 2));
                this.diagonalBD = Math.Sqrt(Math.Pow(verticeD.X - verticeB.X, 2) + Math.Pow(verticeD.Y - verticeB.Y, 2));
                if (EsCuadrado())
                {
                    this.Nombre = "cuadrado";
                }
            }
        }

        /// <summary>
        /// Método que calcula el área del cuadrilatero simple, convexo
        /// </summary>
        /// <returns>El area del cuadrilatero del cuadrilatero simple, convexo</returns>
        public override double Area()
        {
            //implementarlo con la fórmula de Bretschneider
            double semiperimetro1 = (this.ladoAB + this.ladoBC + this.diagonalAC) / 2;
            double semiperimetro2 =  (this.diagonalAC + this.ladoCD + this.ladoDA) / 2;
            double area1 = Math.Sqrt((semiperimetro1) * (semiperimetro1 - ladoAB) * (semiperimetro1 - ladoBC) * (semiperimetro1 - diagonalAC));
            double area2 = Math.Sqrt((semiperimetro2) * (semiperimetro2 - diagonalAC) * (semiperimetro2 - ladoCD) * (semiperimetro2 - ladoDA));
            return area1 + area2;
        }

        /// <summary>
        /// Método que calcula el perimetro del cuadrilatero
        /// </summary>
        /// <returns>El perímetro del cuadrilatero</returns>
        public override double Perimetro()
        {
            return this.ladoAB + this.ladoBC + this.ladoCD + this.ladoDA;
        }

        public bool EsCuadrado()
        {
            if (ladoAB == ladoBC && ladoBC ==ladoCD && ladoCD == ladoDA && diagonalAC== diagonalBD)
            {
                return true;
            }
            return false;
        }
    }
}