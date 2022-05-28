import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	ArrayList<Team> arr=new ArrayList<>();
	Main(){
		create_teams();
	}
	private void create_teams() {
		arr.add(new Team("GT",20,Arrays.asList(true,true,false,false,true)));
		arr.add(new Team("LSG",18,Arrays.asList(true,false,false,true,true)));
		arr.add(new Team("RR",16,Arrays.asList(true,false,true,false,false)));
		arr.add(new Team("DC",14,Arrays.asList(true,true,false,true,false)));
		arr.add(new Team("RCB",14,Arrays.asList(false,true,true,false,false)));
		arr.add(new Team("KKR",12,Arrays.asList(false,true,true,false,true)));
		arr.add(new Team("PBKS",12,Arrays.asList(false,true,false,true,false)));
		arr.add(new Team("SRH",12,Arrays.asList(true,false,false,false,false)));
		arr.add(new Team("CSK",8,Arrays.asList(false,false,true,false,true)));
		arr.add(new Team("MI",6,Arrays.asList(false,true,false,true,true)));
		
	}
	
	public ArrayList<Team> retrive_teams_with_loss(){
		ArrayList<Team> list=new ArrayList<>();
		for(int i=0;i<arr.size();i++) {
			List<Boolean> list1=arr.get(i).getLastFive();
			boolean prev=list1.get(0);
			for(int j=1;j<list1.size();j++) {
				if(prev==false && list1.get(j)==false) {
					if(!list.contains(arr.get(i))) {
					list.add(arr.get(i));
					}
				}
				prev=list1.get(j);
			}
		}
		
	return list;	
	}
	public ArrayList<Team> retrive_teams_with_loss(int n,int a){
		boolean w;
		if(a==1) {
			w=true;
		}else {
			w=false;
		}
		ArrayList<Team> list=new ArrayList<>();
		for(int i=0;i<arr.size();i++) {
			List<Boolean> list1=arr.get(i).getLastFive();
			
			for(int j=0;j<list1.size();j++) {
				int count=0;
				if( list1.get(j)==w) {
					count=1;
					if(j!=list1.size()-1) {
					while(list1.get(j+1)==w) {
						count++;
						j++;
						if(j==list1.size()-1) {
							break;
						}
					}
					}
					if(!list.contains(arr.get(i)) && count>=n) {
						
					list.add(arr.get(i));
					}
				}
			}
		}
		return list;
	}
	
	public double calculate_Avg(ArrayList<Team> ls) {
		double sum=0;
		for(Team b:ls) {
			sum+=b.getPoints();
		}
		return sum/ls.size();
	}
	}
