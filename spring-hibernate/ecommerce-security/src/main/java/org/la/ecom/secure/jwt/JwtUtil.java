package org.la.ecom.secure.jwt;

import java.util.Date;
import java.util.Map;
import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class JwtUtil {

	private String SECRET_KEY = "c754e7ae9434d31e79cf14f62fdd0ea613d3a42ce38a5034d8490d73b5c50d52e027ea8ffa024402269f49af0d78f4ed402e9e78d4c1f9e82572d56103751934";
	
	private final Logger log = LoggerFactory.getLogger(JwtUtil.class);
			
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
	
	private Claims extractAllClaims(String token) {
		
		return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
	}
	
	private Boolean isTokenExpired(String token) {

		return extractExpiration(token).before(new Date());
	}
	
	public String generateToken(UserDetails userDetails) {
		
		log.info("-------------authorities: "+userDetails.getAuthorities());
		return createToken(userDetails);
	}
	
	private String createToken(UserDetails userDetails) {
		return Jwts.builder()
	                .setSubject(userDetails.getUsername())
	                .claim("authorities", userDetails.getAuthorities())
	                .setIssuedAt(new Date())
	                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))
	                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
	                .compact();
	}
	
	private String createToken(Map<String, Object> claims, String subject) {
		return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))
				.signWith(SignatureAlgorithm.HS256, SECRET_KEY).compact();
	}
	
	public boolean validateToken(String token, UserDetails userDetails) {

		final String username = extractUsername(token);
		return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
	}
	
}
