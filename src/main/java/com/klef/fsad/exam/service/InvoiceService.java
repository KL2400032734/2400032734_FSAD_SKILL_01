package com.klef.fsad.exam.service;

import java.util.List;
import com.klef.fsad.exam.model.Invoice;

public interface InvoiceService {

 String addInvoice(Invoice invoice);

 List<Invoice> viewAllInvoices();

}