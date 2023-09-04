package candidateproject.details.Candidate.Repository;

import candidateproject.details.Candidate.Entity.CandidateRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CandidateRepo extends JpaRepository<CandidateRegistration,Integer> {

    @Query(value = "select * from candidate where candidate_id in (select candidate_id from skills_table where skills = ?1)",
            nativeQuery = true)
    public List<CandidateRegistration> findBySkill(String skills);


}
