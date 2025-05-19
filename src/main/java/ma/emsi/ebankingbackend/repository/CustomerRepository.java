package ma.emsi.ebankingbackend.repository;

import ma.emsi.ebankingbackend.entities.customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<customer,Long> {
}
