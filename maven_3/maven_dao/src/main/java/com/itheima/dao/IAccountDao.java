package com.itheima.dao;




import com.itheima.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAccountDao {
    /**
     * 查询所有
     */
    List<Account> findAll();
    /**
     * 删除用户
     */

    void deleteAccountById( @Param("id") Integer id);
}
