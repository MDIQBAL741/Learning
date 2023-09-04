package candidateproject.details.Candidate.Controller;

import candidateproject.details.Candidate.Dto.CandidateRegistrationDto;
import candidateproject.details.Candidate.Entity.CandidateRegistration;
import candidateproject.details.Candidate.Services.CandidateServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CandidateController {
    @Autowired
    CandidateServices candidateServices;

    @PostMapping("/addcandidate")
    public ResponseEntity<CandidateRegistration> addCandidate(@Valid @RequestBody CandidateRegistrationDto candidateRegistrationDto){
        return new ResponseEntity<>(candidateServices.addCandidate(candidateRegistrationDto),HttpStatus.CREATED);
    }

    @GetMapping("/candidate")
    public List<CandidateRegistration> findbyAllCandidate() {
        return candidateServices.getCandidate();
    }
    @GetMapping("/candidate/{candidateId}")
    public CandidateRegistration findbyId(@PathVariable int candidateId){
        return candidateServices.findbyId(candidateId);
    }


    @DeleteMapping("/delete/{candidateId}")
    public String deletebyId(@PathVariable int candidateId)
    {
        return candidateServices.deletebyId(candidateId);
    }
    @PutMapping("/candidateupdate")
    public ResponseEntity<CandidateRegistration> update(@Valid @RequestBody CandidateRegistrationDto candidateRegistrationDto){
        return new ResponseEntity<>(candidateServices.updateCandidate(candidateRegistrationDto),HttpStatus.CREATED);
    }

    @GetMapping("/candidateskills/{skills}")
    public List<CandidateRegistration> get(@PathVariable String skills){
        return candidateServices.findBySkill(skills);
    }

}
