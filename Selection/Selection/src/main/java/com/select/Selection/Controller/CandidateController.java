package com.select.Selection.Controller;
import com.select.Selection.Entity.Candidate;
import com.select.Selection.Services.CandidateServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
public class CandidateController {
    @Autowired
    private CandidateServices candidateServices;

    @PostMapping("/add")
    public Candidate addCandidate(@RequestBody Candidate candidate) {
        System.out.println("candidate details" + candidate.toString());
        return candidateServices.adCandidate(candidate);
    }

    @GetMapping("/candidate")
    public List<Candidate> findbyAllCandidate() {
        return candidateServices.getCandidate();
    }

    @GetMapping("/candidate/{skills}")
    public Candidate findCandidatebySkills(@PathVariable String skills) {
        return candidateServices.getCandidatebySkills(skills);
    }

    @GetMapping("/searchbyId/{id}")
    public Candidate findById(@PathVariable int id) {
        return candidateServices.getCandidateById(id);
    }

    @PutMapping("/update")
    public Candidate updateCandidate(@RequestBody Candidate candidate) {
        return candidateServices.updateCandidate(candidate);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCandidate(@PathVariable int id) {
        return candidateServices.deleteProduct(id);
    }

//    @PostMapping("/image")
//    public ResponseEntity<?> uploadImage(@RequestParam("image") MultipartFile file) throws IOException {
//        String uploadImage = candidateServices.uploadImage(file);
//        return ResponseEntity.status(HttpStatus.OK)
//                .body(uploadImage);
//    }

    //    @PostMapping("/upload"
//    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file){
//        System.out.println(file.getName());
//        System.out.println(file.getOriginalFilename());
//        System.out.println(file.getSize());
//        return ResponseEntity.ok("working");
//    }
    @PostMapping("/uploadFiles")
    public String uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) throws IOException {
        for (MultipartFile file : files) {
            candidateServices.saveFile(file);

        }
        return "redirect:/";


    }
}

