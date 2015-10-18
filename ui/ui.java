package ui;

import bin.info;
import net.slashie.libjcsi.*;
import net.slashie.libjcsi.wswing.*;
import java.awt.*;


//this class handles UI stuff, like printing messages to various windows, displaying stats, etc
public class ui{
	info ref= new info();
	
	Font gameFont = new Font("Monospaced Plain", 0, 0);
	
	SwingConsoleFrame mainWindow= new SwingConsoleFrame(ref.GAME_NAME);
	SwingConsolePanel gamePanel;
	SwingConsolePanel statsPanel;
	SwingConsolePanel messagePanel;
	
	BorderLayout layout= new BorderLayout();
	
	
	
	
	
	public ui(){
		
	}
	//Okay, so I'm trying to build a UI. I want it to look like this:
	/*
	 * ----------------
	 * |..............|
	 * |...MESSAGES...|
	 * |..............|
	 * |--------------|
	 * |..............|
	 * |.....GAME.....|
	 * |..............|
	 * |--------------|
	 * |..............|
	 * |.....STATS....|
	 * |..............|
	 * ----------------
	 * 
	 * 
	 */
	public void buildGameUI(){
		mainWindow.init(gameFont, 200, 100);
		mainWindow.setLayout(layout);
		statsPanel.init(gameFont, 200, 20);
		messagePanel.init(gameFont, 200, 20);
		gamePanel.init(gameFont, 200, 60);
		mainWindow.add(gamePanel, layout.CENTER);
		mainWindow.add(statsPanel, layout.SOUTH);
		mainWindow.add(messagePanel, layout.NORTH);
	}
	
	//Default message printer. Prints a string. Future versions will generate messages based on entities and their actions.
	public void printGenericMessage(String message){
		
	}
}