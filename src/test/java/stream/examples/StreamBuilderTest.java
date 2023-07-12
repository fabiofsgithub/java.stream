package stream;

import org.junit.jupiter.api.Test;
import stream.examples.StreamBuilder;

import java.io.IOException;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

public class StreamBuilderTest {

    @Test
    public void whenStreamRequestFromStringListSuccess() {
        assertTrue(Objects.nonNull(StreamBuilder.getStreamFromStringList()));
    }

    @Test
    public void whenStreamRequestFromStringSetSuccess() {
        assertTrue(Objects.nonNull(StreamBuilder.getStreamFromStringSet()));
    }

    @Test
    public void whenStreamRequestFromStringValuesHashMapSuccess() {
        assertTrue(Objects.nonNull(StreamBuilder.getStreamFromStringValuesHashMap()));
    }

    @Test
    public void whenStreamRequestFromIntegerKeysHashMapSuccess() {
        assertTrue(Objects.nonNull(StreamBuilder.getStreamFromIntegerKeysHashMap()));
    }

    @Test
    public void whenStreamRequestFromIntegerValuesSuccess() {
        assertTrue(Objects.nonNull(StreamBuilder.getStreamFromIntegerValues()));
    }

    @Test
    public void whenStreamRequestFromTextFileSuccess() throws IOException {
        var stream = StreamBuilder.getStreamFromTextFile();
        assertTrue(Objects.nonNull(stream));
        assertEquals(stream.count(), 5);
    }

}
