package classworks.lesson21_20230531.mockito.stub;

import java.util.Collection;

public interface PricingService {

  // [... other methods ...]

  Price getHighestPricedTrade(Collection<Trade> trades);
}