public class AppBanco {
    public static void main(String[] args) throws Exception {
        CuentaAhorros cuentaAhorros=new CuentaAhorros(8000, "cristian");
        CuentaCorriente cuentaCorriente=new CuentaCorriente(7300, "camilo", 4);
        

        cuentaAhorros.consultarSaldo();
        cuentaAhorros.depositarDinero(9000);
        cuentaAhorros.retirarDinero(2000);
        cuentaAhorros.consultarSaldo();
        System.out.println("--------------------------");
        cuentaCorriente.consultarSaldo();
        cuentaAhorros.depositarDinero(5000);
        cuentaAhorros.retirarDinero(9000);
        cuentaAhorros.consultarSaldo();
    }
}
