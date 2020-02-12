package ma.ensa.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Conference {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idConference;
	private String conferenceName;
	@OneToMany(mappedBy = "conference")
	private List<ConferenceEvent> conferenceEvent;
	public Conference() {
		super();
	}
	public Conference(String conferenceName) {
		super();
		this.conferenceName = conferenceName;
	}
	public Long getIdConference() {
		return idConference;
	}
	public void setIdConference(Long idConference) {
		this.idConference = idConference;
	}
	public String getConferenceName() {
		return conferenceName;
	}
	public void setConferenceName(String conferenceName) {
		this.conferenceName = conferenceName;
	}

	public List<ConferenceEvent> getConferenceEvent() {
		return conferenceEvent;
	}

	public void setConferenceEvent(List<ConferenceEvent> conferenceEvent) {
		this.conferenceEvent = conferenceEvent;
	}
}
