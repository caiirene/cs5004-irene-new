import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PawnTest {

  /**
   * test getRow method,
   * it should return correct int about the readding on x-aixs of a piece
   */
  @Test
  public void getRow() {
    ChessPiece test_1 = new Pawn(2,0, BorW.WHITE);
    ChessPiece test_2 = new Pawn(5,7, BorW.BLACK);
    assertEquals(2,test_1.getRow());
    assertEquals(5,test_2.getRow());
  }

  /**
   * test getColoum method,
   * it should return correct int about the readding on y-aixs of a piece
   */
  @Test
  public void getColoum() {
    ChessPiece test_1 = new Pawn(2,0, BorW.WHITE);
    ChessPiece test_2 = new Pawn(5,7, BorW.BLACK);
    assertEquals(0,test_1.getColoum());
    assertEquals(7,test_2.getColoum());
  }

  /**
   * test getBW method,
   * it should return correct color of a piece
   */
  @Test
  public void getBW() {
    ChessPiece test_1 = new Pawn(2,0, BorW.WHITE);
    ChessPiece test_2 = new Pawn(5,7, BorW.BLACK);
    assertEquals(BorW.WHITE,test_1.getBW());
    assertEquals(BorW.BLACK,test_2.getBW());
  }


  /**
   * test toString method,
   * it should return correct string of a piece intro
   */
  @Test
  public void testToString() {
    ChessPiece test_1 = new Pawn(2,0, BorW.WHITE);
    ChessPiece test_2 = new Pawn(5,7, BorW.BLACK);
    String except_1 = "this piece is a white pawn in position (2,0)\n";
    String except_2 = "this piece is a black pawn in position (5,7)\n";

    assertEquals(except_1, test_1.toString());
    assertEquals(except_2, test_2.toString());
  }

  /**
   * test canMove method,
   * it should return true of false a piece can move to provided position
   */
  @Test
  public void canMove() {
    ChessPiece test_1 = new Pawn(2,0, BorW.WHITE);
    ChessPiece test_2 = new Pawn(5,7, BorW.BLACK);
    assertEquals(true, test_1.canMove(2,1));
    assertEquals(false, test_2.canMove(5,5));
  }

  /**
   * test canKill method,
   * it should return true of false a piece can kill a provided piece
   */
  @Test
  public void canKill() {
    ChessPiece test_1 = new Pawn(2,0, BorW.WHITE);
    ChessPiece test_2 = new Pawn(5,7, BorW.BLACK);
    assertEquals(false, test_1.canKill(test_2));
    assertEquals(false, test_2.canKill(test_1));
    ChessPiece killed = new Rook(3,1, BorW.BLACK);
    ChessPiece killed2 = new Rook(7,6, BorW.BLACK);
    assertEquals(true, test_1.canKill(killed));
    assertEquals(false, test_2.canKill(killed2));
  }
}