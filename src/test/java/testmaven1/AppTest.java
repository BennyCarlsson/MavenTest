package testmaven1;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
	
	@Test
	public void shouldReturnTrue(){
		App app = new App();
		assertFalse(app.getBool());
	}
}
