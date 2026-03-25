package proyectoProgII;

public class Emprendimiento {
	
	private String nombreEmprendimiento, categoria, IDemprendimiento;
	
	Emprendimiento(String a, String b, String c) 
	{
		nombreEmprendimiento = a;
		categoria = b;
		IDemprendimiento = c;
	}

	public String getNombreEmprendimiento() {
		return nombreEmprendimiento;
	}

	public void setNombreEmprendimiento(String nombreEmprendimiento) {
		this.nombreEmprendimiento = nombreEmprendimiento;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getIDemprendimiento() {
		return IDemprendimiento;
	}

	public void setIDemprendimiento(String iDemprendimiento) {
		IDemprendimiento = iDemprendimiento;
	}
	
	public void mostrar() 
	{
		System.out.println("Nombre del Emprendimiento: " + nombreEmprendimiento + " - Categoria: " + categoria
				+ " - ID del Emprendimiento: " + IDemprendimiento);
	}

}
