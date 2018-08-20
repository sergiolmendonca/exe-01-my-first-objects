class Lampada{
	
	final int potencia;
	final int tensao;
	final int luminosidade;
	private boolean estaLigada = false;

	Lampada(int tensao, int potencia, int luminosidade){
		this.tensao = tensao;
		this.potencia = potencia;
		this.luminosidade = luminosidade;
	}

	int tensao(){
		return this.tensao;
	}

	int potencia(){
		return this.potencia;
	}

	int luminosidade(){
		return this.luminosidade;
	}

	boolean estaLigada(){
		return this.estaLigada;
	}

	void ligar(){
		this.estaLigada = true;
	}

	void desligar(){
		this.estaLigada = false;
	}

	void trocar(){
		this.estaLigada = !this.estaLigada; 
	}

}