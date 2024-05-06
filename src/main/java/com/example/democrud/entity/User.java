package com.example.democrud.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName("sys_user")
public class User {

    @TableId(type = IdType.ASSIGN_ID)
    private Integer id;

    private String name;

    private Integer age;

    private String email;

    private Integer companyId;

}
