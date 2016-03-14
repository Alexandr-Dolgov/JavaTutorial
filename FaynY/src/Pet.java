public class Pet {
    int age;
    float weight;
    float height;
    String color;

    public void sleep(){//метод можно вызвать из другого класса public
        //не возвращает никаких данных void
        //пустые () не имеет параметров
        System.out.println("Спокойной ночи! До завтра");
    }

    public void eat(){
        System.out.println("Я очень голоден, давайте перекусим чипсами!");

    }

    public String say(String aWord){//метод можно вызвать из другого класса public
    //возвращает текст, это и есть роль ключевого слова String
    //ожидает данные извне, т.к () есть параметр String aWord
    String petResponse = "Ну ладно!! " +aWord;
    return petResponse;
    }

}
//Иногда возникает необходимость определить элемент (член) класса так, чтобы появилась возможность пользоваться им независимо от какого-либо объекта этого класса
//Обычно к элементам класса нужно обращаться только через объект этого класса. Однако можно создать элемент для использова­ния без ссылки на определенный объект.
//Чтобы это сделать, укажите в на­чале его объявления ключевое слово static. Когда элемент объявляется как static, к нему можно обращаться до того,
//как создаются какие-либо объек­ты его класса, и без ссылки на какой-либо объект. Статическими мож­но объявлять как методы, так и переменные.
//Наиболее общим примером static-элемента является метод main(). Он объявляется как static, потому что должен вызваться прежде, чем будут созданы какие-либо объекты
//Методы, объявленные-как static имеют несколько ограничений:
//могут вызывать только другие static-методы;
//должны обращаться только к static-данным;
//никогда не могут ссылаться на this или super.