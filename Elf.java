public class Elf
{
    String []elfMaleNames = {"Адран", "Арамиль", "Араннис", "Ауст", "Аэлар", "Бейро", "Берриан", "ВАрис", "Галинндан", "Ивеллиос", "Иммераль", "Каррик", "Кварион", "Лаусиан", "Миндартис", "Паэлиас" +
                                "Перен", "Риардон", "Ролен", "Совелисс", "Тамиор", "Таривол", "Терен", "Хадарай", "Хейян", "Химо", "Эниалис", "Эрдан", "Эреван"};

    String []elfFemaleNames = {"Адри", "Альтея", "Анастрианна", "Андрасте", "Антинуя", "Бетринна", "Бирэль", "Вадания", "Валантэ", "Друзилия", "Желеннет", "Занафия", "Йеления", "Квеленна" +
                                "Квиллатэ", "Кейлет", "Кейлинн", "Лешанна", "Лия", "Миали", "Мэриэль", "Найвара", "Сариэль", "Силакви", "Тейрастра", "Тия", "Фелосиаль", "Шава", "Шанейра", "Энна"};

    String []elfSurnames = {"Амакиир (Драгоценный Цветок)", "Амастасия (Звёздный цветок)", "Галанодэль (Лунный Шёпот)", "Зилосциент (Золотой Лепесток)", "Ильфелькиир (Драгоценный Блеск)" +
                                "Лиадон (Серебрянный Лист)", "Мелиамнэ (Дубовый Корень)", "Найло (Ночной ветерок)", "Сианнодель (Лунный Ручей)", "Холимион (Алмазная Роса)"};

    Generator generateNumber;
    GenderGenerated generateGender;
    AgeGenerated generateAge;
    SizeGenerated generateSize;

    Elf()
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
            name = elfMaleNames[generateNumber.generate(elfMaleNames.length)];
        else
            name = elfFemaleNames[generateNumber.generate(elfFemaleNames.length)];
    }

    String surname;
    void generateSurname()
    {
        surname = elfSurnames[generateNumber.generate(elfSurnames.length)];
    }

    int subRace;
    void subraceChoice()
    {
        subRace = generateNumber.generate(3);
        if(subRace == 1)
            subraceHighElf();
        else if (subRace == 2)
            subraceForestElf();
        else
            subraceDarkElf();
    }

    String subraceOut;
    void subraceHighElf()
    {
        subraceOut = "Высший эльф";
    }

    void subraceForestElf()
    {
        subraceOut = "Лесной эльф";
    }

    void subraceDarkElf()
    {
        subraceOut = "Тёмный эльф (Дроу)";
    }

    void elfOutInfo()
    {
        System.out.println("Раса: " + RaceGenerated.raceChoice);
        System.out.println("Подраса: " + subraceOut);
        System.out.println("Пол: " + GenderGenerated.sexChoice);
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Возраст: " + AgeGenerated.ageChoice);
        System.out.println("Рост: " + SizeGenerated.sizeChoice);    // переделать генерацию размера
        System.out.println("Скорость: 25 футов (5 клеток)");
        System.out.println("Размер: Средний");
        System.out.println("Класс: " );
        System.out.println("Оружие: ");
        System.out.println("Броня: ");
        System.out.println("Снаряжение: ");
    }
}
