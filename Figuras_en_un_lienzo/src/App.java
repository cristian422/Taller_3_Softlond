import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Dibujable cDibujable=new Circulo();
        Dibujable rDibujable=new Rectangulo();
        ArrayList<Dibujable> arrayList=new ArrayList<>();
        arrayList.add(cDibujable);
        arrayList.add(rDibujable);
        Lienzo lienzo=new Lienzo(arrayList);
        lienzo.mostrarDibujo();
    }
}
