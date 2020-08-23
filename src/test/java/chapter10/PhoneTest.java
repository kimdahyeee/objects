package chapter10;

import money.Money;
import org.junit.Test;

import java.time.Duration;
import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;

public class PhoneTest {
    @Test
    public void create_phone() {
        Phone phone = new Phone(Money.wons(5), Duration.ofSeconds(10));
        phone.call(new Call(
                LocalDateTime.of(2020, 1, 1, 12, 10, 0),
                LocalDateTime.of(2020, 1, 1, 12, 11, 0)));
        phone.call(new Call(
                LocalDateTime.of(2020, 1, 2, 12, 10, 0),
                LocalDateTime.of(2020, 1, 2, 12, 11, 0)));

        assertEquals(Money.wons(60.0), phone.calculateFee());
    }
}