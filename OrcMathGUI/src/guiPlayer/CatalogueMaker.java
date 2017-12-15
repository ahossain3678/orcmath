package guiPlayer;

import java.util.ArrayList;
import java.util.Scanner;

public class CatalogueMaker {
	
	private ArrayList<TVStars> list;
	
	public CatalogueMaker() {
		list = new ArrayList<TVStars>();
		list.add(new TVStars("Bella Thorne","Disney","Shake"));
		list.add(new TVStars("Miranda Cosgrove","Nick","iCarly"));
		list.add(new TVStars("Dylan Sprouse","Nick","Suite"));
	}

	public static void main(String[] args) {
		CatalogueMaker c = new CatalogueMaker();
		System.out.println(c.getCSVContent());
		Scanner in = new Scanner(System.in);
		while(in.nextLine() != "stop") {
		System.out.println("Name?");
		String name = in.nextLine();
		System.out.println("Network?");
		String network = in.nextLine();
		System.out.println("Show?");
		String show = in.nextLine();
		c.addNewItem(name,network,show);
		}
	}
	public String getCSVContent() {
		String data = "name, network, show\n";
		for(TVStars t:list) {
			data += t + "\n";
		}
		return data;
	}
	public void addNewItem(String name, String network, String show) {
		list.add(new TVStars(name,network,show));
		System.out.println("Item added successfully");
	}
}
