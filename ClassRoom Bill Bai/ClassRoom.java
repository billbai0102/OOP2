/**
 * The "ClassRoom" class for the CrazyObjects problem. It has a course field which stores the classrooms course, and a
 * teacher field which stores the teacher name. It has a constructor which sets the course and teacher, enter() which
 * returns a boolean value that represents whether the student can enter, or prints a message as to why they can't. It
 * also has a toString() method that prints the classroom information.
 *
 * @author Bill Bai
 * @version 1 2019.04.23
 * @date 2019.04.20
 */
public class ClassRoom {
    String course;
    String teacher;

    /**
     * Constructs a ClassRoom object.
     *
     * @param course  ClassRoom's course.
     * @param teacher ClassRoom's teacher.
     */
    public ClassRoom(String course, String teacher) {
        this.course = course;
        this.teacher = teacher;
    }

    /**
     * Returns a boolean based on whether the student is able to enter or not, given their current state. It will
     * print a message if they are rejected.
     *
     * @param me The Student to enter the class.
     * @return A boolean on whether the student is able to enter.
     */
    public Boolean enter(Student me) {
        System.out.println("Student " + me + " came into class " + course + ", of " + teacher + "\n");
        if (me.myLocker == null) {
            me.sentToOffice("Do not have a locker");
            return false;
        }
        if (me.myJacket != null) {
            me.myLocker.putJacket(me.myJacket);
            me.myJacket = null;
            return false;
        }
        for (int x = 0; x < me.books.length; x++)
            if (me.books[x] != null) {
                if (me.books[x].course.equals(this.course)) {
                    return true;
                }
            }
        me.sentToOffice("Do not have the correct book");
        return false;
    }

    /**
     * Prints the ClassRoom's information.
     *
     * @return The ClassRoom information.
     */
    public String toString() {
        return course + " taught by the amazing " + teacher;
    }
}
