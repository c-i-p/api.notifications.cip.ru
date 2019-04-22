package net.feng_shui.service.implementations;

import net.feng_shui.dao.implementations.PhoneDaoImpl;
import net.feng_shui.dao.interfaces.IndividualDao;
import net.feng_shui.model.*;
import net.feng_shui.service.generic.GenericServiceImpl;
import net.feng_shui.service.interfaces.IndividualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mil on 26.11.15.
 * banana
 */

@Service
@Transactional
public class IndividualServiceImpl extends GenericServiceImpl<Individual> implements IndividualService {

    /**
     * Эта фигня работает, то некорректно. Так как делает запрос на общую таблицу contactInfo и получает все ее Айдюки
     */
    @Autowired
    PhoneDaoImpl phoneDao;

    @Override
    public List<Phone> getPhoneListById(Integer id) {
        return phoneDao.listById(id, "contactInfo");
    }


    /**
     * Данные методы сделаны с целью получения корректных запросов, если получится их переделать на генерик, то хорошо!
     */
    @Autowired
    IndividualDao individualDao;

    @Override
    public List<Phone> getPhoneListByPhoneId(Integer id) {
        return individualDao.getPhoneListByIndividualId(id);
    }

    @Override
    public List<Email> getEmailListByPhoneId(Integer id) {
        return individualDao.getEmailListByIndividualId(id);
    }

    @Override
    public List<Social> getSocialListByPhoneId(Integer id) {
        return individualDao.getSocialListByIndividualId(id);
    }

    @Override
    public List<Tag> getTagListByPhoneId(Integer id) {
        return individualDao.getTagListByIndividualId(id);
    }

    @Override
    public List<Website> getWebsiteListByPhoneId(Integer id) {
        return individualDao.getWebsiteListByIndividualId(id);
    }

}
