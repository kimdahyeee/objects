package chapter2.movie.discount;

import chapter2.movie.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
