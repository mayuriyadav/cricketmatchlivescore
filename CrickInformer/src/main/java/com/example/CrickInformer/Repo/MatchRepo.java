package com.example.CrickInformer.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CrickInformer.Entity.Match;
import java.util.Optional;


public interface MatchRepo extends JpaRepository<Match,Integer> {
    
    Optional<Match> findByTeamHeading(String teamHeading);
}
