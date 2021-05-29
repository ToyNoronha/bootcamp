package com.project.bootcamp.exceptions;

import com.project.bootcamp.util.MessageUtils;

public class NoFoundException extends RuntimeException{

    public NoFoundException(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
