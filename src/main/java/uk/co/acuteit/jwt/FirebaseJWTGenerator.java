/**
 * 
 */
package uk.co.acuteit.jwt;

import java.util.HashMap;
import java.util.Map;

import com.firebase.security.token.TokenGenerator;

/**
 * @author mikel
 * Requires a uuid
 *
 */
public class FirebaseJWTGenerator implements JWTGenerator {
	
	private String secret;

	/**
	 * @see uk.co.acuteit.jwt.JWTGenerator#setSecret(java.lang.String)
	 */
	public void setSecret(final String secret) {

		this.secret = secret;
	}

	/**
	 * @see uk.co.acuteit.jwt.JWTGenerator#generateToken()
	 */
	public String generateToken(final Map<String, Object> authPayload) {

		TokenGenerator tokenGenerator = new TokenGenerator(this.secret);
		String token = tokenGenerator.createToken(authPayload);
		
		return token;
	}
}
