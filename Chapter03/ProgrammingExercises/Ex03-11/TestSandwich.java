// TestSandwich.java
// Chapter 3, Exercise 11
class TestSandwich
{
  public static void main (String args[])
  {
    Sandwich sandwich = new Sandwich();
    sandwich.setMainIngredient("tuna");
    sandwich.setBread("wheat");
    sandwich.setPrice(4.99);
    System.out.println("You have ordered a " +
        sandwich.getMainIngredient() + " sandwich on " +
        sandwich.getBread() + " bread, and the price is " + sandwich.getPrice());
  }
}


