public abstract class Cuenta {
    private double saldo;
    private String propietario;

    
    public Cuenta(double saldo, String propietario) {
        this.saldo = saldo;
        this.propietario = propietario;
    }
    abstract public void consultarSaldo();
    
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
