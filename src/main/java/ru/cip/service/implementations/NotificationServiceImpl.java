package ru.cip.service.implementations;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.cip.service.generic.GenericServiceImpl;
import ru.cip.model.Notification;
import ru.cip.service.interfaces.NotificationService;

/**
 * Created by milomory on 22.04.19.
 */

@Service
@Transactional
public class NotificationServiceImpl extends GenericServiceImpl<Notification> implements NotificationService {
}


