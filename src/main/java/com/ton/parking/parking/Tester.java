package com.ton.parking.parking;

import sun.java2d.pipe.SpanShapeRenderer;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Tester {
    public static void main(String[] args) {
        LocalDateTime enter =
                LocalDateTime.of(2018, 11  , 25 ,8,0,0) ;
        LocalDateTime leave =
                LocalDateTime.of(2018 , 11 , 25 , 10 ,30,0);
      Car car = new Car("AA-001" ,enter);
      car .setLeave(leave);
        System.out.println(car.getDuration());
        long hours =(long) Math.ceil(car.getDuration()/60.0);
        System.out.println( hours);
        System.out.println(30*hours);
        //time();


        //java();
    }

    private static void time() {
        Instant instant = Instant.now();
        System.out.println(instant);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
    }

    private static void java() {
        Date date = new Date();
        System.out.println(date.getTime());
        SimpleDateFormat pdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(pdf.format(date));
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONDAY ,9);
        System.out.println(calendar.getTime());
    }
}
