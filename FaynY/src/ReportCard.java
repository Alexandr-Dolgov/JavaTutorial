public class ReportCard {
    /*
Mетод convertGrades принимает один целочисленный аргумент
- результат теста и возвращает символ A, B, C or D в
зависимости от этого аргумента.
     */
    public static char convertGrades(int testResult){
        char grade;//локальная переменная внутри метода, после выполнения метода удаляется из памяти
        if (testResult >=90){
            grade = 'A';
        }else if (testResult >=80 && testResult <90){
            grade = 'B';
        }else if (testResult >=70 && testResult <80){
            grade = 'C';
        }else {
            grade = 'D';
        }
        return  grade;
    }

    public static void main(String[] args) {
        //ReportCard reportCard = new ReportCard();
        //char yourGrande = reportCard.convertGrades(88);
        convertGrades(88);

//        System.out.println("Ваша первая оценка " + yourGrande);
//        yourGrande = reportCard.convertGrades(79);
//        System.out.println("Ваша вторая оценка " + yourGrande);
    }
}
