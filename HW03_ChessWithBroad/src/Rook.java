import static java.lang.Math.abs;
public class Rook extends AbstractChessPiece {

  /**
   * this construct an object of bishop chess
   * at x,y position
   * and color in your choice
   * @param x pos
   * @param y pos
   * @return object
   */
  public Rook(int x, int y, BW blackOrWhite) {
    super(x,y,blackOrWhite, Type.ROOK);
  }


  @Override
  public boolean canMove(int x, int y) {
    checkIndex(x,y);
    boolean RookCanMove = false;
    if (x == this.getRow() || y == this.getColoum()) {RookCanMove = true;}
    if (x == this.getRow() && y == this.getColoum()) {RookCanMove = false;}
    return RookCanMove;
  }

  @Override
  public boolean canKill(ChessPiece another) {
    boolean bishopCanKill;
    return (this.canMove(another.getRow(), another.getColoum()) && this.getBW() != another.getBW());
  }
}