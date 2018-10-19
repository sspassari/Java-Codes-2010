import java.io.*;
public class Teacher
{
    String teach1= "Harshad";
    String teach2= "Shilpa";
    static String student [ ][ ] = new String [40][15];
    String choice;
    Logo objLogo = new Logo();
    InputStreamReader isr = new InputStreamReader (System.in);
    BufferedReader br = new BufferedReader (isr);
    Index objIndex = new Index();
    String pause;
    float per, sum;
    static int r =-1;
    static int rowStudent=2;
    public Teacher()
    {
        student [0] [0]="Soumyaa Passari";
        student [0] [1]="8013";
        student [0] [2]="9";
        student [0] [3]="10th";
        student [0] [4]="Mahadevi Verma";
        student [0] [5]="Sangeeta Passari";
        student [0] [6]="Sunzay Passari";

        student [2] [0]="Prischa";
        student [2] [1]="8014";
        student [2] [2]="10";
        student [2] [3]="10th";
        student [2] [4]="Mahadevi Verma";
        student [2] [5]="sangeeta";
        student [2] [6]="Sunzay";

        student [1] [0]="Neil Gala";
        student [1] [1]="8015";
        student [1] [2]="26";
        student [1] [3]= "10th";
        student [1] [4]="Mahadevi Verma";
        student [1] [5]="Manish";
        student [1] [6]="Dimple";

        student [3] [0]="Michelle Vetekar ";
        student [3] [1]="8016";
        student [3] [2]="6";
        student [3] [3]="10th";
        student [3] [4]="Mahadevi Verma";
        student [3] [5]="Nandita";
        student [3] [6]=" xyz";

         
    }

    public  void teacher ()throws IOException 
    {
        while (true)
        {
            System.out.println ("\f1. Login");
            System.out.println ("2.Back");
            System.out.println ("Enter your choice");
            choice=br.readLine();
            if(choice.equalsIgnoreCase("one") || choice.equals("1"))
            {
                System.out.println ("Please enter your name..");
                String name = br.readLine();
                if(name.equalsIgnoreCase (teach1) || name.equalsIgnoreCase (teach2)) 
                { for (int tries=3; tries >=0; tries--)

                    {

                        System.out.println ("\f Please Enter The Password  (this is case sensitive)...");
                        String pass= br.readLine();
                        if (pass.equals("LHSpass"))
                        { 
                            System.out.println ("Login Successfull");
                            System.out.println ("\f");
                            login ();
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
                                teacher();
                            }
                        }

                    }
                }

                else
                {
                    System.out.println ("Sorry your name does not exist in the record.");
                    pause=br.readLine();
                    teacher();
                }

            }
            else if(choice.equalsIgnoreCase("two") || choice.equals("2"))
            {
                objLogo.displogo();
                objIndex.mainMenu();
                break;

            }
        }
    }

    public void login () throws IOException
    {
       
        while(true)
        {
            System.out.println ("\f please enter your choice :- 1) Create Student"); 
            System.out.println ("                               2) Create Report Card");
            System.out.println ("                               3) logout");
            choice =br.readLine ();
            if(choice.equalsIgnoreCase("one") || choice.equals("1"))
            {
                createStudent ();
            }

            else if(choice.equalsIgnoreCase("two") || choice.equals("2"))
            {
                createReport();
            }
            else if(choice.equalsIgnoreCase("three") || choice.equals("3"))
            {
                System.out.println("\f");
                objLogo.displogo();
                objIndex.mainMenu(); 
            }
        }
    }

    public void createStudent() throws IOException
    {
        String ans="yes" ;
        start:
        for ( ; ans.equalsIgnoreCase("yes")==true;)
        {
            System.out.println ("\fEnter he Students name");
            student[++rowStudent][0] = br.readLine();
            System.out.println ("Enter " + student [rowStudent] [0] + "'s Registration no");
            student[rowStudent][1] = br.readLine();
            System.out.println ("Enter " + student [rowStudent] [0] +"'s Roll no");
            student[rowStudent][2] = br.readLine();
            System.out.println ("Enter " + student [rowStudent] [0] +"'s Standard");
            student[rowStudent][3] = br.readLine();
            System.out.println ("Enter " + student [rowStudent] [0] +"'s division");
            student[rowStudent][4] = br.readLine();
            System.out.println ("Enter " + student [rowStudent] [0]+"'s Mother's name");
            student[rowStudent][5] = br.readLine();
            System.out.println ("Enter " + student [rowStudent] [0]+"'s Father's name");
            student[rowStudent][6] = br.readLine();
            System.out.println ("\f Thankyou ;)\n Records have been stored.");
            String pause=br.readLine ();
            start1:
            while(true)
            {
                System.out.println("Name: "+student[rowStudent][0]);
                System.out.println("General Registration no.: "+student[rowStudent][1]);
                System.out.println("Roll no: "+student[rowStudent][2]);
                System.out.println("Standard: "+student[rowStudent][3]);
                System.out.println("Division: "+student[rowStudent][4]);
                System.out.println("Mother's Name: "+student[rowStudent][5]);
                System.out.println("Fathers Name: "+student[rowStudent][6]);
                pause=br.readLine();
                System.out.println("\f");
                System.out.println ("Do you  wish to add another student?");
                ans = br.readLine();
                if (ans.equalsIgnoreCase("yes"))
                {
                    continue start;
                    
                }
                else if (ans.equalsIgnoreCase("no"))
                {
                    System.out.println ("THANKYOU");
                    System.out.println("Press enter to continue");
                    pause=br.readLine();
                    login();
                }
            }
        }
    }

    public void createReport ()throws IOException
    {
        System.out.println("\f");
        System.out.println ("WELCOME");
        System.out.println ("Enter the Students name");
        String name = br.readLine();
        int j;
        for (j= 0;student[j][0]!=null; j++)
        {
            if (student [j][0].equalsIgnoreCase(name))
            {
                r=j;
                break;
            }
        }
        if (r>=0)
        {
            System.out.println ("\fStudent found");
            System.out.println("Details:");
            System.out.println("Name: "+student[r][0]);
            System.out.println("General Registration no.: "+student[r][1]);
            System.out.println("Roll no: "+student[r][2]);
            System.out.println("Standard: "+student[r][3]);
            System.out.println("Division: "+student[r][4]);
            System.out.println("Mother's Name: "+student[r][5]);
            System.out.println("Fathers Name: "+student[r][6]);
            pause = br.readLine();
            System.out.println ("Please press enter to continue entering records for " + student[r][0]);
            pause=br.readLine();
            System.out.println("\f");
            System.out.println("Enter the marks for English:");
            student [r] [7] = br.readLine ();
            System.out.println("Enter the marks for Hindi:");
            student [r] [8] = br.readLine ();
            System.out.println("Enter the marks for Math:");
            student [r] [9] = br.readLine ();
            System.out.println("Enter the marks for Science:");
            student [r] [10] = br.readLine ();
            System.out.println("Enter the marks for Social Studies:");        
            student [r] [11] = br.readLine ();
            System.out.println("Enter the marks for III Group:");
            student [r] [12] = br.readLine ();
            for(int i =7; i<13; i++)
            {
             sum= sum + Float.parseFloat(student [r] [i]);
            }
            per=(sum/600)*100;
            System.out.println ("press enter to view the report card");
            pause=br.readLine();
            displayReport ();
            pause=br.readLine();
            System.out.println("\f");
            System.out.println ("Press enter to go back to the main menu");
            login();
            
            

        }
        else
        {

            System.out.println ("Student not found please create a record first");
            login();
        }

    }

    public void displayReport () throws IOException
    {
        System.out.println("\f");
        System.out.println ("|-----------------------------------------------------------------------------------|");
        System.out.println ("|                               LAKSHDHAM HIGH SCHOOL                   2011-2012   | ");
        System.out.println ("|-----------------------------------------------------------------------------------|");
        System.out.println ("|  NAME: "+student[r][0]+" ROLL NO " +student[r][2]+ "STD: "+student[r][3] +student[r][4]+       "|  ");
        System.out.println ("|-----------------------------------------------------------------------------------| ");                        
        System.out.println ("| SUBJECTS  |   MARKS OBTAINED    |     OUT OF   |   HIGHEST    |                   |                ");
        System.out.println ("|-----------------------------------------------------------------------------------|");
        System.out.println ("|           |                     |              |              |                   |");
        System.out.println ("| ENGLISH   |          "+ student [r] [7]+"         |    100       |     99       |                   |");
        System.out.println ("|  HINDI    |          "+ student [r] [8]+"         |    100       |    99        |                   |");
        System.out.println ("|  MATHS    |          "+ student [r] [9]+"         |    100       |     100      |                   |");
        System.out.println ("| SCIENCE   |          "+ student [r] [10]+"         |    100       |     100      |                   |");
        System.out.println ("| S.STUDIES |          "+ student [r] [11]+"         |    100       |     100      |                   |");
        System.out.println ("| III GROUP |          "+ student [r] [12]+"         |    100       |      100     |                   |");
        System.out.println ("|           |                     |              |              |                   |");
        System.out.println ("|           |                     |              |              |                   |");
        System.out.println ("|           |                     |              |              |                   |");
        System.out.println ("|           |                     |              |              |                   |");
        System.out.println ("|           |                     |              |              |                   |");
        System.out.println( "|           |                     |              |              |                   |");
        System.out.println ("|           |                     |              |              |                   |");
        System.out.println ("|           |                     |              |              |                   |");
        System.out.println ("|           |                     |              |              |                   |");
        System.out.println ("|-----------------------------------------------------------------------------------|");                    
        System.out.println ("|  AVERAGE: " +per+ "%                                                                  |");
        System.out.println ("|-----------------------------------------------------------------------------------| ");  
        System.out.println ("|GOENKA AND ASSOCIATES EDUCATIONAL TRUST                         POONAM JAISWAL     |  ");
        System.out.println ("|-----------------------------------------------------------------------------------|");
        pause=br.readLine();
      
    }
}
