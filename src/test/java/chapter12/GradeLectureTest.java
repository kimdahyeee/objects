package chapter12;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class GradeLectureTest {
    @Test
    public void grade_lecture_evaluate() {
        Lecture lecture = new GradeLecture(70, "객체 지향 프로그래밍",
                Arrays.asList(81, 95, 75, 50, 45),
                Arrays.asList(
                        new Grade("A", 100, 95),
                        new Grade("B", 94, 80),
                        new Grade("C", 79, 70),
                        new Grade("D", 69, 50),
                        new Grade("F", 49, 0)));

        assertEquals("Pass:3 Fail:2, A:1 B:1 C:1 D:1 F:1", lecture.evaluate());
    }
}