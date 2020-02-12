package ma.ensa.dao;

import ma.ensa.entities.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerJpaRepository extends JpaRepository<Speaker,String> {
}
