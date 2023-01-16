package com.flowable.flowableproject.service.impl;

import com.flowable.flowableproject.entity.User;
import com.flowable.flowableproject.mapper.UserMapper;
import com.flowable.flowableproject.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bin
 * @since 2022-12-28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
