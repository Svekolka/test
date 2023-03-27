public class PhraseOMatic {
    private String phrase;

    String[] wordListOne = {"круглосуточный", "взаимный", "обоюдный выигрыш", "на основе веб-технологий", "проникающий",
            "умный", "динамичный", "фронтэнд", "метод критического пути"};
    String[] wordListTwo = {"уполномоченный", "трудный", "чистый продукт", "ориентированный", "центральный", "распределенный",
            "фирменный", "кластеризованный", "нестандартный ум", "позиционированный", "сетевой", "сфокусированный",
            "использованный с выгодой", "нацеленый на", "общий объем", "совместный", "ускоренный"};
    String[] wordListThree = {"процесс", "пункт разгрузки", "выход из положения", "тип структуры", "талант", "подход",
            "уровень завоеванного внимания", "портал", "период времени", "обзор", "образец", "пункт следования"};
    int oneLenght = wordListOne.length;
    int twoLenght = wordListTwo.length;
    int threeLenght = wordListThree.length;

    int rand1 = (int) (Math.random() * oneLenght);
    int rand2 = (int) (Math.random() * twoLenght);
    int rand3 = (int) (Math.random() * threeLenght);

    public void randomPhrase() {
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("Всё, что нам нужно - это "+ phrase +".");
    }
}
