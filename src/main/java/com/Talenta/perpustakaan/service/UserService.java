package com.Talenta.perpustakaan.service;

import com.Talenta.perpustakaan.dao.BaseDao;
import com.Talenta.perpustakaan.dao.UserDao;
import com.Talenta.perpustakaan.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService extends BaseService<User>{

    @Autowired
    private UserDao dao;

    @Override
    protected BaseDao<User> getDao(){
        return dao;
    }

}
