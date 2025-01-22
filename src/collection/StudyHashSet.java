package collection;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 1. HashSet은 중복된 값을 허용하지 않는다.
 * 2. 저장한 순서가 보장되지 않는다. (저장 순서를 유지해야 되면 LinkedHashSet 사용)
 * 3. null을 값으로 허용한다.
 */
public class StudyHashSet {

    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<Integer>(); // HashSet 생성
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3)); // 초기값 지정

        set1.add(1); // 값 추가
        set1.add(2);

        set1.remove(1); // 값 1 제거
        set1.clear(); // 모든 값 제거

        System.out.println(set2.size()); // set 크기 : 3

        System.out.println(set1); // HashSet 값 전체 출력

        System.out.println(set1.contains(1)); // set 내부에 1이 있는지 확인
    }
}
