/**
 * The "VirtualSchool" class for the CrazyObjects problem. It only contains a driver class.
 *
 * @author Bill Bai
 * @version 1 2019.04.23
 * @date 2019.04.20
 */
public class VirtualSchool {

    /**
     * Demo test driver for Crazy Objects.
     */
    public static void main(String[] args) {
        //Create new Student, BIll Bai
        Student student = new Student("Bill Bai");
        //Create new Classroom, ICS4UO taught by Ms.Krasteva
        ClassRoom classRoom = new ClassRoom("ICS4UO", "Ms.Krasteva");
        System.out.println("Welcome to " + classRoom + "\n");
        //Create new Book for ICS
        Book ICSTextBook = new Book();
        ICSTextBook.setCourse("ICS4UO");
        ICSTextBook.setTitle("Advanced Placement - Introduction to Computer Science");
        //Create new Book for Science
        Book scienceTextBook = new Book();
        scienceTextBook.setCourse("SNC2D3");
        scienceTextBook.setTitle("Grade 10 Science");
        //Create new Book for gym
        Book gymTextBook = new Book();
        gymTextBook.setCourse("GYM2D3");
        gymTextBook.setTitle("Gym is Fun!");
        //Put all 3 books in locker
        student.myLocker.putABook(ICSTextBook);
        student.myLocker.putABook(scienceTextBook);
        student.myLocker.putABook(gymTextBook);
        //Take ICS Book out of locker
        student.books[0] = student.myLocker.getABook("ICS4UO");
        System.out.println(student + " visited " + student.myLocker + "\n");
        System.out.println(student + " took " + student.books[0] + " from their locker. \n");
        //Put the jacket into locker
        student.myLocker.putJacket(student.myJacket);
        System.out.println(student + " put " + student.myLocker.checkJacket() + " into " + student.myLocker + "\n");
        //Enter classroom
        if (classRoom.enter(student))
            System.out.println(student + " was allowed into class \n");
        else
            System.out.println(student + " was not allowed into class \n");
        //Put jacket back on
        student.myJacket = student.myLocker.getJacket();
        System.out.println(student + " took their jacket from their locker\n");
        //Enter classroom
        if (classRoom.enter(student))
            System.out.println(student + " was allowed into class \n");
        else
            System.out.println(student + " was not allowed into class \n");
        //Create new Student, Ryan
        Student ryan = new Student("Ryan");
        //Assign locker to Ryan
        student.myLocker.assignOwner(ryan);
        System.out.println(student + " lost their locker to " + ryan + "\n");
        //Try to enter classroom.
        classRoom.enter(student);
    }
} // VirtualSchool class

