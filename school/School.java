package school;

import java.util.List;

public class School {

        List<ClassRoom> classRooms;
        FoodStall foodStall;
        Liberary liberary;
        SecurityRoom securityRoom;
        SportsRoom sportsRoom;
        List<TeacherRoom> teacherRooms;
        List<WashRoom> washRoom;

        public School(List<ClassRoom> classRooms,FoodStall foodStall,Liberary liberary,
                      SecurityRoom securityRoom,SportsRoom sportsRoom,
        List<TeacherRoom> teacherRooms,List<WashRoom> washRoom){
            this.foodStall= foodStall;
            this.classRooms=classRooms;
            this.liberary=liberary;
            this.securityRoom=securityRoom;
            this.sportsRoom=sportsRoom;
            this.teacherRooms=teacherRooms;
            this.washRoom=washRoom;

        }

        public void open() {
            System.out.println("School open");
        }

    }



