package poo;

//public class procesosConcu {
	
	
	import java.util.logging.Level;
	import java.util.logging.Logger;
	public class Main_procesos_concur {
	    public synchronized static void main(String[] args) {
	        Mensaje proceso1 = new Mensaje("hola", 100);
	        proceso1.start();
	        Mensaje proceso2 = new Mensaje("adiós", 100);
	        proceso2.start();
	        Mensaje proceso3 = new Mensaje("buenas", 100);
	        proceso2.start();
	        Mensaje proceso4 = new Mensaje("que tal", 100);
	        proceso2.start();
	    }
	}
	class Mensaje extends Thread {
	    private String texto;
	    private int tiempo;
	    public Mensaje(String texto, int tiempo) {
	        this.texto = texto;
	        this.tiempo = tiempo;
	    }
	    @Override
	    public void run() {
	        for (int i = 0; i < 10; i++) {
	            try {
	                System.out.print(texto + " ");
	                sleep(tiempo);
	            } catch (InterruptedException ex) {
//	                Logger.getLogger(PingPong.class.getName()).log(Level.SEVERE, null, ex);
	            }
	        }
	    }
	}
	
	

//}
