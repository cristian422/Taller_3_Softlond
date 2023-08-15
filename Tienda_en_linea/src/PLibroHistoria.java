public class PLibroHistoria extends ProducLibro {
    

    public PLibroHistoria(int precio, String detalles, int cantidad) {
        super(precio, detalles, cantidad);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void calcularPrecio() {
        System.out.println("El precio total de los libros es: "+getCantidad()*getPrecio());
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("el detalle del libro es: "+getDetalles());
    }
    
}
