package src.com.magdalena;

import java.io.Serializable;
import java.util.*;

/**
 * Created by Magdalena on 2017-04-07.
 */
public class Competition{

    /**
     * Nazwa zawodów
     */
    private String name;

    /**
     * Numer zawodów
     */
    private String competitionNumber;

    /**
     * Data zawodów
     */
    private Date date;

    private HashSet<Contestant> contestantsInComp = new HashSet<>();



    public Competition(Date date, String name, String competitionNumber) {
        this.date = date;
        this.name = name;
        this.competitionNumber = competitionNumber;
    }

    public void setContestant(Contestant contestant) throws Exception {
        if(contestantsInComp.contains(contestant)){
            throw new Exception("Ten zawodnik już bierze udział w zawodach");
        }
        contestantsInComp.add(contestant);
        contestant.setCompetition(this);
    }


    public String getName() {
        return name;
    }

    public String getCompetitionNumber() {
        return competitionNumber;
    }
}
