package com.example.demo.cmm.mpr;

import com.example.demo.sym.service.model.ManagerDto;

import org.springframework.stereotype.Repository;

@Repository
public interface ManagerMapper {

    public int insert(ManagerDto manager);

}
