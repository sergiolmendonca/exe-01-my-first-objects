// Especifique descritivamente e com Casos de Teste um objeto simples, 
// mas que tenha pelo menos alguma propriedade imutável e mutável, e suas operações. 
// Tema livre.

// Considere uma lâmpada. Ela tem luminosidade(Lúmens), potência(Watts) e tensão(Volts). Pode ser observado se esta 
// ligada ou desligada, considerando que ela está inicialmente desligada, mas pode ser ligada e vice-versa.

//Casos de teste
class Especificando{
	public static void main(String[] args) {
		Lampada lamp = new Lampada(220, 25, 700); //tensão, potência e luminosidade

		//Não podem ser alterados
		//lamp.tensao = 110; //imutável
		//lamp.potencia = 30; //imutavel
		//lamp.luminosidade = 1000; //imutável
		//lamp.estaLigada = true; //inacesível

		//casos de consulta
		System.out.println(lamp.tensao() == 220); //true
		System.out.println(lamp.potencia() == 25); //true
		System.out.println(lamp.luminosidade() == 700); //true
		System.out.println(lamp.estaLigada() == false); //true

		//Ligar e desligar
		lamp.ligar(); //Liga a lampada
		System.out.println(lamp.estaLigada() == true); //true
		lamp.desligar(); //Desliga a lampada
		System.out.println(lamp.estaLigada() == false); //true
		lamp.trocar(); //Se etiver ligada desliga, se etiver desligada liga
		System.out.println(lamp.estaLigada() == true); //true

		//Casos especiais
		lamp.ligar(); //A lampada já está ligada, nada deve acontecer
		System.out.println(lamp.estaLigada() == true); //true
		lamp.trocar(); //Desliga
		System.out.println(lamp.estaLigada() == false); //true
		lamp.desligar(); //ja está desligada, nada deve acontecer
		System.out.println(lamp.estaLigada() == false); //true
	}
}