package com.select.Selection.Services;

import com.select.Selection.Dao.CandidateRepository;
import com.select.Selection.Entity.Candidate;
import com.select.Selection.util.ResumeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.print.Doc;
import java.io.IOException;
import java.util.List;

@Service
public class CandidateServices {
    @Autowired
    private CandidateRepository candidateRepository;

    public Candidate adCandidate(Candidate candidate){

        return candidateRepository.save(candidate);
    }

    public List<Candidate> getCandidate() {
        return candidateRepository.findAll();
    }
    public Candidate getCandidatebySkills(String skills) {
        return candidateRepository.findByskills(skills);
    }
    public Candidate getCandidateById(int id) {
        return candidateRepository.findById(id).orElse(null);
    }
    public Candidate updateCandidate(Candidate candidate) {
       Candidate existing= candidateRepository.findById(candidate.getId()).orElse(null);
       existing.setName(candidate.getName());
       existing.setEmail(candidate.getEmail());
       existing.setPhnoe(candidate.getPhnoe());
       existing.setSkills(candidate.getSkills());
       existing.setAbout(candidate.getAbout());
       existing.setStatus(candidate.getStatus());
       return candidateRepository.save(existing);
    }

    public String deleteProduct(int id) {
        candidateRepository.deleteById(id);
        return "candidate removes" +id;
    }


//    public String uploadImage(MultipartFile file) throws IOException {
//
//        Candidate candidate = candidateRepository.save(Candidate.builder()
//                .resume(ResumeUtil.compressImage(file.getBytes())).build());
//        if (candidate.getResume() != null) {
//            return "file uploaded successfully : " + file.getOriginalFilename();
//        }
//        return null;
//    }

    public Candidate saveFile(MultipartFile file)  {


        Candidate doc = null;
        try {
            doc = new Candidate(file.getOriginalFilename(),file.getContentType(),file.getBytes());
            return candidateRepository.save(doc);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return null;

    }
}

