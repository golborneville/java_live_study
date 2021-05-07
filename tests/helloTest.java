import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class helloTest {

    private static hello a;
    private static int[] num = {1412, 2222, 1010, 3045, 10001000, 3129430, 3333};
    private static boolean[] evl = {true, true, false, false, false, false, true};

    //테스트 코드의 기본 형태
    @BeforeAll
    static void setUp() {
        //여기에 테스트 코드 수행 전 실행할 작업 작성
        a = new hello();
    }
    @DisplayName("정확도 테스트")
    @Test
    void solution() {
     //여기에 테스트 코드 작성
        assertAll("Heading",
                () -> assertFalse(a.solution(1412)),
                () -> assertTrue(a.solution(2222)),
                () -> assertFalse(a.solution(1010)),
                () -> assertFalse(a.solution(3045)),
                () -> assertFalse(a.solution(10001000)),
                () -> assertFalse(a.solution(3129430)),
                () -> assertTrue(a.solution(3333)));
    }

    @DisplayName("효율성 테스트")
    @Test
    void tle() {
        assertAll("Heading",
                () -> assertTimeout(Duration.ofMillis(0), () -> a.solution(1412)),
                () -> assertTimeout(Duration.ofMillis(0), () -> a.solution(2222)),
                () -> assertTimeout(Duration.ofMillis(0), () -> a.solution(1010)),
                () -> assertTimeout(Duration.ofMillis(0), () -> a.solution(3045)),
                () -> assertTimeout(Duration.ofMillis(0), () -> a.solution(10001000)),
                () -> assertTimeout(Duration.ofMillis(0), () -> a.solution(3129430)),
                () -> assertTimeout(Duration.ofMillis(0), () -> a.solution(3333)));
    }
}