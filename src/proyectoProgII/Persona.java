package proyectoProgII;

public class Persona {
	
	protected String nombre, paterno;
	protected int CI;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public int getCI() {
		return CI;
	}

	public void setCI(int cI) {
		CI = cI;
	}

	Persona(String a, String b, int c)
	{
        nombre = a;
        paterno = b;
        CI = c;
    }
	
	public void  mostrar()
	{
        System.out.println("Nombre: " + nombre+" - Apellido: " + paterno+" - CI: " + CI );
    }
	

}
