package stream;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBuilder {

    public static Stream<String> getStreamFromStringList() {
        return List.of("Primeiro Elemento", "Segundo Elemento", "Terceiro Elemento").stream();
    }

    public static Stream<String> getStreamFromStringSet() {
        return Set.of("Primeiro Elemento", "Segundo Elemento", "Terceiro Elemento").stream();
    }

    public static Stream<String> getStreamFromStringValuesHashMap() {
        return getExampleHashMap().values().stream();
    }

    public static Stream<Integer> getStreamFromIntegerKeysHashMap() {
        return getExampleHashMap().keySet().stream();
    }

    public static Stream<Integer> getStreamFromIntegerValues() {
        return Stream.of(1, 2, 3, 4, 5);
    }

    public static IntStream getStreamFromIntegerArray() {
        return Arrays.stream(new int[] {1, 2, 3, 4, 5});
    }

    public static Stream<String> getStreamFromTextFile() throws IOException {
        return Files.lines(Paths.get("src/main/resources/example.txt"), Charset.defaultCharset());
    }

    private static HashMap<Integer, String> getExampleHashMap() {
        var map = new HashMap<Integer, String>();
        map.put(1, "Primeiro Elemento");
        map.put(2, "Segundo Elemento");
        map.put(3, "Terceiro Elemento");
        return map;
    }

}
