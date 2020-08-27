package chapter12;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class LectureTest {
    @Test
    public void print_lecture_evaluate() {
        Lecture lecture = new Lecture(70, "객체 지향 프로그래밍", Arrays.asList(81, 95, 75, 50, 45));
        assertEquals("Pass:3 Fail:2", lecture.evaluate());
    }
}