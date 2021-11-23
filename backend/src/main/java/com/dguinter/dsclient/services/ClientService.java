package com.dguinter.dsclient.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dguinter.dsclient.entities.Client;
import com.dguinter.dsclient.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	public List<Client> findAll(){
		return repository.findAll();
	}

}
