package com.example.democrud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.democrud.entity.Company;

public interface CompanyMapper extends BaseMapper<Company> {

    Company selectById(Integer id);

}
