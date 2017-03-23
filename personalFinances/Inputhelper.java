package personalFinances;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Inputhelper {
	
	private ArrayList<Purchase> myPurchases;
	private ArrayList<String> data;
	
	
	public ArrayList<Purchase>  getData(){
		return this.myPurchases;
	}
	
	public Inputhelper(){
		this.myPurchases = new ArrayList<Purchase>();
		this.data = new ArrayList<String>();
	}
	
	public void getInputFromConsole(){
		ConsoleInput ci = new ConsoleInput();
		this.data = ci.getData();
		this.treatData();
					
	}
	
	public void getInputFromFile(String path) throws IOException{
		FileInput fi = new FileInput("testcase.txt");
		this.data = fi.getData();
		this.treatData();
		
	}
	
	
	public void treatData(){
		//data is given in multiples of 2
		for(int i=0; i<this.data.size(); i+=2){
			
			boolean found = false;
			
			//checa por si ya esta un payee en mis payees
			for(Purchase currentP : this.myPurchases){
				if(currentP.getName().equals(this.data.get(i))){
					currentP.addAmount(Double.parseDouble(this.data.get(i+1)));
					found = true;
					break;
				}
			}
				
			if(!found){
				this.myPurchases.add(new Purchase(this.data.get(i), Double.parseDouble(this.data.get(i+1))));
			}		
		}
	}
}
