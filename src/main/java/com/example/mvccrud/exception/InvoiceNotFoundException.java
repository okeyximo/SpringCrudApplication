package com.example.mvccrud.exception;

public class InvoiceNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public InvoiceNotFoundException(){
        super();
    }
    public InvoiceNotFoundException(String customeMessage){
        super(customeMessage);
    }
}
