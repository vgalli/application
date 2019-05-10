package com.vgalli.application;

import com.vgalli.domain.Message;
import com.vgalli.service.MainService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Logger;

public class Application {
    private final static Logger LOGGER = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) {

        if (args.length != 1) {
            throw new IllegalArgumentException("Please provide json file as a parameter.");
        }

        try {
            processFile(args[0]);
        } catch (IOException e) {
            e.printStackTrace();
            LOGGER.severe(e.getMessage());
        }

        System.exit(0);
    }

    /**
     * Process file
     * @param filePath
     * @throws IOException
     */
    private static void processFile(String filePath) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(filePath)));

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MainService mainService = (MainService) context.getBean("mainService");

        Message consume = mainService.consume(content);

        System.out.println(consume);
    }
}
