import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assumptions;
public class assumptiondemo {
	@Test
	void testOnDev()
	{
		System.setProperty("ENV","DEV");
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
	}
	@Test
	void testOnProd()
	{
		System.setProperty("ENV","PROD");
		Assumptions.assumingThat("DEV".equals(System.getProperty("ENV")), assumptiondemo:: message);
	}
	private static String message()
	{
		return "today's test execution failed :: ";
	}

}
