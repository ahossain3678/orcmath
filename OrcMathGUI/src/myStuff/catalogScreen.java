package myStuff;

import java.util.List;

import guiPlayer.CDs;
import guiPlayer.CatalogMaker;
import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.TextArea;
import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class catalogScreen extends FullFunctionScreen{

	private TextField title;
	private TextField anima;
	private CatalogMaker catalog;
	private Button add;
	private TextArea ta;
	
	public catalogScreen(int width, int height) {
		super(width,height);
	}

	public static void main(String[] args) {
		

	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		catalog = new CatalogMaker();
		title = new TextField(40,40,200,30,"Relapse","Title");
		viewObjects.add(title);
		anima = new TextField(40,100,200,30,"Eminem","Artist");
		viewObjects.add(anima);
		ta = new TextArea(300,150,100,100,"");
		viewObjects.add(ta);
		add = new Button(40,150,100,200,"Add",new Action() {
			
			@Override
			public void act() {
				addButtonClicked();
			}
		});
		viewObjects.add(add);
	}

	protected void addButtonClicked() {
		CDs album = new CDs(title.getText(), anima.getText());
		String s = ta.getText() + album + "\n";
		ta.setText(s);
		catalog.addNewItem(title.getText(),anima.getText());
		title.setText("");
		anima.setText("");
	}
}
