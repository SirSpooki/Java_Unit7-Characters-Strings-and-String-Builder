public class Game {
    private Team team1;
    private Team team2;
    private String time;

    public Game(Team t1, Team t2, String time) {
        team1 = t1;
        team2 = t2; 
        if(!t1.getSport().equals(t2.getSport())) { time = "Game cancelled!"; }
        this.time = time;

    }

    public Team getTeam1() {
        return team1;
    }
    public Team getTeam2() {
        return team2;
    }
    public String getTime() {
        return time;
    }
     public static void main(String args[]) {
        Team t1 = new Team("Team1", "Basketball", "Mascot1");
        Team t2 = new Team("Team2", "Cricket", "Mascot2");
        
        Game g = new Game(t1, t2, "Jul 13, 2019");
}
}
