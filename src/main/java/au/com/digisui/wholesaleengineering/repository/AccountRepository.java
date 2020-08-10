package au.com.digisui.wholesaleengineering.repository;

import au.com.digisui.wholesaleengineering.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
}
