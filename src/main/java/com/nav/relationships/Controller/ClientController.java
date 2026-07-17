package com.nav.relationships.Controller;

import java.util.List;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nav.relationships.Services.ClientServicesImpl;
import com.nav.relationships.entity.Client;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/clients")
@RequiredArgsConstructor
public class ClientController {
    public final ClientServicesImpl services;

    @PostMapping
    ResponseEntity<Client> addClient(
            @RequestBody Client client) {
        return ResponseEntity.status(HttpStatus.CREATED).body(services.addClient(client));
    };

    @GetMapping
    public ResponseEntity<List<Client>> getClient() {
        return ResponseEntity.status(HttpStatus.OK).body(services.getClient());
    };

    @GetMapping("/{id}")
    Client getClientById(@PathVariable Long id) {
        return services.getClientById(id);
    };

    @PutMapping("/{id}")
    Client UpdateClient(@PathVariable Long id, @RequestBody Client client) {
        return services.UpdateClient(id, client);
    };

    @DeleteMapping("{id}")
    String deleteClient(@PathVariable Long id) {
        return services.deleteClient(id);
    };
}
