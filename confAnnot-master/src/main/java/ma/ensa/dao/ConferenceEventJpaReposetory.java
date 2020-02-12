package ma.ensa.dao;

import ma.ensa.entities.ConferenceEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceEventJpaReposetory extends JpaRepository<ConferenceEvent,String> {
}
