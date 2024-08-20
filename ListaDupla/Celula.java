package ListaDupla;

public class Celula {
	
	public Celula proxima;
	public Celula anterior;
	public Object elemento;
	
	public Celula(Celula proxima, Celula anterior, Object elemento) {
		this.proxima = proxima;
		this.anterior = anterior;
		this.elemento = elemento;
	}
	
	public Celula(Celula proxima, Object elemento) {
		this.proxima = proxima;
		this.elemento = elemento;
	}
	
	public Celula(Object elemento) {
		this.elemento = elemento;
	}
	
	
	
	public Celula() {}

	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}
	
	public Celula getAnterior() {
		return anterior;
	}

	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}

	public Celula getProxima() {
		return proxima;
	}

	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}
}