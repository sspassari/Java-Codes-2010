import java.io.*;
public class Intro
{
    public static void intro() throws IOException
    {
        String pause;
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);
        for(int i=10; i<=100; i+=5)
        {
            for( double r=0; r <=10000000000.0; r+=10)
            {

            }
            System.out.println("\f");
            System.out.println ("\t\t\t\t\t\t\t LOADING " +i+ " % COMPLETE..." );
            if (i==15)
            {
                System.out.println ("\n\n\n\n\n\n\n\n");
                System.out.println("\t\t\t\t\t\t\t THIS PROJECT IS MADE BY SOUMYAA PASSARI ...");

            }
            else if (i==20)
            {
                System.out.println ("\n\n\n\n\n\n\n\n");
                System.out.println(" \t\t\t\t\t\t\t THIS PROJECT IS MADE BY SOUMYAA PASSARI");
                System.out.println();
                System.out.println (" \t\t\t\t\t\t\t  10 MAHADEVI VERMA (Roll no: 9) ... ");

            }
            else if (i==25)
            {
                System.out.println ("\n\n\n\n\n\n\n\n");  
                System.out.println("\t\t\t\t\t\t\t THIS PROJECT IS MADE BY SOUMYAA PASSARI");
                System.out.println();
                System.out.println (" \t\t\t\t\t\t\t  10 MAHADEVI VERMA (Roll no: 9)  ");
                System.out.println();
                System.out.println("\t\t\t\t\t\t\t    LAKSHDHAM HIGH SCHOOL...");
            }

            else if (i==30)
            {

                System.out.println ("\n\n\n\n\n\n\n\n\n\n\n"); 
                System.out.println("\t\t\t\t\t\t\t ASSISTED BY HARSHAD SIR..."); 
            }

            else if (i==35)
            {
                System.out.println ("\n\n\n\n\n\n\n\n\n\n\n"); 
                System.out.println("\t\t\t\t\t\t\t ASSISTED BY HARSHAD SIR"); 
                System.out.println("\t\t\t\t\t\t\t IMMENSE GRATITUDE TO HIM ...");
            }

            else if (i==40)
            {
                System.out.println ("\n\n\n\n\n\n\n\n");
                System.out.println("\t\t\t\t\t\t\t SPECIAL THANKS T0...");
            }

            else if (i==45)
            {

                System.out.println ("\n\n\n\n\n\n\n\n");
                System.out.println("\t\t\t\t\t\t\t SPECIAL THANKS T0");
                System.out.println ();
                System.out.println("\t\t\t\t\t\t\t MICHELLE VETEKAR...");
            }

            else if (i==50)
            {
                System.out.println ("\n\n\n\n\n\n\n\n");
                System.out.println("\t\t\t\t\t\t\t SPECIAL THANKS T0");
                System.out.println ();
                System.out.println("\t\t\t\t\t\t\t MICHELLE VETEKAR");
                System.out.println ();
                System.out.println ("\t\t\t\t\t\t\t MANIKANTAN KUMAR...");
                System.out.println ();

            }

            else if (i==55)
            {
                System.out.println ("\n\n\n\n\n\n\n\n");
                System.out.println("\t\t\t\t\t\t\t SPECIAL THANKS T0");
                System.out.println ();
                System.out.println("\t\t\t\t\t\t\t MICHELLE VETEKAR");
                System.out.println ();
                System.out.println ("\t\t\t\t\t\t\t MANIKANTAN KUMAR");
                System.out.println ();
                System.out.println ("\t\t\t\t\t\t\tTATHAGATA ACHARYA...");

            }
            else if (i==60)
            {
                System.out.println ("\n\n\n\n\n\n\n\n\n\n");
                System.out.println("\t\t\t\t\t\t\t   FOR THEIR GENEROUS HELP...");

                
            }
            else if(i==65 )
            {
                System.out.println ("\n\n\n\n\n\n\n\n\n\n");
                System.out.println("\t\t\t\t\t\t\t\t ICSE 2011-2012...");

            }
             else if(i==70 )
            {
                System.out.println ("\n\n\n\n\n\n\n\n\n\n");
                System.out.println("\t\t\t\t\t\t\t\t ICSE 2011-2012...");

            }
            else if(i==75 )
            {

                System.out.println ("\n\n\n\n\n\n\n\n\n\n");
                System.out.println("\t\t\t\t\t\t\t\tPLEASE WAIT ");

            }
            else if(i>75 && i<100)
            {
                System.out.println ("\n\n\n\n\n\n\n\n\n\n");
                System.out.println("\t\t\t\t\t\t\t\tPLEASE WAIT WHILE THE REST OF THE PROGRAM LOADS...");

            }
            else if (i==100)
            {
                System.out.println ("\n\n\n\n\n\n\n\n\n\n");
                System.out.println ("\t\t\t\t\t\t\t\tPRESS ENTER TO CONTINUE...");
                pause=br.readLine();
                break;
            }
        }
    }
}

