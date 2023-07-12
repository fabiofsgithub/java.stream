package stream;

import stream.domain.Equipment;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class StreamBuilder {

    public static Stream<String> getStreamFromStringList(String... elements) {
        return List.of(elements).stream();
    }

    public static Stream<String> getStreamFromStringSet(String... elements) {
        return Set.of(elements).stream();
    }

    public static Stream<String> getStreamFromStringValuesHashMap() {
        return getExampleHashMap().values().stream();
    }

    public static Stream<Integer> getStreamFromIntegerKeysHashMap() {
        return getExampleHashMap().keySet().stream();
    }

    public static Stream<Integer> getStreamFromIntegerValues(Integer... elements) {
        return Stream.of(elements);
    }

    public static Stream<String> getStreamFromTextFile() throws IOException {
        return Files.lines(Paths.get("src/main/resources/example.txt"), Charset.defaultCharset());
    }

    public static Stream<Equipment> getEquipmentStream() {
        List<Equipment> equipments = new ArrayList<>();
        equipments.add(new Equipment(1, "Keyboard", 10.0));
        equipments.add(new Equipment(2, "Monitor", 200.0));
        equipments.add(new Equipment(3, "Smart TV", 500.0));
        equipments.add(new Equipment(4, "Mouse", 5.0));

        return equipments.stream();
    }

    private static HashMap<Integer, String> getExampleHashMap() {
        var map = new HashMap<Integer, String>();
        map.put(1, "Primeiro Elemento");
        map.put(2, "Segundo Elemento");
        map.put(3, "Terceiro Elemento");
        return map;
    }
}
