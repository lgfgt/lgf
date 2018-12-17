package com.itheima.service;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IAccountService {
    /**
     * 查询所有
     */
    List<Account> findAll();
    /**
     * 删除用户
     */

    void deleteAccountById(  Integer id);
}
