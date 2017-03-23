package personalFinances;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Report {
	
	private double min;
	private double max;
	private double avg;
	private String freqPayee;
	private String src;
	private ArrayList<Purchase> usr_purchases;

	
	public Report(ArrayList<Purchase> input) throws ParseException{
		this.usr_purchases = input;	
	}
	
	public StringBuilder getReport() throws ParseException{
		
		StringBuilder sb = new StringBuilder();
		sb.append("Date " +this.getDate("dd/MM/yyyy") +"\n");
		sb.append("Min: " +this.getMinimum() +"\n");
		sb.append("Max: " +this.getMaximum() +"\n");
		sb.append("Avg: " +this.getAverage() +"\n");
		sb.append("Frequent Payee: " +this.getFreqPayee() +"\n");
		
		return sb;
	}
	
	
	public void printOnFile() throws ParseException{
		FileWriter fw = new FileWriter("test2.txt", this.getReport());
		
	}
	
	public void printOnConsole() throws ParseException{
		System.out.println(this.getReport());
	}
	
	
	public static String getDate(String format) throws ParseException{
		
		Date current_date = new Date();
		SimpleDateFormat date_format = new SimpleDateFormat(format);
	    String date = date_format.format(current_date);
	    
	    return date;
	}
	
	
	public double getMinimum(){
		double min = Double.MAX_VALUE;
		for(Purchase p : this.usr_purchases)
			min = ((p.getMin() < min) ? p.getMin() : min);
		return min;
	}
	
	
	public double getMaximum(){
		double max = Double.MIN_VALUE;
		for(Purchase p : this.usr_purchases)
			max = ((p.getMax() > max) ? p.getMax() : max);
		return max;
	}
	
	public String getFreqPayee(){
		
		double max = Double.MIN_VALUE;
		String fPayee = "";
		
		for(Purchase p : this.usr_purchases){
			if(p.getSize() > max){
				fPayee = p.getName();
				max = p.getSize();
			}
		}
		
		return fPayee;
	}
	
	
	public double getAverage(){
		
		double avg=0;
		int items = 0;
		
		for(Purchase p : this.usr_purchases){
			for(double val : p.getAmounts()){
				avg += val;
				items++;
			}
		}
		return avg/items;
	}

}
