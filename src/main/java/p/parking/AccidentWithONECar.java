package p.parking;

import java.util.List;

public class AccidentWithONECar extends ParkingEvents {
    List<String> smallDamage = List.of("Погодные условия", "Умышленное повреждение человеком", "Падение предмета");
    List<String> averageDamage = List.of("Погодные условия", "Умышленное повреждение человеком", "Падение предмета");
    List<String> seriousDamage = List.of("Погодные условия", "Умышленное повреждение человеком", "Падение предмета");
    protected List<List<String>> listWithAccidentForONECar = List.of(smallDamage, averageDamage, seriousDamage);
}
