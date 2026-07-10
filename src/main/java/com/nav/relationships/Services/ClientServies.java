package com.nav.relationships.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nav.relationships.entity.Client;

@Service
public interface ClientServies {

    Client addClient(Client client);

    List<Client> getClient();

    Client getClientById(Long id);

    Client UpdateClient(Long id, Client client);

    String deleteClient(Long id);
}
