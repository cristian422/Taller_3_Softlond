import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
    Instrumento instrumento =new Guitarra();
    Instrumento instrumento2=new Violin();
    Instrumento instrumento3=new Piano();
    ArrayList<Instrumento> instrumentos=new ArrayList<>();
    instrumentos.add(instrumento);

    instrumentos.add(instrumento2);
    instrumentos.add(instrumento3);
    for (int i = 0; i < instrumentos.size(); i++) {
        instrumentos.get(i).tocar();
    }
    
    }
}
