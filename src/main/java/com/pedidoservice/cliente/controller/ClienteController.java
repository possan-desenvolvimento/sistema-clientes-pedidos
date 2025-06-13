package com.pedidoservice.cliente.controller;

import com.pedidoservice.cliente.model.Cliente;
import com.pedidoservice.cliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @PostMapping
    public Cliente criar(@RequestBody Cliente cliente) {
        return service.salvar(cliente);
    }

    @GetMapping("/{id}")
    public Optional<Cliente> buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }
}
