package ListaDupla;

public class Lista {
	
	private Celula cabeca;
	private Celula cauda;
	private int totalDeElementos=0;
	
	public void adicionarNoInicio(String nome) {
		
		if(this.totalDeElementos==0) {
			
			Celula nova = new Celula(nome);
			this.cabeca = nova;
			this.cauda = nova;
			
		}else {
			
			Celula nova = new Celula(this.cabeca,nome);
			this.cabeca.setAnterior(nova);
			this.cabeca = nova;
		}
		
		this.totalDeElementos++;
	}
	
	public void adicionarNoFim(String nome) {
		
		if(this.totalDeElementos==0) {
			adicionarNoInicio(nome);
		}else {
			
			Celula nova = new Celula(null, this.cauda,nome);
			this.cauda.setProxima(nova);;
			this.cauda = nova;
			
		}
			
			this.totalDeElementos++;
		
	}
	
	public void imprimir() {
		
		Celula aux = this.cabeca;
		for(int cont = 0; cont < this.totalDeElementos-1; cont++) {
			System.out.println(aux.getElemento());
			aux = aux.getProxima();
	
		}
	}

}
