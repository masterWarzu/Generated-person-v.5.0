public class Dwarf
{
    String []maleNames = {"Адрик", "Альбрих", "Барендд", "Броттор", "Бренор", "Бэрн", "Вейт", "Вондал", "Гардаин", "Даин", "Даррак", "Дельг", "Кильдрак", "Моргран", "Орсик", "Оскар", "Рангрим",
                         "Рюрик", "Таклинн", "Торадин", "Тордек", "Торин", "Травок", "Траубон", "Ульфгар", "Фаргрим", "Флинт", "Харбек", "Эберг", "Эйнкиль"};

    String []femaleNames = {"Амбер", "Артин", "Аудхильд", "Бардрин", "Вистра", "Гуннлода", "Гурдис", "Дагнал", "Диеза", "Ильде", "Кастра", "Кристрид", "Лифтраза", "Мардред", "Рисвинн", "Саннл",
                            "Торбера", "Торгга", "Фалькрунн", "Финеллен", "Хелья", "Хлин", "Эльдет"};

    String []clans = {"Айронфист", "Бальдерк", "Батлхаммер", "Броненвил", "Горунн", "Данкил", "Лодерр", "Лютгер", "Румнахейм", "Стракельн", "Торунн", "Унгарт", "Файрфордж", "Фростберд", "Хольдерхек"};

    Generator generateNumber;
    GenderGenerated generateGender;
    AgeGenerated generateAge;
    SizeGenerated generateSize;

    Dwarf()
    {
        generateNumber = new Generator();
        generateGender = new GenderGenerated();
        generateName();
        generateClan();
        AgeGenerated.max = 200;
        AgeGenerated.min = 50;
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

    String clan;
    void generateClan()
    {
        clan = clans[generateNumber.generate(clans.length)];
    }

    int subRace;
    void subraceChoice()
    {
        subRace = generateNumber.generate(2);
        if(subRace == 1)
            subraceHillDwarf();
        else
            subraceMountainDwarf();
    }

    String subraceOut;
    void subraceHillDwarf()
    {
        int wisdom = 2;  // мудрость
        int dwarvenToughness = 1;   // живучесть дварфа
        subraceOut = "Холмовой дварф";
    }

    void subraceMountainDwarf()
    {
        int strength = 2;   // Сила
        // Dwarven Armor Training (Дварфийское ношение брони) - умелы в обращении с лёгкой и средней бронёй
        subraceOut = "Горный дварф";
    }

    void outInfo()
    {
        System.out.println("Раса: " + RaceGenerated.raceChoice);
        System.out.println("Подраса: " + subraceOut);
        System.out.println("Пол: " + GenderGenerated.sexChoice);
        System.out.println("Имя: " + name);
        System.out.println("Клан: " + clan);

        System.out.println("Возраст: " + AgeGenerated.ageChoice);
        System.out.println("Рост: " + SizeGenerated.sizeChoice);
        System.out.println("Скорость: 25 футов (5 клеток)");
        System.out.println("Размер: Средний");
        System.out.println("Класс: " );
        System.out.println("Оружие: ");
        System.out.println("Броня: ");
        System.out.println("Снаряжение: ");
    }
}

// Constitution + 2 (Выносливость)

// Size: 4-5 feet (от 4 до 5 футов)

// Darkvision
// Dwarven Resilience (Стойкость дварфа)
// Dwarven Combat Training (Боевая подготовка дварфа)
// Tool Proficiency (Умения с инструментами)
// Stonecunning (Знание камня)
// Languages (Языки)

// Subrace
//      Hill Dwarf (Холмовой)
//          Wisdom (Мудрость) + 2
//          Dwarven Toughness (Живучесть дварфа) + 1 хит
//
//      Mountain Dwarf (Горный)
//          Strength (Сила) + 2
//          Dwarven Armor Training (Дварфийское ношение брони) - умелы в обращении с лёгкой и средней бронёй