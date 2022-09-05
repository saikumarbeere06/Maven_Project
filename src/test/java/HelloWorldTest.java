import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ust.application.HelloWorld;

public class HelloWorldTest {
	@Test
	public void test() {
		HelloWorld hw=new HelloWorld("Hello");
		assertEquals( hw.getText(),"Hello");
	}

}
