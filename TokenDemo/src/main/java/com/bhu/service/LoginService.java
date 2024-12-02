package com.bhu.service;

import com.bhu.domain.ResponseResult;
import com.bhu.domain.User;

public interface LoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
