import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		
		Main m=new Main();
		System.out.println("teams with 2 consecutive loss");
	ArrayList<Team> list =	m.retrive_teams_with_loss();
		list.forEach(x->System.out.println(x.getName()));
		System.out.println("Teams with n consecutive loss /Win");
		ArrayList<Team> list1 =	m.retrive_teams_with_loss(2,3);  //first argument is for Consecutive wins or losses and second argument is just wi or loss,for win pass 1 and for loss pass anything 
		list1.forEach(x->System.out.println(x.getName()));
		System.out.println("Average of Filtered teams");
		
		System.out.println(m.calculate_Avg(list1));
	}

}
