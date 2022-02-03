package com.finalwebproject.pastrtyshop.service.impl;

import com.finalwebproject.pastrtyshop.dao.ClientDao;
import com.finalwebproject.pastrtyshop.dao.impl.ClientDaoImpl;
import com.finalwebproject.pastrtyshop.entity.Client;
import com.finalwebproject.pastrtyshop.service.ClientService;

import java.util.Map;
import java.util.Optional;

public class ClientServiceImpl implements ClientService {

    @Override
    public boolean userRegistration(Map<String, String> mapData) {
        return false;
    }

    @Override
    public Optional<Client> login(String login, String password) {
        ClientDao clientDao = new ClientDaoImpl();
        Optional<Client> client = Optional.of(clientDao.findByLogin(login).get(0));
        return client;
    }
}
