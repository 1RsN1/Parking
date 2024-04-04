package p.parking;

import java.util.List;

public class AccidentWithTWOCar {
    List<String> smallDamage = List.of("Погодные условия", "Повреждение другого авто своим авто", "Падение предмета");
    List<String> averageDamage = List.of("Погодные условия", "Повреждение другого авто своим авто", "Падение предмета");
    List<String> seriousDamage = List.of("Погодные условия", "Повреждение другого авто своим авто", "Падение предмета");
    protected List<List<String>> listWithAccidentForONECar = List.of(smallDamage, averageDamage, seriousDamage);
}
