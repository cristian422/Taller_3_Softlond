public class PPantalon extends ProducRopa {

    public PPantalon(String talla, int precio, String detalles, int cantidad) {
        super(talla, precio, detalles, cantidad);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void calcularPrecio() {
        System.out.println("El precio total de los Pantalones es: "+(getCantidad()*getPrecio()));}

    @Override
    public void mostrarDetalles() {
        System.out.println("el detalle de los Pantalones es : "+getDetalles()); }
    
}
