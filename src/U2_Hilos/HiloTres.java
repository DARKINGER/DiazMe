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
public class HiloTres implements Runnable{
     String NombreHilo;
    HiloTres(String parNombre){
        NombreHilo = parNombre;
    }
    
    @Override
    public void run() {
        System.out.println(NombreHilo + "Inicio del Hilo");
        int contador = 10;
        try{
            do{
           
                Thread.sleep(600); 
              System.out.println(NombreHilo+" (CORRIENDO) " + " z = " + contador);
                contador--;
            
            }while(contador != 0);
               /* for (int x  = 0; x<=10; x++){
                     
                }*/
            
        }catch (InterruptedException exc) {
          System.out.println(NombreHilo+" (INTERRUPCION)\n");
      }
        
      System.out.println(NombreHilo+" (FINAL)\n");
    }
}
