package proyectoProgII;

public class FeriaMilColores {

	private String IdFeria, IdMacroDistrito, hora, lugar, fecha;
	
	FeriaMilColores(String a, String b, String c, String d, String e) 
	{
		IdFeria = a;
		IdMacroDistrito = b;
		hora = c;
		lugar = d;
		fecha = e;
	}

	public String getIdFeria() {
		return IdFeria;
	}

	public void setIdFeria(String idFeria) {
		IdFeria = idFeria;
	}

	public String getIdMacroDistrito() {
		return IdMacroDistrito;
	}

	public void setIdMacroDistrito(String idMacroDistrito) {
		IdMacroDistrito = idMacroDistrito;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public void mostrar() 
	{
		System.out.println("ID de la Feria: " + IdFeria + " - ID del Macro Distrito: " + IdMacroDistrito + " - Hora: "
				+ hora + " - Lugar: " + lugar + " - Fecha: " + fecha);
	}
}
