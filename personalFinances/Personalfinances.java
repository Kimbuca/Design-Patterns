package personalFinances;

import java.io.IOException;
import java.text.ParseException;

public class Personalfinances {
	
	
	public static void main(String[] args) throws ParseException, IOException{
		
		
		Inputhelper input = new Inputhelper();
		input.getInputFromConsole();
		//input.getInputFromFile("path"); <-- el parametro path esta considerado pero no implementado
		//entonces a fuerzas hay que darle un String, pero no va a hacer nada con el.
		
		Report myreport = new Report(input.getData());
		myreport.printOnFile();
		//myreport.printOnConsole();
		
		
		/* HASHIIIIN 
		 		/*
		 // simple hash may have collision problems
	
		String str = String.valueOf(key);
		int asciiVal = 0;
		
		for(char c : str.toCharArray())
			asciiVal =+ (int)c;
		return asciiVal%this.arr.length;
			
			siempre no :c
		*/
		
		
	}

}
