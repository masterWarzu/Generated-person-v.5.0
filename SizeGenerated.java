public class SizeGenerated
{
    public static int sizeChoice;
    Generator generatedPoint;
    SizeGenerated()
    {
        generatedPoint = new Generator();
        newSize();
    }

    void newSize()
    {
        sizeChoice = (generatedPoint.generate(2) + 4);
    }
}
