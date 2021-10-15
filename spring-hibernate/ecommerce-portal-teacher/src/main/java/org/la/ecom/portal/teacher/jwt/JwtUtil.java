package org.la.ecom.portal.teacher.jwt;

import java.util.Date;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@Service
public class JwtUtil {

	private String SECRET_KEY = "c754e7ae9434d31e79cf14f62fdd0ea613d3a42ce38a5034d8490d73b5c50d52e027ea8ffa024402269f49af0d78f4ed402e9e78d4c1f9e82572d56103751934";
	
	public String extractUsername(String token) {
		return extractClaim(token, Claims::getSubject);
	}
	
	public Date extractExpiration(String token) {
		return extractClaim(token, Claims::getExpiration);
	}
	public <T> T extractClaim(String token, Function<Claims, T> claimResolver) {
		final Claims claims = extractAllClaims(token);
		return claimResolver.apply(claims);
	}
	
	public Claims extractAllClaims(String token) {
		
		return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
	}
	
	private Boolean isTokenExpired(String token) {

		return extractExpiration(token).before(new Date());
	}
	
	public boolean validateToken(String token, UserDetails userDetails) {

		final String username = extractUsername(token);
		return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
	}
	
	public boolean validateToken(String token) {

		extractUsername(token);
		return (!isTokenExpired(token));
	}
	
	
}
