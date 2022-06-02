package com.yanzhao.spring.boot.blog.initialzrstart.service;

import com.yanzhao.spring.boot.blog.initialzrstart.domain.User;
import com.yanzhao.spring.boot.blog.initialzrstart.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * 用户服务接口实现
 */
@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    @Transactional
    @Override
    public User saveOrUpdateUser(User user) {
        return userRepository.save(user);
    }

    @Transactional
    @Override
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    @Transactional
    @Override
    public void removeUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.getById(id);
    }

    @Override
    public Page<User> listUsersByNameLike(String name, Pageable pageable) {
        //模糊查询
        name = "%" +name+ "%";
        Page<User> users = userRepository.findByNameLike(name, pageable);
        return users;
    }
}
