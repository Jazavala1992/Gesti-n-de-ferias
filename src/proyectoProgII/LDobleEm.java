package proyectoProgII;

public class LDobleEm {
	
	private NodoEm p;
	
	public LDobleEm() 
	{
		p = null;
	}

	public NodoEm getP() {
		return p;
	}

	public void setP(NodoEm p) {
		this.p = p;
	}
	
	public void adicionar(Emprendedor emprendedor, Emprendimiento emprendimiento, CCircularM menu, LSimpleCl clientes) 
	{
		NodoEm x = new NodoEm();
		x.setEmprendedor(emprendedor);
		NodoE e = new NodoE();
		e.setEmprendimiento(emprendimiento);
		e.setMenu(menu);
		e.setCl(clientes);
	
		x.setEmprendimiento(e);

		if (getP() == null) {
			setP(x);
			x.setAnt(null);
		} else {
			NodoEm q = getP();
			while (q.getSig() != null) {
				q = q.getSig();
			}
			q.setSig(x);
			x.setAnt(q);
		}
	}
	
	public void mostrar ()
	{
		System.out.println("Lista Emprendedores:");
		NodoEm w=getP();
		while (w!=null)
		{
			w.mostrar();
			w=w.getSig();
		}
	}
	
	public void adicionarnodo(NodoEm r) //adiciona un nodo a la lista
    {
		if (getP() == null) 
		{
            setP(r);
            r.setAnt(null);
        } 
		    else 
		    {
            NodoEm q = getP();
            while (q.getSig() != null) 
            {
                q = q.getSig();
            }
            q.setSig(r);
            r.setAnt(q);
        }
    }

	

	

}
