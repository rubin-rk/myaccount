package com.acc.respository;

import com.acc.entity.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TransRepository extends CrudRepository<Transaction,Integer> {
}
