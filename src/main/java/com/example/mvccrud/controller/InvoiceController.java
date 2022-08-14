package com.example.mvccrud.controller;

import com.example.mvccrud.exception.InvoiceNotFoundException;
import com.example.mvccrud.model.Invoice;
import com.example.mvccrud.service.IInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/invoice")
public class InvoiceController {
    @Autowired
    private IInvoiceService service;

    @GetMapping("/")
    public String showHomePage(){
        return "homePage";
    }

    @GetMapping("/register")
    public String showRegistration(){
        return "registerInvoicePage";
    }

    @GetMapping("/getAllInvoices")
    public String getAllInvoices(
            @RequestParam(value = "message", required = false) String message,
            Model model
    ) {
        List<Invoice> invoices= service.getAllInvoices();
        model.addAttribute("list", invoices);
        model.addAttribute("message", message);
        return "allInvoicesPage";
    }

    @PostMapping("/save")
    public String saveInvoice(@ModelAttribute Invoice invoice, Model model){
        service.saveInvoice(invoice);
        Long id = service.saveInvoice(invoice).getId();
        String message = "Record with id : '" +id + "' is saved successfully !";
        model.addAttribute("message", message);
        return "registerInvoicePage";
    }
    @GetMapping("/edit")
    public String getEditPage(Model model, RedirectAttributes attributes, @RequestParam Long id){
        String page = null;
        try {
            Invoice invoice = service.getInvoiceById(id);
            model.addAttribute("invoice", invoice);
            page = "editInvoicePage";
        } catch (InvoiceNotFoundException e){
            e.printStackTrace();
            attributes.addAttribute("message", e.getMessage());
            page = "redirect:getAllInvoices";
        }
        return page;
    }
    @GetMapping("/delete")
    public String deleteInvoice(@RequestParam Long id, RedirectAttributes attributes){
        try{
            service.deleteInvoiceById(id);
            attributes.addAttribute("message", "Invoice with id : '" + id + " is removed successfully!");
        } catch (InvoiceNotFoundException e){
            e.printStackTrace();
            attributes.addAttribute("message", e.getMessage());
        }
        return "redirect:getAllInvoices";
    }
}
