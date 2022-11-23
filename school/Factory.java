package school;

import java.util.ArrayList;
import java.util.List;

public class Factory {
    public static void main(String[] args) {
        List<ClassRoom> classRooms=new ArrayList<>();
        classRooms.add(new ClassRoom());
        classRooms.add((new ClassRoom()));

        FoodStall foodStall=new FoodStall();

        Liberary liberary=new Liberary();

        List<WashRoom> washRooms=new ArrayList<>();
        washRooms.add(new WashRoom());

        PrincipleRoom principleRoom=new PrincipleRoom();

        SecurityRoom securityRoom=new SecurityRoom();

        SportsRoom sportsRoom=new SportsRoom();

        List<TeacherRoom>teacherRooms=new ArrayList<>();
        teacherRooms.add(new TeacherRoom());

        School school1=new School(classRooms,foodStall,liberary,securityRoom,sportsRoom,teacherRooms,washRooms);

    }

}
