public class PCamisa extends ProducRopa{


    public PCamisa(String talla, int precio, String detalles, int cantidad) {
        super(talla, precio, detalles, cantidad);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void calcularPrecio() {
        System.out.println("El precio total de las camisas es: "+(getCantidad()*getPrecio()));
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("el detalle de las Camisas: "+getDetalles());
    }
    
}
