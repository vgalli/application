package com.vgalli.service;

import com.google.gson.Gson;
import com.vgalli.domain.Message;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContextTest.xml"})
public class MainServiceTest {

    @Autowired
    private MainService mainService;

    @Test
    public void testConsume() {
        Message message = new Message();
        message.setMessage("Hello");
        message.setNum(11);
        Gson gson = new Gson();

        Message consumed = mainService.consume(gson.toJson(message));

        assertEquals("Messages are not matching", message, consumed);
    }
}
