package ma.ensa.dao;

import ma.ensa.entities.Contribution;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContributionJpaRepository extends JpaRepository<Contribution,String > {
}
