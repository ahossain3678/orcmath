package guiPlayer;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;

public class TVStars extends Component {

	private String name;
	private String show;
	private String network;
	
	public TVStars(String name, String network,String show) {
		super(40, 40, 50, 40);
		this.name = name;
		this.network = network;
		this.show = show;
//		addSequence("resources/pika.png", 150, 20, 80, 50, 40, 5);
//		Thread animation = new Thread(this);
//		animation.start();
		update();
	}

	@Override
	public void update(Graphics2D g) {
//		super.update(g);
//		g.setColor(Color.orange);
//		g.fillRect(0, 0, getWidth(), getHeight());

	}
	public String toString() {
		return name + " " + network + " " + show;
		
	}

}
