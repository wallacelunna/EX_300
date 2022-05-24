package EX_300;

import java.util.Scanner;

public class EX_300_2 {

	public static void main(String[] args) {
		String meses[]={"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
	      
	      int mes=0;
				Scanner ler = new Scanner (System.in);
				
					System.out.println("Digite Um Valor entre 1 e 12");
					
					mes= ler.nextInt();
	if  ((mes >=1)&&(mes<=12)){
	  System.out.println("Esse valor corresponde ao mês de: "+ meses[mes-1]);
	}
		else{
				System.out.println("Valor Digitado Incorreto");
	    }

			}
	}