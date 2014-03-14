package lista;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
********************************************************************

Universidade Positivo
Engenharia da Computa��o - 3� Ano - Manh�
Turma: 13009MA_1

Nome: Vin�cius Gabriel Mendes de Souza			Matr�cula: 1201485

TODOS OS DIREITOS RESERVADOS

********************************************************************
*/

public class Principal2 {

	private static final String space = "----------------------------------------------------------------";
	
	public static void main(String[] args) {

		menuOpcoes();

	}
	
	private static void menuOpcoes() {
		
		printOpcoes();
		
		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();
		
		while (opcao < 1 || opcao > 16) {
			System.out.println(space);
			System.out.println("Op��o Inv�lida. Certifique-se de ter escolhido a op��o correta:\n\n");
			printOpcoes();
			opcao = scanner.nextInt();
		}

		if (opcao != 17) {
			if (opcao == 1)
				fatorialMain(scanner);
			else if (opcao == 2)
				numerosPerfeitos(scanner);
			else if (opcao == 3)
				numerosPrimosMain(scanner);
			else if (opcao == 4)
				mdcMain(scanner);
			else if (opcao == 5)
				fibonacciMain(scanner);
			/*
			else if (opcao == 6)
				conversaoStringParaInteiroMain(scanner);
			else if (opcao == 7)
				conversaoDeBasesMain(scanner);
			else if (opcao == 8)
				exponenciacaoMain(scanner);
			else if (opcao == 9)
				multiplicacaoDeVetoresMain(scanner);
			else if (opcao == 10)
				produtoEscalarMain(scanner);
			else if (opcao == 11)
				produtorioDosNumerosParesMain(scanner);
			else if (opcao == 12)
				trocaDeElementosDeDuasMatrizesMain(scanner);
			else if (opcao == 13)
				menorElementoDeMatrizMain(scanner);
			else if (opcao == 14)
				transpostaDeUmaMatrizMain(scanner);
			else if (opcao == 15)
				diagonalPrincipaldiagonalSecundaria(scanner);
			else if (opcao == 16)
				matrizTriangular(scanner);
			*/
		}
		
		
	}
	
	private static void fibonacciMain(Scanner scanner) {
		
		try {
			System.out.println(space);
			System.out.println("Op��o escolhida: Fibonacci. \n"
					+ "Digite a quantidade de n�meros da sequ�ncia de Fibonacci que deseja saber : ");
	
			int n = scanner.nextInt();

			Exercicios2 ex2 = new Exercicios2();
			Integer[] resposta = ex2.fibonacci(n);
			
			System.out.println("n = " + n + ". -> " + Arrays.toString(resposta));

		} catch (InvalidNumberException e) {
			e.printStackTrace();
			System.out.println("N�mero 'n' inv�lido. Certifique-se de ter digitado um n�mero maior que 0.");
		} catch (LargeNumberException e) {
			e.printStackTrace();
			System.out.println("Resultado muito extenso. Certifique-se de ter digitado um n�mero menor que : " + (Math.pow(2, 31)-1));
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("ERRO: Certifique-se de ter digitado um n�mero inteiro.");
		} catch (ElementBeyondSizeException e) {
			e.printStackTrace();
			System.out.println("ERRO: Algum elemento da sequ�ncia de Fibonacci excedeu o tamanho m�ximo de 32 bits.\nInsira uma quantidade inferior � quantidade inserida anteriormente.");
		}
		
	}

	private static void mdcMain(Scanner scanner) {
		
		try {
			System.out.println(space);
			System.out.println("Op��o escolhida: N�meros MDC (M�todo de Euclides). \n"
					+ "Digite os seguintes n�meros: \n"
					+ "n1 = ");
	
			int n1 = scanner.nextInt();
			
			System.out.println("n2 = ");
			int n2 = scanner.nextInt();

			Exercicios2 ex2 = new Exercicios2();
			int resposta = ex2.mdc(n1, n2);
			
			if (resposta == -1) {
				System.out.println("N�o existe MDC entre os n�meros " + n1 + " e " + n2 + ".");
			} else {
				System.out.println("O MDC entre os n�meros " + n1 + " e " + n2 + " � = " + resposta + ".");
			}
		} catch (InvalidNumberException e) {
			e.printStackTrace();
			System.out.println("N�meros 'n1' ou 'n2' inv�lido. Certifique-se de ter digitado dois n�meros positivos e n�o nulos.");
		} catch (LargeNumberException e) {
			e.printStackTrace();
			System.out.println("Resultado muito extenso. Certifique-se de ter digitado n�meros menores que : " + (Math.pow(2, 31)-1));
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("ERRO: Certifique-se de ter digitado n�meros inteiros.");
		}
		
	}

	private static void numerosPrimosMain(Scanner scanner) {
		
		try {
			System.out.println(space);
			System.out.println("Op��o escolhida: N�meros Primos. \n"
					+ "Digite um n�mero 'n' para verificar se ele � primo: \n"
					+ "n = ");
	
			int n = scanner.nextInt();

			Exercicios2 ex2 = new Exercicios2();
			boolean resposta = ex2.numeroPrimo(n);
			
			if (resposta == true) {
				System.out.println("O n�mero " + n + " � Primo.");
			} else {
				System.out.println("O n�mero " + n + " N�O � Primo.");
			}
			
		} catch (InvalidNumberException e) {
			e.printStackTrace();
			System.out.println("N�mero 'n' inv�lido. Certifique-se de ter digitado um n�mero maior que 1.");
		} catch (LargeNumberException e) {
			e.printStackTrace();
			System.out.println("Resultado muito extenso. Certifique-se de digitar um valor menor que : " + (Math.pow(2, 31)-1));
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("ERRO: Certifique-se de ter digitado um n�mero inteiro.");
		}
		
	}

	private static void numerosPerfeitos(Scanner scanner) {
		
		try {
			System.out.println(space);
			System.out.println("Op��o escolhida: N�meros Perfeitos. \n"
					+ "Digite um n�mero 'n' para verificar se ele � perfeito: \n"
					+ "n = ");
	
			int n = scanner.nextInt();

			Exercicios2 ex2 = new Exercicios2();
			boolean resposta = ex2.numeroPerfeito(n);
			
			if (resposta == true) {
				System.out.println("O n�mero " + n + " � Perfeito.");
			} else {
				System.out.println("O n�mero " + n + " N�O � Perfeito.");
			}
			
		} catch (InvalidNumberException e) {
			e.printStackTrace();
			System.out.println("N�mero 'n' inv�lido. Certifique-se de ter digitado um n�mero positivo.");
		} catch (LargeNumberException e) {
			e.printStackTrace();
			System.out.println("Resultado muito extenso. Certifique-se de digitar um valor menor que : " + (Math.pow(2, 31)-1));
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("ERRO: Certifique-se de ter digitado um n�mero inteiro.");
		}
		
	}

	private static void fatorialMain(Scanner scanner) {
		
		try {
			System.out.println(space);
			System.out.println("Op��o escolhida: Fatorial. \n"
					+ "Digite o fatorial 'n' que deseja calcular: \n"
					+ "n = ");
	
			long n = scanner.nextLong();

			Exercicios2 ex2 = new Exercicios2();
			long resposta = ex2.fatorial(n);
			
			System.out.println("Fatorial de " + n + " � = " + resposta + ".");
			
		} catch (InvalidNumberException e) {
			e.printStackTrace();
			System.out.println("N�mero 'n' inv�lido. Certifique-se de ter digitado um n�mero positivo.");
		} catch (LargeNumberException e) {
			e.printStackTrace();
			System.out.println("Resultado muito extenso. Certifique-se de que 0 >= n <= 20.");
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("ERRO: Certifique-se de ter digitado um n�mero inteiro.");
		}

	}

	private static void printOpcoes() {
		
		System.out.println("Selecione a op��o desejada:\n"
				+ "1) Fatorial. \n"
				+ "2) N�meros Perfeitos. \n"
				+ "3) N�meros Primos. \n"
				+ "4) MDC (M�todo de Euclides). \n"
				+ "5) FIBONACCI. \n"
				+ "6) Convers�o de String para inteiro. \n"
				+ "7) Convers�o de bases. \n"
				+ "8) Exponencia��o. \n"
				+ "9) Multiplica��o de Vetores. \n"
				+ "10) Produto escalar. \n"
				+ "11) Produt�rio dos n�meros pares. \n"
				+ "12) Troca de elementos de duas matrizes. \n"
				+ "13) Menor elemento de matriz."
				+ "14) Transposta de uma matreiz. \n"
				+ "15) Diagonal principal e Diagonal secund�ria.\n"
				+ "16) Matriz triangular.\n"
				+ "17) Sair.");
	}

	
	
}
