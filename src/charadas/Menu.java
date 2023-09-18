package charadas;

public abstract class Menu {
	private String nome;
	
	public Menu (String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract void menuIniciar();
	
	public abstract void menuInstrucao1();
	
	public abstract void menuInstrucao2();
	
	public abstract void menuInstrucao3();
	
	public abstract void menuFinalizar();
}