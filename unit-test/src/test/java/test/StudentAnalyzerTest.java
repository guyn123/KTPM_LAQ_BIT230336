package test;

import org.junit.jupiter.api.Test;
import src.StudentAnalyzer;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentAnalyzerTest {

    private final StudentAnalyzer analyzer = new StudentAnalyzer();

    /*
     * =====================================================
     * EP – Equivalence Partitioning
     * =====================================================
     */

    // EP1: scores = null
    @Test
    public void EP_CountExcellent_NullList() {
        assertEquals(0, analyzer.countExcellentStudents(null));
    }

    // EP2: scores rỗng
    @Test
    public void EP_CountExcellent_EmptyList() {
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
    }

    // EP3: điểm hợp lệ & >= 8
    @Test
    public void EP_CountExcellent_ValidExcellentScores() {
        List<Double> scores = Arrays.asList(8.0, 9.5, 10.0);
        assertEquals(3, analyzer.countExcellentStudents(scores));
    }

    // EP4: điểm hợp lệ nhưng < 8
    @Test
    public void EP_CountExcellent_ValidNonExcellentScores() {
        List<Double> scores = Arrays.asList(0.0, 5.5, 7.99);
        assertEquals(0, analyzer.countExcellentStudents(scores));
    }

    // EP5: điểm không hợp lệ
    @Test
    public void EP_CountExcellent_InvalidScoresOnly() {
        List<Double> scores = Arrays.asList(-1.0, 11.0, 100.0);
        assertEquals(0, analyzer.countExcellentStudents(scores));
    }

    // EP6: trộn hợp lệ + không hợp lệ
    @Test
    public void EP_CountExcellent_MixedScores() {
        List<Double> scores = Arrays.asList(9.0, 7.0, -1.0, 11.0);
        assertEquals(1, analyzer.countExcellentStudents(scores));
    }

    /*
     * =====================================================
     * BAV – Boundary Value Analysis
     * =====================================================
     */

    @Test
    public void BAV_CountExcellent_Boundaries() {
        assertEquals(0, analyzer.countExcellentStudents(List.of(-0.01)));
        assertEquals(0, analyzer.countExcellentStudents(List.of(0.0)));
        assertEquals(0, analyzer.countExcellentStudents(List.of(7.99)));
        assertEquals(1, analyzer.countExcellentStudents(List.of(8.0))); // biên quan trọng
        assertEquals(1, analyzer.countExcellentStudents(List.of(10.0)));
        assertEquals(0, analyzer.countExcellentStudents(List.of(10.01)));
    }

    @Test
    public void BAV_CalculateAverage_Boundaries() {
        assertEquals(0.0, analyzer.calculateValidAverage(List.of(-0.01)));
        assertEquals(0.0, analyzer.calculateValidAverage(List.of(10.01)));
        assertEquals(0.0, analyzer.calculateValidAverage(List.of()));
        assertEquals(0.0, analyzer.calculateValidAverage(null));
        assertEquals(5.0, analyzer.calculateValidAverage(List.of(5.0)));
        assertEquals(5.0, analyzer.calculateValidAverage(List.of(0.0, 10.0)));
    }

    /*
     * =====================================================
     * DT – Decision Table Testing
     * =====================================================
     */

    /**
     * Điều kiện:
     * C1: scores null?
     * C2: scores rỗng?
     * C3: có điểm hợp lệ?
     * C4: có điểm >= 8?
     *
     * Hành động:
     * A1: trả về 0
     * A2: đếm số điểm >= 8
     */

    @Test
    public void DT_Case1_NullList() {
        // C1 = true → A1
        assertEquals(0, analyzer.countExcellentStudents(null));
    }

    @Test
    public void DT_Case2_EmptyList() {
        // C2 = true → A1
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
    }

    @Test
    public void DT_Case3_AllInvalidScores() {
        // C3 = false → A1
        List<Double> scores = Arrays.asList(-5.0, 20.0);
        assertEquals(0, analyzer.countExcellentStudents(scores));
    }

    @Test
    public void DT_Case4_ValidButNoExcellent() {
        // C3 = true, C4 = false → A2 = 0
        List<Double> scores = Arrays.asList(5.0, 6.5, 7.99);
        assertEquals(0, analyzer.countExcellentStudents(scores));
    }

    @Test
    public void DT_Case5_HasExcellentStudents() {
        // C3 = true, C4 = true → A2 > 0
        List<Double> scores = Arrays.asList(7.0, 8.0, 9.0);
        assertEquals(2, analyzer.countExcellentStudents(scores));
    }

    @Test
    public void DT_MixedInvalidAndOneExcellent() {
        List<Double> scores = Arrays.asList(-1.0, 8.0, 20.0);
        assertEquals(1, analyzer.countExcellentStudents(scores));
    }

}
