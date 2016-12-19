package no.stelar7.api.l4j8.tests;

import no.stelar7.api.l4j8.basic.*;
import no.stelar7.api.l4j8.basic.DataCall.*;
import no.stelar7.api.l4j8.basic.constants.api.*;
import org.junit.*;
import org.junit.runners.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestBase
{
	protected static DataCallBuilder builder = DataCall.builder();
	
	@BeforeClass
	public static void init()
	{
		TestBase.builder = DataCall.builder();
		TestBase.builder.asVerbose(true);
		TestBase.builder.withServer(Server.EUW);
		TestBase.builder.withRegion(Server.EUW);
		DataCallBuilder.setCredentials(SecretFile.CREDS);
	}
	
	public TestBase()
	{
		// Empty public constructor
	}
	
}
