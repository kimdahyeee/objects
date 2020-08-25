package chapter10;

import money.Money;
import org.junit.Test;

import java.time.Duration;
import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RegularPhoneTest {
    @Test
    public void create_phone() {
        Phone phone = new Phone(new RegularPolicy(Money.wons(5), Duration.ofSeconds(10)));
        phone.call(new Call(
                LocalDateTime.of(2020, 1, 1, 12, 10, 0),
                LocalDateTime.of(2020, 1, 1, 12, 11, 0)));
        phone.call(new Call(
                LocalDateTime.of(2020, 1, 2, 12, 10, 0),
                LocalDateTime.of(2020, 1, 2, 12, 11, 0)));

        assertEquals(Money.wons(60), phone.calculateFee());
    }

    @Test
    public void create_basic_phone() {
        Phone phone = new Phone(new RegularPolicy(Money.wons(5), Duration.ofSeconds(10)));
        assertNotNull(phone);
    }

    @Test
    public void create_nightly_phone() {
        Phone phone = new Phone(new NightlyDiscountPolicy(Money.wons(5), Money.wons(10), Duration.ofSeconds(10)));
        assertNotNull(phone);
    }
}