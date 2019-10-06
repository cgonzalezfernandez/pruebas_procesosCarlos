package poo;

import java.io.File;

public class Procesos_Sumador_cambiadoLLamada {
//		package com.ies;

		        public void lanzarSumador(Integer n1,
		                        Integer n2, String fichResultado){
//		                String clase="poo.Procesos_Sumador_cambiado";
		                String clase="C:\\Users\\MI PC\\eclipse_pruebaCarlos\\poo\\src\\poo\\Procesos_Sumador_cambiado.java";
		                Procesos_Sumador_cambiado psc = new Procesos_Sumador_cambiado();
		                ProcessBuilder pb;
		                try {
		                        pb = new ProcessBuilder(
		                                        "java",clase,
		                                        n1.toString(),
		                                        n2.toString());
		                        pb.redirectError(new File("errores.txt"));
		                        pb.redirectOutput(new File(fichResultado));
		                        pb.start();
		                } catch (Exception e) {
		                        // TODO Auto-generated catch block
		                        e.printStackTrace();
		                }
		        }
		        public static void main(String[] args){
		        	Procesos_Sumador_cambiadoLLamada l=new Procesos_Sumador_cambiadoLLamada();
//		                l.lanzarSumador(1, 51);
//		                l.lanzarSumador(51, 100);
		                l.lanzarSumador(1, 5, "result1.txt");
		                l.lanzarSumador(6,10, "result2.txt");
		                System.out.println("Ok");
		        }
}
