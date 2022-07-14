package respository;

import entity.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransRepository extends CrudRepository<Transaction,Integer> {
}
