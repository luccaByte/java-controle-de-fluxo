package controle;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

            System.out.println("Digite o primeiro parâmetro: ");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro:");
            int parametroDois = terminal.nextInt();
            terminal.close();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar (parametroUm, parametroDois);
		
		}catch (Exception e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(e.getMessage());
		}
	}
    
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            try {
                throw new Exception (" segundo parâmetro deve ser maior que o primeiro");
            } catch (Exception e) {
                
            }
        } else {
            int contagem = parametroDois - parametroUm;
            if (contagem < 0) {
                System.out.println("Não há números para imprimir.");
            } else {
                //realizar o for para imprimir os números com base na variável contagem
                for (int i = parametroUm; i <= parametroDois; i++) {
                    System.out.println("Imprimindo o número " + i);
                }
            }
        }
	}
}
