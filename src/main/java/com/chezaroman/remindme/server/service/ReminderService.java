package com.chezaroman.remindme.server.service;

import com.chezaroman.remindme.server.entity.Remind;

import java.util.List;


public interface ReminderService {

    List<Remind> getAll();
    Remind getByID(long ID);
    Remind save(Remind remind);
    void remove(long id);

}
