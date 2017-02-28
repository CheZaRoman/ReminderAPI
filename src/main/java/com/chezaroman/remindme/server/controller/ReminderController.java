package com.chezaroman.remindme.server.controller;

import com.chezaroman.remindme.server.entity.Remind;
import com.chezaroman.remindme.server.service.ReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReminderController {

    @Autowired
    private ReminderService service;

    @RequestMapping(value = "/reminders", method = RequestMethod.GET)
    @ResponseBody
    public  List<Remind> getAllReminders(){
        return service.getAll();
    }

    @RequestMapping(value = "/reminders/{id}", method = RequestMethod.GET)
    @ResponseBody
    public  Remind getReminder(@PathVariable("id") long remindID){
        return service.getByID(remindID);
    }

    @RequestMapping(value = "/reminders/", method = RequestMethod.POST)
    @ResponseBody
    public  Remind saveReminder(@RequestBody Remind remind){
        return service.save(remind);
    }


    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public  void deleteReminder(@PathVariable("id") long ID){
        service.remove(ID);
    }
}
