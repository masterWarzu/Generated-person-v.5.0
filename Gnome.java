public class Gnome
{
    String []gnomeMaleNames = {"Альвин", "Альстон", "Бёрджелл", "Боддинок", "Брок", "Варрин", "Вренн", "Гербо", "Гимбл", "Глим", "Джебеддо", "Димбл", "Зук", "Келлен", "Намфудль", "Оррин", "Рундар" +
                                "Сибо","Синдри", "Фонкин", "Фраг", "Эльдон", "Эрки"};

    String []gnomeFemaleNames = {"Бимпноттин", "Брина", "Вейвокет", "Донелла", "Думавиль", "Занна", "Карамип", "Карлин", "Лилли", "Лорилла", "Лупмоттин", "Марднаб", "Никс", "Нисса", "Ода", "Орла" +
                                    "Ройвин","Тана", "Шамилла", "Элла", "Элливик", "Эллиджобелл"};

    String []gnomeClans = {"Берен", "Гаррик", "Дергель", "Мёрнинг", "Некль", "Нингель", "Рольнор", "Тимберс", "Турен", "Фолькор", "Щеппен"};

    String []gnomeNicknames = {"Барсук", "Блестяшка", "Двухзамок", "Ку", "Ним", "Одна-Туфля", "Оспина", "Пепельник", "Пивохлёб", "Плащик", "Тестохват", "Утковал", "Фниппер"};

    Generator generateNumber;
    GenderGenerated generateGender;
    AgeGenerated generateAge;
    SizeGenerated generateSize;

    Gnome()
    {
        generateNumber = new Generator();
        generateGender = new GenderGenerated();
        generateName();
        generateClan();
        generateNickname();
        AgeGenerated.max = 400;
        AgeGenerated.min = 50;
        generateAge = new AgeGenerated();
        generateSize = new SizeGenerated();
        subraceChoice();
    }

    String name;
    void generateName()
    {
        if(GenderGenerated.sexChoice.equals("Мужской"))
            name = gnomeMaleNames[generateNumber.generate(gnomeMaleNames.length)];
        else
            name = gnomeFemaleNames[generateNumber.generate(gnomeFemaleNames.length)];
    }

    String clan;
    void generateClan()
    {
        clan = gnomeClans[generateNumber.generate(gnomeClans.length)];
    }

    String nickname;
    void generateNickname()
    {
        nickname = gnomeNicknames[generateNumber.generate(gnomeNicknames.length)];
    }

    int subRace;
    void subraceChoice()
    {
        subRace = generateNumber.generate(2);
        if(subRace == 1)
            subraceHighElf();
        else
            subraceForestElf();
    }

    String subraceOut;
    void subraceHighElf()
    {
        subraceOut = "Лесной гном";
    }

    void subraceForestElf()
    {
        subraceOut = "Скальный гном";
    }


    void gnomeOutInfo()
    {
        System.out.println("Раса: " + RaceGenerated.raceChoice);
        System.out.println("Подраса: " + subraceOut);
        System.out.println("Пол: " + GenderGenerated.sexChoice);
        System.out.println("Имя: " + name);
        System.out.println("Клан: " + clan);
        System.out.println("Прозвище: " + nickname);
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
