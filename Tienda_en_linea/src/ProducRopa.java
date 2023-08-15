public abstract class ProducRopa implements IProduct {
    private String talla;
    private int precio;
    private String detalles;
    private int cantidad;
    

    public ProducRopa(String talla, int precio, String detalles, int cantidad) {
        this.talla = talla;
        this.precio = precio;
        this.detalles = detalles;
        this.cantidad = cantidad;
    }
    abstract public void calcularPrecio();
    abstract  public void mostrarDetalles();
    public String getTalla() {
        return talla;
    }
    public void setTalla(String talla) {
        this.talla = talla;
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
