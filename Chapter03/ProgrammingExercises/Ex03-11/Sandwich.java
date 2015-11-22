// Sandwich.java
// Chapter 3,Exercise 11
class Sandwich
{
  // the private data members
     private String mainIngredient;
     private String bread;
     private double price;

  // the public get and set methods

     public void setMainIngredient(String ingredient)
     {
	mainIngredient = ingredient;
     }

     public String getMainIngredient()
     {
	return mainIngredient;
     }
     public void setBread(String breadType)
     {
	bread = breadType;
     }
     public String getBread()
     {
	return bread;
     }
     public void setPrice(double amt)
     {
	price = amt;
     }

     public double getPrice()
     {
	return price;
     }

}
