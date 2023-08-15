import java.lang.reflect.Array;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        PCamisa prCamisa=new PCamisa("XL", 40000, "lana", 4);
        PLavadora pLavadora=new PLavadora(5, 800000, "blanco", "12");
        PLibroHistoria pLibroHistoria=new PLibroHistoria(15000, "Ultima edicion", 10);
        PLicuadora pLicuadora=new PLicuadora(1, 70000, "Nueva", "24");
        PPantalon pPantalon=new PPantalon("L", 20000, "Temporada", 8);
        ArrayList<IProduct> arrayProductos=new ArrayList<IProduct>();
        arrayProductos.add(prCamisa);
        arrayProductos.add(pLavadora);
        arrayProductos.add(pLibroHistoria);
        arrayProductos.add(pPantalon);
        arrayProductos.add(pLicuadora);

        for (int i = 0; i < arrayProductos.size(); i++) {
            arrayProductos.get(i).calcularPrecio();
            arrayProductos.get(i).mostrarDetalles();
        }
    
    }
}
