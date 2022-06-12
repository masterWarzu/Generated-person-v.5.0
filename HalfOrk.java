public class HalfOrk
{
    String []halfOrkMaleNames = {"Гелл", "Денч", "Имш", "Кет", "Краск", "Муррен", "Ронт", "Токк", "Фенг", "Хенк", "Хольг", "Шамп"};

    String []halfOrkFemaleNames = {"Багги", "Вола", "Волен", "Йевельда", "Кансиф", "Мьев", "Ниджа", "Овак", "Оунка", "Сута", "Шаута", "Эмен", "Энгонг"};

    Generator generateNumber;
    GenderGenerated generateGender;
    AgeGenerated generateAge;
    SizeGenerated generateSize;

    HalfOrk()
    {
        generateNumber = new Generator();
        generateGender = new GenderGenerated();
        generateName();
        AgeGenerated.max = 52;
        AgeGenerated.min = 14;
        generateAge = new AgeGenerated();
        generateSize = new SizeGenerated();
    }

    String name;
    void generateName()
    {
        if(GenderGenerated.sexChoice.equals("Мужской"))
            name = halfOrkMaleNames[generateNumber.generate(halfOrkMaleNames.length)];
        else
            name = halfOrkFemaleNames[generateNumber.generate(halfOrkFemaleNames.length)];
    }

    void halfOrkOutInfo()
    {
        System.out.println("Раса: " + RaceGenerated.raceChoice);
        System.out.println("Пол: " + GenderGenerated.sexChoice);
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + AgeGenerated.ageChoice);
        System.out.println("Рост: " + SizeGenerated.sizeChoice);    // переделать генерацию размера
        System.out.println("Скорость: 30 футов (6 клеток)");
        System.out.println("Размер: Средний");
        System.out.println("Класс: " );
        System.out.println("Оружие: ");
        System.out.println("Броня: ");
        System.out.println("Снаряжение: ");
    }
}
