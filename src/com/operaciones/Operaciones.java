package com.operaciones;
//import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
//import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

public class Operaciones {
	
	public int suma(int a, int b) {
		return a+b;
	}
	public int resta(int a, int b) {
		return a-b;
	}
	public int multiplicacion(int a, int b) {
		return a*b;
	}
	public int division(int a, int b) {
		return a/b;
	}
	
	public static void main(String[] args) throws Exception {
		
		Operaciones op = new Operaciones();
		Logger log = Logger.getLogger("com.operaciones");
		FileHandler handler = new FileHandler("default.log",true);
		handler.setFormatter(new XMLFormatter());
		log.addHandler(handler);
		
	
		int a = 10;
		int b = 5;
		
		int suma = op.suma(a, b);
		String sSuma = String.valueOf(suma);
		log.info(sSuma);
		
		int resta = op.resta(a, b);
		String sResta = String.valueOf(resta);
		log.warning(sResta);
		
		int mult = op.multiplicacion(a, b);
		String sMult = String.valueOf(mult);
		log.severe(sMult);
		
		int divi = op.division(a, b);
		System.out.println(divi);
		
	}
	
}
