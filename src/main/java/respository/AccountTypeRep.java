package respository;

import entity.AccountType;
import org.springframework.data.repository.CrudRepository;

public interface AccountTypeRep extends CrudRepository<AccountType,Integer> {
}
