public class Fish extends Pet{

    int currentDepth=0;/*атрибут класса или экземпляра класса, срок жижни такой же как и у объекта Fish,
могут использоваться всеми методами класса и в некоторых случаях доступны для др. классов
*/
    public static void main(String[] args) {
      Fish myLittleFish = new Fish();
      myLittleFish.sleep();
    }

    public int dive(int howDeep){
        currentDepth = currentDepth + howDeep;
        if (currentDepth > 100){
            System.out.println("Я маленькая рыбка " + " и не могу плавать глубже 100 метров");
            currentDepth = currentDepth - howDeep;

        }else {
            System.out.println("погружаюсь ещё на " + howDeep + " метров");
            System.out.println("Я на глубине " + currentDepth + " футов");
        }


        return currentDepth;//возвращает значение вызывающему классу
    }
    public String say(String something){

        return "Ты чё не знаешь, что рыбы не разговаривают?";
    }

}
