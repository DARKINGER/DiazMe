/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numeros_Fibo;

/**
 *
 * @author Darking
 */
public class numeros_Fibo {
    public static void main(String[] args){
        int val1=0, val2=1, contador=0;
		System.out.println(val1);
		System.out.println(val2+"\n"+ "----------------"+"\n");
		
		while(contador < 10 )
		{
			int valResultado=val1+val2;
			System.out.println(val1 +"+"+ val2+" = " +valResultado);
			
			val1=val2;
			val2=valResultado;
			contador++;
		}
    }
}
