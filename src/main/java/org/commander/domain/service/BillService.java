package org.commander.domain.service;

import org.commander.domain.model.Bill;

public interface BillService {

    Bill createBill(Bill bill);

    Bill updateBill(Bill bill);

    Bill findBillByTableNumberAndIsNotPaid(Integer tableNumber);

    Boolean deleteBill(Integer billId);

}
