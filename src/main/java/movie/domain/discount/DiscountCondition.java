package movie.domain.discount;

import movie.domain.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
