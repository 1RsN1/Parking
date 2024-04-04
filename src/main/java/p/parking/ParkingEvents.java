package p.parking;

import java.util.List;

public class ParkingEvents {

    List<List<List<String>>> listWithAccident = List.of();
    List<Class> listClass = List.of(AccidentWithONECar.class, AccidentWithTWOCar.class,
            AccidentWithMOREThenTwoCar.class);
    List<String> journalAfterMath = List.of("Блокировка шлагбаума", "Вызов специальных служб",
            "Оповещение владельцев авто", "Сохранение видео фрагмента аварии");

    private int countOfCarInAccident;
    public void incrementCountOfCarAccident() {
        countOfCarInAccident++;
    }
    public int getCountOfCarAccident() {
        return countOfCarInAccident;
    }

    private int powerContourDeformation;
    public int getPowerContourDeformation() {
        return powerContourDeformation;
    }


}
