public class Tiefling
{
    String []tieflingMaleNames = {"Акменос", "Амнон", "Баракас", "Дамакос", "Иадос", "Кайрон", "Левкис", "Мелех", "Мордай", "Мортос", "Пелайос", "Скамос", "Терай", "Экемон"};

    String []tieflingFemaleNames = {"Акта", "Анакис", "Брисеида", "Дамая", "Каллиста", "Криелла", "Лерисса", "Макария", "Немея", "Орианна", "Риета", "Фелая", "Эа"};

    String []tieflingIdeaNames = {"Безрассудство", "Идеал", "Искусство", "Кредо", "Музыка", "Мучение", "Надежда", "Нигде", "Открытие", "Отчаяние", "падаль", "Песнь", "Печаль", "Поиск", "Почтение",
                                    "Поэзия", "превосходство", "Слава", "Случай", "ужас", "усталость"};

    Generator generateNumber;
    GenderGenerated generateGender;
    AgeGenerated generateAge;
    SizeGenerated generateSize;

    Tiefling()
    {
        generateNumber = new Generator();
        generateGender = new GenderGenerated();
        generateName();
        generateIdea();
        AgeGenerated.max = 55;
        AgeGenerated.min = 18;
        generateAge = new AgeGenerated();
        generateSize = new SizeGenerated();
    }

    String name;
    void generateName()
    {
        if(GenderGenerated.sexChoice.equals("Мужской"))
            name = tieflingMaleNames[generateNumber.generate(tieflingMaleNames.length)];
        else
            name = tieflingFemaleNames[generateNumber.generate(tieflingFemaleNames.length)];
    }

    String idea;
    void generateIdea()
    {
        idea = tieflingIdeaNames[generateNumber.generate(tieflingIdeaNames.length)];
    }

    void tieflingOutInfo()
    {
        System.out.println("Раса: " + RaceGenerated.raceChoice);
        System.out.println("Пол: " + GenderGenerated.sexChoice);
        System.out.println("Имя: " + name);
        System.out.println("Идея: " + idea);
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
