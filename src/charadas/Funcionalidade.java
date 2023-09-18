package charadas;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import charadas.util.Cores;

public class Funcionalidade extends Menu implements FaseUm, FaseDois, FaseFinal{

	public Funcionalidade(String nome) {
		super(nome);
	}
	

	@Override
	public void menuIniciar() {
		System.out.println(Cores.TEXT_YELLOW + "\n**************************************************************");
		System.out.println("Esse é um pequeno jogo de charadas");
		System.out.println("Bem-vindo ao jogo " + getNome() + "!");
		System.out.println("Deseja participar?");
		System.out.println("1 - SIM!  0 - NÃO!");
		System.out.println("\n**************************************************************\n" + Cores.TEXT_RESET);
	}
		
		public void menuIniciar2() {
			System.out.println(Cores.TEXT_YELLOW + "Você aceita esse desafio?");
			System.out.println("1- SIM!\n0- NÃO!");
			System.out.println("\n**************************************************************\n" + Cores.TEXT_RESET);
	}
		
		public void menuIniciar3() {
			System.out.println(Cores.TEXT_YELLOW + "Você se sente capaz??");
			System.out.println("1- SIM!\n0- NÃO!");
			System.out.println("\n**************************************************************\n" + Cores.TEXT_RESET);
	}

	@Override
	public void menuInstrucao1() {
		System.out.println(Cores.TEXT_YELLOW + "\n**************************************************************");
		System.out.println("OK! Vou explicar como vai funcionar:\n");
		System.out.println("Eu vou te contar uma charada e te dar algumas possíveis respostas.\nTudo o que precisa fazer é escolher entre elas, certo?");
		System.out.println("Serão 3 opções e você escolherá o número que corresponde a sua resposta.");
		System.out.println("Mas ATENÇÃO: Digite somente os números de 1 a 3, ok?\nLembre-se: Para sair do jogo, digite o número 0\nVamos lá");
		System.out.println("**************************************************************\n" + Cores.TEXT_RESET);
		
	}
	
	@Override
	public void menuInstrucao2() {
		System.out.println(Cores.TEXT_YELLOW +"\n**************************************************************");
		System.out.println("Vai funcionar do mesmo jeito mas agora fica um pouco mais difícil.\nVou te contar uma charada e te dar três opções.\nApenas escolha entre elas.");
		System.out.println("Mas ATENÇÃO: Digite somente os números de 1 a 3, ok?\nLembre-se: Para sair do jogo, digite o número 0\nVamos lá");
		System.out.println("**************************************************************" + Cores.TEXT_RESET);
	}
	
	@Override
	public void menuInstrucao3() {
		System.out.println(Cores.TEXT_YELLOW + "\n**************************************************************");
		System.out.println("Como esperado da sua inteligência, eu sabia que você estava confiante!");
		System.out.println("Diferente das fases anteriores, agora você está por conta própria!");
		System.out.println("Mas ATENÇÃO: Preste atenção no que você digita! Se errar, terá que recomeçar da fase um!\nPronto?");
		System.out.println("**************************************************************" + Cores.TEXT_RESET);
	}
	
	int resposta;
	@Override
	public void faseUm() {
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
			do{	
				System.out.println(Cores.TEXT_YELLOW + "O que é, o que é... Está sempre a caminho, mas nunca chega.\n");
				System.out.println("\n1- O atraso \n2- O futuro\n3- O passado\n" + Cores.TEXT_RESET);
				resposta = leia.nextInt();
				
				switch(resposta) {
				case 1:
					System.out.println(Cores.TEXT_YELLOW + "\nAh, não... que vacilo! Tenta outra vez!\n" + Cores.TEXT_RESET);
					break;
				case 2:
					System.out.println(Cores.TEXT_YELLOW + "\nVocê acertou! PARABÉNS!" + Cores.TEXT_RESET);
					break;
				case 3:
					System.out.println(Cores.TEXT_YELLOW + "\nAh, não... que vacilo! Tenta outra vez!\n" + Cores.TEXT_RESET);
					break;
				case 0:
					System.out.println(Cores.TEXT_YELLOW + "\nAh, finalizar? Então ta jóia!" + Cores.TEXT_RESET);
					System.exit(0);
					break;
				default:
					if(resposta > 3) {
						System.out.println(Cores.TEXT_YELLOW + "\nHum... essa não é uma opção. Vamos de novo!\n" + Cores.TEXT_RESET);
					}
					break;
				}
			}while (resposta != 2 && resposta != 0);
	}
	
	@Override
	public void faseDois() {
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println(Cores.TEXT_YELLOW + "\nO que é, o que é... Se o dia anterior a ontem é o dia 21, que dia é o dia depois de amanhã?" + Cores.TEXT_RESET);
			System.out.println(Cores.TEXT_YELLOW + "\n1- 25 \n2- 24\n3- 26\n" + Cores.TEXT_RESET);
			resposta = leia.nextInt();
			
			switch(resposta) {
			case 1:
				System.out.println(Cores.TEXT_YELLOW + "\nVocê acertou! PARABÉNS!" + Cores.TEXT_RESET);
				break;
			case 2:
				System.out.println(Cores.TEXT_YELLOW + "\nAh, não... que vacilo! Tenta outra vez!" + Cores.TEXT_RESET);
				break;
			case 3:
				System.out.println(Cores.TEXT_YELLOW + "\nAh, não... que vacilo! Tenta outra vez!" + Cores.TEXT_RESET);
				break;
			case 0:
				System.out.println(Cores.TEXT_YELLOW + "\nAh, finalizar? Então ta jóia!" + Cores.TEXT_RESET);
				System.exit(0);
				break;
			default:
				if(resposta > 3) {
					System.out.println(Cores.TEXT_YELLOW + "\nHum... essa não é uma opção. Vamos de novo!\n" + Cores.TEXT_RESET);
				}
				break;
			}
			
		}while(resposta != 1 && resposta != 0);
	}
	
	@Override
	public void faseFinal() {
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		ArrayList<String> respostaFinal = new ArrayList<>();
		
		System.out.println(Cores.TEXT_YELLOW + "\nTenha atenção a esta sequência de letras: U D T Q C S S." + Cores.TEXT_RESET);
		System.out.println(Cores.TEXT_YELLOW + "Será que você consegue descobrir quais são as próximas 3 letras?" + Cores.TEXT_RESET);
		for( int indice = 0; indice <1; indice++) {
			System.out.println(Cores.TEXT_YELLOW + "\nPrimeira letra da resposta (Pressione ENTER após digitar sua resposta:" + Cores.TEXT_RESET);
			respostaFinal.add(leia.nextLine().toUpperCase());
			System.out.println(Cores.TEXT_YELLOW + "Segunda letra da resposta (Pressione ENTER após digitar sua resposta:" + Cores.TEXT_RESET);
			respostaFinal.add(leia.nextLine().toUpperCase());
			System.out.println(Cores.TEXT_YELLOW + "Terceira letra da resposta (Pressione ENTER após digitar sua resposta:" + Cores.TEXT_RESET);
			respostaFinal.add(leia.nextLine().toUpperCase());
			
			List<String> respostaFinalDesc = respostaFinal.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
			System.out.println(Cores.TEXT_YELLOW + "\nResposta digitada exibida em ordem Decrescente: " + respostaFinalDesc + Cores.TEXT_RESET);
		}
		
		if(respostaFinal.contains("O") && respostaFinal.contains("N") && respostaFinal.contains("D")) {
			System.out.println(Cores.TEXT_YELLOW + "\nVocê acertou e completou o jogo! uhull!" + Cores.TEXT_RESET);
		}else {
			System.out.println(Cores.TEXT_YELLOW + "\nVocê errou... e como toda fase difícil aqui vai a segunda parte do desafio:" + Cores.TEXT_RESET);
			System.out.println(Cores.TEXT_YELLOW + "Terá que começar tudo novamente. Eu sei que você consegue, não desista!" + Cores.TEXT_RESET);
		}
		
		if(respostaFinal.contains("sair")) {
			System.out.println(Cores.TEXT_YELLOW + "Poxa, você chegou tão longe... mas ok!" + Cores.TEXT_RESET);
		}
	}

	@Override
	public void menuFinalizar() {
		System.out.println(Cores.TEXT_YELLOW + "\nUé? Poxa... parece que acabou...\nObrigada por jogar! =)" + Cores.TEXT_RESET);
	}
	
	public void enquete(String frase) {
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		String respost = null;

		
		System.out.println(Cores.TEXT_YELLOW + "\nVocê se divertiu? Sim ou Não?" + Cores.TEXT_RESET);
		respost = leia.nextLine().toLowerCase();
		
		switch(respost) {
		case "sim":
			System.out.println(Cores.TEXT_YELLOW + "\nQue bom que você gostou!" + Cores.TEXT_RESET);
			break;
		case "não":
			System.out.println(Cores.TEXT_YELLOW + "\nOh? Vou tentar melhorar no futuro, obrigada por dizer!" + Cores.TEXT_RESET);
			break;
		case "nao":
			System.out.println(Cores.TEXT_YELLOW + "\nOh? Vou tentar melhorar no futuro, obrigada por dizer!" + Cores.TEXT_RESET);
			break;
		default:
			System.out.println(Cores.TEXT_YELLOW + "\nOpa! Resposta inválida!" + Cores.TEXT_RESET);
			System.exit(0);
		}
	}
	
	public void enquete(int numero) {
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		System.out.println(Cores.TEXT_YELLOW + "\nDe 0 a 10 o quão legal você achou o jogo?" + Cores.TEXT_RESET);
		resposta = leia.nextInt();
		
		if(resposta >= 0 && resposta < 5) {
			System.out.println(Cores.TEXT_YELLOW + "\nNão foi tão legal, né? Mas pode deixar que vou melhorar!" + Cores.TEXT_RESET);
			System.out.println(Cores.TEXT_YELLOW + "Obrigada por jogar comigo! Até a próxima =)");
		}else if( resposta > 5 && resposta <= 10) {
			System.out.println(Cores.TEXT_YELLOW + "\nUau! Você gostou mesmo? Eu fico muito feliz, obrigada!" + Cores.TEXT_RESET);
			System.out.println(Cores.TEXT_YELLOW + "Obrigada por jogar comigo! Até a próxima =)");
		}else if (resposta > 10) {
			System.out.println(Cores.TEXT_YELLOW + "Esse número é bem grandão! Gostou tanto assim? Obrigada de verdade!" + Cores.TEXT_RESET);
			System.out.println(Cores.TEXT_YELLOW + "Obrigada por jogar comigo! Até a próxima =)");
		}else if(resposta < 0) {
			System.out.println(Cores.TEXT_YELLOW + "\nWah! Tão ruim assim? Ok, preciso correr atrás e melhorar bastantão!" + Cores.TEXT_RESET);
			System.out.println(Cores.TEXT_YELLOW + "Obrigada por jogar comigo! Até a próxima =)" + Cores.TEXT_RESET);
		}
	}

	public boolean checkLetters(String nome) {
		return nome.matches("[a-zA-Z]+");
	}
}