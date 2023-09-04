package candidateproject.details.Candidate.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="candidate")
public class CandidateRegistration {
    private String candidateType;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "candidateId")
    private int candidateId;
    private String employeeID;
    private String name;
    @Column(unique = true)
    private String email;
    @OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "candidateId")
    private List<SkillsList> skillslists=new ArrayList<>();
    private int level;
    @Column(unique = true)
    @UniqueElements(message = "phone no should be unique")
    private Long phone;
    private int experience;
    private String baselocation;
    private String preferedloaction;

    private boolean isExternal;
    private float currentctc;
    private float expectedctc;
    private int NoticePeriod;
    @Column(unique = true)
    private String pancard;
    @Lob
    private byte[] resume;

    public CandidateRegistration() {

    }

    public String getCandidateType() {
        return candidateType;
    }

    public void setCandidateType(String candidateType) {
        this.candidateType = candidateType;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<SkillsList> getSkillslists() {
        return skillslists;
    }

    public void setSkillslists(List<SkillsList> skillslists) {
        this.skillslists = skillslists;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getBaselocation() {
        return baselocation;
    }

    public void setBaselocation(String baselocation) {
        this.baselocation = baselocation;
    }

    public String getPreferedloaction() {
        return preferedloaction;
    }

    public void setPreferedloaction(String preferedloaction) {
        this.preferedloaction = preferedloaction;
    }

    public boolean isExternal() {
        return isExternal;
    }

    public void setExternal(boolean external) {
        isExternal = external;
    }

    public float getCurrentctc() {
        return currentctc;
    }

    public void setCurrentctc(float currentctc) {
        this.currentctc = currentctc;
    }

    public float getExpectedctc() {
        return expectedctc;
    }

    public void setExpectedctc(float expectedctc) {
        this.expectedctc = expectedctc;
    }

    public int getNoticePeriod() {
        return NoticePeriod;
    }

    public void setNoticePeriod(int noticePeriod) {
        NoticePeriod = noticePeriod;
    }

    public String getPancard() {
        return pancard;
    }

    public void setPancard(String pancard) {
        this.pancard = pancard;
    }

    public byte[] getResume() {
        return resume;
    }

    public void setResume(byte[] resume) {
        this.resume = resume;
    }

    public CandidateRegistration(String candidateType, int candidateId, String employeeID, String name, String email, List<SkillsList> skillslists, int level, Long phone, int experience, String baselocation, String preferedloaction, boolean isExternal, float currentctc, float expectedctc, int noticePeriod, String pancard, byte[] resume) {
        this.candidateType = candidateType;
        this.candidateId = candidateId;
        this.employeeID = employeeID;
        this.name = name;
        this.email = email;
        this.skillslists = skillslists;
        this.level = level;
        this.phone = phone;
        this.experience = experience;
        this.baselocation = baselocation;
        this.preferedloaction = preferedloaction;
        this.isExternal = isExternal;
        this.currentctc = currentctc;
        this.expectedctc = expectedctc;
        NoticePeriod = noticePeriod;
        this.pancard = pancard;
        this.resume = resume;
    }
}
