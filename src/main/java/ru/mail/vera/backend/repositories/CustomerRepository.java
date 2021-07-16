package ru.mail.vera.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.mail.vera.backend.data.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
