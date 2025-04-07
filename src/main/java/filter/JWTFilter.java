package filter;

import edu.icet.ecom.service.jwt.JWTService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
@Slf4j
@RequiredArgsConstructor
public class JWTFilter extends OncePerRequestFilter {

    private final JWTService jwtService;

    @Override
    protected void  doFilterInternal(@NonNull HttpServletRequest request,@NonNull HttpServletResponse response,@NonNull FilterChain filterChain) throws ServletException, IOException {
        String authorization = request.getHeader("Authorization");
        if (authorization == null){
            log.debug("authorization was null");
            filterChain.doFilter(request,response);
            return;
        }

        if (!authorization.startsWith("Bearer ")){
            log.info("{} 's request was not Bearer is was {}",request.getRemoteAddr(),authorization);
            filterChain.doFilter(request,response);
            return;
        }

        String token = authorization.split(" ")[1];
        jwtService.getUsername(token);
        if ()
    }
}
