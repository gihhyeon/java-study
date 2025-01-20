package bufferreader;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class UseBufferedWriter {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("Hello World"); // 버퍼에 출력문 저장( write()으로 출력되는 게 아니라 버퍼에 저장하는 것)

        bw.flush(); // 버퍼 안에 저장되어 있는 모든 문자열을 출력.
        bw.close();

    }
}
