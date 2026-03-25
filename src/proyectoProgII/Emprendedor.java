package proyectoProgII;

public class Emprendedor extends Persona{
	
	private String Espedialidad, nombreEmprendimiento;
	private int NroRegistroSanitario;
	
	Emprendedor(String a, String b, int c, String d, String e, int f)
    {
        super(a, b, c);
        Espedialidad = d;
        nombreEmprendimiento = e;
        NroRegistroSanitario = f;
    }
	
	public String getEspedialidad() {
		return Espedialidad;
	}

	public void setEspedialidad(String espedialidad) {
		Espedialidad = espedialidad;
	}

	public String getNombreEmprendimiento() {
		return nombreEmprendimiento;
	}
	
	public void setNombreEmprendimiento(String nombreEmprendimiento) {
		this.nombreEmprendimiento = nombreEmprendimiento;
	}

	public int getNroRegistroSanitario() {
		return NroRegistroSanitario;
	}

	public void setNroRegistroSanitario(int nroRegistroSanitario) {
		NroRegistroSanitario = nroRegistroSanitario;
	}

	
	public void  mostrar()
	{
		System.out.println("Nombre: " + nombre + " - Apellido: " + paterno + " - CI: " + CI + " - Especialidad: "
				+ Espedialidad + " - Nombre del Emprendimiento: " + nombreEmprendimiento
				+ " - Nro de Registro Sanitario: " + NroRegistroSanitario);
	}

}
