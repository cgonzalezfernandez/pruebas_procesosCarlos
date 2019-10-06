package poo;

public class Procesos_Ejemplo_ProcessBuilder {

	
	public static class LanzadorProcesos {
        public void ejecutar(String ruta){

                ProcessBuilder pb;
                try {
                        pb = new ProcessBuilder(ruta);
                        Process pro = pb.start();
                } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }

        }
        /**
         * @param args
         */
        public static void main(String[] args) {
                String ruta=
                		"C:\\Program Files (x86)\\Adobe\\Acrobat Reader DC\\Reader\\AcroRd32.exe";
                LanzadorProcesos lp=new LanzadorProcesos();
               lp.ejecutar(ruta);
                System.out.println("Finalizado");
        }

}
}
