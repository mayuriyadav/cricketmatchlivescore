package com.example.CrickInformer.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "crick_match")
@Setter
@Getter
@NoArgsConstructor
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;

    private String teamHeading;
    private String matchNumberVenue;

    private String battingTeam;

    private String battingTeamScore;

    private String bowlTeam;
    private String bowlTeamScore;

    private String liveText;

    private String matchLink;

    private String textComplete;

    @Enumerated
    private MatchStatus status;
    private Date date = new Date();
    
    public Match(int matchId, String teamHeading, String matchNumberVenue, String battingTeam, String battingTeamScore,
            String bowlTeam, String liveText, String matchLink, String textComplete, MatchStatus status, Date date) {
        this.matchId = matchId;
        this.teamHeading = teamHeading;
        this.matchNumberVenue = matchNumberVenue;
        this.battingTeam = battingTeam;
        this.battingTeamScore = battingTeamScore;
        this.bowlTeam = bowlTeam;
        this.liveText = liveText;
        this.matchLink = matchLink;
        this.textComplete = textComplete;
        this.status = status;
        this.date = date;
    }
// set the match status according to textComplete

              public void setMatchStatus(){
                if(textComplete.trim().isBlank()){
                    this.status= MatchStatus.LIVE;
                }else{
                    this.status = MatchStatus.COMPLETED;
                }
              }
}
