
import java.io.*;
public class Principal
{
    InputStreamReader isr = new InputStreamReader (System.in);
    BufferedReader br = new BufferedReader (isr);
    String pause, choice, ans;
    Index objIndex = new Index();
    Logo objLogo = new Logo ();
    Teacher objTeach = new Teacher ();
    int r=-1;
    int k= -1;
    public void principal ()throws IOException
    {
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);
        System.out.println ("\f");
        while(true)
        {
            System.out.println("welcome");
            System.out.println ("Please enter your choice 1) Login");
            System.out.println ("                         2) Back");
            choice=br.readLine();
            if(choice.equalsIgnoreCase("one") || choice.equals("1"))
            {

                for (int tries=3; tries >=0; tries--)
                {
                    System.out.println ("\f Please Enter The Password  (this is case sensitive)...");
                    String pass= br.readLine();
                    if (pass.equals("LHSpass"))
                    {  System.out.println ("\f");
                        System.out.println ("Login Successfull");
                        System.out.println ("Kindly press enter to continue");
                        pause=br.readLine();
                        princimenu ();
                        break;
                    }
                    else 
                    {

                        if (tries>0)
                        {System.out.println ("Sorry incorrect password");
                            System.out.println ("You have " + tries + "tries left"); 
                        }
                        else if (tries==0)
                        {
                            System.out.println ("\f Sorry! your Login is LOCKED for security reason,");
                            System.out.println ("To unlock your login, Kindly press enter...");
                            pause=br.readLine();
                        }
                    }
                }
            }
            else if(choice.equalsIgnoreCase("two") || choice.equals("2"))
            {
                objLogo.displogo();
                objIndex.mainMenu ();
            }

        }
    }

    public void princimenu ()throws IOException
    {
        while(true)
        {
            System.out.println ("\f1. LHSocial");
            System.out.println ("2. View Report Card");
            System.out.println ("3. Logout");
            System.out.println ("enter your choice...");
            String choice= br.readLine ();
            if(choice.equalsIgnoreCase("one") || choice.equals("1"))
            {
                lhs_social();
            }
            else if(choice.equalsIgnoreCase("two") || choice.equals("2"))
            {
                viewReport();
            }
            else if(choice.equalsIgnoreCase("three") || choice.equals("3"))
            {
                objLogo.displogo();
                objIndex.mainMenu ();
                break;

            }

        }
    }

    public void lhs_social() throws IOException
    {
        System.out.println ("\f");
        int track=0;
        start:
        while (true)
        {
            track=0;
            for (int i =0; i< 39; i++)
            {
                if (objTeach.student[i] [13] != null)
                {
                    track+=1;
                }
            }
            if (track==0)

            {
                System.out.println ("YOU HAVE NO PENDING E-MAILS.");
                System.out.println ("Press enter to go back to menu..:");
                pause=br.readLine();
                princimenu ();
            }
            else
            {

                while(true)
                {
                    while (true)
                    {
                        System.out.println ("\f");
                        System.out.println ("YOU HAVE " + track + " PENDING EMAILS");
                        System.out.println ("\nPress enter to view and answer them...");
                        pause=br.readLine();
                        break;
                    }

                    start1:
                    while (true)
                    {
                        System.out.println("\f");
                        for (int i=0; i< 39; i++)
                        {

                            if (objTeach.student[i] [13] != null)
                            {
                                r=i;
                                System.out.println ("Name : " + objTeach.student[i] [0] + ".");
                                System.out.println ("Gr.no: " + objTeach.student[i] [1] + ".");
                                System.out.println ("e-mail:");
                                System.out.println (objTeach.student[i] [13]);
                                System.out.println("\n\n");

                            }
                        }
                        while (true)
                        {
                            System.out.println ("Enter the Gr.no of the student whose mail you want to reply to");
                            choice =br.readLine();
                            start2:
                            for(int i = 0; i<=39; i++)
                            {
                                if (choice.equals(objTeach.student[i] [1]))
                                {
                                    System.out.println("\f");
                                    System.out.println ("Name : " + objTeach.student[i] [0] + ".");
                                    System.out.println ("Gr.no: " + objTeach.student[i] [1] + ".");
                                    System.out.println ("e-mail:");
                                    System.out.println (objTeach.student[i] [13]);
                                    System.out.println ("\n\nType your reply below");
                                    objTeach.student[i] [14]= br.readLine();
                                    objTeach.student[i] [13]= null;
                                    pause=br.readLine();
                                    System.out.println ("\f");
                                    System.out.println("Thankyou for answering.");
                                    pause=br.readLine();
                                    while(true)
                                    { 
                                        System.out.println ("Do you wish to answer another email?  (yes/no)");
                                        choice=br.readLine();
                                        if(choice.equalsIgnoreCase("yes"))
                                        {
                                            continue start;
                                        }
                                        else if(choice.equalsIgnoreCase("no"))
                                        {
                                            System.out.println ("THANKYOU. \n Press enter to go back to the menu");
                                            pause=br.readLine();

                                            princimenu ();

                                        }
                                        else
                                        {
                                            continue start1;
                                        }
                                    }

                                }
                                else{
                                    continue start2;    
                                }
                            }

                        }
                    }
                }
            }
        } 

    }

    public void viewReport() throws IOException
    {
        start:
        while (true)
        {

            System.out.println("\f");
            System.out.println("Enter the name of the student whose report card you want to view");
            ans=br.readLine();
            for(int i =0; i<=39; i++)
            {

                if (ans.equalsIgnoreCase(objTeach.student[i] [0]))
                {
                    k=i; 
                }

            }
            if (k> -1)
            {    
                if(objTeach.student[k] [7] != null)
                {
                    System.out.println("\f");
                    objTeach.r=k;
                    objTeach.displayReport ();
                    System.out.println("Do you wish to view the progress report for another student");
                    ans=br.readLine();
                    while(true)
                    {if (ans.equalsIgnoreCase("yes"))
                        {
                            continue start;
                        }
                        else if (ans.equalsIgnoreCase("no"))
                        {
                            princimenu (); 
                        }
                    }

                }
                else
                {
                    System.out.println("Sorry, the teacher hasnt entered the marks yet");
                    System.out.println("press enter to go back to the main menu");
                    pause=br.readLine();
                    princimenu ();
                }
            }
            else 
            {
                System.out.println ("Record not found");
                System.out.println("press 1 to try again and 2 to go back to the menu");
                ans=br.readLine();
                while(true)
                {
                    if (ans.equalsIgnoreCase("1"))
                    {
                        continue start;
                    }
                    if (ans.equalsIgnoreCase("2"))
                    {
                        princimenu (); 
                    }
                }
            }
        }
    }
}
