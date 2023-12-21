package com.waterquality.entity;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Sensor {
    private int id;


    @Setter @Getter private String devicedId;
    @Setter @Getter private int month;
    @Setter @Getter private int year;
    @Setter @Getter private long pH;
    @Setter @Getter private long barium;
    @Setter @Getter private long copper;
    @Setter @Getter private long iron;
    @Setter @Getter private long viruses;



    @Override
    public String toString() {
        return "Sensor{" +
                "id=" + id +
                ", devicdId='" + devicedId + '\'' +
                ", month=" + month +
                ", year=" + year +
                ", pH=" + pH +
                ", barium=" + barium +
                ", copper=" + copper +
                ", iron=" + iron +
                ", viruses=" + viruses +
                '}';
    }



}
