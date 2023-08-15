import Figuras_geometricas.Circulo;
import Figuras_geometricas.Cuadrado;
import Figuras_geometricas.Figuras;
import Figuras_geometricas.IFigura;
import Figuras_geometricas.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, !");


        Figuras cuadrado1=new Cuadrado(3);
        IFigura cuadrado2=new Cuadrado(3);

        Figuras circulo1=new Circulo(4);
        IFigura circulo2=new Circulo(4);

        /*  
        
      */
        Figuras triangulo1=new Triangulo(6, 8,7,5);
        IFigura triangulo2=new Triangulo(6, 8,7,5);

        cuadrado1.hallarArea();
        cuadrado2.hallarArea();
        circulo1.hallarArea();
        circulo2.hallarArea();
        /* */
        triangulo1.hallarArea();
        triangulo2.hallarArea();
        
        cuadrado1.hallarPerimetro();
        circulo1.hallarPerimetro();
        triangulo1.hallarPerimetro();
    }
}
