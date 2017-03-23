package personalFinances;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileInput {
	FileReader fr;
	BufferedReader br;
	
	String line;
	private int nLines = 0;
	
	private ArrayList<String> data = new ArrayList<String>();
	
	public int getnLines() {
		return nLines;
	}

	public void setnLines(int nLines) {
		this.nLines = nLines;
	}



	public ArrayList<String> getData() {
		return data;
	}



	public void setData(ArrayList<String> data) {
		this.data = data;
	}



	public FileInput (String path) throws IOException{
		fr = new FileReader(path);
		br = new BufferedReader(fr);
		
		line = br.readLine();
		nLines = Integer.parseInt(line);
		
		String[] parts;
		
		for(int i = 0; i < nLines;i++){
			line = br.readLine();
			parts = line.split(" ");
			
			data.add(parts[0]);
			data.add(parts[1]);
		}
		
		
		br.close();
		fr.close();
		
	}
}
