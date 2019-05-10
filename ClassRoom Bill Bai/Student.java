/**
 * The "Student" class for the CrazyObjects problem. It has a number field which is the student number, the student's
 * name, locker, jacket, and books. It contains a constructor that creates the Student object, sentToOffice() which
 * sends the Student to the office with a reason and prints it, and toString() which returns Student information.
 *
 * @author Bill Bai
 * @version 1 2019.04.23
 * @date 2019.04.20
 */
public class Student {
    String number;
    String name;
    Locker myLocker;
    Jacket myJacket;
    Book books[];

    /**
     * Constructor that sets the name, creates a random student number from 1000 to 9999999, sets the students locker
     * and jacket, and creates an empty Book array of 4.
     *
     * @param myName - name of the student
     */
    public Student(String myName) {
        name = myName;
        number = Integer.toString((int) (Math.random() * 10000000) + 1000);
        myLocker = new Locker(this);
        myJacket = new Jacket(this);
        books = new Book[4];
    }

    /**
     * This method gets called when the student is sent to the office
     *
     * @param reason The reason why the student is being sent to the office.
     */
    public void sentToOffice(String reason) {
        System.out.println(this + " was sent to the office because they: " + reason + ".");
    }

    /**
     * Display student information
     *
     * @return Student information.
     */
    public String toString() {
        return name;
    }

} // Student class
