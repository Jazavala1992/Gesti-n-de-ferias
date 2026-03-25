package proyectoProgII;

public class CoordinadorGAMLP extends Persona{
	
	private String IDmacrodistrito, IDGAMLP;
	
	CoordinadorGAMLP(String a, String b, int c, String d, String e) 
	{
		super(a, b, c);
		IDmacrodistrito = d;
		IDGAMLP = e;
	}

	public String getIDmacrodistrito() {
		return IDmacrodistrito;
	}

	public void setIDmacrodistrito(String iDmacrodistrito) {
		IDmacrodistrito = iDmacrodistrito;
	}

	public String getIDGAMLP() {
		return IDGAMLP;
	}

	public void setIDGAMLP(String iDGAMLP) {
		IDGAMLP = iDGAMLP;
	}
	
	public void mostrar() 
	{
		System.out.println("ID del Macrodistrito: " + IDmacrodistrito + " - ID del GAMLP: " + IDGAMLP);
	}
}
