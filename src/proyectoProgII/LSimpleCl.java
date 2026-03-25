package proyectoProgII;

public class LSimpleCl {
	
	private NodoCl p;
	
	LSimpleCl() 
	{
		p = null;
	}

	public NodoCl getP() {
		return p;
	}

	public void setP(NodoCl p) {
		this.p = p;
	}
	
	public void adicionar(Cliente x, LSimpleCo y) 
	{
		NodoCl nue = new NodoCl();
		nue.setCliente(x);
		nue.setListaCompras(y);

		if (getP() == null) {
			setP(nue);
		} else {
			NodoCl aux = getP();
			while (aux.getSig() != null) {
				aux = aux.getSig();
			}
			aux.setSig(nue);
		}
	}
	

}
