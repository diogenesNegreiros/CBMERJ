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
			
		 escala = JOptionPane.showInputDialog("Informe o dia do primeiro servi�o de 1 a 31: ");
		 if (escala == null){
				System.exit(1);
			}
		 try {
			 
		 escalado = Integer.parseInt(escala);
		 if (escalado <1|| escalado >31){
			 JOptionPane.showMessageDialog(null,"              DATA INV�LIDA!\n"+"Digite um dia de 1 a 31 do M�s!");
		 }
		 }catch (NumberFormatException n1){
				JOptionPane.showMessageDialog(null,"              DATA INV�LIDA!\n"+"Coloque um numero inteiro v�lido!");
				
				 
		 }
		} while (escalado < 1 || escalado > 31);
			
		
		
		while ( escalado <=31){
			dias.add(escalado);
			escalado+= 4;
		}
		JOptionPane.showMessageDialog(null,"Voc� est� de servi�o no(s) dia(s): \n"+dias);
		}
		
	}
	


