package helloworldmvc;

import java.io.IOException;

import helloworldmvc.controller.*;
import helloworldmvc.model.Model;
import helloworldmvc.view.View;

public class HelloWorldMVC {

	public static void main(String[] args) {
		Controller c=new Controller(new Model(), new View());
		try {
			c.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
