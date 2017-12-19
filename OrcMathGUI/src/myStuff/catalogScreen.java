package myStuff;

import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class catalogScreen extends FullFunctionScreen{

	private TextField title;
	private Button add;
	
	public catalogScreen(int width, int height) {
		super(width,height);
	}

	public static void main(String[] args) {
		

	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		title = new TextField(40,40,200,30,"Blood","GORE");
		viewObjects.add(title);
		title = new TextField(100,100,200,90,"Unicorns","Animals");
		viewObjects.add(title);
		add = new Button(70,150,100,200,"Click here To win",new Action() {
			
			@Override
			public void act() {
				title.setText("L");
			}
		});
		viewObjects.add(add);
		
	}


}
