package charadas;
import java.util.InputMismatchException;
import java.util.Scanner;
import charadas.util.Cores;

public class ProjetoCharada {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Funcionalidade usuario = new Funcionalidade(null);
		int resposta = 0;
		
		System.out.println(Cores.TEXT_YELLOW + "Qual o seu nome?\n" + Cores.TEXT_RESET);
		usuario.setNome(leia.nextLine().trim());
		
		if(usuario.checkLetters(usuario.getNome())) {
			System.out.println(Cores.TEXT_YELLOW + "\nMuito prazer em te conhecer!" + Cores.TEXT_RESET);
		}else {
			System.out.println(Cores.TEXT_YELLOW + "\nOpa, tenho certeza que esse não é o seu nome!" + Cores.TEXT_RESET);
			System.exit(0);
		}

		try{
			usuario.menuIniciar();
			resposta = leia.nextInt();

			if(resposta == 1) {
				try {
					usuario.menuInstrucao1();
					usuario.faseUm();
				}catch(InputMismatchException e) {
					System.out.println(Cores.TEXT_YELLOW + "\nAh não, não foi isso que eu pedi. \nVocê respondeu com letras e por isso deu erro! \nLembre-se: Digite apenas os números das opções!" + Cores.TEXT_RESET);
					System.exit(0);
				}	
			}else if(resposta == 0) {
				usuario.menuFinalizar();
				System.exit(0);
			}else {
				System.out.println(Cores.TEXT_YELLOW + "Ops, opção inválida!" + Cores.TEXT_RESET);
				System.exit(0);
			}
		}catch(InputMismatchException e) {
			System.out.println(Cores.TEXT_YELLOW + "\nAh não, não foi isso que eu pedi. \nVocê respondeu com letras e por isso deu erro! \nLembre-se: Digite apenas o que for pedido!" + Cores.TEXT_RESET);
			System.exit(0);
		}

		try{
			System.out.println(Cores.TEXT_YELLOW + "\n**************************************************************");
			System.out.println("\nMuito bem " + usuario.getNome() + ", vejo que você tem habilidades e quero testa-las!" + Cores.TEXT_RESET);
			usuario.menuIniciar2();
			resposta = leia.nextInt();
			
			if(resposta == 1) {
				try {
					usuario.menuInstrucao2();
					usuario.faseDois();
				}catch(InputMismatchException e) {
					System.out.println(Cores.TEXT_YELLOW + "\nAh não, não foi isso que eu pedi. \nVocê respondeu com letras e por isso deu erro! \nLembre-se: Digite apenas os números das opções!" + Cores.TEXT_RESET);
				}	
			}else if(resposta == 0) {
				usuario.menuFinalizar();
				System.exit(0);
			}else {
				System.out.println(Cores.TEXT_YELLOW + "Ops, opção inválida!" + Cores.TEXT_RESET);
				System.exit(0);
			}
		}catch(InputMismatchException e) {
			System.out.println(Cores.TEXT_YELLOW + "\nAh não, não foi isso que eu pedi. \nVocê respondeu com letras e por isso deu erro! \nLembre-se: Digite apenas o que for pedido!" + Cores.TEXT_RESET);
			System.exit(0);
		}

		try{
			System.out.println(Cores.TEXT_YELLOW + "\n**************************************************************");
			System.out.println("\nChegamos na fase final, " + usuario.getNome() + ". Agora sim as coisas complicam!" + Cores.TEXT_RESET);
			usuario.menuIniciar3();
			resposta = leia.nextInt();
					
			if(resposta == 1) {
				try {
					usuario.menuInstrucao3();
					usuario.faseFinal();
				}catch(InputMismatchException e) {
					System.out.println(Cores.TEXT_YELLOW + "\nAh não, não foi isso que eu pedi. \nVocê respondeu com letras e por isso deu erro! \nLembre-se: Digite apenas os números das opções!" + Cores.TEXT_RESET);
				}	
			}else if(resposta == 0) {
				usuario.menuFinalizar();
				System.exit(0);
			}else {
				System.out.println(Cores.TEXT_YELLOW + "Ops, opção inválida!" + Cores.TEXT_RESET);
				System.exit(0);
			}
		}catch(InputMismatchException e) {
			System.out.println(Cores.TEXT_YELLOW + "\nAh não, não foi isso que eu pedi. \nVocê respondeu com letras e por isso deu erro! \nLembre-se: Digite apenas o que for pedido!" + Cores.TEXT_RESET);
			System.exit(0);
		}
				
		usuario.enquete(null);
		usuario.enquete(0);
		leia.close();
	}
}