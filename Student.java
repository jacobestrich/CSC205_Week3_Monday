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
}
