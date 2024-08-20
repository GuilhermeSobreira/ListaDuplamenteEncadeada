package ListaDupla;

public class Principal {
	public static void main(String[] args) {
	
		Lista l = new Lista();
		
		l.adicionarNoFim("Lunes");
		l.adicionarNoInicio("Martes");
		l.adicionarNoInicio("Miercules");
		
		l.imprimir();
		
		System.out.println("=========");
		
		l.adicionarNoFim("Jueves");
		
		l.imprimir();
	}
}
