public class Coin
{
private final int HEADS = 0; // tails is 1
private int face; // current side showing
//-----------------------------------------------------------------
// Sets up this coin by flipping it initially.
//-----------------------------------------------------------------
public Coin ()
{
flip();
}
public void flip ()
{
face = (int) (Math.random() * 2);
}
//-----------------------------------------------------------------
// Returns true if the current face of this coin is heads.
//-----------------------------------------------------------------
public boolean isHeads ()
{
return (face == HEADS);
}
//-----------------------------------------------------------------
// Returns the current face of this coin as a string.
//-----------------------------------------------------------------
public String toString()
{
return (face == HEADS) ? "Heads" : "Tails";
}
}