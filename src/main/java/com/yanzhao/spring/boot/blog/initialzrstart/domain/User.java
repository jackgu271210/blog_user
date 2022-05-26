package com.yanzhao.spring.boot.blog.initialzrstart.domain;

import javax.persistence.*;
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
    
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    protected User() { //无参构造函数
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
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

    @Override
    public String toString() {
        return String.format(
                "User[id=%d, name='%s', age='%s']",
                id, name, email);
    }
}
