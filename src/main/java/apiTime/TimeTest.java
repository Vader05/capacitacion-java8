package apiTime;

import java.time.*;

public class TimeTest {
    public static void main(String[] args) {
        LocalDate ahora = LocalDate.now();
        LocalDate fecha =LocalDate.of(2021, 8, 8);
        LocalDate fechaText = LocalDate.parse("2022-08-08");

        System.out.println(ahora);//2022-08-08

        LocalDate mañana = LocalDate.now().plusDays(1);
        //System.out.println(fecha);

        Period periodo = Period.between(ahora, fecha);
        //System.out.println(periodo.getMonths());




        //localTime
        LocalTime now = LocalTime.now();

        LocalTime doce30 = LocalTime.of(12, 30);
        LocalTime doce30Text = LocalTime.parse("12:30");


        //LocalDateTime

        LocalDateTime tiempoyfecha = LocalDateTime.now();

        LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);
        LocalDateTime.parse("2015-02-20T06:30:00");

        //System.out.println(tiempoyfecha);



        //duration

        LocalTime initialTime = LocalTime.of(6, 30, 0);

        LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));

        long duracion = Duration.between(initialTime, finalTime).getSeconds();

    }
}
