package proyectoProgII;

public class NodoF {
	
	private FeriaMilColores feria;
	private LDobleEm emprendedores;
	private NodoF sig, ant;
	
	NodoF() 
	{
		sig = null;
		ant = null;
	}

	public FeriaMilColores getFeria() {
		return feria;
	}

	public void setFeria(FeriaMilColores feria) {
		this.feria = feria;
	}

	public LDobleEm getEmprendedores() {
		return emprendedores;
	}

	public void setEmprendedores(LDobleEm emprendedores) {
		this.emprendedores = emprendedores;
	}

	public NodoF getSig() {
		return sig;
	}

	public void setSig(NodoF sig) {
		this.sig = sig;
	}

	public NodoF getAnt() {
		return ant;
	}

	public void setAnt(NodoF ant) {
		this.ant = ant;
	}
	
	

}
