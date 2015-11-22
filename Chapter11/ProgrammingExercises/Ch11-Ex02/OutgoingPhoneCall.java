public class OutgoingPhoneCall extends PhoneCall
{
  public final static double RATE = .04;
  private int minutes;
  public OutgoingPhoneCall(String num, int mins)
  {
     super(num);
     minutes = mins;
     price = minutes * RATE;
  }
  public void getInfo()
  {
     System.out.println("Outgoing phone call " +
        getPhoneNumber() + " " + RATE +
        " per minute at " + minutes +
        " minutes. Total is $" +
        getPrice());
  }
  public String getPhoneNumber()
  {
     return phoneNumber;
  }
  public double getPrice()
  {
     return price;
  }
}
