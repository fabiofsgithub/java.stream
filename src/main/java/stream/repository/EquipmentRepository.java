package stream;

import stream.model.Equipment;
import stream.model.EquipmentTypeEnum;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class repository {

    List<Equipment> equipments = new ArrayList<>();

    public void addEquipment(String name, double price) {
        var newId = equipments.stream()
                .mapToInt(Equipment::id)
                .max()
                .orElse(0);

        equipments.add(new Equipment(newId, name, price));
    }

    public void removeEquipment(Equipment equipment) {
        equipments.remove(equipment);
    }

    public Equipment updateEquipment(Equipment updatedEquipment) {
        var deprecatedEquipment = equipments.stream()
                .filter(equipment -> updatedEquipment.id() == updatedEquipment.id())
                .findFirst()
                .orElse(null);

        if (Objects.nonNull(deprecatedEquipment)) {
            equipments.remove(deprecatedEquipment);
            equipments.add(updatedEquipment);
        }

        return updatedEquipment;
    }

    public void addEquipment(String name, double price, EquipmentTypeEnum type) {
        var newId = equipments.stream()
                .mapToInt(Equipment::id)
                .max()
                .orElse(0);

        equipments.add(new Equipment(newId, name, price, type));
    }

    public Equipment getEquipmentById(Integer id) {
        return equipments.stream()
                .filter(equipment -> equipment.id() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Equipment> getEquipmentByTypeOrderByName(EquipmentTypeEnum type) {
        return equipments.stream()
                .filter(equipment -> equipment.type() == type)
                .sorted(Comparator.comparing(Equipment::name))
                .collect(Collectors.toList());
    }

    public List<Equipment> getEquipments() {
        return equipments;
    }

}
