package GenericUtility;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzerPractice {
@Test(retryAnalyzer = UtilityPackage.RetryAnalyzerClass.class)
	public void Test1()
	{
		System.out.println("passed");
	}

@Test
public void Test2()
{
	System.out.println("passed");
	Assert.fail();
}
}
