public class DemoPhoneCalls
{
   public static void main(String[] args)
   {
      IncomingPhoneCall inCall = new IncomingPhoneCall("212-555-3096");
      OutgoingPhoneCall outCall = new OutgoingPhoneCall("312-874-0232", 10);
      inCall.getInfo();
      outCall.getInfo();
   }
}
