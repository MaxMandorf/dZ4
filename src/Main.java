import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Quest 1
        int i = 0;
        while (i < 10) {
            System.out.print(++i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        // Quest 2
        int f = 5;
        for (; f < 31; f += 7)
            System.out.println("Сегодня пятница " + f + "-е число. Необходимо подготовить отчет.");
        // Quest 3
        int curtentYear = LocalDate.now().getYear();
        int earlyYear = curtentYear - 200;
        int lateYear = curtentYear + 100;
        for (int year = earlyYear; year < lateYear; year++) {
            if (year % 79 == 0)
                System.out.println(year);
        }

    }
}