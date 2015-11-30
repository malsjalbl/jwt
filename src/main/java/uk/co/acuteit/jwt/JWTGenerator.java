/**
 * 
 */
package uk.co.acuteit.jwt;

import java.util.Map;

/**
 * @author Mike Langley
 * Describe implementation contract for generating a JWT (JavaScript Web Token)
 */
public interface JWTGenerator {
	
	public void setSecret(String secret);
	public String generateToken(Map<String, Object> authPayload);
}
