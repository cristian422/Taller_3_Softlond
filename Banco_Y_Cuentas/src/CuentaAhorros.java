public class CuentaAhorros extends Cuenta implements Movimineto {
    private double interes;

    public CuentaAhorros(double saldo, String propietario) {
        super(saldo, propietario);
        this.interes=0;
        
    }

    

    
    

    @Override
    public void consultarSaldo() {
        System.out.println("consultar saldo de la cuenta de ahorros");
        System.out.println("en la cuenta tiene: "+this.getSaldo());
        }

    

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }






    @Override
    public void retirarDinero(int retirar) {
        System.out.println("retirar de la cuenta de ahorros ");
        setSaldo(getSaldo()-retirar);
    }






    @Override
    public void depositarDinero(int ingresa) {
        System.out.println("deposito: "+ingresa);
        setSaldo(getSaldo()+ingresa);
    }






    

    
    
}
