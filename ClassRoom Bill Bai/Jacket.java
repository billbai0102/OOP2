/**
 * The "Jacket" class for the CrazyObjects problem. It has a Student field that stores it's owner. It has a constructor
 * which constructs the object and sets it's owner, and a toString() method.
 *
 * @author Bill Bai
 * @version 1 2019.04.23
 * @date 2019.04.20
 */
public class Jacket
{
    Student owner;

    /**
     * Constructor that assigns ownership.
     */
    public Jacket(Student me)
    {
        owner = me;
    }

    /**
     * Returns the Jacket's owner's name.
     *
     * @return The Jacket information.
     */
    public String toString(){
        return owner + "'s jacket";
    }

} // Jacket class
