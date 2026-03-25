package proyectoProgII;

public class NodoEm {

	private Emprendedor emprendedor;
	private NodoE emprendimiento;
	private NodoEm sig, ant;
	
	public NodoEm() 
	{
		sig = null;
	}

	public Emprendedor getEmprendedor() {
		return emprendedor;
	}

	public void setEmprendedor(Emprendedor emprendedor) {
		this.emprendedor = emprendedor;
	}

	public NodoE getEmprendimiento() {
		return emprendimiento;
	}

	public void setEmprendimiento(NodoE emprendimiento) {
		this.emprendimiento = emprendimiento;
	}

	public NodoEm getSig() {
		return sig;
	}

	public void setSig(NodoEm sig) {
		this.sig = sig;
	}

	public NodoEm getAnt() {
		return ant;
	}

	public void setAnt(NodoEm ant) {
		this.ant = ant;
	}
	
	public void mostrar() {
		System.out.println("Emprendedor: " + getEmprendedor().getNombre());
		getEmprendimiento().getEmprendimiento().mostrar();
	}
	
	
	
}
