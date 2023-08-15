public class CuentaCorriente extends Cuenta implements Movimineto {
    private int movimientos;
    

    public CuentaCorriente(double saldo, String propietario, int movimientos) {
        super(saldo, propietario);
        this.movimientos = movimientos;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("consultar saldo de la cuenta de ahorros");
        System.out.println("en la cuenta tiene: "+this.getSaldo());
        }

    @Override
    public void retirarDinero(int retirarDinero) {
        System.out.println("Retirar de la cuenta Corriente ");
        setSaldo(getSaldo()-retirarDinero);

        }

    @Override
    public void depositarDinero(int ingresa) {
        System.out.println("deposito: "+ingresa);
        setSaldo(getSaldo()+ingresa);
    }


    
}
