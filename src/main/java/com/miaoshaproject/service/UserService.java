package com.miaoshaproject.service;

import com.alibaba.druid.util.StringUtils;
import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.UserModel;

public interface UserService {

    //通过ID获取用户对象
    UserModel getUserById(Integer id);
    void register(UserModel userModel) throws BusinessException;

    //用户注册用手机，用户加密后密码
    UserModel validateLogin(String telphone, String encrotPassword) throws BusinessException;
}
