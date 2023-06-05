package classworks.lesson21_20230531.mockito.stub;

public class PricingRepository {

  // [... other methods ...]

  public Price getPriceForTrade(Trade trade) {
    return trade.price;
  }
}