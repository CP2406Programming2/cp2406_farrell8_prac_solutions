public class PhoneCallArray
{
   public static void main(String[] args)
   {
      PhoneCall calls[] = new PhoneCall[10];
      int i;
      calls[0] = new IncomingPhoneCall("345-094-8372");
      calls[1] = new OutgoingPhoneCall("644-564-8572", 4);
      calls[2] = new IncomingPhoneCall("343-194-3372");
      calls[3] = new OutgoingPhoneCall("655-999-6372", 10);
      calls[4] = new IncomingPhoneCall("545-065-2362");
      calls[5] = new OutgoingPhoneCall("655-999-6372", 30);
      calls[6] = new IncomingPhoneCall("125-345-4857");
      calls[7] = new OutgoingPhoneCall("235-955-1371", 3);
      calls[8] = new IncomingPhoneCall("644-564-8572");
      calls[9] = new OutgoingPhoneCall("920-787-8919", 5);
      for(i = 0; i < calls.length; ++i)
         calls[i].getInfo();
   }
}