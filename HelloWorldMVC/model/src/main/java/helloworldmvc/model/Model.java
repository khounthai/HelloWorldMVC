package helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Model implements IModel  {

	
	public String getMessage() throws IOException  {
		String result="";	
		String s="" ;
		
		 try (FileReader fr=new FileReader(Model.class.getResource("message.txt").getFile()); BufferedReader br=new BufferedReader(fr);){
			while ((s=br.readLine())!=null) {
				result+=s;
			};
		 }
		 
		return result;
	}

}
