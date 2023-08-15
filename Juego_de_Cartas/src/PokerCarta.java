public class PokerCarta extends Carta implements ICarta{
    private String color;
    public PokerCarta(Palo pinta, Byte valor,String color) {
        super(pinta, valor);
        this.color=color;
    }
    
    
    


    @Override
    public void mostrarCarta() {
        System.out.println("Color: "+this.color);
        System.out.println("Pinta: "+getPinta());
        System.out.println("-----------------------");
    }
    @Override
    public void valorNumerico() {
        System.out.println("el valor de la carta es: "+getValor());
        System.out.println("------------------------------------");
    }
    @Override
    public String toString() {
        return "PokerCarta [color=" + color + "]";
    }
    
    
}
