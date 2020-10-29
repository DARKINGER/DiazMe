/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U2_Hilos;

/**
 *
 * @author Darking
 */
public class HiloUno implements Runnable{
     String NombreHilo;
    HiloUno(String parNombre){
        NombreHilo = parNombre;
    }
    
    @Override
    public void run() {
        System.out.println(NombreHilo + "Inicio del Hilo");
        int y = 10, Resultado = 0;
        try{
                for (int x  = 1; x<=10; x++){
                     Thread.sleep(900); 
                     Resultado = y*x;
              System.out.println(NombreHilo+" (CORRIENDO) " + " y = " + Resultado +"%");
                }
            
        }catch (InterruptedException exc) {
          System.out.println(NombreHilo+" (INTERRUPCION)\n");
      }
        
      System.out.println(NombreHilo+" (FINAL)\n");
    }
}
