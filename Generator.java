import java.util.Random;

public class Generator
{
    Random rand;
    int genOut;

    Generator()
    {
        rand = new Random();
    }

    int generate(int max)
    {
        return genOut = (rand.nextInt(max));
    }
}
