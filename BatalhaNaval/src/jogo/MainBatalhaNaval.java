package jogo;

import java.util.Scanner;

public class MainBatalhaNaval {
	
	public static void main(String[] args) {
		
		Scanner tecladoColuna = new Scanner(System.in);
		Scanner tecladoLinha = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		
		Navio navios = new Navio();
		int [] navio = new int[] {1,2,2,3,4};
		navios.iniciarNavio(navio);
		String[] colunasArray = new String[] { "A", "B", "C", "D", "E", "F", "G", "H" }; 
		String tabuleiro[][] = new String[8][8];

		int acertoColunas = 0; int acertoLinhas = 0; 
		int pontos = 0, acertos = 0, erros = 0;
		int tentativas = 5; 
		
		System.out.println("###-- BATALHA NAVAL --###");
		System.out.println("Deseja exibir o manual de instruções? [S/N]");
		String manual = input.nextLine();
		
			if(manual.equalsIgnoreCase("S")) {
				System.out.println("##--MANUAL DE INSTRUÇÕES --##");
				System.out.println("|------------------------|"
						+ "\nTABULEIRO- REPRESENTAÇÕES:    "
						+ "\n|     Colunas [A-H]      |"
						+ "\n|     Linhas [1-8]       |\n"
						+ "    \n    NAVIOS - PONTOS:    "
						+ "\n|   1º navio: 1 ponto    |\n"
						+ "|   2º navio: 2 pontos   |\n"
						+ "|   3º navio: 2 pontos   |\n"
						+ "|   4º navio: 3 pontos   |\n"
						+ "|   5º navio: 4 pontos   |\n"
						+ "\n    ACERTOS - ERROS:    \n"
						+ "|   Acerto Navio: X      |\n"
						+ "|   Acerto(Erro) Água:0  |\n"
						+ "|   Total de tiros:" + tentativas + "     |\n"
						+ "|------------------------|");
			}
		
			System.out.println("\n      BOM JOGO!\n");
		while (tentativas > 0) {
			System.out.println("Tentativas restantes: " + tentativas);
			String coluna;
			System.out.print("Escolha a coluna: [A-H] ");
			coluna = tecladoColuna.nextLine();


			for (int i = 0; i < 8; i++) {
				if (coluna.equalsIgnoreCase(colunasArray[i])) {
					acertoColunas = i;
				}

			}

			System.out.print("Escolha a linha: [1-8] ");
			acertoLinhas = tecladoLinha.nextInt() - 1;

			if (navios.area[acertoLinhas][acertoColunas] == navio[0] ||navios.area[acertoLinhas][acertoColunas] == navio[1]) {
				pontos += 2;
				acertos++;
				System.out.println("Acertou o navio de 2 pontos!");
				tabuleiro[acertoLinhas][acertoColunas] = "X";
			} else if (navios.area[acertoLinhas][acertoColunas] == navio[2] || navios.area[acertoLinhas][acertoColunas] == navio[3]) {
				pontos += 3;
				acertos++;
				System.out.println("Acertou o navio de 3 pontos!!");
				tabuleiro[acertoLinhas][acertoColunas] = "X";
			} else if (navios.area[acertoLinhas][acertoColunas] == navio[4]) {
				pontos += 4;
				acertos++;
				System.out.println("Acertou o navio de 4 pontos!!!");
				tabuleiro[acertoLinhas][acertoColunas] = "X";
			}

			else {
				erros++;
				System.out.println("Acertou a água... =/");
				tabuleiro[acertoLinhas][acertoColunas] = "O";
			}
			System.out.print("------------------\n");
			System.out.println(" |A|B|C|D|E|F|G|H|");
			System.out.print("------------------");

			for (int i = 0; i < 8; i++) {
				System.out.println("");
				System.out.print(i + 1);
				for (int j = 0; j < 8; j++) {
					if (tabuleiro[i][j] != "X" && tabuleiro[i][j] != "O") {
						tabuleiro[i][j] = " ";
					}
					System.out.print("|" + tabuleiro[i][j]);

				}
				System.out.print("|\n------------------");
			}

			System.out.println("\nPontos: " + pontos + "\nAcertos no navio: " + acertos + "\nAcertos na água: " + erros);
			tentativas--;
		}
		
		System.out.println("**** TABELA ****");
		System.out.print("------------------\n");
		System.out.println(" |A|B|C|D|E|F|G|H|");
		System.out.print("------------------");

		for (int i = 0; i < 8; i++) {
			System.out.println("");
			System.out.print(i + 1);

			for (int j = 0; j < 8; j++) {

				System.out.print("|" + navios.area[i][j]);

			}
			System.out.print("|\n------------------");
			}
		
		System.out.println("\nDeseja exibir os créditos? [S/N]");
		String resposta = input.nextLine();
			if(resposta.equalsIgnoreCase("S")) {
				System.out.println("       DESENVOLVEDORES:"
						+ "\n      KAROLINE DINIZ RAMOS"
						+ "\n(•_•) JOHN HERBERT FREIRE LOURENÇO\n"
						+ "<) )╯\n"
						+ "_/ \\");
			}
		}
}
