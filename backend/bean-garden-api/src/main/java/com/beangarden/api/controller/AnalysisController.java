package com.beangarden.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api")
public class AnalysisController {

    @PostMapping("/upload")
    public ResponseEntity<?> upload(MultipartFile file) {
        // TODO
        return ResponseEntity.ok("uploaded");
    }

    @GetMapping("/analyze")
    public ResponseEntity<?> analysis(@RequestParam String path) {
        // TODO
        return ResponseEntity.ok("analyzed");
    }
}
