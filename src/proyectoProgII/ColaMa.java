package proyectoProgII;

public class ColaMa {

	     private int max=1000;
	     private MacroDistrito v[]=new MacroDistrito[max+1];
	     private int ini,fin;
	     
	     public ColaMa()
	     {
	         ini=fin=0;
	     }
	     public boolean esvacia ()
	     {
	 	if (ini == 0 && fin == 0)
	 	    return (true);
	 	return (false);
	     }
	     boolean esllena ()
	     {
	 	if (fin == max)
	 	    return (true);
	 	return (false);
	     }
	     int nroelem ()
	     {
	 	return (fin - ini);
	     }
	     public void adicionar (MacroDistrito elem)
	     {
	    	 if (!esllena())
				{
				v[fin+1]=elem;
				fin++;
				}
			else 
				System.out.println("Cola llena");
	     }
	     
	     
	     
	     public MacroDistrito eliminar ()
	     {
	    MacroDistrito elem = null;
	 	if (!esvacia ())
	 	{
	 	    ini++;
	 	    elem = v [ini];
	 	    if (ini == fin)
	 		ini = fin = 0;
	 	}
	 	else
	 	    System.out.println ("Cola Simple vacia");
	 	return (elem);
	     }
	     
	     
		     
	     
	     void mostrar ()
	     {
	    MacroDistrito elem;
	 	if (esvacia ())
	 	    System.out.println ("Cola vacia");
	 	else
	 	{
	 	    System.out.println ("\n Macroditritos: ");
	 	    ColaMa aux = new ColaMa ();
	 	    while (!esvacia ())
	 	    {
	 		elem = eliminar ();
	 		aux.adicionar (elem);
	 		elem.mostrar();
	 	    }
	 	    vaciar(aux);
	 	}
	     }
	     
	     public void vaciar (ColaMa a)
	     {
	 	while (!a.esvacia ())
	 	    adicionar (a.eliminar ());
	     }
}
