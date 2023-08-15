import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
    
        Animal perro=new Perro();
        Animal gato=new Gato();
        Animal gallina=new Gallina();
        ArrayList<Animal> animales=new ArrayList<Animal>();
        animales.add(perro);
        animales.add(gallina);
        animales.add(gato);
        for (int i = 0; i < animales.size(); i++) {
            animales.get(i).hacerSonido();
        }
    }
}
