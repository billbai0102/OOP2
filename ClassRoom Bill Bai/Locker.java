/**
 * The "Locker" class for the CrazyObjects problem. It has a number field which stores it's number, a Student field to
 * hold it's owner, a Jacket field to hold a Jacket, and a Book array to hold 4 books. It has a constructor which
 * initializes its fields, getABook() which returns a specific book, putABook() which places a book in the locker,
 * getJacket() which returns the Jacket inside, checkJacket() which returns the Jacket, putJacket() which places a
 * Jacket inside the locker, assignOwner which reassigns ownership, and toString().
 *
 * @author Bill Bai
 * @version 1 2019.04.23
 * @date 2019.04.20
 */
public class Locker {
    int number;
    Student owner;
    private Jacket studentJacket;
    private Book books[];

    /**
     * Assigns the owner to me, creates a number between 0-3999 for the locker number, creates an array of 4 null books,
     * and initializes studentJacket to null.
     */
    public Locker(Student me) {
        owner = me;
        number = (int) (Math.random() * 4000);
        books = new Book[4];
        studentJacket = null;
    }

    /**
     * Returns a specified Book object.
     *
     * @param course The Book's course.
     * @return The specified Book.
     */
    public Book getABook(String course) {
        for (int x = 0; x < books.length; x++) {
            Book temp = books[x];
            if (temp.course.equals(course)) {
                books[x] = null;
                return temp;
            }
        }
        return null;
    }

    /**
     * Places a book in the Locker if there is space. Will return an exception if full.
     *
     * @param book The Book to be placed inside.
     */
    public void putABook(Book book) {
        for (int x = 0; x < books.length; x++)
            if (books[x] == null) {
                books[x] = book;
                return;
            }
        throw new IllegalArgumentException("Locker already full of books");
    }

    /**
     * Returns the Jacket inside the locker. Will throw an exception if there is no Jacket inside.
     *
     * @return The Jacket inside.
     */
    public Jacket getJacket() {
        Jacket temp = studentJacket;
        if (studentJacket == null)
            throw new IllegalArgumentException("There is no jacket");
        else {
            studentJacket = null;
            return temp;
        }
    }


    /**
     * Returns a Jacket object.
     *
     * @return The Jacket to be returned.
     */
    public Jacket checkJacket() {
        return studentJacket;
    }

    /**
     * Places the Jacket inside the locker, takes it from the Student. Will throw an exception if there is already
     * a Jacket inside.
     *
     * @param jacket The Jacket to be placed inside the Locker.
     */
    public void putJacket(Jacket jacket) {
        jacket.owner.myJacket = null; //remove the jacket from student
        if (studentJacket == null)
            studentJacket = jacket; //put the jacket in locker
        else
            throw new IllegalArgumentException("Jacket is already inside locker");
    }

    /**
     * Reassigns ownership of the Locker.
     *
     * @param me The new Student owner.
     */
    public void assignOwner(Student me) {
        owner.myLocker = null;
        owner = me;
    }

    /**
     * Returns the Locker's information.
     * @return The Locker's information in a String.
     */
    public String toString() {
        return owner + "'s locker, " + number;
    }

} // Locker class
