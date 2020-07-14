package movie.domain.discount;

import movie.domain.Money;
import movie.domain.Screening;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
