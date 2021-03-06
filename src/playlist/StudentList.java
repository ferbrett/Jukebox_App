package playlist;

import studentPlaylists.*;
import java.util.ArrayList;
import java.util.List;

public class StudentList {

	public StudentList(){
	}

	public List<String> getStudentsNames() {
		ArrayList<String> studentNames = new ArrayList<String>();
		
		String StudentName1 = "TestStudent1Name";
		studentNames.add(StudentName1);
		
		String StudentName2 = "TestStudent2Name";
		studentNames.add(StudentName2);
		
		String BrettFerguson = "Brett Ferguson";
		studentNames.add(BrettFerguson);
		
		//Add AngelaRuhstorfer new student profile to StudentList
		String AngelaRuhstorfer = "Angela Ruhstorfer";
		studentNames.add(AngelaRuhstorfer);
		
		return studentNames;
	}

	public Student GetStudentProfile(String student){
		Student emptyStudent = null;
	
		switch(student) {
		   case "TestStudent1_Playlist":
			   TestStudent1_Playlist testStudent1Playlist = new TestStudent1_Playlist();
			   Student TestStudent1 = new Student("TestStudent1", testStudent1Playlist.StudentPlaylist());
			   return TestStudent1;
			   
		   case "TestStudent2_Playlist":
			   TestStudent2_Playlist testStudent2Playlist = new TestStudent2_Playlist();
			   Student TestStudent2 = new Student("TestStudent2", testStudent2Playlist.StudentPlaylist());
			   return TestStudent2;
		   case "BrettFerguson_Playlist":
			   BrettFerguson_Playlist brettFergusonPlaylist = new BrettFerguson_Playlist();
			   Student BrettFerguson_Playlist = new Student("BrettFerguson_Playlist", brettFergusonPlaylist.StudentPlaylist());
			   return BrettFerguson_Playlist;
		}
		return emptyStudent;
	}
}
