public class PLavadora extends ProducElectronico{
    
    
    
    public PLavadora(int cantidad2, int precio, String detalle, String voltajeTrabajo) {
        super(cantidad2, precio, detalle, voltajeTrabajo);
    
    }

    @Override
    public void calcularPrecio() {
        
        System.out.println("El precio total de las lavadoras es: "+getCantidad()*getPrecio());
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("el detalle de las lavadoras: "+getDetalles());
    }
    
}
