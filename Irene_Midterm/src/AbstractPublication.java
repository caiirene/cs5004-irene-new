/**
 * This Class provides fields/methods shared by all kinds of Publications
 */
public abstract class AbstractPublication implements Publication {
  // Fields shared by all Publications
  protected String title;
  protected Person author;
  protected int year;
  protected double price;

  /**
   * Gets the title of this publication
   * <p>
   * @return String, representing the title of this publication
   */
  @Override
  public String getTitle() {
    return this.title;
  }

  /**
   * Gets the publication year of this publication
   * <p>
   * @return int, representing the year this was published
   */
   @Override
  public int getYear() {
    return this.year;
  }

  /**
   * Return the author of this publication on
   * <p>
   * @return the author, a person
   */
  @Override
  public Person getAuthor() {
    return this.author;
  }

  /**
   * Return the price of this publication
   *
   * @return double, representing the price of this publication in US dollars
   */
  @Override
  public double getPrice() {
    return this.price;
  }

  /**
   * Shared method for returning the kind of publication as a String
   * <p>
   * This method is inherited by all subclasses of Abstract Publication
   * It is marked final since it should not be overridden
   * @return String, based on the name of the subClass
   */
  @Override
  public final String getKind() {
    return this.getClass().getName() ;
  }


  @Override
  public boolean sameAuthor(Publication other) {
    // Get the two authors and hand to equals
    Person author1 = this.getAuthor();
    // FLAW? suggest to use author or this.author, but it's ok to use getAuthor()
    Person author2 = other.getAuthor();
    return author1.equals(author2);
  }
}
