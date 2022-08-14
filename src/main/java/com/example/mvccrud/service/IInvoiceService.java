package com.example.mvccrud.service;

import com.example.mvccrud.model.Invoice;

import java.util.List;

public interface IInvoiceService {
    Invoice saveInvoice(Invoice invoice);
    List<Invoice> getAllInvoices();
    Invoice getInvoiceById(Long id);
    void deleteInvoiceById(Long id);
    void updateInvoice(Invoice invoice);
}
