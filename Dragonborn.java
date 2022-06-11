public class Dragonborn
{
    String []dragonbornMaleNames = {"Аржхан", "Балазар", "Бхараш", "Геш", "Донаар", "Крив", "Медраш", "Мехен", "Надарр", "Панжет", "Патрин", "Рогар", "Тархун", "Торинн", "Хескан", "Шамаш", "Шединн"};

    String []dragonbornFemaleNames = {"Акра", "Бири", "Даар", "Жери", "Кава", "Коринн", "Мишанн", "Нала", "Перра", "Райанн", "Сора", "Сурина", "Тава", "Уаджит", "Фарида", "Хавилар", "Харанн"};

    String []dragonbornClans = {"Вертизатургьеш", "Даардендриан", "Дельмирев", "Драхедандион", "Кепешкмолик", "Керрилон", "Кимбатуул", "Клеттинтьялор", "Линзакасендалор", "Мьястан", "Неммонис",
                                    "Нориксиус", "Офиншталаджиир", "Прексиджандилин", "Турнурот", "Фенкенкабрадон", "Шестенделиат", "Яржерит"};

    String []dragonbornHeritage = {"Белый", "Бронзовый", "Зелёный", "Золотой", "Красный", "Латунный", "Медный", "Серебряный", "Синий", "Чёрный"};

    Generator generateNumber;
    GenderGenerated generateGender;
    AgeGenerated generateAge;
    SizeGenerated generateSize;

    Dragonborn()
    {
        generateNumber = new Generator();
        generateGender = new GenderGenerated();
        generateName();
        generateClan();
        dragonHeritage();
        AgeGenerated.max = 50;
        AgeGenerated.min = 15;
        generateAge = new AgeGenerated();
        generateSize = new SizeGenerated();
    }

    String name;
    void generateName()
    {
        if(GenderGenerated.sexChoice.equals("Мужской"))
            name = dragonbornMaleNames[generateNumber.generate(dragonbornMaleNames.length)];
        else
            name = dragonbornFemaleNames[generateNumber.generate(dragonbornFemaleNames.length)];
    }

    String clan;
    void generateClan()
    {
        clan = dragonbornClans[generateNumber.generate(dragonbornClans.length)];
    }

    String heritage;
    void dragonHeritage()
    {
        heritage = dragonbornHeritage[generateNumber.generate(dragonbornHeritage.length)];
    }

        void dragonbornOutInfo()
    {
        System.out.println("Раса: " + RaceGenerated.raceChoice);
        System.out.println("Пол: " + GenderGenerated.sexChoice);
        System.out.println("Имя: " + name);
        System.out.println("Клан: " + clan);
        System.out.println("Драконье наследие: " + heritage);
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
