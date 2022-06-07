public class Halfling
{
    String []maleNames = {"Альтон", "Андер", "Веллби", "Гаррет", "Кейд", "Коррин", "Лайль", "Линдал", "Майло", "Осборн", "Перрин", "Рид", "Роско", "Финнан", "Эльдон", "Эррик"};

    String []femaleNames = {"Бри", "Верна", "Вэни", "Джиллиан", "Келли", "Китри", "Кора", "Лавиния", "Лидда", "Мерла", "Недда", "Паэла", "Порция", "Серафина", "Трим", "Шейна", "Эндри", "Юфимия"};

    String []surnames = {"Валигора", "Висельчак", "Вышегор", "Добробочка", "Зеленобутыль", "Камнемёт", "Кистебор", "Подветка", "Чаелист", "Шипомер"};

    Generator generateNumber;
    GenderGenerated generateGender;
    AgeGenerated generateAge;
    SizeGenerated generateSize;

    Halfling()
    {
        generateNumber = new Generator();
        generateGender = new GenderGenerated();
        generateName();
        generateSurname();
        AgeGenerated.max = 100;
        AgeGenerated.min = 20;
        generateAge = new AgeGenerated();
        generateSize = new SizeGenerated();
        subraceChoice();
    }

    String name;
    void generateName()
    {
        if(GenderGenerated.sexChoice.equals("Мужской"))
            name = maleNames[generateNumber.generate(maleNames.length)];
        else
            name = femaleNames[generateNumber.generate(femaleNames.length)];
    }

    String surname;
    void generateSurname()
    {
        surname = surnames[generateNumber.generate(surnames.length)];
    }

    int subRace;
    void subraceChoice()
    {
        subRace = generateNumber.generate(2);
        if(subRace == 1)
            subraceSturdyHalfling();
        else
            subraceLightfootHalfling();
    }

    String subraceOut;
    void subraceSturdyHalfling()
    {
        int endurance = 1;  // выносливость
        // "Стойкость крепкого" - у вас преимущество к испытаниям против яда и устойчивость к урону ядом
        subraceOut = "Крепкий полурослик";
    }

    void subraceLightfootHalfling()
    {
        int charisma = 1;   // харизма
        // "Природная скрытность" - Вы можете попробовать спрятаться, если вас заслоняет, затрудняя видимость, существо, которое больше вас как минимум на одну категорию размера
        subraceOut = "Легконогий полурослик";
    }

    void outInfo()
    {
        System.out.println("Раса: " + RaceGenerated.raceChoice);
        System.out.println("Подраса: " + subraceOut);
        System.out.println("Пол: " + GenderGenerated.sexChoice);
        System.out.println("Имя: " + name);
        System.out.println("Клан: " + surname);
        System.out.println("Возраст: " + AgeGenerated.ageChoice);
        System.out.println("Рост: " + SizeGenerated.sizeChoice);    // переделать генерацию размера
        System.out.println("Скорость: 25 футов (5 клеток)");
        System.out.println("Размер: Небольшой");
        System.out.println("Класс: " );
        System.out.println("Оружие: ");
        System.out.println("Броня: ");
        System.out.println("Снаряжение: ");
    }
}
