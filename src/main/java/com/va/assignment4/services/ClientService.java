package com.va.assignment4.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.va.assignment4.models.Client;
import com.va.assignment4.repository.ClientRepository;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    //TODO Save Workshop Registration
    public void clientWorkshop(Client client) {
        clientRepository.save(client);
    }
}