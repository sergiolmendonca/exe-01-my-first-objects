# Exercício: My First Objects :heart:

## Garrafa Térmica

Considere a garrafa térmica e a abstração de suas propriedades e operações. Um garrafa térmica possui uma certa capacidade em mL e de início consideramos que ela está vazia. Quando ela é abastecida consideramos que o conteúdo está na plenitude de sua carga e que a cada pressionamento ela sirva pelo menos 100mL, menos se restar menos de 100, até ficar vazia. Seguem os Casos de Teste.

```java
GarrafaTermica garrafa = new GarrafaTermica(1000); // 1000mL = 1L
// assumimos que:
System.out.println(garrafa.capacidade == 1000); // esta é a capacidade
System.out.println(garrafa.conteudo() == 0); // e que está vazia
// essas instruções não devem compilar, comente-as:
garrafa.capacidade = 1500; // deve ser imutável
garrafa.conteudo = 1000; // deve ser inacessível
// alguns métodos para consulta:
System.out.println(garrafa.estaVazia() == true);
System.out.println(garrafa.estaCheia() == false);
System.out.println(garrafa.temConteudo() == false);
// abastecendo:
garrafa.abastecer();
System.out.println(garrafa.conteudo() == 1000);
System.out.println(garrafa.conteudo() == garrafa.capacidade);
System.out.println(garrafa.estaVazia() == false);
System.out.println(garrafa.estaCheia() == true);
System.out.println(garrafa.temConteudo() == true);
// servindo:
garrafa.servir(); // -100mL
// estado atual:
System.out.println(garrafa.conteudo() == 900);
System.out.println(garrafa.conteudo() != garrafa.capacidade);
System.out.println(garrafa.estaVazia() == false);
System.out.println(garrafa.estaCheia() == false);
System.out.println(garrafa.temConteudo() == true);
// servindo mais:
garrafa.servir(); // -100mL
garrafa.servir(); // -100mL
garrafa.servir(); // -100mL
garrafa.servir(); // -100mL
System.out.println(garrafa.conteudo() == 500);
System.out.println(garrafa.estaVazia() == false);
// servindo até ficar vazia:
while (garrafa.temConteudo()) garrafa.servir();
System.out.println(garrafa.temConteudo() == false);
System.out.println(garrafa.estaVazia() == true);
System.out.println(garrafa.estaCheia() == false);
// abastecendo
garrafa.abastecer();
System.out.println(garrafa.conteudo() == 1000);
garrafa.servir();
System.out.println(garrafa.conteudo() == 900);
// quando abastece volta a plenitude da capacidade, esteja vazia ou não
garrafa.abastecer();
System.out.println(garrafa.conteudo() == 1000);

// CASO ESPECIAL:
GarrafaTermica garrafinha = new GarrafaTermica(730); // 730mL
System.out.println(garrafinha.capacidade == 1000); // esta é a capacidade
System.out.println(garrafinha.conteudo() == 0); // e que está vazia
// abastecendo
garrafinha.abastecer();
System.out.println(garrafinha.conteudo() == 730);
// servindo
garrafinha.servir();
System.out.println(garrafinha.conteudo() == 630);
garrafinha.servir(); garrafinha.servir(); garrafinha.servir();
garrafinha.servir(); garrafinha.servir(); garrafinha.servir();
System.out.println(garrafinha.conteudo() == 30);
garrafinha.servir(); // serviu os últimos 30
System.out.println(garrafinha.conteudo() == 0);
System.out.println(garrafinha.estaVazia() == true);
garrafinha.servir(); // não há o que servir
System.out.println(garrafinha.conteudo() == 0);
System.out.println(garrafinha.estaVazia() == true);
```

## Escrevendo os Casos de Teste a partir de uma especificação descritiva

Considere um elevador. Ele é instalado em um intervalo de andares, sendo o mais inferior o térreo (vamos considerar andar 1) e o mais superior a ser informado. Instalado, considere que ele está no térreo e que, usando os botões, pode-se indicar o andar, dentro dos possíveis, para que o elevador vá. Escrevar os Casos de Teste segundo esta descrição.

## Especificando

Especifique descritivamente e com Casos de Teste um objeto simples, mas que tenha pelo menos alguma propriedade imutável e mutável, e suas operações. Tema livre.
