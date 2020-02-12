package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ma.ensa.entities.Conference;

@Repository(value="conferenceJpaRepository")
public interface ConferenceJpaRepository extends JpaRepository<Conference, Long>{

}
