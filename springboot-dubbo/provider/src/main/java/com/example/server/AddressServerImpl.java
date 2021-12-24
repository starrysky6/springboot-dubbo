package com.example.server;

import com.example.bean.Address;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@DubboService   /**暴露服务*/
@Component
public class AddressServerImpl implements AddressServer, Serializable {

    @Override
    public Address getPersonById(String id) {
        //根据id查找地址，比如找到了上海
        Address addr = new Address(id,"上海");
        return addr;
    }
}
