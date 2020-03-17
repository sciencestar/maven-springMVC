package com.service;

import com.entity.User;
import org.springframework.stereotype.Service;

public interface IUserService {
    boolean doUserLogin(User user);
}
