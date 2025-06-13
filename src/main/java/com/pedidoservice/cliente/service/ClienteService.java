package com.pedidoservice.cliente.service;

import com.pedidoservice.cliente.model.Cliente;
import com.pedidoservice.cliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Cliente salvar(Cliente cliente) {
        return repository.save(cliente);
    }

    public Optional<Cliente> buscarPorId(Long id) {
        return repository.findById(id);
    }
}
