package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import src.StudentAnalyzer;

public class StudentAnalyzerTest {

    // --- Test cho hàm countExcellentStudents ---

    @Test
    public void testCountExcellentStudents_NormalCase() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        // 9.0 (Giỏi), 8.5 (Giỏi), 7.0 (Khá), 11.0 (Bỏ qua), -1.0 (Bỏ qua) -> Kết quả: 2
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(2, analyzer.countExcellentStudents(scores), "Phải đếm được 2 học sinh giỏi");
    }

    @Test
    public void testCountExcellentStudents_EmptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()), "Danh sách rỗng phải trả về 0");
    }

    @Test
    public void testCountExcellentStudents_Boundary() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        // 8.0 là biên dưới của loại giỏi -> Phải được đếm
        assertEquals(1, analyzer.countExcellentStudents(Arrays.asList(8.0)), "8.0 phải được tính là giỏi");
        // 7.99 sát biên -> Không được đếm
        assertEquals(0, analyzer.countExcellentStudents(Arrays.asList(7.99)), "7.99 không phải là giỏi");
    }

    // --- Test cho hàm calculateValidAverage ---

    @Test
    public void testCalculateValidAverage_NormalCase() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        // Hợp lệ: 9.0, 8.5, 7.0 (Tổng: 24.5 / 3 = 8.1666...)
        // Không hợp lệ: 11.0, -1.0
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(8.167, analyzer.calculateValidAverage(scores), 0.01, "Điểm trung bình tính sai");
    }

    @Test
    public void testCalculateValidAverage_AllInvalid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        // Không có điểm hợp lệ nào -> Trả về 0
        assertEquals(0.0, analyzer.calculateValidAverage(Arrays.asList(-5.0, 15.0)), 0.001);
    }

    @Test
    public void testCalculateValidAverage_Empty() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0.0, analyzer.calculateValidAverage(Collections.emptyList()), 0.001);
    }
}