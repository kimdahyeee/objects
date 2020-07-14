package movie.domain.discount;

import movie.domain.Money;
import movie.domain.Screening;

public class NonDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
