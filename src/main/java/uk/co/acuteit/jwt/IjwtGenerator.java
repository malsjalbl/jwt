/**
 * 
 */
package uk.co.acuteit.jwt;

import java.util.Map;

/**
 * @author Mike Langley
 * Describe implementation contract for generating a JWT (JSON Web Token)
 */
public interface IjwtGenerator {
	
	public void setSecret(String secret);
	public void setJwtGeneratorImpl();
	public String generateToken(Map<String, String> data);
}
