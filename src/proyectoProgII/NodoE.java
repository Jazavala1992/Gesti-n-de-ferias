package proyectoProgII;

public class NodoE {
	
	private Emprendimiento emprendimiento;
	private CCircularM Menu;
	private LSimpleCl cl;
	private NodoE sig;
	
	NodoE() 
	{
		sig = null;
	}

	public Emprendimiento getEmprendimiento() {
		return emprendimiento;
	}

	public void setEmprendimiento(Emprendimiento emprendimiento) {
		this.emprendimiento = emprendimiento;
	}

	public CCircularM getMenu() {
		return Menu;
	}

	public void setMenu(CCircularM menu) {
		Menu = menu;
	}

	public NodoE getSig() {
		return sig;
	}

	public void setSig(NodoE sig) {
		this.sig = sig;
	}

	public LSimpleCl getCl() {
		return cl;
	}

	public void setCl(LSimpleCl cl) {
		this.cl = cl;
	}
	

	
}
