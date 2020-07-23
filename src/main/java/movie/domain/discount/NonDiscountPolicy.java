package movie.domain.discount;

import money.Money;
import movie.domain.Screening;

public class NonDiscountPolicy implements DiscountPolicy {
    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
