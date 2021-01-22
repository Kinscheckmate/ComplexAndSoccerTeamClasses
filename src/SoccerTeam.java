import java.sql.SQLOutput;

public class SoccerTeam {
    private int wins;
    private int losses;
    private int ties;
    private static int gamesPlayed = 0;
    private static int totalGoals = 0;
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    public SoccerTeam(int w, int l, int t){
        wins = w;
        losses = l;
        ties = t;
    }
    public SoccerTeam(){
        this(0,0,0);
    }

    public void played(SoccerTeam other, int myScore, int otherScore){
        if (myScore > otherScore) {
            this.wins++;
            other.losses++;
        }
        else if (myScore < otherScore) {
            this.losses++;
            other.wins++;
        }
        else if (myScore == otherScore) {
            this.ties++;
            other.ties++;
        }
        totalGoals = totalGoals + myScore + otherScore;
        gamesPlayed++;
    }

    public int getGamesPlayed() { return gamesPlayed;}
    public int getTotalGoals() {return totalGoals;}
    public int getPoints() { return wins*3 + ties; }

    public void reset() {
        wins = 0;
        losses = 0;
        ties = 0;
    }

    public static void StartTournament() {
        gamesPlayed = 0;
        totalGoals = 0;
    }

    public static void main(String args[]){
        StartTournament();
        SoccerTeam BlueBees = new SoccerTeam(0,0,0);
        SoccerTeam GraniteShoes = new SoccerTeam(0, 0, 0);
        SoccerTeam ThreeSocks = new SoccerTeam(0,0,0);
        SoccerTeam UnitedPeoplesTeam = new SoccerTeam(0,0,0);

        BlueBees.played(GraniteShoes, 2, 7);
        ThreeSocks.played(UnitedPeoplesTeam, 4, 4);
        BlueBees.played(UnitedPeoplesTeam, 3, 8);
        ThreeSocks.played(GraniteShoes, 1, 4);
        GraniteShoes.played(UnitedPeoplesTeam, 5, 4);
        System.out.println("\u001B[33mTournament 1");
        System.out.println(ANSI_BLUE + "Blue Bees got " + BlueBees.getPoints()+ " points." + ANSI_RESET);
        System.out.println("\u001B[31mGranite Shoes got " + GraniteShoes.getPoints() + " points.");
        System.out.println("\u001B[35mThree Socks got " + ThreeSocks.getPoints() + " points.");
        System.out.println("\u001B[32mUnited Peoples Team " + UnitedPeoplesTeam.getPoints() + " points." + "\u001B[0m");
        System.out.println("Total Number of Games: "+ gamesPlayed);
        System.out.println("Total Number of Goals: " + totalGoals);

        StartTournament();
        BlueBees.reset();
        ThreeSocks.reset();
        GraniteShoes.reset();
        UnitedPeoplesTeam.reset();
        BlueBees.played(GraniteShoes, 7, 7);
        ThreeSocks.played(UnitedPeoplesTeam, 1, 2);
        BlueBees.played(UnitedPeoplesTeam, 8, 5);
        ThreeSocks.played(GraniteShoes, 4, 4);
        GraniteShoes.played(UnitedPeoplesTeam, 10, 1);
        System.out.println("\n\u001B[33mTournament 2: Electric Boogaloo");
        System.out.println(ANSI_BLUE + "Blue Bees got " + BlueBees.getPoints()+ " points." + ANSI_RESET);
        System.out.println("\u001B[31mGranite Shoes got " + GraniteShoes.getPoints() + " points.");
        System.out.println("\u001B[35mThree Socks got " + ThreeSocks.getPoints() + " points.");
        System.out.println("\u001B[32mUnited Peoples Team " + UnitedPeoplesTeam.getPoints() + " points." + "\u001B[0m");
        System.out.println("Total Number of Games: "+ gamesPlayed);
        System.out.println("Total Number of Goals: " + totalGoals);
    }
}
