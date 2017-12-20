package guiPlayer;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Date;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;

public class CDs extends AnimatedComponent 
{
	private String name;
	private String artist;

	public CDs(String name,String artist)
	{
		super(0,0,300,300);
		this.name = name;
		this.artist = artist;
	}

	public String toString()
	{
		return name + "," + artist + "," ;
	}
	
	

}