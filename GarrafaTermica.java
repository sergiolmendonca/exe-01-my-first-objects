class GarrafaTermica{
	
	//Atributos
	final int capacidade;
	private int conteudo = 0;

	//Construtor
	GarrafaTermica(int capacidade){
		this.capacidade = capacidade;
	}

	//metodos para consulta
	boolean estaVazia(){
		return conteudo == 0 ? true : false;
	}

	boolean estaCheia(){
		return conteudo == capacidade ? true : false;
	}

	int conteudo(){
		return conteudo;
	}


	//abastecer e servir
	void abastecer(){
		conteudo = capacidade;
	}

	void servir(){
		if(conteudo >= 100){
			conteudo -= 100;
		}else if (conteudo > 0) {
			conteudo -= conteudo;
		}
	}

	boolean temConteudo(){
		return conteudo > 0 ? true : false;
	}





}