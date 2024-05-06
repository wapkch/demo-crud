package com.example.democrud.service;

import com.example.democrud.entity.Company;
import com.example.democrud.mapper.CompanyMapper;

import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    private final CompanyMapper companyMapper;

    public CompanyService(CompanyMapper companyMapper) {
        this.companyMapper = companyMapper;
    }

    public Company queryCompany(Integer id) {
        return companyMapper.selectById(1);
    }

}
