enum Seasons
{
    SPRING, SUMMER, FALL, WINTER, AUTUMN
}



public class Main 
{
    public static void main(String[] args) 
    {
        SeasonsLogic();

        Student Student1 = new Student();
        Student1.FirstName = "Jake";
        Student1.LastName = "Estrich";
        Student1.GPA = 2.5; //If set as float, need to put "f" at the end of 2.5
        Student1.Major = Major.IT;
        System.out.println(Student1.GPA);

    }

    public static void SeasonsLogic()
    {
        Seasons seasons = Seasons.SPRING;

        if(seasons == Seasons.SPRING)
        {
            System.out.println("This is my fav season!");
        }
        else if(seasons == Seasons.WINTER)
        {
            System.out.println("This is my second fav season");
        }
        else
        {
            System.out.println("Fall and Summer are okay");
        }
    }

    
}