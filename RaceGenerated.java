public class RaceGenerated
{
    String []races = {"Дварф", "Полурослик", "Человек", "Эльф", "Гном", "Драконорожденный", "Полуорк", "Полуэльф", "Тифлинг"};
    int gen;
    public static String raceChoice;

    Generator generatedPoint;
    RaceGenerated()
    {
        generatedPoint = new Generator();
    }

    void newRace()
    {
        gen = generatedPoint.generate(races.length);
        raceChoice = races[gen];
        switch (raceChoice)
        {
            case "Дварф":
                Dwarf dwarf = new Dwarf();
                dwarf.outInfo();
                break;
            case "Полурослик":
                Halfling halfling = new Halfling();
                halfling.outInfo();
                break;
            case "Человек":
                Human human = new Human();
                human.outInfo();
                break;
            case "Эльф":
                Elf elf = new Elf();

                break;
            case "Гном":
                Gnome gnome = new Gnome();

                break;
            case "Драконорожденный":
                Dragonborn dragonborn = new Dragonborn();

                break;
            case "Полуорк":
                HalfOrk hulfOrk = new HalfOrk();

                break;
            case "Полуэльф":
                HalfElf halfElf = new HalfElf();

                break;
            case "Тифлинг":
                Tiefling tiefling = new Tiefling();
        }
    }
}
