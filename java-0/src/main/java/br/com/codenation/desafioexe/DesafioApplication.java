package br.com.codenation.desafioexe;

import java.util.List;
import java.util.ArrayList;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		List<Integer> sequenciaNumerica = new ArrayList<>();
		int num1 = 0;
		int num2 = 1;
				sequenciaNumerica.add(num1);
				sequenciaNumerica.add(num2);

		int numeroFib;

				do{
					numeroFib = num1 +num2;
					num1 = num2;
					num2 = numeroFib;
					sequenciaNumerica.add(numeroFib);
				}while (numeroFib <= 350);
		return sequenciaNumerica;
	}

	public static Boolean isFibonacci(Integer a) {
		List<Integer> sequenciaFibonacci =fibonacci();
		return sequenciaFibonacci.contains(a);
	}

}