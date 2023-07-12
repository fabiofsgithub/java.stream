package stream;

import org.junit.jupiter.api.Test;
import stream.examples.StreamService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StreamServiceTest {

    @Test
    public void whenEquipmentFilteredByPriceHasNoElementsOverpriced() {
        var overpricedEquipments = StreamService.getEquipmentWithPriceLessThan(100.0)
                .stream().filter(equipment -> equipment.getPrice() >= 100)
                .count();

        assertEquals(overpricedEquipments, 0);
    }

    @Test
    public void whenEquipmentNameListRequestedElementExists() {
        var equipmentName = "Equipment{id=1, name='Keyboard'}";
        var equipmentFound = StreamService.getEquipmentNameList().stream()
                .filter(name -> name.equals(equipmentName))
                .distinct()
                .findFirst();
        assertTrue(equipmentFound.isPresent());
        assertTrue(equipmentFound.get().equals(equipmentName));
    }
}
