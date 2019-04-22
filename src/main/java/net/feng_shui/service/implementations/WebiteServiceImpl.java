package net.feng_shui.service.implementations;

import net.feng_shui.model.Website;
import net.feng_shui.service.generic.GenericServiceImpl;
import net.feng_shui.service.interfaces.WebsiteService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mil on 23.11.2015.
 */

@Service
@Transactional
public class WebiteServiceImpl extends GenericServiceImpl<Website> implements WebsiteService {

}
