package com.Talenta.perpustakaan.service;

import com.Talenta.perpustakaan.dao.BaseDao;
import com.Talenta.perpustakaan.dao.LoanDao;
import com.Talenta.perpustakaan.entity.Loan;
import org.springframework.beans.factory.annotation.Autowired;

public class LoanService extends BaseService<Loan>{
    @Autowired
    private LoanDao dao;

    @Override
    protected BaseDao<Loan> getDao(){
        return null;
    }

}
