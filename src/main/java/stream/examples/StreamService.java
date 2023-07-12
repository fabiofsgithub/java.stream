package stream;

import stream.domain.Equipment;
import stream.examples.StreamBuilder;

import java.util.List;
import java.util.stream.Collectors;

public class StreamService {

    public static List<Equipment> getEquipmentWithPriceLessThan(Double referencePrice) {
        return StreamBuilder.getEquipmentStream()
                .filter(equipment -> equipment.price() < referencePrice)
                .collect(Collectors.toList());
    }

    public static List<String> getEquipmentNameList() {
        return StreamBuilder.getEquipmentStream()
                .map(Equipment::toString)
                .collect(Collectors.toList());
    }

}
