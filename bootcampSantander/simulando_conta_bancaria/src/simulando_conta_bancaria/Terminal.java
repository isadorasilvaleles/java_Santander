package simulando_conta_bancaria;

import java.util.Scanner;

public class Terminal {
	public static void main(String[] args) {
		
// o que faremremos ; importar classe scanner
// obter pelo scanner os valores digitados no terminal
// exibir mensagem na tela 
								
										
		
		
		
  System.out.println("olá vamos criar uma conta bancária personalizada para voce! siga as instruções abaixo! ");

Scanner sc = new Scanner(System.in);							
					    
  System.out.println("para começar , me conta ai qual é seu nome ?(aceitamos nome social)");

String NomeCliente = sc.nextLine();

  System.out.printf("legal!  " + NomeCliente + " vamos começar então ,  1- crie um número para sua conta com 4 digitos ; ");
int conta = sc.nextInt();

  System.out.println("2- agora digite sua agencia , também com 4 numeros ; ");
int agencia = sc.nextInt();


  System.out.println("3- digite o valor que voce irá colocar em conta nesse momento ; ");

float saldo = sc.nextFloat();

            sc.close();					
				        
					
 System.out.printf("olá " + NomeCliente + "  obrigada por criar uma conta conosco!  "+ " sua agencia será a de número: " + agencia  
					+ " sua conta será de numero: "+ conta + " e seu saldo em conta é de: R$  "	+ saldo);
						
					
				
	}

				




	}


