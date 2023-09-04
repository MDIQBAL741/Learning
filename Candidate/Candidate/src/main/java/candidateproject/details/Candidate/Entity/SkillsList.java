package candidateproject.details.Candidate.Entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name="skillsTable")
public class SkillsList {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int skillsId;
    private String skills;
    @ManyToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
    private List<CandidateRegistration> candidateRegistrations;
    public int getSkillsId() {
        return skillsId;
    }

    public void setSkillsId(int skillsId) {
        this.skillsId = skillsId;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

}
