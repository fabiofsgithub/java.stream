package java;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamBuilder {

    public Stream<String> getStreamFromStringList() {
        return List.of("Primeiro Elemento", "Segundo Elemento", "Terceiro Elemento").stream();
    }

    public Stream<String> getStreamFromStringSet() {
        return Set.of("Primeiro Elemento", "Segundo Elemento", "Terceiro Elemento").stream();
    }

    public Stream<String> getStreamFromStringValuesHashMap() {
        return getExampleHashMap().values().stream();
    }

    public Stream<Integer> getStreamFromIntegerKeysHashMap() {
        return getExampleHashMap().keySet().stream();
    }

    private HashMap<Integer, String> getExampleHashMap() {
        var map = new HashMap<Integer, String>();
        map.put(1, "Primeiro Elemento");
        map.put(2, "Segundo Elemento");
        map.put(3, "Terceiro Elemento");
        return map;
    }
}
