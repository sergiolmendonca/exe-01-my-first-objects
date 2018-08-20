class Elevador{
	final int ultimoAndar;
	private int andarAtual = 1;

	Elevador(int ultimoAndar){
		this.ultimoAndar = ultimoAndar;
	}

	void subir(){
		if(this.andarAtual < this.ultimoAndar) this.andarAtual++;
	}

	void descer(){
		if(this.andarAtual > 1) this.andarAtual--;
	}

	void vaiPara(int andar){
		if(andar <= ultimoAndar && andar >= 1) this.andarAtual = andar;
	}

	int ultimoAndar(){
		return this.ultimoAndar;
	}

	int andarAtual(){
		return this.andarAtual;
	}
}