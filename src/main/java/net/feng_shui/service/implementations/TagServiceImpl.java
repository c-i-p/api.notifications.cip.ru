package net.feng_shui.service.implementations;

import net.feng_shui.model.Tag;
import net.feng_shui.service.generic.GenericServiceImpl;
import net.feng_shui.service.interfaces.TagService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mil on 02.12.15.
 */

@Service
@Transactional
public class TagServiceImpl extends GenericServiceImpl<Tag> implements TagService{

}
