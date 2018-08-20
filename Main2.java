class Main2{
	public static void main(String[] args) {
		
		Elevador elevador = new Elevador(10); //10 Andares

		System.out.println(elevador.ultimoAndar == 10); //Esse é o ultimo andar

		//Não deve compilar
		//elevador.ultimoAndar = 11; //Deve ser imutavél
		//elevador.andarAtual = 5; //Deve ser inacessivel

		//Métodos para consulta
		System.out.println(elevador.andarAtual() == 1); //Deve ser o andar inicial por padrão
		System.out.println(elevador.ultimoAndar() == 10); //retorna o último andar

		//Movimentar
		elevador.subir(); //Sobe 1 andar
		System.out.println(elevador.andarAtual() == 2); //true
		elevador.descer(); //Desce 1 andar
		System.out.println(elevador.andarAtual() == 1); //true
		elevador.vaiPara(5); //Vai para o quinto andar
		System.out.println(elevador.andarAtual() == 5); //true
		elevador.vaiPara(11); //Não acontece nada, só existem 10 andares
		System.out.println(elevador.andarAtual() == 5); //true

		//sobe até o último andar
		while(elevador.andarAtual() != elevador.ultimoAndar()){
			elevador.subir();
		}

		elevador.subir(); //ja esta no ultimo andar
		System.out.println(elevador.andarAtual() == 10); //true
		elevador.vaiPara(1);
		System.out.println(elevador.andarAtual() == 1); //true
		elevador.descer(); //ja esta no andar mais baixo
		System.out.println(elevador.andarAtual() == 1); //true
	}
}