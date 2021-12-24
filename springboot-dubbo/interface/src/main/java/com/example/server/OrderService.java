package com.example.server;

import com.example.bean.Address;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    public Address initOrder(String userId);
}
