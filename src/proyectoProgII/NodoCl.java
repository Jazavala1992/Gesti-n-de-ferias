package proyectoProgII;

public class NodoCl {
	
	private Cliente cliente;
	private LSimpleCo ListaCompras;
	private NodoCl sig;
	
	
	public LSimpleCo getListaCompras() {
		return ListaCompras;
	}

	public void setListaCompras(LSimpleCo listaCompras) {
		ListaCompras = listaCompras;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public NodoCl getSig() {
		return sig;
	}

	public void setSig(NodoCl sig) {
		this.sig = sig;
	}

	NodoCl()
    {
        sig = null;
    }
	
	

}
