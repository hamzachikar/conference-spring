package ma.ensa.dao;

import ma.ensa.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicJpaRepository extends JpaRepository<Topic,String> {
}
