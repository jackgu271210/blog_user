package com.yanzhao.spring.boot.blog.initialzrstart.domain;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * User 实体
 */
@Entity
@XmlRootElement
public class User implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //实体一个唯一标识
    
    @NotEmpty(message="姓名不能为空")
    @Size(min=2,max=20)
    @Column(nullable = false, length=20) //映射为字段，值不能为空
    private String name;

    @NotEmpty(message="邮箱不能为空")
    @Size(max=50)
    @Email(message="邮箱格式不对")
    @Column(nullable = false, length=20,unique = true) //映射为字段，值不能为空
    private String email;

    @NotEmpty(message="账号不能为空")
    @Size(min=3,max=20)
    @Column(nullable = false, length=20,unique = true) //映射为字段，值不能为空
    private String username;

    @NotEmpty(message="密码不能为空")
    @Size(max=100)
    @Column(length =100) //映射为字段，值不能为空
    private String password;

    @Column(length =200)
    private String avatar;

    protected User() { //无参构造函数
    }

    public User(Long id, String name, String username, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return String.format(
                "User[id=%d, name='%s',username='%s', age='%s']",
                id, name, username, email);
    }
}
