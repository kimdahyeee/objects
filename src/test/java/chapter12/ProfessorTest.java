package chapter12;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ProfessorTest {
    @Test
    public void call_lecture() {
        Professor professor = new Professor("다익스트라",
                new Lecture(70, "알고리즘", Arrays.asList(81, 95, 75, 50, 45)));

        assertEquals("[다익스트라] Pass:3 Fail:2 - Avg: 69.2", professor.compileStatistics());
    }

    @Test
    public void call_gradeLecture() {
        Professor professor = new Professor("다익스트라",
                new GradeLecture(70, "알고리즘",
                        Arrays.asList(81, 95, 75, 50, 45),
                        Arrays.asList(
                                new Grade("A", 100, 95),
                                new Grade("B", 94, 80),
                                new Grade("C", 79, 70),
                                new Grade("D", 69, 50),
                                new Grade("F", 49, 0))));

        assertEquals("[다익스트라] Pass:3 Fail:2, A:1 B:1 C:1 D:1 F:1 - Avg: 69.2", professor.compileStatistics());
    }
}