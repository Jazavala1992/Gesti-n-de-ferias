package proyectoProgII;

public class LSimpleCo {
	
	NodoCo p;

	public NodoCo getP() {
		return p;
	}

	public void setP(NodoCo p) {
		this.p = p;
	}
	
	LSimpleCo() 
	{
		p = null;
	}
	
	public void adicionar(Plato x) 
	{
		NodoCo nue = new NodoCo();
		nue.setPlato(x);

		if (getP() == null) {
			setP(nue);
		} else {
			NodoCo aux = getP();
			while (aux.getSig() != null) {
				aux = aux.getSig();
			}
			aux.setSig(nue);
		}
	}

}
