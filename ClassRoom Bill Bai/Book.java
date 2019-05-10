/**
 * The "Book" class for the CrazyObjects problem. It contains two instance variables - title and course. Title
 * stores the title of the book, course stores the book's course. It has a constructor that creates a generic book,
 * setTitle() which changes the title, setCourse() which changes the course, and toString() which returns the book's
 * information.
 *
 * @author Bill Bai
 * @version 1 2019.04.23
 * @date 2019.04.20
 */
public class Book {
    String title;
    String course;

    /**
     * Constructor creates a generic Book object.
     */
    public Book() {
        title = "Undefined Book";
        course = "Undefined Course";
    }

    /**
     * Changes the Book object's title.
     *
     * @param thisTitle The new title.
     */
    public void setTitle(String thisTitle) {
        title = thisTitle;
    }

    /**
     * Changes the Book object's course.
     *
     * @param thisCourse the new course.
     */
    public void setCourse(String thisCourse) {
        course = thisCourse;
    }

    /**
     * This method returns a String containing the title and course of the Book.
     *
     * @return A String representing the Book.
     */
    public String toString() {
        return title + " for " + course;
    }

} // Book class
