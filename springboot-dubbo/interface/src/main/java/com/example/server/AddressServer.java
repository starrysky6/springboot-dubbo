package com.example.server;

import com.example.bean.Address;
import org.springframework.stereotype.Service;

@Service
public interface AddressServer {
    public Address getPersonById(String id);
}
