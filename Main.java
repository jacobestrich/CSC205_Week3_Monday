public class Main 
{
    public static void main(String[] args) 
    {
        SeasonsLogic();
        CarLogic();
        StudentLogic();
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


    public static void CarLogic()
    {
        Car Car1 = new Car();
        Car1.Mileage = 5000.2;
        Car1.BodyStyle = BodyStyle.SEDAN;
        Car1.CarMake = Make.FORD;

        Car Car2 = new Car();
        Car2.Mileage = 500;
        Car2.BodyStyle = BodyStyle.SUV;
        Car2.CarMake = Make.MAZDA;

        Car Car3 = new Car();
        Car3.Mileage = 186.5;
        Car3.BodyStyle = BodyStyle.TRUCK;
        Car3.CarMake = Make.DODGE;
    }


    public static void StudentLogic()
    {
        Student Student1 = new Student();
        Student1.SetFirstName("Jake");
        Student1.SetLastName("Estrich");
        Student1.GPA = 2.5; //If set as float, need to put "f" at the end of 2.5
        Student1.Major = Major.IT;

        Student Student2 = new Student();
        Student2.SetFirstName("Tom");
        Student2.SetLastName("Tommy");

        Student1.PrintNames();
        System.out.println(Student1);

        Student1.ChangNameAndMajor("Nelson", Major.ENGINEERING);
        System.out.println(Student1);

        //System.out.println(Student1.FirstName);
        //System.out.println(Student2.FirstName); //will return null since it was not set with a value or initialized.
        // System.out.println(Student1.GetFirstName() + " " + Student1.GetLastName());
        // System.out.println(Student2.GetFirstName() + " " + Student2.GetLastName());
    }


    
}