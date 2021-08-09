package tests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import artist.*;
import playlist.Song;

public class JukeboxTest {

	@Test
	public void testGetBeatlesAlbumSize() throws NoSuchFieldException, SecurityException {
		 TheBeatles theBeatlesBand = new TheBeatles();
		 ArrayList<Song> beatlesTracks = new ArrayList<Song>();
		 beatlesTracks = theBeatlesBand.getBeatlesSongs();
		 assertEquals(3, beatlesTracks.size());
	}
	
	@Test
	public void testGetImagineDragonsAlbumSize() throws NoSuchFieldException, SecurityException {
		 ImagineDragons imagineDragons = new ImagineDragons();
		 ArrayList<Song> imagineDragonsTracks = new ArrayList<Song>();
		 imagineDragonsTracks = imagineDragons.getImagineDragonsSongs();
		 assertEquals(3, imagineDragonsTracks.size());
	}
	
	@Test
	public void testGetAdelesAlbumSize() throws NoSuchFieldException, SecurityException {
		 Adele adele = new Adele();
		 ArrayList<Song> adelesTracks = new ArrayList<Song>();
		 adelesTracks = adele.getAdelesSongs();
		 assertEquals(3, adelesTracks.size());
	}
	
	@Test
	public void testGetPinkFloydsAlbumSize() throws NoSuchFieldException, SecurityException {
		 PinkFloyd pinkFloyd = new PinkFloyd();
		 ArrayList<Song> PinkFloydsTracks = new ArrayList<Song>();
		 PinkFloydsTracks = pinkFloyd.getPinkFloydsSongs();
		 assertEquals(3, PinkFloydsTracks.size());
	}
	
	@Test
	public void testGetTechN9nesAlbumSize() throws NoSuchFieldException, SecurityException {
		 TechN9ne techN9ne = new TechN9ne();
		 ArrayList<Song> TechN9nesTracks = new ArrayList<Song>();
		 TechN9nesTracks = techN9ne.getTechN9nesSongs();
		 assertEquals(4, TechN9nesTracks.size());
	}

	@Test
	// Test to ensure getArianaGrandeSongs array works and ArianaGrande.java class songs are displayed
	public void testGetArianaGrandeAlbumSize() throws NoSuchFieldException, SecurityException {
		 ArianaGrande arianaGrande = new ArianaGrande();
		 ArrayList<Song> arianaGrandeTracks = new ArrayList<Song>();
		 arianaGrandeTracks = arianaGrande.getArianaGrandeSongs();
		 assertEquals(2, arianaGrandeTracks.size());
	}
	
	@Test
	// Test to ensure getDanceGavinDanceSongs array works and DanceGavinDance.java class songs are displayed
	public void testGetDanceGavinDanceAlbumSize() throws NoSuchFieldException, SecurityException {
		 DanceGavinDance danceGavinDance = new DanceGavinDance();
		 ArrayList<Song> danceGavinDanceTracks = new ArrayList<Song>();
		 danceGavinDanceTracks = danceGavinDance.getDanceGavinDanceSongs();
		 assertEquals(3, danceGavinDanceTracks.size());
	}
}
