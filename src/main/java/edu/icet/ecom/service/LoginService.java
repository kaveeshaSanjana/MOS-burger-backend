package edu.icet.ecom.service;

import edu.icet.ecom.dto.UserDTO;

public interface LoginService {
    Boolean isUser(String username, String password);
    UserDTO isExists(String username, String password);
}
