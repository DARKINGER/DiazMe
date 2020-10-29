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
public class HiloDos implements Runnable{
    String NombreHilo;
    HiloDos(String parNombre){
        NombreHilo = parNombre;
    }
    
    @Override
    public void run() {
        System.out.println(NombreHilo + "Inicio del Hilo");
        int w = 1;
        try{
                for (int x  = 0; x<=6; x++){
                     Thread.sleep(2100);
                     w= w+(x*w);
              System.out.println(NombreHilo+" (CORRIENDO) " + " w = " + w);
                }
            
        }catch (InterruptedException exc) {
          System.out.println(NombreHilo+" (INTERRUPCION)\n");
      }
        
      System.out.println(NombreHilo+" (FINAL)\n");
    }
}
