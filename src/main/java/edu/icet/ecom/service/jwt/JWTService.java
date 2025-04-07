package edu.icet.ecom.service.jwt;

import filter.JWTFilter;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import lombok.RequiredArgsConstructor;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class JWTService {

    private final SecretKey secretKey;

    public JWTService(){
        try {
            secretKey = Keys.hmacShaKeyFor(KeyGenerator.getInstance("HmacSHA256")
                                                        .generateKey()
                                                        .getEncoded());
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public String getUsername(String token){
       Claims claims =  tokenData(token);
       if(claims == null )return null;
       return claims.getSubject();
    }

    private Claims tokenData(String token) {
        try {
           return Jwts
                .parser()
                .verifyWith(secretKey)
                .build()
                    .parseSignedClaims(token)
                    .getPayload();
        } catch (Exception e) {
           return null;
        }
    }
}
