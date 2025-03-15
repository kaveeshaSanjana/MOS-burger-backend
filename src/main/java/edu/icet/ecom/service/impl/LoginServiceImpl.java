package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.UserDTO;
import edu.icet.ecom.entity.UserEntity;
import edu.icet.ecom.repository.UserDao;
import edu.icet.ecom.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {
    final UserDao userDao;
    final ModelMapper modelMapper;

    public UserDTO isExists(String username, String password){
        UserEntity user = userDao.findByUsernameAndPassword(username, password);
        return modelMapper.map(user, UserDTO.class);
    }

    public Boolean isUser(String username, String password){
        UserEntity user = userDao.findByUsernameAndPassword(username, password);
        return user!=null ;
    }
}
