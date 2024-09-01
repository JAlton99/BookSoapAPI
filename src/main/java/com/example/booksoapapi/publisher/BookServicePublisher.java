package com.rz.soap.publisher;

import com.rz.soap.service.BookServiceImpl;
import jakarta.xml.ws.Endpoint;

public class BookServicePublisher {
    public static void main(String[] args) {
        Endpoint.publish(
                "http://localhost:8080/bookservice",
                new BookServiceImpl());
    }
}