package movies;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HtmlStatement {
	
	
	public HtmlStatement(String data, String filename) throws IOException{
		
		File file = new File(filename +".html");
		FileWriter fw = new FileWriter(file);
		
		file.createNewFile();
		
		for(String line : data.split("\n")){
			System.out.println(line);
			String str = (line.matches("\\t") ? "<h5>" +line +"</h5>" : "<h3>" +line +"</h3>");
			
			fw.write(str+"\n");
		}	
		fw.flush();
		fw.close();
	}
}
