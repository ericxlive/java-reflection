package reflection.util;

import java.lang.reflect.Method;

public class Robot {
	
	public void turnOff() {
		System.out.println("Ending application.");
	}
	
	public static void main(String[] args) {
		Robot bot = new Robot();
		try {
			Method method = bot.getClass().getMethod("turnOff");
			method.invoke(bot);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
