package com.Talenta.perpustakaan.service;

import com.Talenta.perpustakaan.dao.BaseDao;
import com.Talenta.perpustakaan.dao.BookDao;
import com.Talenta.perpustakaan.service.BaseService;
import com.Talenta.perpustakaan.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService extends BaseService<Book> {

    @Autowired
    private BookDao dao;


    @Override
    protected BaseDao<Book> getDao(){
        return dao;

    }

}
