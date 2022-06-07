public class AgeGenerated
{
    public static int ageChoice;
    Generator generatedPoint;
    public static int max, min;
    AgeGenerated()
    {
        generatedPoint = new Generator();
        newAge(max, min);
    }

    void newAge(int max, int min)
    {
        ageChoice = (generatedPoint.generate(max) + min);
    }
}
