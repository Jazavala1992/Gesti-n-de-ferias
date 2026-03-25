package proyectoProgII;

public class MacroDistrito {
	
	private String nombre, IDmacrodistrito;
	
	MacroDistrito(String a, String b) 
	{
		nombre = a;
		IDmacrodistrito = b;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIDmacrodistrito() {
		return IDmacrodistrito;
	}

	public void setIDmacrodistrito(String iDmacrodistrito) {
		IDmacrodistrito = iDmacrodistrito;
	}

	public void mostrar() 
	{
		System.out.println("Nombre del Macrodistrito: " + nombre + " - ID del Macrodistrito: " + IDmacrodistrito);
	}
}
