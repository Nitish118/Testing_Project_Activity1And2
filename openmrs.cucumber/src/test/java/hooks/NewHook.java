package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class NewHook {
    @Before
	public void method1() {
		System.out.println("Printing 1st method");
	}
    @After
	public void method2() {
		System.out.println("Printing 2nd method");
	}
    
  
}