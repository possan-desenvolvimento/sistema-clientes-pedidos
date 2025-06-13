package com.pedidoservice.cliente;

import com.pedidoservice.cliente.model.Cliente;
import com.pedidoservice.cliente.service.ClienteService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.Scanner;

@Component
public class ClienteTerminalApp implements CommandLineRunner {

    private final ClienteService clienteService;

    public ClienteTerminalApp(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n==== MENU CLIENTES ====");
            System.out.println("1 - Cadastrar novo cliente");
            System.out.println("2 - Buscar cliente por ID");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o email do cliente: ");
                    String email = scanner.nextLine();

                    Cliente novoCliente = new Cliente();
                    novoCliente.setNome(nome);
                    novoCliente.setEmail(email);

                    Cliente salvo = clienteService.salvar(novoCliente);
                    System.out.println("Cliente salvo com ID: " + salvo.getId());
                    break;

                case 2:
                    System.out.print("Digite o ID do cliente: ");
                    Long id = scanner.nextLong();
                    Optional<Cliente> cliente = clienteService.buscarPorId(id);

                    if (cliente.isPresent()) {
                        System.out.println("Cliente encontrado:");
                        System.out.println("Nome: " + cliente.get().getNome());
                        System.out.println("Email: " + cliente.get().getEmail());
                    } else {
                        System.out.println("Cliente com ID " + id + " não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 0);
    }
}
