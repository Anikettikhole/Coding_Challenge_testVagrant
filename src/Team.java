import java.util.ArrayList;
import java.util.List;

public class Team {
	private String name;
	private int points;
	private List<Boolean> lastFive;
	public Team(String name, int points,List<Boolean> lastFive) {
		super();
		this.name = name;
		this.lastFive=lastFive;
		this.points = points;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public List<Boolean> getLastFive() {
		return lastFive;
	}
	public void setLastFive(ArrayList<Boolean> lastFive) {
		this.lastFive = lastFive;
	}
	
}
