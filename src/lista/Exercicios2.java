package lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicios2 {
	
	public long fatorial(long n) throws InvalidNumberException, LargeNumberException {

		if (n < 0) {
			throw new InvalidNumberException();
		}
		
		if (n > 20) {
			throw new LargeNumberException();
		}
		
		if (n == 0) {
			return 1;
		}
		
		long n2 = n-1;
		long index = n2;
		
		for (long i = 0; i < index; i++) {
			n *= n2;
			n2--;
		}
		
		return n;

	}

	public boolean numeroPerfeito(int n) throws InvalidNumberException, LargeNumberException {

		if (n >= (Math.pow(2, 31)-1)) {
			throw new LargeNumberException(); // número muito extenso
		}
		
		if (n < 0) {
			throw new InvalidNumberException(); // número negativo não é permitido
		}
		
		if (n == 0) {
			return false; // 0 não é número perfeito
		}
		
		int somaDivisores = 0; // int para verificar se a soma dos divisores é igual à 'n'
		int divisor = n-1;
		
		while (divisor != 0) {
			
			if (n % divisor == 0) { // se o resto da divisão de n por divisor for 0
				somaDivisores += divisor;
			}
			
			divisor--;
		}
		
		if (somaDivisores == n) {
			return true;
		} else {
			return false;
		}
	
	}

	public boolean numeroPrimo(int n) throws InvalidNumberException, LargeNumberException {
		
		if (n >= (Math.pow(2, 31)-1)) {
			throw new LargeNumberException(); // número muito extenso
		}
		
		if (n <= 1) {
			throw new InvalidNumberException(); // número <= 1 não é aceito
		}
		
		int divisor = n-1;
		
		while (divisor != 0) {
			
			if (((n % divisor) == 0) && (divisor != 1)) {
				return false;
			}
			
			divisor --;
		}
		
		return true;
	}
	
	public int mdc(int n1, int n2) throws InvalidNumberException, LargeNumberException {

		if ((n1 >= (Math.pow(2, 31)-1)) || (n2 >= (Math.pow(2, 31)-1))) {
			throw new LargeNumberException(); // número muito extenso
		}
		
		if ((n1 <= 0) || (n2 <= 0)) {
			throw new InvalidNumberException(); // número negativo ou nulo não é aceito
		}
		
		if (n2 > n1) {
			int nAux = n1;
			n1 = n2;
			n2 = nAux;
		}
		
		while ((n1 % n2) != 0) {
			
			int nAux = n1;
			n1 = n2;
			n2 = nAux % n2;
			
			if (n2 == 0) {
				return -1; // não existe MDC entre os números
			}
		}
		
		return n2; // no final, n2 será o MDC	
	}
	
	public Integer[] fibonacci(int n) throws InvalidNumberException, LargeNumberException, ElementBeyondSizeException {
		
		if (n >= (Math.pow(2, 31)-1)) {
			throw new LargeNumberException(); // número muito extenso
		}
		
		if (n <= 0) {
			throw new InvalidNumberException(); // número negativo ou nulo não é aceito
		}
		
		List<Integer> fibonacciList = new ArrayList<Integer>(); // list contendo os 'n' números da seq. de fibonacci
		
		fibonacciList.add(0);
		
		if (n == 1) {
			Integer[] fibonnaciVetor = fibonacciList.toArray(new Integer[1]);
			return fibonnaciVetor;
		} 
		
		fibonacciList.add(1);

		if (n == 2) {
			Integer[] fibonnaciVetor = fibonacciList.toArray(new Integer[2]);
			return fibonnaciVetor;
		}
		
		int index = 2;
		
		while (index < n) {

			if (((fibonacciList.get(index-1)+fibonacciList.get(index-2)) < (Math.pow(2, 31)-1)) &&
					(fibonacciList.get(index-1)+fibonacciList.get(index-2)) > 0) {
				fibonacciList.add(fibonacciList.get(index-1)+fibonacciList.get(index-2));
			} else {
				throw new ElementBeyondSizeException();
			}
			
			index++;
		}
		
		Integer[] fibonnaciVetor = fibonacciList.toArray(new Integer[n]);
		return fibonnaciVetor;
	}
	
	public int stringParaInteiro(String string) throws ElementBeyondSizeException, WrongSignalException {
		
		Character[] charArray = {'-', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		List<Character> charList = Arrays.asList(charArray);
		
		for (int i = 0; i < string.length(); i++) {
			if (!charList.contains(string.charAt(i))) {
				throw new WrongSignalException();
			}
		}
		
		if (string.length() > 9) { // excede o limite de tamanho
			throw new ElementBeyondSizeException();
		}
		
		int multiplier = 1;
		int sum = 0; // the sum of all elements. It is used to reach the final result.
		
		for (int i = (string.length()-1); i >= 0; i--) {
			
			if (string.charAt(i) == '-') {
				if (i == 0) {
					sum *= -1;
					return sum;
				} else {
					throw new WrongSignalException();
				}
			}
			
			sum += ((string.charAt(i) - '0')*multiplier);
			multiplier *= 10;
			
		}
		
		return sum;
		
	}

	public int decimalPara(int n, int base) throws InvalidNumberException, InvalidBaseException, LargeNumberException {
		
		if (n <= 0) {
			throw new InvalidNumberException();
		}
		
		if (base != 2 && base != 8) {
			throw new InvalidBaseException();
		}
		
		if (n >= (Math.pow(2, 31)-1)) {
			throw new LargeNumberException(); // número muito extenso
		}
		
		
		
		
	}
	
}
