public class BookArray
{
  public static void main(String[] args)
  {
     Book someBook[] = new Book[10];
     int x;
     someBook[0] = new Fiction("Scarlet Letter");
     someBook[1] = new NonFiction("Introduction to Java");
     someBook[2] = new Fiction("Mill on the Floss");
     someBook[3] = new NonFiction("The Road Not Taken");
     someBook[4] = new Fiction("A Tale of Two Cities");
     someBook[5] = new NonFiction("Europe on $5 a Day");
     someBook[6] = new Fiction("War and Peace");
     someBook[7] = new Fiction("A Simple Plan");
     someBook[8] = new Fiction("Disclosure");
     someBook[9] = new Fiction("Nancy Drew");
     for(x = 0; x < someBook.length; ++x)
        System.out.println("Book: " + 
          someBook[x].getTitle() + " costs $" +
          someBook[x].getPrice());
  }
}
