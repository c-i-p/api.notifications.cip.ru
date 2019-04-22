package net.feng_shui.service.implementations;

import net.feng_shui.model.ContactInfo;
import net.feng_shui.service.generic.GenericServiceImpl;
import net.feng_shui.service.interfaces.ContactInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mil on 23.11.2015.
 */

@Service
@Transactional
public class ContactInfoInfoServiceImpl extends GenericServiceImpl<ContactInfo> implements ContactInfoService {

}
