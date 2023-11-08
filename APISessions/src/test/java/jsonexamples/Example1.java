package jsonexamples;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Example1 {

	@Test
	public void createJsonObject() {
		
		JSONObject obj=new JSONObject();
		obj.put("Name", "Shailesh");
		obj.put("Job", "IT");
		obj.put("Mobile", 987654256);
		System.out.println(obj);
	}
}
