package com.example.demo.bootstrap;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Division;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository) {
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Division division = new Division();
        division.setId(2L);

        Customer c1 = new Customer("Sophia", "Johnson", "111 Abc St.", "1001", "123-456-7890", division);
        Customer c2 = new Customer("Liam", "Martinez", "222 Bcd St.", "2002", "234-567-8901", division);
        Customer c3 = new Customer("Olivia", "Thompson", "333 Cde St.", "3003", "345-678-9012", division);
        Customer c4 = new Customer("Noah", "Rodriguez", "444 Def St", "4004", "456-789-0123", division);
        Customer c5 = new Customer("Ava", "Lee", "555 Efg St.", "5005", "567-890-1234", division);

        c1.setDivision(division);
        division.getCustomers().add(c1);
        customerRepository.save(c1);

        c2.setDivision(division);
        division.getCustomers().add(c2);
        customerRepository.save(c2);

        c3.setDivision(division);
        division.getCustomers().add(c3);
        customerRepository.save(c3);

        c4.setDivision(division);
        division.getCustomers().add(c4);
        customerRepository.save(c4);

        c5.setDivision(division);
        division.getCustomers().add(c5);
        customerRepository.save(c5);

        List<Customer> customers = customerRepository.findAll();

    }
}
