package net.feng_shui.service.implementations;

import net.feng_shui.model.User;

import net.feng_shui.service.generic.GenericServiceImpl;
import net.feng_shui.service.interfaces.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mil on 23.11.2015.
 */

@Service
@Transactional
public class UserServiceImpl extends GenericServiceImpl<User> implements UserService {

}
