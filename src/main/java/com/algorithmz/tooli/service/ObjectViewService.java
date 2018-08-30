/*package com.algorithmz.tooli.service;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algorithmz.tooli.model.ObjectViewings;
import com.algorithmz.tooli.model.Users;
import com.algorithmz.tooli.repository.ObjectTypeRepository;
import com.algorithmz.tooli.repository.ObjectViewingRepository;
import com.algorithmz.tooli.repository.UserRepository;

/**
 * Created by kmagdy on 8/13/2017.
 *//*
@Service
public class ObjectViewService {

    @Autowired
    private ObjectViewingRepository objectViewingRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ObjectTypeRepository objectTypeRepository;

    public ObjectViewings addObjectView(String objectId, short objectTypeId, Users user) {
        List<ObjectViewings> objectViewingsList = objectViewingRepository.findByObjectIdAndObjectTypeId_ObjectTypeIdAndActingUserId_UserId(objectId, objectTypeId, user.getUserId());
        if (objectViewingsList == null || objectViewingsList.isEmpty()) {
            ObjectViewings objectViewings = new ObjectViewings(objectId, new Date(), objectTypeRepository.findOne(objectTypeId), userRepository.findOne(user.getUserId()));
            return objectViewingRepository.save(objectViewings);
        } else {
            Calendar viewingCalendar = Calendar.getInstance();
            viewingCalendar.setTime(objectViewingsList.get(objectViewingsList.size() - 1).getViewingDateTime());
            viewingCalendar.add(Calendar.DATE, 1);

            if (new Date().after(viewingCalendar.getTime())) {
                ObjectViewings objectViewings = new ObjectViewings(objectId, new Timestamp(new Date().getTime()), objectTypeRepository.findOne(objectTypeId), userRepository.findOne(user.getUserId()));
                return objectViewingRepository.save(objectViewings);
            } else {
                return objectViewingsList.get(objectViewingsList.size() - 1);
            }
        }

    }

    public long getTotalNumberOfViewing(String objectId, short objectTypeId) {
        return objectViewingRepository.countByObjectIdAndObjectTypeId_ObjectTypeId(objectId, objectTypeId);
    }

}
*/