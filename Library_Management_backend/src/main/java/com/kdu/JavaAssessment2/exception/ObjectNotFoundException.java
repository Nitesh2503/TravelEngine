package com.kdu.JavaAssessment2.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ObjectNotFoundException extends RuntimeException{
    public ObjectNotFoundException(String message){
        super(message);
        log.error("Object Not found");
    }
}
