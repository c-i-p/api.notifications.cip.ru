package net.feng_shui.service.implementations;

import net.feng_shui.model.Social;
import net.feng_shui.service.generic.GenericServiceImpl;
import net.feng_shui.service.interfaces.SocialService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mil on 23.11.2015.
 */

@Service
@Transactional
public class SocialServiceImpl extends GenericServiceImpl<Social> implements SocialService {

}
