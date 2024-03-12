package com.example.CrickInformer.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.CrickInformer.Entity.Match;
import com.example.CrickInformer.Service.MatchService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class MatchController {
    @Autowired
    private MatchService matchService;

@GetMapping("/")
    public ResponseEntity<List<Match>>getAllMatches(){
        return new ResponseEntity<>(this.matchService.getAllMatches(),HttpStatus.OK);
    }

@GetMapping("/live")
public ResponseEntity<List<Match>> getLiveMatches() {
    return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
}

@GetMapping("/point-table")
public ResponseEntity<?> getPointsTable() {
    return new ResponseEntity<>(this.matchService.getPointsTable(), HttpStatus.OK);
}
}
