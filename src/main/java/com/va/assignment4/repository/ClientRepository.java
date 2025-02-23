package com.va.assignment4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.va.assignment4.models.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}

