package com.example.server;

import com.example.bean.Address;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class OrderServiceImpl implements OrderService, Serializable{

    @DubboReference
    AddressServer addressServer;

    @Override
    public Address initOrder(String userId) {
        return addressServer.getPersonById(userId);
    }
}
