package com.finalwebproject.pastrtyshop.service;

import com.finalwebproject.pastrtyshop.entity.Client;

import java.util.Map;
import java.util.Optional;

public interface ClientService {

    boolean userRegistration(Map<String, String> mapData);
    Optional<Client> login (String login, String password);
}
