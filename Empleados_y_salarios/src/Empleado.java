public abstract class Empleado {
    private int salario;
    

    public Empleado(int salario) {
        this.salario = salario;
    }

    public void calcularSalario(){
        System.out.println("hola");
    }
    public void calcularSalario(int valorHoras){}

    public  int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
}
