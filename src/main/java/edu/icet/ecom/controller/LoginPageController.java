package edu.icet.ecom.controller;

import edu.icet.ecom.dto.UserDTO;
import edu.icet.ecom.service.LoginService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpHeaders;

@RestController
@RequestMapping("/api/login")
@RequiredArgsConstructor
@CrossOrigin
@Slf4j
public class LoginPageController {
    final LoginService loginService;

    public UserDTO isExists ( HttpServletRequest httpHeaders){
      log.debug(httpHeaders.getRequestURI());
      return null;
    }

    @GetMapping("check/{username}/{password}")
    public Boolean isUser(@PathVariable("username") String username, @PathVariable("password") String password,HttpServletRequest servletRequest){
        log.info(servletRequest.getRemoteAddr());
        return loginService.isUser(username,password);
    }
}
