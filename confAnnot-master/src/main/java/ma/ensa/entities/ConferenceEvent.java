package ma.ensa.entities;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Component
@Entity
public class ConferenceEvent {
    @Id
    private String title;
    private Date date;
    @ManyToOne
    private Conference conference;
    @ManyToMany
    private List<Topic> topic;
    @OneToMany(mappedBy = "conferenceEvent")
    private List<Contribution> contribution;
    public ConferenceEvent() {

    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Conference getConference() {
        return conference;
    }
    public void setConference(Conference conference) {
        this.conference = conference;
    }
    public List<Topic> getTopic() {
        return topic;
    }
    public void setTopic(List<Topic> topic) {
        this.topic = topic;
    }
    public List<Contribution> getContribution() {
        return contribution;
    }
    public void setContribution(List<Contribution> contribution) {
        this.contribution = contribution;
    }


}
