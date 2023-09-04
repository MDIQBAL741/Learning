package candidateproject.details.Candidate.Services;

import candidateproject.details.Candidate.Dto.CandidateRegistrationDto;
import candidateproject.details.Candidate.Entity.CandidateRegistration;
import candidateproject.details.Candidate.Repository.CandidateRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CandidateServices {
    @Autowired
    CandidateRepo candidateRepo;
    @Autowired
    private ModelMapper modelMapper;


    public CandidateRegistration addCandidate(CandidateRegistrationDto candidateRegistrationDto) {
        CandidateRegistration candidate = modelMapper.map(candidateRegistrationDto, CandidateRegistration.class);
        return candidateRepo.save(candidate);
    }


    public CandidateRegistration findbyId(int candidateId) {
        return candidateRepo.findById(candidateId).orElse(null);
    }


    public String deletebyId(int candidateId) {
        candidateRepo.deleteById(candidateId);
        return "removed id " + candidateId;
    }

    public CandidateRegistration updateCandidate(CandidateRegistrationDto candidateRegistrationDto) {
        CandidateRegistration candidate = modelMapper.map(candidateRegistrationDto, CandidateRegistration.class);
        CandidateRegistration existing = candidateRepo.findById(candidate.getCandidateId()).orElse(new CandidateRegistration());
        existing.setName(candidate.getName());
        existing.setEmail(candidate.getEmail());
        existing.setPhone(candidate.getPhone());
        return candidateRepo.save(existing);

    }

    public List<CandidateRegistration> getCandidate() {
        return candidateRepo.findAll();
    }

    public List<CandidateRegistration> findBySkill(String skills) {

        List<CandidateRegistration> candidateRegistrations = candidateRepo.findBySkill(skills);

        return candidateRegistrations;
    }

    //    public CandidateRegistration update(CandidateRegistration candidate){
//        CandidateRegistration updateCandidate=candidateRepo.findById(candidate.getCandidateId()).orElse(null);
//        if(updateCandidate!=null){
//            updateCandidate.setName(candidate.getName());
//            updateCandidate.setPhone(candidate.getPhone());
//            candidateRepo.save(candidate);
//            return updateCandidate;
//        }
//        return null;
//
//    }

}
