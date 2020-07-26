package chapter2.movie.discount;

import money.Money;
import chapter2.movie.Screening;

public class NonDiscountPolicy implements DiscountPolicy {
    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
