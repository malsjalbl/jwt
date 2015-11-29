/**
 * 
 */
package uk.co.acuteit.jwt;

/**
 * @author Mike Langley
 * Describe implementation contract for generating a JWT (JavaScript Web Token)
 */
public interface IjwtGenerator {
	
	public void setSecret(String secret);
	public String generateToken();
}
