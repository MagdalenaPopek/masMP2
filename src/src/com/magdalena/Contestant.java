package src.com.magdalena;

/**
 * Created by Magdalena on 2017-04-21.
 */

//Atrybut asocjacji Person ----- Competition
public class Contestant {

    private static int counter;

    /**
     * Osoba - uczestnik
     */
    Person person;

    /**
     * Zawody
     */
    Competition competition;

    /**
     * Numer zawodnika
     */
    private int contestantNumber;

    public Contestant(Person person, Competition competition) throws Exception {
        this.person = person;
        this.competition = competition;
        this.contestantNumber = counter++;
        this.person.setContestant(this);
        this.competition.setContestant(this);
    }

    public int getContestantNumber() {
        return contestantNumber;
    }

    @Override
    public String toString() {
        return "Uczestnik numer " + contestantNumber +
                ", osoba " + person.getName() + " " + person.getSurname() +
                ", zawody o nazwie " + competition.getName() +
                ", numer " + competition.getCompetitionNumber();
    }

    public void setCompetition(Competition competition) throws Exception {
        if(this.competition != null) {
            throw new Exception("Do tego uczestnika przypisano już zawody");
        }
        this.competition = competition;
        competition.setContestant(this);
    }

    public void setPerson(Person person) throws Exception {
        if(this.person != null) {
            throw new Exception("Do tego uczestnika przypisano już zawody");
        }
        this.person = person;
        person.setContestant(this);
    }
}
