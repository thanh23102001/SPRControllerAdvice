package com.example.sprcontrolleradvice.exception;

public class NoDataFoundException {
    public class NoDataFoundException extends RuntimeException {

        public NoDataFoundException() {

            super("No data found");
        }
    }
}
