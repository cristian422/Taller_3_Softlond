package Figuras_geometricas;

public class Figuras implements IFigura {
    protected double area;
    protected double perimetro;

    public Figuras() {
    }

    
    public int area(){return 0;}

    

    @Override
    public void hallarArea() {
        System.out.println("usando el medoto del padre");
    }

    @Override
    public void hallarPerimetro() {};


    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }


   
    

    
}
