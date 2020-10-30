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
public class Hilo {
    public static void main(String[]args){
     System.out.print("Hilo main (Inicio)");
     
     HiloUno primerHilo = new HiloUno("Hilo numero uno");
     HiloDos SegundoHilo = new HiloDos("Hilo numero dos");
     HiloTres TercerHilo = new HiloTres("Hilo numero tres");
     
     Thread varHiloUno = new Thread(primerHilo); 
     Thread varHiloDos = new Thread(SegundoHilo); 
     Thread varHiloTres = new Thread(TercerHilo); 
     
     
     varHiloUno.start();
     varHiloDos.start();
     varHiloTres.start();
     
     
     for(int x = 0; x<=30; x++){
         
         System.out.print("@");
         
         try{
         Thread.sleep(200);
         
         }catch(InterruptedException ex){
                System.out.println("Hilo main interrupido");
         }
     }
     
      try {
           
           varHiloUno.join();
           varHiloDos.join();
           varHiloTres.join();
       } catch (InterruptedException exc){
           System.out.println("Junta los hilos");
       }


        System.out.println("Hilo main (FINAL)\n\n\n\n\n");
        
        CorrerDos();
    }
    
    private static void CorrerDos(){
        System.out.print("Metodo Secundario (Inicio)");
     
     HiloUno primerHilo = new HiloUno("Hilo numero uno (Metodo)");
     HiloUno SegundoHilo = new HiloUno("Hilo numero dos (Metodo)");
     HiloUno TercerHilo = new HiloUno("Hilo numero tres (Metodo)");
     
     Thread varHiloUno = new Thread(primerHilo); 
     Thread varHiloDos = new Thread(SegundoHilo); 
     Thread varHiloTres = new Thread(TercerHilo); 
     
     
     varHiloUno.start();
     varHiloDos.start();
     varHiloTres.start();
     
     
     for(int x = 0; x<=30; x++){
         
         System.out.print("-");
         
         try{
         Thread.sleep(200);
         
         }catch(InterruptedException ex){
                System.out.println("Metodo Secundario interrupido");
         }
     }
     
      try {
           
           varHiloUno.join();
           varHiloDos.join();
           varHiloTres.join();
       } catch (InterruptedException exc){
           System.out.println("Junta los hilos");
       }


        System.out.println("Metodo Secundario (FINAL)");
    }
}
