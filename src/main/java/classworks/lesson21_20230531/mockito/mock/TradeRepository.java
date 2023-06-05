package classworks.lesson21_20230531.mockito.mock;

import java.util.*;

public class TradeRepository {
  Map<Long, Trade> trades = new HashMap<>();

  public void addTrade(long id, Trade trade) {
    trades.put(id, trade);
  }

  public Long createTrade(Trade trade) {
    long id = trades.size() + 1;
    addTrade(id, trade);
    return id;
  }
}