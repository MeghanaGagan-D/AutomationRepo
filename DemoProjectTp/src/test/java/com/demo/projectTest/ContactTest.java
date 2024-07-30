package com.demo.projectTest;

import org.testng.annotations.Test;

public class ContactTest {
@Test
public void createContactTest()
{
	String Environment=System.getenv("url");
	String Browser=System.getenv("browser");
	System.out.println(Environment);
	System.out.println(Browser);
	System.out.println("========contact created=========");
}
}
