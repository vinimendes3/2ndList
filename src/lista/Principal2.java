package lista;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
********************************************************************

Universidade Positivo
Engenharia da Computação - 3º Ano - Manhã
Turma: 13009MA_1

Nome: Vinícius Gabriel Mendes de Souza			Matrícula: 1201485

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
			System.out.println("Opção Inválida. Certifique-se de ter escolhido a opção correta:\n\n");
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
			System.out.println("Opção escolhida: Fibonacci. \n"
					+ "Digite a quantidade de números da sequência de Fibonacci que deseja saber : ");
	
			int n = scanner.nextInt();

			Exercicios2 ex2 = new Exercicios2();
			Integer[] resposta = ex2.fibonacci(n);
			
			System.out.println("n = " + n + ". -> " + Arrays.toString(resposta));

		} catch (InvalidNumberException e) {
			e.printStackTrace();
			System.out.println("Número 'n' inválido. Certifique-se de ter digitado um número maior que 0.");
		} catch (LargeNumberException e) {
			e.printStackTrace();
			System.out.println("Resultado muito extenso. Certifique-se de ter digitado um número menor que : " + (Math.pow(2, 31)-1));
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("ERRO: Certifique-se de ter digitado um número inteiro.");
		} catch (ElementBeyondSizeException e) {
			e.printStackTrace();
			System.out.println("ERRO: Algum elemento da sequência de Fibonacci excedeu o tamanho máximo de 32 bits.\nInsira uma quantidade inferior à quantidade inserida anteriormente.");
		}
		
	}

	private static void mdcMain(Scanner scanner) {
		
		try {
			System.out.println(space);
			System.out.println("Opção escolhida: Números MDC (Método de Euclides). \n"
					+ "Digite os seguintes números: \n"
					+ "n1 = ");
	
			int n1 = scanner.nextInt();
			
			System.out.println("n2 = ");
			int n2 = scanner.nextInt();

			Exercicios2 ex2 = new Exercicios2();
			int resposta = ex2.mdc(n1, n2);
			
			if (resposta == -1) {
				System.out.println("Não existe MDC entre os números " + n1 + " e " + n2 + ".");
			} else {
				System.out.println("O MDC entre os números " + n1 + " e " + n2 + " é = " + resposta + ".");
			}
		} catch (InvalidNumberException e) {
			e.printStackTrace();
			System.out.println("Números 'n1' ou 'n2' inválido. Certifique-se de ter digitado dois números positivos e não nulos.");
		} catch (LargeNumberException e) {
			e.printStackTrace();
			System.out.println("Resultado muito extenso. Certifique-se de ter digitado números menores que : " + (Math.pow(2, 31)-1));
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("ERRO: Certifique-se de ter digitado números inteiros.");
		}
		
	}

	private static void numerosPrimosMain(Scanner scanner) {
		
		try {
			System.out.println(space);
			System.out.println("Opção escolhida: Números Primos. \n"
					+ "Digite um número 'n' para verificar se ele é primo: \n"
					+ "n = ");
	
			int n = scanner.nextInt();

			Exercicios2 ex2 = new Exercicios2();
			boolean resposta = ex2.numeroPrimo(n);
			
			if (resposta == true) {
				System.out.println("O número " + n + " é Primo.");
			} else {
				System.out.println("O número " + n + " NÃO é Primo.");
			}
			
		} catch (InvalidNumberException e) {
			e.printStackTrace();
			System.out.println("Número 'n' inválido. Certifique-se de ter digitado um número maior que 1.");
		} catch (LargeNumberException e) {
			e.printStackTrace();
			System.out.println("Resultado muito extenso. Certifique-se de digitar um valor menor que : " + (Math.pow(2, 31)-1));
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("ERRO: Certifique-se de ter digitado um número inteiro.");
		}
		
	}

	private static void numerosPerfeitos(Scanner scanner) {
		
		try {
			System.out.println(space);
			System.out.println("Opção escolhida: Números Perfeitos. \n"
					+ "Digite um número 'n' para verificar se ele é perfeito: \n"
					+ "n = ");
	
			int n = scanner.nextInt();

			Exercicios2 ex2 = new Exercicios2();
			boolean resposta = ex2.numeroPerfeito(n);
			
			if (resposta == true) {
				System.out.println("O número " + n + " é Perfeito.");
			} else {
				System.out.println("O número " + n + " NÃO é Perfeito.");
			}
			
		} catch (InvalidNumberException e) {
			e.printStackTrace();
			System.out.println("Número 'n' inválido. Certifique-se de ter digitado um número positivo.");
		} catch (LargeNumberException e) {
			e.printStackTrace();
			System.out.println("Resultado muito extenso. Certifique-se de digitar um valor menor que : " + (Math.pow(2, 31)-1));
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("ERRO: Certifique-se de ter digitado um número inteiro.");
		}
		
	}

	private static void fatorialMain(Scanner scanner) {
		
		try {
			System.out.println(space);
			System.out.println("Opção escolhida: Fatorial. \n"
					+ "Digite o fatorial 'n' que deseja calcular: \n"
					+ "n = ");
	
			long n = scanner.nextLong();

			Exercicios2 ex2 = new Exercicios2();
			long resposta = ex2.fatorial(n);
			
			System.out.println("Fatorial de " + n + " é = " + resposta + ".");
			
		} catch (InvalidNumberException e) {
			e.printStackTrace();
			System.out.println("Número 'n' inválido. Certifique-se de ter digitado um número positivo.");
		} catch (LargeNumberException e) {
			e.printStackTrace();
			System.out.println("Resultado muito extenso. Certifique-se de que 0 >= n <= 20.");
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("ERRO: Certifique-se de ter digitado um número inteiro.");
		}

	}

	private static void printOpcoes() {
		
		System.out.println("Selecione a opção desejada:\n"
				+ "1) Fatorial. \n"
				+ "2) Números Perfeitos. \n"
				+ "3) Números Primos. \n"
				+ "4) MDC (Método de Euclides). \n"
				+ "5) FIBONACCI. \n"
				+ "6) Conversão de String para inteiro. \n"
				+ "7) Conversão de bases. \n"
				+ "8) Exponenciação. \n"
				+ "9) Multiplicação de Vetores. \n"
				+ "10) Produto escalar. \n"
				+ "11) Produtório dos números pares. \n"
				+ "12) Troca de elementos de duas matrizes. \n"
				+ "13) Menor elemento de matriz."
				+ "14) Transposta de uma matreiz. \n"
				+ "15) Diagonal principal e Diagonal secundária.\n"
				+ "16) Matriz triangular.\n"
				+ "17) Sair.");
	}

	
	
}
