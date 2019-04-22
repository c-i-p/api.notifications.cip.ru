package net.feng_shui.dao.interfaces;

import net.feng_shui.dao.generic.interfaces.GenericDAO;
import net.feng_shui.model.Company;
import net.feng_shui.model.Phone;
import net.feng_shui.model.Email;
import net.feng_shui.model.Social;
import net.feng_shui.model.Tag;
import net.feng_shui.model.Website;

import java.util.List;

/**
 * Created by mil on 30.11.15.
 */
public interface CompanyDao extends GenericDAO<Company> {
    List<Phone> getPhoneListByCompanyId(Integer id);
    List<Email> getEmailListByCompanyId(Integer id);
    List<Social> getSocialListByCompanyId(Integer id);
    List<Tag> getTagListByCompanyId(Integer id);
    List<Website> getWebsiteListByCompanyId(Integer id);
}
