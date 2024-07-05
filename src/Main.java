public class Main {
    public static void main(String[] args) {

        System.out.println("Hello JavaWorld and JavaDeveloper!");
        System.out.println("*****");

        //task1
        int monthNumber = 1;
        int sum = 0;
        int expectedBalance = 2_459_000;
        while (sum < expectedBalance) {
            sum += 15000;
            System.out.println("В этом месяце сумма накоплений равна\n" + sum);
            monthNumber++;
            if (sum >= expectedBalance) {
                break;
            }
        }
        System.out.println("***end of the task 1***");


        //task2
        int num = 1;
        while (num <= 10) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
        for (num = 10; num > 0; num--) {
            System.out.print(num + " ");
        }

        System.out.println("\n***end of the task 2***");


        //task3
        int population = 12_000_000;
        for (int i = 1; i <= 10; i++) {
            int birthRate = 17 * population / 1000;
            int deathRate = 8 * population / 1000;
            population = population + birthRate - deathRate;
            System.out.println("В этом году население составит " + population + " человек");
        }
        System.out.println("***end of the task 3***");

        //task4
        int theFirstContribution = 15000;
        int monthNum = 1;
        while (theFirstContribution <= 12_000_00) {
            theFirstContribution *= 1.07;
            System.out.printf("\nВ этом месяце сумма вклада будет\n " + theFirstContribution);
            monthNum++;
        }
        System.out.println("\n***end of the task 4***");


        //task5
        int theContribution = 15000;
        int theFirstNum = 0;
        int i=0;
        for(;theContribution<=12_000_000;i++) {
            theContribution *= 1.07;
            if (theFirstNum % 6 == 0) {
                System.out.println("Это будет месяц номер " + i + " и сумма накоплений будет " + theContribution+" рублей.");
            }
        }
        System.out.println(theContribution);
            System.out.println("\n***end of the task 5***");

            //task6
            //обращаю внимание,что в этой задаче стандортное i внутри цикла заменил на l
        int years=9;
        int halfYears=years*2;
        double total=15000;
        for (int l=0;l<halfYears;l++){
            total=total*1.07+total;
            System.out.printf(" Сумма накоплений за "+(l+1)+"полугодие равна: "+total);}
        System.out.println("\n***end of the task 6");


        //task7
        int currentFriday;
        int currentDay;
        for(int day=0;day<31;day++){
            System.out.println("Сегодня "+(day+1)+"."+(day%7==0?"пятница отчётный день":"рабочий день"));}
        System.out.println("***end of task 7***");

        //task8
        int currentYear=2024;
        int begin=currentYear-200;
        int end=currentYear+100;
        int count;
        for(count=0;count<end;count=count+79){
            if (count >= begin) {
                System.out.println(count);}
                                              }
        System.out.println("***end of task 8***");
    }
}