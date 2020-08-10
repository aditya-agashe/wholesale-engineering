package au.com.digisui.wholesaleengineering.repository;

import au.com.digisui.wholesaleengineering.entity.AccountTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountTransactionRepository extends JpaRepository<AccountTransaction, Integer> {
    List<AccountTransaction> findByAccountAccountId(Integer accountId);
}