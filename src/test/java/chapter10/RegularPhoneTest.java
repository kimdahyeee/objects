package chapter10;

import money.Money;
import org.junit.Test;

import java.time.Duration;
import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;

public class RegularPhoneTest {
    @Test
    public void create_phone() {
        RegularPhone regularPhone = new RegularPhone(Money.wons(5), Duration.ofSeconds(10));
        regularPhone.call(new Call(
                LocalDateTime.of(2020, 1, 1, 12, 10, 0),
                LocalDateTime.of(2020, 1, 1, 12, 11, 0)));
        regularPhone.call(new Call(
                LocalDateTime.of(2020, 1, 2, 12, 10, 0),
                LocalDateTime.of(2020, 1, 2, 12, 11, 0)));

        assertEquals(Money.wons(60.0), regularPhone.calculateFee());
    }
}