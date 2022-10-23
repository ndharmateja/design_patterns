package decorator.headfirst_iostreams;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

    // InputStream is the base component
    // FilterInputStream is the base decorator component
    // LowerCaseInputStream is a concrete decorator which transforms the values to
    // lowercase
    // FileInputStream is an example of a concrete component around which decorators
    // are wrapped

    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = in.read();
        return c == -1 ? c : Character.toLowerCase((char) c);
    }

    @Override
    public int read(byte[] b, int offset, int len) throws IOException {
        int result = in.read(b, offset, len);
        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }

}
