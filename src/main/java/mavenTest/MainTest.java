package mavenTest;

import java.text.ParseException;
import java.util.Map;

public class MainTest {
	
	public static void main(String[] args) throws ParseException {
		
		System.out.println("----------------" + System.getenv("UNIVISION_KEYSTORE_KEY_PASSWORD"));
		
		Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n", envName, env.get(envName));
        }
	}
}