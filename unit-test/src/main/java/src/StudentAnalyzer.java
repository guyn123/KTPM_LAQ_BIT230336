package src;

import java.util.List;

public class StudentAnalyzer {

    /**
     * Phân tích điểm số và trả về số lượng học sinh đạt loại Giỏi.
     * 
     * @param scores danh sách điểm số từ 0 đến 10
     * @return số học sinh đạt loại Giỏi (>= 8.0)
     */
    public int countExcellentStudents(List<Double> scores) {
        if (scores == null || scores.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (Double score : scores) {
            // Bỏ qua điểm không hợp lệ
            if (score < 0 || score > 10) {
                continue;
            }
            // Đếm học sinh giỏi
            if (score >= 8.0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Tính điểm trung bình hợp lệ (từ 0 đến 10)
     * 
     * @param scores danh sách điểm
     * @return điểm trung bình của các điểm hợp lệ
     */
    public double calculateValidAverage(List<Double> scores) {
        if (scores == null || scores.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        int validCount = 0;

        for (Double score : scores) {
            // Chỉ tính toán các điểm hợp lệ
            if (score >= 0 && score <= 10) {
                sum += score;
                validCount++;
            }
        }

        // Tránh lỗi chia cho 0 nếu không có điểm nào hợp lệ
        if (validCount == 0) {
            return 0.0;
        }

        return sum / validCount;
    }
}