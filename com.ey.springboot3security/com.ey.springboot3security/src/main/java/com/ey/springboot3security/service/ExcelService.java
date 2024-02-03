package com.ey.springboot3security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ey.springboot3security.entity.UserInfo;
import com.ey.springboot3security.repository.UserInfoRepository;



@Service
public class ExcelService {
    @Autowired
    private UserInfoRepository repository;

    public List<UserInfo> getAllData() {
        return repository.findAll();
    }
}
