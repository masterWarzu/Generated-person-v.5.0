public class Human
{
    String []subRaces = {"Дамаранец", "Иллюсканец", "Калишит", "Муланец", "Рашемен", "Тетриец", "Турамиец", "Чондатанец", "Шу"};

    String []damarenMaleNames = {"Бор", "Глар", "Григор", "Ивор", "Иган", "Козеф", "Миваль", "Орел", "Павел", "Сергор", "Фодель"};
    String []damaranFemaleNames = {"Алетра", "Зора", "Кара", "Катернина", "Мара", "Натали", "Ольма", "Тана"};
    String []damaranSurnames = {"Берск", "Доцк", "Куленов", "Марск", "Немецк", "Стараг", "Чернин", "Шемов"};

    String []illuskanMaleNames = {"Андер", "Блат", "Бран", "Гет", "Ландер", "Лут", "Мальсер", "Стор", "Таман", "Фрат", "Урт"};
    String []illuskanFemaleNames = {"Амафрей", "Бета", "Вестра", "Кетра", "Мара", "Ольга", "Сефрей", "Селифрей"};
    String []illuskanSurname = {"Брайтвуд", "Виндривер", "Лекмен", "Стормвинд", "Хельдер", "Хорнрейвен"};

    String []calishiteMaleNames = {"Азеир", "Бардеид", "Зашеир", "Мехмен", "Судейман", "Хасеид", "Хемед"};
    String []calishiteFemaleNames = {"Атала", "Жасмаль", "Зашеида", "Мейлиль", "Сеидиль", "Сейпора", "Хама", "Яшеира"};
    String []calishiteSurnames = {"Баша", "Думеин", "Жассан", "Мостана", "Пашар", "Реин", "Халид"};

    String []mulanMaleNames = {"Аот", "Барерис", "Кетот", "Мумед", "Рамас", "Со-Кехур", "Тазар-Де", "Урхур", "Эпут-Ки"};
    String []mulanFemaleNames = {"Аризима", "Золида", "Мурити", "Нефида", "Нулара", "Сефрида", "Тола", "Умара", "Чати"};
    String []mulanSurnames = {"Анскульд", "Анхалаб", "Натандем", "Сепрет", "Уутракт", "Фезим", "Хапет"};

    String []rashemiMaleNames = {"Боривик", "Владислак", "Джандар", "Канитат", "Медислак", "Ральмевик", "Фаургар", "Шаумар"};
    String []rashemiFemaleNames = {"Имзель", "Иммит", "Наварра", "Таммит", "Фьеварра", "Хульмарра", "Шеварра", "Юльдра"};
    String []rashemiSurnames = {"Дьернина", "Ильтазяра", "Мурнетара", "Стаянога", "Ульмокина", "Чергоба"};

    String []turamiMaleNames = {"Антон", "Диеро", "Маркон", "Пьерон", "Римардо", "Ромеро", "Салазар", "Умберо"};
    String []turamiFemaleNames = {"Балама", "Вонда", "Дона", "Жалана", "Квара", "Луиза", "Марта", "Селиз", "Фаила"};
    String []turamiSurnames = {"Агусто", "Асторио", "Домине", "Калабра", "Маривальди", "Пиказар", "Рамондо", "Фалоне"};

    String []chondathanMaleNames = {"Дарвин", "Дорн", "Горстаг", "Грим", "Маларк", "Морн", "Рендал", "Стедд", "Хельм", "Эвендур"};
    String []chondathanFemaleNames = {"Арвин", "Джеззейль", "Кэрри", "Люрин", "Мири", "Ровен", "Тессель", "Шандри", "Эсвель"};
    String []chondathanSurnames = {"Бакмен", "Грейкасл", "Дандрагон", "Толлстаг", "Эвенвуд", "Эмблкроун"};

    String []shouMaleNames = {"Ань", "Вэнь", "Лон", "Лянь", "Мен", "Онь", "Фай", "Цзян", "Чень", "Чжунь", "Чи", "Шань", "Шуй"};
    String []shouFemaleNames = {"Бай", "Лэй", "Мэй", "Тай", "Чао", "Цзя", "Цяо", "Шуй"};
    String []shouSurnames = {"Вань", "Као", "Кун", "Лин", "Ляо", "Мэй", "Пинь", "Сум", "Тань", "Чен", "Хуан", "Шинь"};

    Generator generateNumber;
    GenderGenerated generateGender;
    AgeGenerated generateAge;
    SizeGenerated generateSize;

    Human()
    {
        generateNumber = new Generator();
        generateGender = new GenderGenerated();
        subraceChoice();
        AgeGenerated.max = 50;
        AgeGenerated.min = 20;
        generateAge = new AgeGenerated();
        generateSize = new SizeGenerated();

    }

    int subRaceGenerate;
    void subraceChoice()
    {
        subRaceGenerate = (generateNumber.generate(subRaces.length));
        switch (subRaces[subRaceGenerate])
        {
            case "Дамаранец" -> subraceDamaren();
            case "Иллюсканец" -> subraceIlluskan();
            case "Калишит" -> subraceCalishite();
            case "Муланец" -> subraceMulan();
            case "Рашемен" -> subraceRashemi();
            case "Турамиец" -> subraceTurami();
            case "Тетриец" -> subraceTethirian();
            case  "Чондатанец" -> subraceChondathan();
            default -> subraceShou();
        }
    }

    String name, surname, subraceOut;
    void subraceDamaren()
    {
        if(GenderGenerated.sexChoice.equals("Мужской"))
            name = damarenMaleNames[generateNumber.generate(damarenMaleNames.length)];
        else
            name = damaranFemaleNames[generateNumber.generate(damaranFemaleNames.length)];

        surname = damaranSurnames[generateNumber.generate(damaranSurnames.length)];

        subraceOut = "Дамаранец";
    }

    void subraceIlluskan()
    {
        if(GenderGenerated.sexChoice.equals("Мужской"))
            name = illuskanMaleNames[generateNumber.generate(illuskanMaleNames.length)];
        else
            name = illuskanFemaleNames[generateNumber.generate(illuskanFemaleNames.length)];

        surname = illuskanSurname[generateNumber.generate(illuskanSurname.length)];

        subraceOut = "Иллюсканец";
    }

    void subraceCalishite()
    {
        if(GenderGenerated.sexChoice.equals("Мужской"))
            name = calishiteMaleNames[generateNumber.generate(calishiteMaleNames.length)];
        else
            name = calishiteFemaleNames[generateNumber.generate(calishiteFemaleNames.length)];

        surname = calishiteSurnames[generateNumber.generate(calishiteSurnames.length)];

        subraceOut = "Калишит";
    }

    void subraceMulan()
    {
        if(GenderGenerated.sexChoice.equals("Мужской"))
            name = mulanMaleNames[generateNumber.generate(mulanMaleNames.length)];
        else
            name = mulanFemaleNames[generateNumber.generate(mulanFemaleNames.length)];

        surname = mulanSurnames[generateNumber.generate(mulanSurnames.length)];

        subraceOut = "Муланец";
    }

    void subraceRashemi()
    {
        if(GenderGenerated.sexChoice.equals("Мужской"))
            name = rashemiMaleNames[generateNumber.generate(rashemiMaleNames.length)];
        else
            name = rashemiFemaleNames[generateNumber.generate(rashemiFemaleNames.length)];

        surname = rashemiSurnames[generateNumber.generate(rashemiSurnames.length)];

        subraceOut = "Рашемен";
    }

    void subraceTurami()
    {
        if(GenderGenerated.sexChoice.equals("Мужской"))
            name = turamiMaleNames[generateNumber.generate(turamiMaleNames.length)];
        else
            name = turamiFemaleNames[generateNumber.generate(turamiFemaleNames.length)];

        surname = turamiSurnames[generateNumber.generate(turamiSurnames.length)];

        subraceOut = "Турамиец";
    }

    void subraceTethirian()
    {
        if(GenderGenerated.sexChoice.equals("Мужской"))
            name = chondathanMaleNames[generateNumber.generate(chondathanMaleNames.length)];
        else
            name = chondathanFemaleNames[generateNumber.generate(chondathanFemaleNames.length)];

        surname = chondathanSurnames[generateNumber.generate(chondathanSurnames.length)];

        subraceOut = "Тетирец";
    }

    void subraceChondathan()
    {
        if(GenderGenerated.sexChoice.equals("Мужской"))
            name = chondathanMaleNames[generateNumber.generate(chondathanMaleNames.length)];
        else
            name = chondathanFemaleNames[generateNumber.generate(chondathanFemaleNames.length)];

        surname = chondathanSurnames[generateNumber.generate(chondathanSurnames.length)];

        subraceOut = "Чондатанец";
    }

    void subraceShou()
    {
        if(GenderGenerated.sexChoice.equals("Мужской"))
            name = shouMaleNames[generateNumber.generate(shouMaleNames.length)];
        else
            name = shouFemaleNames[generateNumber.generate(shouFemaleNames.length)];

        surname = shouSurnames[generateNumber.generate(shouSurnames.length)];

        subraceOut = "Шу";
    }

    void outInfo()
    {
        System.out.println("Раса: " + RaceGenerated.raceChoice);
        System.out.println("Подраса: " + subraceOut);
        System.out.println("Пол: " + GenderGenerated.sexChoice);
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
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
