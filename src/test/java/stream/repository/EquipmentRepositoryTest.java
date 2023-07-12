package stream.service;

import org.junit.jupiter.api.Test;
import stream.model.Equipment;
import stream.model.EquipmentTypeEnum;
import stream.repository.EquipmentRepository;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EquipmentRepositoryTest {

    private EquipmentRepository equipmentRepository = new EquipmentRepository();

    @Test
    public void whenOneEquipmentAddedReturnOneEquipmentInList() {
        equipmentRepository.addEquipment("Samsung A14s 5G", 800.0, EquipmentTypeEnum.SMARTPHONE);
        assertTrue(!equipmentRepository.getEquipments().isEmpty());
        assertEquals(equipmentRepository.getEquipments().size(), 1);
    }

    @Test
    public void whenMoreThanOneEquipmentAddedReturnMoreThanOneEquipmentInList() {
        equipmentRepository.addEquipment("Samsung A14s 5G", 800.0, EquipmentTypeEnum.SMARTPHONE);
        equipmentRepository.addEquipment("HDMI Cable v2.0", 50.0, EquipmentTypeEnum.CABLE);
        assertTrue(!equipmentRepository.getEquipments().isEmpty());
        assertEquals(equipmentRepository.getEquipments().size(), 2);
    }

    @Test
    public void whenEquipmentRemovedNotReturnInResultList() {
        equipmentRepository.addEquipments(getNewEquipmentsList());
        assertTrue(!equipmentRepository.getEquipments().isEmpty());
        assertEquals(equipmentRepository.getEquipments().size(), 2);

        var equipment = equipmentRepository.getEquipmentById(equipmentRepository.getEquipments().get(0).id());
        equipmentRepository.removeEquipment(equipment);
        assertTrue(!equipmentRepository.getEquipments().isEmpty());
        assertEquals(equipmentRepository.getEquipments().size(), 1);
    }

    private List<Equipment> getNewEquipmentsList() {
        var equipmentsList = new ArrayList<Equipment>();
        equipmentsList.add(new Equipment(0, "Samsung A14s 5G", 800.0, EquipmentTypeEnum.SMARTPHONE));
        equipmentsList.add(new Equipment(0, "HDMI Cable v2.0", 50.0, EquipmentTypeEnum.CABLE));
        return equipmentsList;
    }
}
