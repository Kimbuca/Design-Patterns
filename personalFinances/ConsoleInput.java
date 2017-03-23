package personalFinances;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
public class ConsoleInput {
	

	public Scanner scanner;
	private ArrayList<String> data;
	
	public ConsoleInput(){
		
		this.data = new ArrayList<String>();
		
		System.out.println("How many purchases did you make today?");
		scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		
		for(int i=0; i<size; i++){
			
			scanner = new Scanner(System.in);
			System.out.println("Payee #" +(i+1) +" Name");
			String pname = scanner.nextLine();
			data.add(pname);
			
			System.out.println("Input the spended amount in '" +pname +"'");
			String amount = scanner.nextLine();
			data.add(amount);
			
		}
		
	}
	
	
	public ArrayList<String> getData(){
		return this.data;
	}
	
	public static void main(String[] args) throws ParseException{
			
		ConsoleInput ci = new ConsoleInput();
		System.out.println(ci.getData());
			
	}

}
