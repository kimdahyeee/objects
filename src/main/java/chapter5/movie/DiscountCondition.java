package chapter5.movie;

import chapter5.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
