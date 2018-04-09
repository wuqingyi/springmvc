package com.wqy.springmvc.mappers;

import com.wqy.springmvc.entities.Account;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {

    @Select("select * from account")
    List<Account> getAllAccount();
}
