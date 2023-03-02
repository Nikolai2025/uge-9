public class Team{

private String team1;
private int rank;
private String player;


Team(String team1){
	this.team1 = team1;
}

public int setRank(int rank){
	this.rank = rank;
	return rank;
}
@Override
public String toString() {
String s ="Hold: " + team1 + " rang: " + rank;
return s;
}
}

