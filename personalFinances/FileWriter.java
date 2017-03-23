package personalFinances;

import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter{
	
	//filename can be also specified as the path
	public FileWriter(String filename, StringBuilder result){
		try{
		    PrintWriter writer = new PrintWriter(filename, "UTF-8");
		    writer.println(result);
		    writer.close();
		} catch (IOException e) {
		   // do something 
		}
	}
}
