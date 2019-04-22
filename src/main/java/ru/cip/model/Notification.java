package ru.cip.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.feng_shui.model.ContactInfo;
import net.feng_shui.settings.ResponseId;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by mil on 23.11.2015.
 * banana
 */

@Entity
public class Notification extends ResponseId implements Serializable {

    private Integer id;
    private String link;
    private String notificationTitle;
    private String notificationText;

    @Override
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }

    public String getNotificationTitle() { return notificationTitle; }
    public void setNotificationTitle(String notificationTitle) { this.notificationTitle = notificationTitle; }

    public String getNotificationText() { return notificationText; }
    public void setNotificationText(String notificationText) { this.notificationText = notificationText; }
}
