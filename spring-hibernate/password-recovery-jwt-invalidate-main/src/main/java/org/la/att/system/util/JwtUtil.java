package org.la.att.system.util;

import java.math.BigInteger;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class JwtUtil {

	private final Logger log = LoggerFactory.getLogger(JwtUtil.class);
	
	@Value("${token.expiry.time}")
	private String expiryTime;
	
	@Value("$jwt.secret.key")
	private String SECRET_KEY;
	
	public void setExpiryTime(String expiryTime) {
		this.expiryTime = expiryTime;
	}
	
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
		Map<String, Object> claims = new HashMap<>();
		return createToken(claims, userDetails);
	}
	
	private String createToken(Map<String, Object> claims, UserDetails userDetails) {
		
		return Jwts.builder()
	                .setSubject(userDetails.getUsername())
	                .claim("authorities", userDetails.getAuthorities())
	                .setIssuedAt(new Date(System.currentTimeMillis()))
	                .setExpiration(new Date(System.currentTimeMillis() + Long.valueOf(expiryTime)))
	                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
	                .compact();
	}
	
	public boolean validateToken(String token, UserDetails userDetails) {
		
		final String username = extractUsername(token);
		return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
	}
	
}