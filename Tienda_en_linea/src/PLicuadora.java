public class PLicuadora extends ProducElectronico{
    
    
    

    public PLicuadora(int cantidad2, int precio, String detalle, String voltajeTrabajo) {
        super(cantidad2, precio, detalle, voltajeTrabajo);
    
    }

    @Override
    public void calcularPrecio() {
        System.out.println("El precio total de las Licuadoras es: "+(getCantidad()*getPrecio()));
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("el detalle de las Licuadoras es : "+getDetalles());
    }
    
}
