package playlist;

import java.util.LinkedList;
import java.util.Queue;

public class JukeboxPlayer {

public static void main(String[] args) {
        
    	try{
    		String studentPlaylistRequested ="";                                
    	    Queue<PlayableSong> playlist = new LinkedList<PlayableSong>();		
    		Jukebox jukebox = new Jukebox();          							
			CommandManager cm=new CommandManager();   							
			
			while(true){
				cm.printMainMenu();                                     		
				String command = cm.getCommand();                       		
				if(command.toLowerCase().equals("quit"))                		
					break;                                              		 
				studentPlaylistRequested = cm.parseCommand(command);    	
			
    		
				playlist = jukebox.play(studentPlaylistRequested);              
				int playlistSize = playlist.size();								
				for (int i = 0; i < playlistSize; i++) {		                
					jukebox.playNext();                                     	
				}
			}
    	}catch(Exception e){
			System.out.println("Oops!! Something went wrong. Please try again!!");
			//e.printStackTrace();
		}  
    }
}
