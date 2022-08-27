package org.commander.domain.dao;

import org.commander.domain.model.Bill;

public interface BillDao {

    Bill save(Bill bill);

    Bill update(Bill bill);

    Bill findBillByTableNumberAndIsNotPaid(Integer tableNumber);

    Boolean delete(Integer billId);

}
