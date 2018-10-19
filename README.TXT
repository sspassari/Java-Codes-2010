------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: LHS Social
PURPOSE OF PROJECT: 
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS:
USER INSTRUCTIONS:
else if(objTeacher.student[r][13].equals(null) )
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
            }
        }