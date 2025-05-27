package ma.emsi.ebankingbackend.repository;

import ma.emsi.ebankingbackend.entities.customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends JpaRepository<customer,Long> {
    @Query("select c from customer c where c.name like :kw")
    List<customer> searchCustomer(@Param("kw") String keyword);
}
