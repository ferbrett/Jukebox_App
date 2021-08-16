package studentPlaylists;

import java.util.ArrayList;
import java.util.LinkedList;

import artist.TobyKieth;
import artist.TomPettyAndTheHeartbreakers;
import playlist.PlayableSong;
import playlist.Song;

public class BrettFerguson_Playlist {

public LinkedList<PlayableSong> StudentPlaylist(){
		
		LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
		ArrayList<Song> tobyKiethTracks = new ArrayList<Song>();
	    TobyKieth tobyKieth = new TobyKieth();
		
	    tobyKiethTracks = tobyKieth.getTobyKiethSongs();
		
		playlist.add(tobyKiethTracks.get(0));
		playlist.add(tobyKiethTracks.get(1));
		playlist.add(tobyKiethTracks.get(2));
		
		TomPettyAndTheHeartbreakers tomPettyAndTheHeartbreakers = new TomPettyAndTheHeartbreakers();
		ArrayList<Song> tomPettyAndTheHeartbreakersTracks = new ArrayList<Song>();
		tomPettyAndTheHeartbreakersTracks = tomPettyAndTheHeartbreakers.getTomPettyAndTheHeartbreakersSongs();
		
		playlist.add(tomPettyAndTheHeartbreakersTracks.get(0));
		playlist.add(tomPettyAndTheHeartbreakersTracks.get(1));
		playlist.add(tomPettyAndTheHeartbreakersTracks.get(2));

		
	    return playlist;
	}
}
