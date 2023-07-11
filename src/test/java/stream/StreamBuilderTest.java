package stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Objects;

public class StreamBuilderTest {

    @Test
    public void whenStreamRequestFromStringListSuccess() {
        Assertions.assertTrue(Objects.nonNull(StreamBuilder.getStreamFromStringList()));
    }

    @Test
    public void whenStreamRequestFromStringSetSuccess() {
        Assertions.assertTrue(Objects.nonNull(StreamBuilder.getStreamFromStringSet()));
    }

    @Test
    public void whenStreamRequestFromStringValuesHashMapSuccess() {
        Assertions.assertTrue(Objects.nonNull(StreamBuilder.getStreamFromStringValuesHashMap()));
    }

    @Test
    public void whenStreamRequestFromIntegerKeysHashMapSuccess() {
        Assertions.assertTrue(Objects.nonNull(StreamBuilder.getStreamFromIntegerKeysHashMap()));
    }

    @Test
    public void whenStreamRequestFromIntegerValuesSuccess() {
        Assertions.assertTrue(Objects.nonNull(StreamBuilder.getStreamFromIntegerValues()));
    }

    @Test
    public void whenStreamRequestFromIntegerArraySuccess() {
        Assertions.assertTrue(Objects.nonNull(StreamBuilder.getStreamFromIntegerArray()));
    }

    @Test
    public void whenStreamRequestFromTextFileSuccess() throws IOException {
        var stream = StreamBuilder.getStreamFromTextFile();
        Assertions.assertTrue(Objects.nonNull(stream));
        Assertions.assertEquals(stream.count(), 5);
    }
}
