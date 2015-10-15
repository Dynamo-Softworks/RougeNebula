import net.slashie.libjcsi.wswing.WSwingConsoleInterface;
import net.slashie.libjcsi.CharKey;
import net.slashie.libjcsi.ConsoleSystemInterface;
import net.slashie.libjcsi.CSIColor;

import java.util.Properties;

import entity.*;
import item.*;



public class engine{
	public static void main(String [] args){
		ConsoleSystemInterface csi = null;
		
		entity player;
		player= new entity('@');
		player.setName("Dynamos");
		player.setTag("PC");
		//player.changeColor("AZURE");
		
		playerController controller= new playerController(player);
		
		Properties text = new Properties();
		text.setProperty("fontSize","20");
		text.setProperty("font", "Courier");
		
		
		try{
				csi = new WSwingConsoleInterface("RougeNebula", text);
		}
		catch (ExceptionInInitializerError eiie) {
			System.out.println("*** Error: Swing Console Box cannot be initialized. Exiting...");
			eiie.printStackTrace();
			System.exit(-1);
		}
		csi.print(34, 12, "RougeNebula", CSIColor.CERULEAN_BLUE);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(controller.isQuit()!=true){
			csi.cls();
			csi.print(player.getX(), player.getY(), player.getType(), CSIColor.WHITE);
			csi.refresh();
			controller.movePupet(csi);
			
		}
		csi.cls();
		System.exit(1);
	}

}

