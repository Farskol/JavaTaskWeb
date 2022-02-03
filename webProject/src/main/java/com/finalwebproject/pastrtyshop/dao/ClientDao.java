package com.finalwebproject.pastrtyshop.dao;

import com.finalwebproject.pastrtyshop.entity.Client;
import com.finalwebproject.pastrtyshop.entity.ClientDiscount;
import com.finalwebproject.pastrtyshop.entity.ClientRole;
import com.finalwebproject.pastrtyshop.entity.ClientStatus;

import java.util.List;

public interface ClientDao extends BaseDao <Client>{
 List<Client> findById(int clientId);
 List<Client> findByLogin(String login);
 List<Client> findByFirstName(String firstName);
 List<Client> findBySecondName(String secondName);
 List<Client> findByEmail(String email);
 List<Client> findByPhoneNumber(String PhoneNumber);
 List<Client> findByRole(ClientRole role);
 List<Client> findByStatus(ClientStatus status);

 boolean updateLogin(String login, int clientId);
 boolean updatePassword(String password, int clientId);
 boolean updateFirstName(String firstName, int clientId);
 boolean updateSecondName(String secondName, int clientId);
 boolean updateEmail(String email, int clientId);
 boolean updatePhoneNumber(String  phoneNumber, int clientId);
 boolean updateRole(ClientRole role, int clientId);
 boolean updateStatus(ClientStatus status, int clientId);
 boolean updateDiscount(ClientDiscount discount, int clientId);
}
