package com.vgalli.service.impl;

import com.google.gson.Gson;
import com.vgalli.domain.Message;
import com.vgalli.service.MainService;
import org.springframework.stereotype.Service;

@Service
public class MainServiceImpl implements MainService {
    private Gson gson = new Gson();

    public Message consume(String toConsume) {

        if(toConsume == null) {
            throw new IllegalArgumentException("Please provide a non null value");
        }

        return gson.fromJson(toConsume, Message.class);
    }
}
