package com.va.assignment4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.va.assignment4.models.Client;
import com.va.assignment4.services.ClientService;

import jakarta.validation.*;

@Controller
public class ClientController {

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    //TODO Get Client Page
    @GetMapping
    public String client(Model model) {
        model.addAttribute("client", new Client());
        return "index";
    }

    //TODO Register
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute Client client, BindingResult bindingResult, Model model) {
        //TODO Error Check
        if (bindingResult.hasErrors()) {
            return "index";
        }
        clientService.clientWorkshop(client);
        return "redirect:/";
    }
}