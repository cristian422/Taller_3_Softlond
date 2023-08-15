package Figuras_geometricas;

public class Circulo extends Figuras {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public void hallarArea() {
        System.out.println("esta usando el metodo de la hija en el Circulo");
            this.area=Math.PI*(this.radio*this.radio);
            System.out.println("el area es: "+area);
        };
    
        @Override
    public void hallarPerimetro() {
        this.perimetro=this.radio*2*Math.PI;
        System.out.println("el perimetro del Circulo es: "+this.perimetro);
    };


}
