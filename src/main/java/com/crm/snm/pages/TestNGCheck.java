package com.crm.snm.pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGCheck {
@Test

public void passTest()
{
Assert.assertTrue(true);
}
@Test
public void failTest()
{
Assert.assertTrue(false);
}
@Test
public void skipTest()
{
throw new SkipException("skipping this is not ready for testing ");
}

 
}
