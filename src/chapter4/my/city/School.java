package chapter4.my.city;

import chapter4.my.school.Classroom;

/**
 * Created by harish on 8/20/2016.
 */
// checks for accessibility of a package private variable
public class School {
    public static void main(String[] args) {
        //System.out.println(Classroom.globalKey); // does not compile because it is package private
        //Classroom classroom = new Classroom(101, ""Mrs. asnd");
        /*System.out.println(classroom.floor); // it compiles, because floor in public in Classroom.
        System.out.println(classroom.roomNumber); // does not compile
        System.out.println(classroom.teacherName);*/ // does not compile
    }
}
