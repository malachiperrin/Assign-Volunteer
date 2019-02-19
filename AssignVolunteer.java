//Filename: AssignVolunteer.java
//Author: Malachi
//Date: 1/30/19

import java.util.Scanner;

public class AssignVolunteer
{
    public static void main(String[] args)
    {
        int donationType;
        String volunteer = "";
        String message = "";
        final int CLOTHING_CODE = 1;
        final int FURNITURE_CODE = 2;
        final int ELECTRONICS_CODE = 3;
        final int OTHER_CODE = 4;
        final String CLOTHING_PRICER = "Regina";
        final String FURNITURE_PRICER = "Walter";
        final String ELECTRONICS_PRICER = "Lydia";
        final String OTHER_PRICER = "Marco";
        final String INVALID_PRICER = "invalid";

        Scanner input = new Scanner(System.in);
        System.out.println("What type of donation is this?");
        System.out.print("Enter " + CLOTHING_CODE + " for clothing, " + FURNITURE_CODE + " for furniture, " + ELECTRONICS_CODE + " for electronics, " + OTHER_CODE + " for anything else...");
        donationType = input.nextInt();
        
        // Loop which will check that the user selection is within the correct range of choices
        while(donationType < CLOTHING_CODE || donationType > OTHER_CODE)
        {
            System.out.println("You entered " +  donationType + " which is not a valid data type");
            System.out.print("Enter " + CLOTHING_CODE + " for clothing, " + FURNITURE_CODE + " for furniture, " + ELECTRONICS_CODE + " for electronics, " + OTHER_CODE + " for anything else...");
            donationType = input.nextInt();
        }



        //Alternate way of decision making

        /* if(donationType == CLOTHING_CODE)
        {   volunteer = CLOTHING_PRICER;
            message = "A clothing donation";
        }
        else
            if (donationType == OTHER_CODE)
              {   volunteer = OTHER_PRICER;
                  message = "A non-clothing donation";
              }
          else
              {
                volunteer = INVALID_PRICER;
                message = "An invalid donation type";
              } */

              switch (donationType)
              {
                  case(CLOTHING_CODE):
                  {
                    volunteer = CLOTHING_PRICER;
                    message = "A clothing donation";
                    break;
                  }

                  case(FURNITURE_CODE):
                  {
                    volunteer = FURNITURE_PRICER;
                    message = "A furniture donation";
                    break;
                  }

                  case(ELECTRONICS_CODE):
                  {
                    volunteer = ELECTRONICS_PRICER;
                    message = "A electronics donation";
                    break;
                  }

                  case(OTHER_CODE):
                  {
                    volunteer = OTHER_PRICER;
                    message = "another donation type";
                    break;
                  }
              }

        System.out.println("You entered " + donationType);
        System.out.println("This is " + message);
        System.out.println("The volunteer who will price this item is " + volunteer);

    }
}
