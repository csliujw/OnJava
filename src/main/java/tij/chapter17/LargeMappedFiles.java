package tij.chapter17_stander_io;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class LargeMappedFiles {
    static int length = 0x8000000; // 128 MB

    public static void
    main(String[] args) throws Exception {
        try (RandomAccessFile tdat = new RandomAccessFile("test.dat", "rw")) {
            MappedByteBuffer out = tdat.getChannel()
                    .map(FileChannel.MapMode.READ_WRITE, 0, length);
            long start = System.currentTimeMillis();
            for (int i = 0; i < length; i++) {
                out.put((byte) 'x');
            }
            long end = System.currentTimeMillis();
            System.out.println(end - start);
            start = System.currentTimeMillis();
            System.out.println("Finished writing");
            for (int i = length / 2; i < length / 2 + 6; i++) {
                System.out.print((char) out.get(i));
            }
            end = System.currentTimeMillis();
            System.out.println(end - start);
        }
    }
}
