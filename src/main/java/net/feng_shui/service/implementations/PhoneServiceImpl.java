package net.feng_shui.service.implementations;

import net.feng_shui.model.Phone;
import net.feng_shui.service.generic.GenericServiceImpl;
import net.feng_shui.service.interfaces.PhoneService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mil on 23.11.2015.
 * banana
 */

@Service
@Transactional
public class PhoneServiceImpl extends GenericServiceImpl<Phone> implements PhoneService {

}
