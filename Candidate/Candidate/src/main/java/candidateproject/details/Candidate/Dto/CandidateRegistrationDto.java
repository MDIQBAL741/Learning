package candidateproject.details.Candidate.Dto;

import candidateproject.details.Candidate.Entity.SkillsList;
import jakarta.persistence.Lob;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.List;

public class CandidateRegistrationDto {
    private int candidateId;
    private String employeeID;
    @NotNull(message = "user name not be null")
    private String name;
    @NotNull(message = "email can't be null")
    @Email(message = "invalid email")
    private String email;
    @NotNull(message = "skill can't be null")
    private List<SkillsList> skillslists = new ArrayList<>();
    private int level;
    @NotNull(message = "phone can't ne null")
    @Pattern(regexp = "^[0-9]{10}$", message = "invalid phone no")
    private String phone;
    @NotNull(message = "required experiance")
    private String experience;
    private String baselocation;

    private String preferedloaction;

    private boolean isExternal;
    @NotNull(message = "current ctc needs to be filled")
    private float currentctc;
    @NotNull(message = "expected ctc needs to be filled")
    private float expectedctc;
    private int NoticePeriod;
    @NotNull(message = "pancard can't be null")
    private String pancard;
    @Lob
    private byte[] resume;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
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

    public CandidateRegistrationDto(int candidateId, String employeeID, String name, String email, List<SkillsList> skillslists, int level, String phone, String experience, String baselocation, String preferedloaction, boolean isExternal, float currentctc, float expectedctc, int noticePeriod, String pancard, byte[] resume) {
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