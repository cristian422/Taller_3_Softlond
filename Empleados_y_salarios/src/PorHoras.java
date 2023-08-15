public class PorHoras extends Empleado {
    private int horas;
    public PorHoras(int salario,int horas){
        super(salario);
        this.horas=horas;
    }
    @Override
    public void calcularSalario(){
        int salariocalculado=this.horas*this.getSalario();
        System.out.println("el total de salario es: "+salariocalculado);
    }
}
