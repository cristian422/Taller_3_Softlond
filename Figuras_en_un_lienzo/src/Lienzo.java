import java.util.ArrayList;

public class Lienzo {
    private ArrayList<Dibujable> dibujables=new ArrayList<>();

    public Lienzo(ArrayList<Dibujable> dibujables) {
        this.dibujables = dibujables;
    }
    
    public void mostrarDibujo(){
        for (int i = 0; i < this.dibujables.size(); i++) {
            this.dibujables.get(i).dibujar();
        }
    }
}
