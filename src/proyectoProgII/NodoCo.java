package proyectoProgII;

public class NodoCo {
	
	private Plato plato;
	private NodoCo sig;
	
	public Plato getPlato() {
		return plato;
	}
	public void setPlato(Plato plato) {
		this.plato = plato;
	}
	public NodoCo getSig() {
		return sig;
	}
	public void setSig(NodoCo sig) {
		this.sig = sig;
	}
	
	NodoCo() 
	{
		sig = null;
	}

}
