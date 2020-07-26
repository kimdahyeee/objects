package chapter2.movie.discount;

import money.Money;
import chapter2.movie.Screening;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
