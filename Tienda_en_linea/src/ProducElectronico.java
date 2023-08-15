public abstract class ProducElectronico implements IProduct{
    private int precio;
    private String detalles;
    private int cantidad;
    private String voltageTrabajo;
    
    public ProducElectronico(int cantidad2, int precio, String detalle,String voltajeTrabajo) {
        this.cantidad=cantidad2;
        this.precio=precio;
        this.detalles=detalle;
        this.voltageTrabajo=voltajeTrabajo;
    }

    @Override
    public abstract  void calcularPrecio();

    @Override
    public abstract void mostrarDetalles();

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    
}
