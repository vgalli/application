package com.vgalli.service;

import com.vgalli.domain.Message;

/**
 * Main Service class
 */
public interface MainService {
    /**
     * Consumes a String message and converts it to the equivalent domain object
     * @param message The message
     * @return  Message The converted domain object
     */
    public Message consume(final String message);
}
