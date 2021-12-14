package com.Talenta.perpustakaan.service;

import com.Talenta.perpustakaan.dao.BaseDao;
import com.Talenta.perpustakaan.entity.BaseEntity;

import javax.transaction.Transactional;
import java.util.Collection;

public class BaseService<T extends BaseEntity<T>> {
    protected abstract BaseDao<T> getDao();

    @Transactional(readonly = true)
    public T findOne(T param){
        return getDao().findOne(param);
    }

    @Transactional(readonly = true)
    public Collection<T> find(T param, int offset, int limit){
        return getDao().find(param, offset, limit);
    }

    @Transactional (readonly = true)
    public long count(T param){
        return getDao().count(param);
    }

    @Transactional
    public T save(T entity){
        return getDao().save(entity);
    }

    @Transactional
    public T update(T entity){
        if (entity.getId() != null){
            return getDao().update(entity)
        }
        return null;
    }

    @Transactional
    public boolean delete(long id){
        return getDao().delete(getDao().findReference(id)) != null;
    }

}