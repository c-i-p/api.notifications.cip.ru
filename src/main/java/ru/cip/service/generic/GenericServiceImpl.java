package ru.cip.service.generic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.cip.dao.generic.interfaces.GenericDAO;

import java.io.Serializable;
import java.util.List;

/**
 * Created by mil on 03.12.15.
 */

@Service
@Transactional
public abstract class GenericServiceImpl<T extends Serializable> implements GenericService<T> {

    @Autowired
    public GenericDAO<T> tGenericDAO;

    @Transactional
    @Override
    public List<T> getList() {
        return tGenericDAO.getList();
    }

    @Transactional
    @Override
    public void save(T entity) {
        tGenericDAO.save(entity);
    }

    @Override
    public void delete(T entity) {
        tGenericDAO.delete(entity);
    }

    @Override
    public void deleteById(Integer id) {
        tGenericDAO.deleteById(id);
    }

    @Override
    public T getById(Integer id) {
        return tGenericDAO.getById(id);
    }

    @Override
    public void update(T entity) {
        tGenericDAO.update(entity);
    }

}
