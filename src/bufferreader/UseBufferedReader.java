package bufferreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Bufferedreader
 * 개행 문자만 경계로 인식하고 입력 받은 데이터가 String으로 고정됨.
 * 그래서 데이터를 따로 가공해야하는 경우가 많음.
 * Scanner보다 속도가 빠름.
 * 버퍼 사이즈는 8192 char이어서 입력이 많을 때 유리하다.
 */
public class UseBufferedReader {
    public static void main(String[] args) throws IOException {
        // BufferedReader 사용할 땐 예외 처리 꼭 해줘야 함.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // String
        String s = br.readLine();

        // int
        int n = Integer.parseInt(br.readLine());

        // 공백 부분 방법1
        StringTokenizer st = new StringTokenizer(s); // StringTokenizer 인자 값에 입력 문자열이 들어감
        int a = Integer.parseInt(st.nextToken()); // 첫번째 호출
        int b = Integer.parseInt(st.nextToken()); // 두번째 호출

        // 공백 구분 방법2
        String array [] = s.split(" "); // 공백마다 데이터를 끊어서 배열에 넣는다.

        br.close();

        /**
         * 자바에서는 Garbage Collection에 의해 내부 객체 및 리소스들이 정리되기 때문에
         * close()를 꼭 호출하지 않아도 자동으로 정리가 되어 문제가 발생하지 않음.
         * 하지만 최적화 관점에서 close()를 호출해 스트림을 종료해주는 것이 좋음.
         */


    }
}
