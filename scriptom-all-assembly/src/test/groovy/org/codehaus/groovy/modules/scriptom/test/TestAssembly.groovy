package org.codehaus.groovy.modules.scriptom.test
import java.lang.management.ManagementFactory



/**
 * @author jsmith
 *
 */
public class TestAssembly extends GroovyTestCase
{
    public void setUp() 
	{
    	println "vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv${ManagementFactory.runtimeMXBean.name}"
    }
    
    public void testIt()
    {
    	//
    }
}
