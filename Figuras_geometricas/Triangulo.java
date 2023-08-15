package Figuras_geometricas;

public class Triangulo extends Figuras {
    private int base;//la base se toma como un lado
    private int altura;
    private int lado2;
    private int lado3;

    
    


    public Triangulo(int base, int altura, int lado2, int lado3) {
        this.base = base;
        this.altura = altura;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public void hallarArea() {
        System.out.println("esta usando el metodo de la hija en el Triangulo");
            this.area=(this.base*this.altura)/2;
            System.out.println("el area es: "+area);
        };

        @Override
        public void hallarPerimetro() {
            this.perimetro=lado2+lado3+base;
            System.out.println("el perimetro del Triangulo es: "+this.perimetro);
        };
    
}
