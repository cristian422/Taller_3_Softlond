public class Asalariado extends Empleado{
    
    

    public Asalariado(int salario) {
        super(salario);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void calcularSalario(){
        System.out.println("el salario es: : "+getSalario());
        
    }
}
