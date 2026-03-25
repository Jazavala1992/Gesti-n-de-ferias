package proyectoProgII;

public class Plato {
	
	private String nombre, codigo;
	private int precio;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	Plato(String a, String b, int c) {
		nombre = a;
		codigo = b;
		precio = c;
	}
	
	public void mostrar() 
	{
		System.out.println("Nombre: " + nombre + " - Codigo: " + codigo + " - Precio: " + precio);
	}

}
