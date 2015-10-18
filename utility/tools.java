package utility;


import net.slashie.libjcsi.textcomponents.TextInformBox;

public class tools{
	
	public tools(){
		
	}
	
	public void sendMessage(TextInformBox messenger, String message){
		messenger.addText(message+ " ");
	}
	
}