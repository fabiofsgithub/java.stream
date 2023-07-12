package stream.domain;

import java.util.ArrayList;
import java.util.List;

public class EquipmentService {

    List<Equipment> equipments = new ArrayList<>();

    public void addEquipment(String name, double price) {

        var newId = equipments.stream()
                .mapToInt(Equipment::getId)
                .max()
                .orElse(0);

        equipments.add(new Equipment(newId, name, price));
    }

    public List<Equipment> getEquipments() {
        return equipments;
    }

    public Equipment getEquipmentById(Integer id) {
        return equipments.stream()
                .filter(equipment -> equipment.getId() == id)
                .findFirst()
                .orElse(null);
    }



}
