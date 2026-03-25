package proyectoProgII;

public class PilaC {
	
	private int max=20;
    private CoordinadorGAMLP v[]=new CoordinadorGAMLP[max+1];
    private int tope;
    
    PilaC()
    {
        tope=0;
    }
    boolean esvacia ()
    {
	if (tope == 0)
	    return (true);
	return (false);
    }
    boolean esllena ()
    {
	if (tope == max)
	    return (true);
	return (false);
    }
    int nroelem ()
    {
	return (tope);
    }
    void adicionar (CoordinadorGAMLP elem)
    {
	if (!esllena ())
	{
	    tope++;
	    v [tope] = elem;
	}
	else
	    System.out.println ("Pila llena");
    }
    CoordinadorGAMLP eliminar ()
    {
    	CoordinadorGAMLP elem=new CoordinadorGAMLP(null, null, max, null, null);
	if (!esvacia ())
	{
	    elem = v [tope];
	    tope--;
	}
	else
	    System.out.println ("Pila vacia");
	return (elem);
    }
    void mostrar ()
    {
	if (esvacia ())
	    System.out.println ("Pila vacia");
	else
	{
	    System.out.println ("\n Ejercicios de la Pila ");
	    PilaC aux = new PilaC ();
	    while (!esvacia ())
	    {
	    CoordinadorGAMLP elem = eliminar ();
		aux.adicionar (elem);
		elem.mostrar();
	    }
	    vaciar(aux);
	}
    }
    void vaciar (PilaC a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());

    }

}
