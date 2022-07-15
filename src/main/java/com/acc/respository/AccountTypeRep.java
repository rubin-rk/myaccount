package com.acc.respository;

import com.acc.entity.AccountType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AccountTypeRep extends CrudRepository<AccountType,Integer> {
}
