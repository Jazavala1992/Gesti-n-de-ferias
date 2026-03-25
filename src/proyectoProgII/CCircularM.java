package proyectoProgII;

public class CCircularM {
	
	private int max=500;
    private Plato v[]=new Plato[max+1];
    private int ini,fin;
    
    public CCircularM()
    {
        ini=fin=0;
    }
    
    int nroelem ()
    {
	return ((max + fin - ini) % max);
    }
    
    public boolean esvacia ()
    {
	if (nroelem () == 0)
	    return (true);
	return (false);
    }
    
    boolean esllena ()
    {
	if (nroelem () == max - 1)
	    return (true);
	return (false);
    }
    
    public void adicionar (Plato elem)
    {
	if (!esllena ())
	{

	    fin = (fin + 1) % max;
	    v [fin] = elem;
	}
	else
	    System.out.println ("Cola circular llena");
    }
    
    public Plato eliminar ()
    {
	Plato elem = new Plato (null, null, fin);
	if (!esvacia ())
	{
	    ini = (ini + 1) % max;
	    elem = v [ini];
	    if (nroelem () == 0)
		ini = fin = 0;
	}
	else
	    System.out.println ("Cola circular vacia");
	return (elem);
    }
    
    void mostrar ()
    {
	Plato elem;
	if (esvacia ())
	    System.out.println ("Cola vacia xxx");
	else
	{
	    System.out.println ("\n Platos del Menu: ");
	    CCircularM aux = new CCircularM ();
	    while (!esvacia ())
	    {
		elem = eliminar ();
		aux.adicionar (elem);
		elem.mostrar();
	    }
	    vaciar(aux);
	}
    }
    
    public void vaciar (CCircularM a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());

    }

}
