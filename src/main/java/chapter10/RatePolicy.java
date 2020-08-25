package chapter10;

import money.Money;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
