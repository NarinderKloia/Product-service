package com.nav.relationships.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nav.relationships.entity.Client;
import com.nav.relationships.repositories.ClientRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClientServicesImpl implements ClientServies {

    public final ClientRepo repo;

    @Override
    public Client addClient(Client client) {
        return repo.save(client);
    }

    @Override
    public List<Client> getClient() {
        return repo.findAll();
    }

    @Override
    public Client getClientById(Long id) {
        return repo.findById(id).orElseThrow(
                () -> new RuntimeException("Client Not Found"));
    }

    @Override
    public Client UpdateClient(Long id, Client client) {
        Client existing = getClientById(id);
        // existing.setClientName(client.get)
       return null;
    }

    @Override
    public String deleteClient(Long id) {
        repo.deleteById(id);
        return "Client Deleted";
    }

}
