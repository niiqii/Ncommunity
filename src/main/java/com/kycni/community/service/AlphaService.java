package com.kycni.community.service;

import com.kycni.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Kycni
 * @date 2022/2/10 21:18
 */
@Service
public class AlphaService {
    @Autowired
    private AlphaDao alphaDao;
    public String find () {
        return alphaDao.select();
    }
    
    public AlphaService() {
        System.out.println("类的实例化");
    }
    
    @PostConstruct
    public void init () {
        System.out.println("类的初始化");
    }
    
    @PreDestroy
    public void beforeDestroy () {
        System.out.println("类销毁前");
    }
    
    
}
