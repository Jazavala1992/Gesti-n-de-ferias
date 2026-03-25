package proyectoProgII;

public class LDobleF {
	
	private NodoF p;
	
	public LDobleF() 
	{
		p = null;
	}

	public NodoF getP() {
		return p;
	}

	public void setP(NodoF p) {
		this.p = p;
	}
	
	public void adicionar(FeriaMilColores feria, LDobleEm emprendedores) 
	{
		NodoF x = new NodoF();
		x.setFeria(feria);
		x.setEmprendedores(emprendedores);

		if (getP() == null) {
			setP(x);
		} else {
			NodoF q = getP();
			while (q.getSig() != null) {
				q = q.getSig();
			}
			q.setSig(x);
			x.setAnt(q);
		}
	}

}
