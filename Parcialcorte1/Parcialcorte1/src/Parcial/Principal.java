package Parcial;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        try {

            Scanner escribir = new Scanner(System.in);
            int opcion = 1;

            while (opcion != 5) {
                if (opcion <= 5) {
                    System.out.println("AREAS Y PERIMETROS DE FIGURAS GEOMETRICAS ");
                    System.out.println("1.Triangulo");
                    System.out.println("2.Rectangulo");
                    System.out.println("3.Cuadrado");
                    System.out.println("4.Circulo");
                    System.out.println("5.fin\n");
                    System.out.println("Digite una opcion :");
                    opcion = escribir.nextInt();
                    Datos(opcion);
                } else {
                    System.out.println("Numero no valido");
                    System.out.println("Digite una opcion :");
                    opcion = escribir.nextInt();
                }
            }

        } catch (Exception e) {
            System.err.println("Solo Numeros: " + e);
            System.exit(1);
        }

    }

    public static void Datos(int opcion) {
        try {
            Scanner escribir = new Scanner(System.in);

            switch (opcion) {
                case 1:
                    double base,
                     altura,
                     ladoA,
                     ladoB,
                     ladoC;
                    Triangulo t1 = new Triangulo();
                    t1.setestablecerNomFigura("Triangulo");
                    System.out.println(t1.getobtenerNomFigura());

                    System.out.println("Digite la base del triangulo: ");

                    base = escribir.nextDouble();
                    t1.setpuestablecerBaseTria(base);

                    System.out.println("Digite la altura del triangulo: ");
                    altura = escribir.nextDouble();
                    t1.setestablecerAlturaTria(altura);

                    System.out.println("Digite la longitud de el lado a: ");
                    ladoA = escribir.nextDouble();
                    t1.setestablecerLadoA(ladoA);

                    System.out.println("Digite la longitud de el lado b: ");
                    ladoB = escribir.nextDouble();
                    t1.serestablecerLadoB(ladoB);

                    System.out.println("Digite la longitud del lado c: ");
                    ladoC = escribir.nextDouble();
                    t1.setestablecerLadoC(ladoC);

                    t1.area();
                    t1.peri();
                    System.out.println("Area del triangulo: " + t1.getobtenerArea());
                    System.out.println("Perimetro del Triangulo: " + t1.getobtenerPerim());

                    break;

                case 2:

                    double baseRect,
                     alturaRect;
                    Rectangulo r1 = new Rectangulo();
                    r1.setestablecerNomFigura("Rectangulo");
                    System.out.println(r1.getobtenerNomFigura());

                    System.out.println("Digite la base del rectangulo: ");
                    baseRect = escribir.nextDouble();
                    r1.setestablecerBaseRecta(baseRect);

                    System.out.println("Digite la altura del Rectangulo: ");
                    alturaRect = escribir.nextDouble();
                    r1.setestablecerAlturaRecta(alturaRect);

                    r1.area();
                    r1.peri();
                    System.out.println("Area del Rectangulo: " + r1.getobtenerArea());
                    System.out.println("Perimetro del Rectangulo : " + r1.getobtenerPerim());

                    break;

                case 3:

                    double lado;
                    Cuadrado c1 = new Cuadrado();
                    c1.setestablecerNomFigura("Cuadrado");
                    System.out.println(c1.getobtenerNomFigura());

                    System.out.println("Digite la longitud del lado ");
                    lado = escribir.nextDouble();
                    c1.setestablecerLadoCuad(lado);

                    c1.area();
                    c1.peri();
                    System.out.println("Area del Cuadrado: " + c1.getobtenerArea());
                    System.out.println("Perimetro del Cuadrado : " + c1.getobtenerPerim());

                    break;

                case 4:
                    double radio;

                    Circulo circ = new Circulo();
                    System.out.println("Digite la longitud del lado ");
                    radio = escribir.nextDouble();
                    circ.setestablecerNomFigura("Circulo");
                    System.out.println(circ.getobtenerNomFigura());

                    circ.setestablecerRadioCirc(radio);

                    circ.area();
                    circ.peri();

                    System.out.println("Area del Circulo" + circ.getobtenerArea());
                    System.out.println("Perimetero del Circulo: " + circ.getobtenerPerim());

                    break;

                case 5:
                    break;
            }
        } catch (Exception e) {
            System.err.println("Se ha presentado un error: " + e);
            System.exit(1);
        }
    }
}
