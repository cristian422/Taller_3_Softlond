import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Empleado empleado=new Asalariado(3000000);
        Empleado empleado2=new Asalariado(9000000);
        Empleado empleado3=new PorHoras(8000,48);
        Empleado empleado4=new PorHoras(5000,50);
        ArrayList<Empleado> listaEmpleados=new ArrayList<>();
        listaEmpleados.add(empleado);
        listaEmpleados.add(empleado3);
        listaEmpleados.add(empleado2);
        listaEmpleados.add(empleado4);
        for (int i = 0; i < listaEmpleados.size(); i++) {
            listaEmpleados.get(i).calcularSalario();
        }
    }
}
