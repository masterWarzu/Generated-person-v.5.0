public class GenderGenerated
{
    String []sex = {"Мужской", "Женский"};

    public static String sexChoice;

    Generator generatedPoint;
    GenderGenerated()
    {
        generatedPoint = new Generator();
        newSex();
    }

    int gen;
    void newSex()
    {
        gen = generatedPoint.generate(sex.length);
        sexChoice = sex[gen];
    }
}
