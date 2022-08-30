package org.commander.application.service;

import lombok.RequiredArgsConstructor;
import org.commander.domain.dao.BillDao;
import org.commander.domain.model.Bill;
import org.commander.domain.service.BillService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class DefaultBillService implements BillService {

    private final BillDao billDao;

    @Transactional
    @Override
    public Bill createBill(Bill bill) {
        return billDao.save(bill);
    }

    @Transactional
    @Override
    public Bill updateBill(Bill bill) {
        return billDao.update(bill);
    }

    @Override
    public Bill findBillByTableNumberAndIsNotPaid(Integer tableNumber) {
        return billDao.findBillByTableNumberAndIsNotPaid(tableNumber);
    }

    @Transactional
    @Override
    public Boolean deleteBill(Integer billId) {
        return billDao.delete(billId);
    }
}
