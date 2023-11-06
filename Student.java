enum Major 
{
    ART, MATHEMATICS, BUSINESS, ENGINEERING, EDUCATION, IT
}

public class Student 
{
    private String FirstName, LastName;

    public String GetFirstName()
    {
        return FirstName;
    }

    public void SetFirstName(String NewName)
    {
        FirstName = NewName.toLowerCase();
    }

    public String GetLastName()
    {
        return LastName;
    }

    public void SetLastName(String NewName)
    {
        LastName = NewName.toUpperCase();
    }

    double GPA;
    Major Major;


    public void PrintNames()
    {
        System.out.println(FirstName + " " + LastName);
    }


    public String toString()
    {
        return "First Name: " + FirstName + " Last Name: " + LastName;
    }

    public void ChangNameAndMajor(String LastName, Major Major)
    {
        this.LastName = LastName;
        this.Major = Major;
    }

    public void ChangeNameAndMajor(String FirstName, String LastName, Major Major)
    {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Major = Major;
    }
}
