package respository;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<entity.Account,Integer> {
}
