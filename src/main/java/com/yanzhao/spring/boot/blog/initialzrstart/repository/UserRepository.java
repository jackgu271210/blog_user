package com.yanzhao.spring.boot.blog.initialzrstart.repository;

import com.yanzhao.spring.boot.blog.initialzrstart.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * UserRepository接口
 */
public interface UserRepository extends CrudRepository<User, Long> {}
