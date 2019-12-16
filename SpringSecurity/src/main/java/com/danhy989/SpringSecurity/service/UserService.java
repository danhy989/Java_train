package com.danhy989.SpringSecurity.service;

import com.danhy989.SpringSecurity.dto.UserDTO;
import com.danhy989.SpringSecurity.model.DAOUser;

public interface UserService {
    DAOUser saveUser(UserDTO userDTO);
}
