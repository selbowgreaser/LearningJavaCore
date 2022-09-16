import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {
    private final byte[] sequenceByte;

    public AsciiCharSequence(byte[] sequenceByte) {
        this.sequenceByte = sequenceByte.clone();
    }

    @Override
    public int length() {
        return sequenceByte.length;
    }

    @Override
    public char charAt(int index) {
        return (char) sequenceByte[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(sequenceByte, start, end));
    }

    @Override
    public String toString() {
        return new String(sequenceByte);
    }
}
