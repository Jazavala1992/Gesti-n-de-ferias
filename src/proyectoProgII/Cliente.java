package proyectoProgII;

public class Cliente extends Persona{
	
	Cliente(String a, String b, int c) 
	{
		super(a, b, c);
	}
	
	public void mostrar() 
	{
		System.out.println("Nombre: " + nombre + " - Apellido: " + paterno + " - CI: " + CI);
	}
	
}
