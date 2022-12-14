package com.example.mvccrud.service.impl;

import com.example.mvccrud.exception.InvoiceNotFoundException;
import com.example.mvccrud.model.Invoice;
import com.example.mvccrud.repo.InvoiceRepository;
import com.example.mvccrud.service.IInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceServiceImpl implements IInvoiceService {
    @Autowired
    private InvoiceRepository repo;

    @Override
    public Invoice saveInvoice(Invoice invoice) {
        return repo.save(invoice);
    }

    @Override
    public List<Invoice> getAllInvoices() {
        return repo.findAll();
    }

    @Override
    public Invoice getInvoiceById(Long id) {
        Optional<Invoice> opt = repo.findById(id);
        if (opt.isPresent()){
            return opt.get();
        }
        else{
            throw new InvoiceNotFoundException("Invoice with Id : " + id + " Not found");
        }
    }

    @Override
    public void deleteInvoiceById(Long id) {
        repo.deleteById(id);
    }
    @Override
    public void updateInvoice(Invoice invoice) {
        repo.save(invoice);
    }
}
