public class Carta {
    private Palo pinta;
    private byte valor;
    
    public Carta(Palo pinta, byte valor) {
        this.pinta = pinta;
        this.valor = valor;
    }
    public Palo getPinta() {
        return pinta;
    }
    public void setPinta(Palo pinta) {
        this.pinta = pinta;
    }
    public byte getValor() {
        return valor;
    }
    public void setValor(byte valor) {
        this.valor = valor;
    }
    
    

    
}
