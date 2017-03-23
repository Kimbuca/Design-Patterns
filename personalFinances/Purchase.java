package personalFinances;

import java.util.ArrayList;
import java.util.Collections;

public class Purchase {
	
	private String payee;
	private ArrayList<Double> amounts = new ArrayList<Double>();
	
	public Purchase(String p, double d){
		
		this.payee = p;
		this.amounts.add(d);
		
	}
	
	public int getSize(){
		return this.amounts.size();
		
	}
	
	public void addAmount(double a){
		this.amounts.add(a);
	}
	
	public String getName(){
		return this.payee;
	}
	
	public ArrayList<Double> getAmounts(){
		return this.amounts;
	}
	
	public double getAverage(){
		
		double avg = 0;
		for(double val : this.amounts){
			avg += val;
		}
		
		return avg/this.amounts.size();
		
	}
	
	public double getMax(){
		return Collections.max(this.amounts);
	}
	
	public double getMin(){
		return Collections.min(this.amounts);
	}
	
	
	public static void main(String[] args){
		Purchase p = new Purchase("Soriana", 12.30);
		p.addAmount(50.20);
		System.out.println(	p.getMin());
	
		
	}
	
	

}
