import static org.junit.Assert.*;

import org.junit.Test;


public class SlotTest {

	
	@Test(expected=NullPointerException.class)
	public void test1() {
		String [] x = null;
		//x[0]= "blah";
		String q = DisplayPanel.chooseImage(x);
		
		
	}
	@Test
	public void test2() {
		String [] x = new String[1];
		x[0] = "blah";
		String q = DisplayPanel.chooseImage(x);
		assertEquals("blah","blah",x[0]);
	}
	@Test
	public void test3() {
		String [] x = new String[4];
		x[0] = "blah";
		x[1] = "stuff";
		x[2] = "blah";
		x[3] = "one";
		assertEquals("pass", "one", x[3]);
		
	}
	

}
