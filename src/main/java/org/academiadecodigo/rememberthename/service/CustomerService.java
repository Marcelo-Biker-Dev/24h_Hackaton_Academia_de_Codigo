package org.academiadecodigo.rememberthename.service;

import org.academiadecodigo.rememberthename.persistence.model.Customer;
import org.academiadecodigo.rememberthename.persistence.model.Reservation;

import java.util.List;
import java.util.Set;

public interface CustomerService {

    Customer get(Integer id);

    Customer save(Customer customer);

    void delete(Integer id);

    List<Customer> list();

    Set<Integer> listCustomerReservationIds(Integer id);

    Reservation addReservation(Integer cid, Reservation convert);

    void closeReservation(Integer cid, Integer aid);
}
