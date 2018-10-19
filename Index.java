import java.io.*;
public class Index
{
    static String choice;
    static Teacher objTeacher = new Teacher();
    static Student objStudent = new Student();
    static Principal objPrinci = new Principal();
    static Intro objIntro =  new Intro ();
    static Logo objLogo = new Logo ();
    public static void main (String args[]) throws IOException
    {
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);
        
        objIntro.intro();
        System.out.println("\f");
        
        objLogo.displogo();
        mainMenu ();

    }

    public static void mainMenu () throws IOException
    {
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);
        
           System.out.println ("\f");
            System.out.println("Please Enter Your Choice : 1) Teacher");
            System.out.println("                           2) Student");
            System.out.println ("                          3) Principal");
            System.out.println ("                          4) Terminate");
            choice = br.readLine();
            if(choice.equalsIgnoreCase("one") || choice.equals("1"))
            {
                objTeacher.teacher();
            }
            else if(choice.equalsIgnoreCase("two") || choice.equals("2"))
            {
                objStudent.student();
            }
            else if(choice.equalsIgnoreCase("three") || choice.equals("3"))
            {
                objPrinci.principal();
            }
            else if(choice.equalsIgnoreCase("four") || choice.equals("4"))
            {
                    objLogo.displogo();
                    System.exit(0);
            }
           else
           {
              mainMenu ();
            }
        }
    }

