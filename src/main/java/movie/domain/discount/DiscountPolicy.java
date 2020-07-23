package movie.domain.discount;

import money.Money;
import movie.domain.Screening;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
