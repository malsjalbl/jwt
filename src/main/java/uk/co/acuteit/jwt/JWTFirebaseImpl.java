/**
 * 
 */
package uk.co.acuteit.jwt;

import java.util.HashMap;
import java.util.Map;

import com.firebase.security.token.TokenGenerator;

/**
 * @author mikel
 *
 */
public class JWTFirebaseImpl implements IjwtGenerator {
	
	private String secret;

	/**
	 * @see uk.co.acuteit.jwt.IjwtGenerator#setSecret(java.lang.String)
	 */
	public void setSecret(String secret) {

		this.secret = secret;
	}

	/**
	 * @see uk.co.acuteit.jwt.IjwtGenerator#generateToken()
	 */
	public String generateToken() {
		
		Map<String, Object> authPayload = new HashMap<String, Object>();
		authPayload.put("uid", "1");
		authPayload.put("some", "arbitrary");
		authPayload.put("data", "here");

		TokenGenerator tokenGenerator = new TokenGenerator(this.secret);
		String token = tokenGenerator.createToken(authPayload);
		
		return token;
	}
}
