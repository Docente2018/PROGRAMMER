using System;

namespace Transporte
{
    class Program
    {
        static void Main(string[] args)
        {
            var enciende = new Enciende("El transporte enciende...");
            Console.WriteLine(enciende.Orden());
            var avance = new Avanza("El transporte avanza...");
            Console.WriteLine(avance.Orden());
            var giroder = new GiroDerecho("El transporte gira a la derecha...");
            Console.WriteLine(giroder.Orden());
            var giroizq = new GiroIzq("El transporte gira a la izquierda...");
            Console.WriteLine(giroizq.Orden());
            var detener = new Detiene("El transporte se detiene...");
            Console.WriteLine(detener.Orden());
            Console.ReadKey();
        }           
    }


    public abstract class Transporte
    {
        public abstract string Orden();
    }

    public class Enciende : Transporte
    {
        private string acciones;

        public Enciende(string accion)
        {
            this.acciones = accion;
        }

        public override string Orden()
        {
            return this.acciones;
        }
    }

    public class Avanza : Transporte
    {
        private string acciones;

        public Avanza(string accion)
        {
            this.acciones = accion;
        }

        public override string Orden()
        {
            return this.acciones;
        }
    }

    public class GiroDerecho : Transporte
    {
        private string acciones;

        public GiroDerecho(string accion)
        {
            this.acciones = accion;
        }

        public override string Orden()
        {
            return this.acciones;
        }
    }

    public class GiroIzq : Transporte
    {
        private string acciones;

        public GiroIzq(string accion)
        {
            this.acciones = accion;
        }

        public override string Orden()
        {
            return this.acciones;
        }
    }

    public class Detiene : Transporte
    {
        private string acciones;

        public Detiene(string accion)
        {
            this.acciones = accion;
        }

        public override string Orden()
        {
            return this.acciones;
        }
    }
}
