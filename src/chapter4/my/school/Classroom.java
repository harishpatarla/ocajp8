package chapter4.my.school;

/**
 * Created by harish on 8/20/2016.
 */
public class Classroom {
    private int roomNumber;
    protected String teacherName;
    static int globalKey = 54321; // package private
    public int floor = 3;
    Classroom(int r, String t) {
        roomNumber = r;
        teacherName = t;
    }
}
