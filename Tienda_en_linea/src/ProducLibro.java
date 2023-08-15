public abstract class ProducLibro implements IProduct {
    private int precio;
    private String detalles;
    private int cantidad;
    public ProducLibro(int precio, String detalles, int cantidad) {
        this.precio = precio;
        this.detalles = detalles;
        this.cantidad = cantidad;
    }
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
