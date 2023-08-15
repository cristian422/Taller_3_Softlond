package Figuras_geometricas;

public class Cuadrado extends Figuras {
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
        
        
        
    }

    @Override
    public void hallarArea() {
    System.out.println("esta usando el metodo de la hija en el cuadrado");
        this.area=lado*2;
        System.out.println("el area es: "+area);
    };
    @Override
    public void hallarPerimetro() {
        this.perimetro=this.lado*4;
        System.out.println("el perimetro del cuadrado es: "+this.perimetro);
    };

}
