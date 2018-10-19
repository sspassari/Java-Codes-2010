import java.io.*;
public class Student
{

    String choice,pause;
    Index obj = new Index();
    int r= -1, k= -1;
    InputStreamReader isr = new InputStreamReader (System.in);
    BufferedReader br = new BufferedReader (isr);
    Index objIndex = new Index ();
    Teacher objTeacher = new Teacher ();
    Logo objLogo = new Logo ();
    String ans;
    static String temp;
    public void student () throws IOException
    {
        start:
        while(true)
        {
            System.out.println("\f");
            System.out.println ("1. Login");

            System.out.println("2.Back");
            System.out.println ("Enter your choice...");
            choice = br.readLine();
            if(choice.equalsIgnoreCase("one") || choice.equals("1"))
            {
                System.out.println("\f");
                System.out.println("Please enter your name");
                String name = br.readLine();
                for (int i=0; i<=39; i++)
                {
                    if(name.equalsIgnoreCase(objTeacher.student[i][0]))
                    {

                        r=i;
                        break;

                    }

                }
                if(r> -1)
                {

                    int k=1;
                    while(true)
                    {
                        System.out.println("\f");
                        System.out.println("Record found: " +objTeacher.student[r][0] + " , \nplease enter your Grno");
                        String pass= br.readLine();

                        if(pass.equals(objTeacher.student[r][1]))
                        {
                            System.out.println("\f");
                            System.out.println ("Login Successfull");
                            pause= br.readLine();
                            login();
                            break start;
                        }
                        else
                        {
                            System.out.println ("\f");
                            System.out.println("record not found, \n press enter to try again");
                            pause=br.readLine();

                        } 
                        if( k==3)
                        {
                            System.out.println ("\f Sorry! your Login is LOCKED for security reason, \n Press enter to go back to main menu");
                            pause=br.readLine();
                            break start;

                        }

                        k++;
                    }

                }
            }
            else if (choice.equalsIgnoreCase ("two") || choice.equals("2"))
            {
                System.out.println("\f");
                objLogo.displogo();
                objIndex.mainMenu();
                break;
            }
        }
    }

    public void login ()throws IOException
    {
        while(true)

        {
            System.out.println ("\f");
            System.out.println ("1. LHSocial");
            System.out.println ("2. View Report Card.");
            System.out.println ("3. back");
            System.out.println ("Enter your choice...");
            choice = br.readLine();
            if(choice.equalsIgnoreCase("one") || choice.equals("1"))
            {

                lhs_social ();
            }
            else if(choice.equalsIgnoreCase("two") || choice.equals("2"))
            {
                System.out.println("\f");
                viewReport ();
            }
            else if(choice.equalsIgnoreCase("three") || choice.equals("3"))
            {
                System.out.println("\f");

                student ();
            }
        }
    }

    public void lhs_social ()throws IOException
    {
        while(true)
        {
            System.out.println ("\f1. Compose E-Mail");
            System.out.println ("2. Inbox");
            System.out.println ("3. back");
            System.out.println ("Enter your choice...");
            choice = br.readLine();
            if(choice.equalsIgnoreCase("one") || choice.equals("1"))
            {
                compose ();
            }
            else if(choice.equalsIgnoreCase("two") || choice.equals("2"))
            {
                inbox ();
            }
            else if(choice.equalsIgnoreCase("three") || choice.equals("3"))
            {

                login ();

            }
        }
    }

    public void compose () throws IOException
    {
        if (objTeacher.student[r][13] != null )
        {   
            System.out.println("\f");
            System.out.println ("Your previous email hasnt been answered  \n do you want to overwrite your email?");
            System.out.println ("press 1 to overwrite your previous email");
            System.out.println ("press 2 to exit and wait for her reply ");
            
            int ans = Integer.parseInt(br.readLine());
            switch (ans)
            {
                case 1:
                {
                    System.out.println ("\fType your mail below...");
                    objTeacher.student[r][13]= br.readLine();
                    temp= objTeacher.student[r][13];
                    pause = br.readLine();
                    System.out.println ("\f");
                    System.out.println ("Thank you. Your email has been sent to the principal for reply");
                    pause= br.readLine();
                    System.out.println ("press enter to continue");
                    lhs_social ();
                }
                case 2:
                {

                    lhs_social ();
                }
               
                default:
                {
                compose ();
                }
            }
        }
        else 
        {
            System.out.println ("\fType your mail below...");
            temp= br.readLine();
            objTeacher.student[r][13]=temp;
            pause = br.readLine();
            System.out.println ("\f");
            System.out.println ("Thank you. Your email has been sent to the principal for reply");
            System.out.println ("press enter to continue");
            pause= br.readLine();
            lhs_social ();

        }
    }

    public void inbox ()throws IOException
    {
        System.out.println("\f");
        if (temp != null)
        {

            if (objTeacher.student[r][14] != null )
            {
               
                System.out.println("\f");
                System.out.println ("SENT MAIL : "  +temp );
                System.out.println ("REPLY:  " +objTeacher.student[r][14]);
                temp= null;
                pause = br.readLine();
                System.out.println ("\n Press enter to exit...");
                System.out.println ("Press 1 to compose a new email");
                pause= br.readLine(); 

                if (pause.equals("1"))
                {
                    compose();
                }
                else{
                    lhs_social ();
                }
            }

            else 
            {
                System.out.println ("REPLY PENDING");
                System.out.println ("Press enter to exit");
                pause = br.readLine();
                lhs_social();
            }

        }
        else
        {
            while(true)
            { 
                System.out.println("\f");
                System.out.println ("You havent sent any mail to be replied.");
                System.out.println ("To send a new E-mail press 1");
                System.out.println ("To exit press 2");
                int ans= Integer.parseInt(br.readLine());
                switch (ans)
                {
                    case 1:
                    {
                        compose ();
                    }
                    case 2:
                    {
                        lhs_social ();
                    }
                    default:
                    {
                        continue;
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
            k= -1;
            System.out.println("\f");
            System.out.println("Enter your gr no please");
            ans=br.readLine();
            for(int i =0; i<=39; i++)
            {

                if (ans.equalsIgnoreCase(objTeacher.student[i] [1]))
                {
                    k=i; 
                }

            }
            if (k> -1)
            {    
                if(objTeacher.student[k] [7] != null)
                {
                    System.out.println("\f");
                    objTeacher.r=k;
                    objTeacher.displayReport ();
                    System.out.println("Press 1 to go back to the main menu");
                    ans=br.readLine();
                    while(true)
                    {if (ans.equalsIgnoreCase("1"))
                        {
                            login ();
                        }

                    }

                }
                else
                {
                    System.out.println("Sorry, the teacher hasnt entered the marks yet");
                    System.out.println("press enter to go back to the main menu");
                    pause=br.readLine();
                    login ();
                }
            }
            else 
            {
                System.out.println ("The Gr.no has been mis-entered,");
                System.out.println("press 1 to try again and 2 to go back to the menu");
                ans=br.readLine();
                while(true)
                {
                    if (ans.equalsIgnoreCase("1"))
                    {
                        continue start;
                    }
                    else if (ans.equalsIgnoreCase("2"))
                    {
                        login (); 
                    }
                }
            }
        }
    }
}
