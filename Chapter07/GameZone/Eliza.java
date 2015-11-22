import javax.swing.*;
public class Eliza
{
   public static void main(String[] args)
   {
      String user;
      String msg = "";
      String msg1 = "Tell me more about your ";
      String msg2 = "You seem to have strong feelings about that";
      String msg3 = "Please go on";
      String msg4 = "Tell me more";
      String msg5 = "Continue";
      int random;
      int length;
      int x, y;
      int stopWord;
      final String END = "Goodbye";
      boolean foundMy = false, foundLove = false, foundHate = false;
      user = JOptionPane.showInputDialog(null,
        "Hello. I am Eliza, your tharapist. Tell me what" +
        "\nis troubling you. Any time you want to quit," +
        "\njust type \"Goodbye\"");
      while(!user.equalsIgnoreCase(END))
      {
         user = user.toLowerCase();
         length = user.length();
         foundMy = false;
         for(x = 0; x < length - 3; ++x) // If "my" is at end of sentence, no need to go further
         {
           if(user.charAt(x) == 'm')
           {
              if(user.charAt(x + 1) == 'y')
                if(user.charAt(x + 2) == ' ')
                   if(x >= 1)
                   {
                     if(user.charAt(x - 1) == ' ')
                          foundMy = true; 
                   }
                   else
                     foundMy = true;
           }
           if(foundMy)
           {
              stopWord = length;
              for(y = x + 3; y < length; ++y)
              {
                if(user.charAt(y) == ' ' || user.charAt(y) == '.' || user.charAt(y) == ',')
                   stopWord = y;
              }
              msg = msg1 + user.substring(x + 3, stopWord);
              x = length;  // do not look for possible second "my"
           }
       }
       if(!foundMy)
       {
          foundLove = false;
          for(x = 0; x < length - 5; ++x) 
          {
            if(user.charAt(x) == 'l')
            {
              if(user.charAt(x + 1) == 'o')
                if(user.charAt(x + 2) == 'v')
                  if(user.charAt(x + 3) == 'e')
                    if(user.charAt(x + 4) == ' ')
                      if(x >= 1)
                      {
                         if(user.charAt(x - 1) == ' ')
                           foundLove = true; 
                      }
                      else
                         foundLove = true;
             }
             if(foundLove)
             {
               msg = msg2;
               x = length;  // do not look for possible second "love"
             }
           }
        }
        if(!foundLove && !foundMy)
        {
            foundHate = false;
             for(x = 0; x < length - 5; ++x) 
             {
               if(user.charAt(x) == 'h')
               {
                 if(user.charAt(x + 1) == 'a')
                   if(user.charAt(x + 2) == 't')
                     if(user.charAt(x + 3) == 'e')
                        if(user.charAt(x + 4) == ' ')
                          if(x >= 1)
                          {
                            if(user.charAt(x - 1) == ' ')
                              foundHate = true; 
                          }
                          else
                              foundHate = true;
                }
                if(foundHate)
                {
                  msg = msg2;
                  x = length;  // do not look for possible second "hate"
                }
             }
         }
         if(!foundHate && !foundLove && !foundMy)
         {
             random = (int) (Math.random() * 100) % 3;
             if(random == 0)
                msg = msg3;
             else
                if(random == 1)
                  msg = msg4;
                 else
                   msg = msg5;

        }                      
        user = JOptionPane.showInputDialog(null, msg);               
             
     } 
    JOptionPane.showMessageDialog(null, END);
  }
}