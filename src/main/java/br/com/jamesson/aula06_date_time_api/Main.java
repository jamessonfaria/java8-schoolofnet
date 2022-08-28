package br.com.jamesson.aula06_date_time_api;

import java.time.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // a data e hora atual no formato ISO
        Instant now = Instant.now();
        Thread.sleep(1000);
        Instant now2 = Instant.now();

        // permite realizar a comparacao entre datas
        Duration dur = Duration.between(now, now2);
        System.out.println(dur.getSeconds());

        // LocalDate - data formatada
        LocalDate local = LocalDate.now();
        System.out.println(local);

        LocalDate birthday = LocalDate.of(1979,10,19);
        System.out.println(birthday);

        LocalDate birthday2 = LocalDate.of(1990,2,1);
        // Period - para comparacao entre datas
        Period period = Period.between(birthday, birthday2);
        System.out.printf("%s %s %s \n", period.getYears(), period.getMonths(), period.getDays());

        // LocalTime - hora formatada
        LocalTime time = LocalTime.now();
        System.out.println(time);
    }

}
