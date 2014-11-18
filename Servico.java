package br.com.xti.logica;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Servico {

	/**
	 * @param args
	 */
	static int escalado ;
	public static void main(String[] args) {
	String escala ;
		ArrayList <Integer> dias = new ArrayList<>();
		do{
			
		 escala = JOptionPane.showInputDialog("Informe o dia do primeiro serviço de 1 a 31: ");
		 if (escala == null){
				System.exit(1);
			}
		 try {
			 
		 escalado = Integer.parseInt(escala);
		 if (escalado <1|| escalado >31){
			 JOptionPane.showMessageDialog(null,"              DATA INVÁLIDA!\n"+"Digite um dia de 1 a 31 do Mês!");
		 }
		 }catch (NumberFormatException n1){
				JOptionPane.showMessageDialog(null,"              DATA INVÁLIDA!\n"+"Coloque um numero inteiro válido!");
				
				 
		 }
		} while (escalado < 1 || escalado > 31);
			
		
		
		while ( escalado <=31){
			dias.add(escalado);
			escalado+= 4;
		}
		JOptionPane.showMessageDialog(null,"Você está de serviço no(s) dia(s): \n"+dias);
		}
		
	}
	


