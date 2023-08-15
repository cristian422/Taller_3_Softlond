import java.util.ArrayList;

public class CartasApp {
    public static void main(String[] args) throws Exception {
        ArrayList<PokerCarta> baraja=new ArrayList<>();
        PokerCarta pokerCarta=new PokerCarta(Palo.Corazon, (byte) 8, "rojo");
        PokerCarta pokerCarta1=new PokerCarta(Palo.Diamante, (byte) 6, "Negro");
        PokerCarta pokerCarta2=new PokerCarta(Palo.Pica, (byte) 2, "rojo");
        PokerCarta pokerCarta3=new PokerCarta(Palo.Trebol, (byte) 5, "Negro");

        baraja.add(pokerCarta);
        baraja.add(pokerCarta1);
        baraja.add(pokerCarta2);
        baraja.add(pokerCarta3);

        for (int index = 0; index < baraja.size(); index++) {
            baraja.get(index).mostrarCarta();
            baraja.get(index).valorNumerico();
        }
        


    }
}
