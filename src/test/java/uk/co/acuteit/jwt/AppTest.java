package uk.co.acuteit.jwt;

import java.util.HashMap;
import java.util.Map;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
    	
        return new TestSuite(AppTest.class);
    }

    public void testJWT() {
    	
        JWTGenerator jwtGenerator = new FirebaseJWTGenerator();
        Map<String, Object> payload = new HashMap<String, Object>();
        
        payload.put("uid", "123456789");
        payload.put("role", "admin");
        
        jwtGenerator.setSecret("asecret");
        String result = jwtGenerator.generateToken(payload);
        
    	assertTrue(true);
    }
}
