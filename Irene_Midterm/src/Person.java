import java.lang.reflect.Method;
import java.util.Objects;

/**
 * This class represents a Person. A person has a first name, last name and a
 * year of birth. This class is needed for authors of publications, for example.
 */
class Person {
  private String firstName;
  private String lastName;
  private final int yearOfBirth;

  /**
   * Constructs a Person object and initializes it given first name,
   * last name and year of birth
   * <p>
   * @param firstName the first name of this person, a String
   * @param lastName the last name of this person, a String
   * @param yearOfBirth the year of birth of this person, an int
   */
  public Person(String firstName, String lastName, int yearOfBirth) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.yearOfBirth = yearOfBirth;
  }

  /**
   * Gets the first name of this person
   *
   * @return String, the first name of this person
   */
  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  /**
   * Returns the year of birth of this person
   *
   * @return int, representing the year of birth of this person
   */
  public int getYearOfBirth() {
    return this.yearOfBirth;
  }
  
  /**
   Returns a string representation of the person with their first and last name

   @return a formatted string, representing the person's full name
   */
  @Override
  public String toString() {
    return "" + firstName  + " " + lastName;
  }
  
  /**
   * Check if this person equals the person in the argument.
   * <p>
   * @param other The other person to be compared to
   * @return boolean, true iff this person is same as other
   * Two persons are equal iff they have the same first and last names
   * and the same year of birth.
   */
  @Override
  public boolean equals(Object other) {
    // Check if identical
    if (this == other)
      return true;
    // Check if null
    if (other == null)
      return false;
    // Check type compatibility
    if (!(other instanceof Person))
      return false;
    try {
      // Similar to dynamic-language sending a respondsTo: message
      // avoid instanceof; ask if instance can respond to the protocol
      Class<?> method = other.getClass();
      // do calculation
      Person person = (Person) other;
      return this.firstName.equals(person.firstName)
          && this.lastName.equals(person.lastName)
          && this.yearOfBirth == person.yearOfBirth;
    }
    catch(ClassCastException ex) {
      // Not a person_fixed object...can't compare them
      return false;
    }
    //FLAW: suggest to not use instanceof
    //FIXED: first we want to try if the classes are the same, then check equal
    /*
    // Cast to Person type
    Person person_fixed = (Person) other;
    // Compare relevant fields
    return this.firstName.equals(person_fixed.firstName)
        && this.lastName.equals(person_fixed.lastName)
        && this.yearOfBirth == person_fixed.yearOfBirth;

     */
  }

  /**
   * Ensure that equals method honors the contract with hashCode
   * <p>
   * Uses the same fields for hashing that are used for equality
   * @return int, the integer that this Person should hash to
   */
  @Override
  public int hashCode() {
     return Objects.hash(firstName, lastName, yearOfBirth);
  }
}
