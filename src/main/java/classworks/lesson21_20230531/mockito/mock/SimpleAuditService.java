package classworks.lesson21_20230531.mockito.mock;

public class SimpleAuditService implements AuditService {
  @Override
  public void logNewTrade(Trade trade) {
    throw new RuntimeException("implement logNewTrade() in SimpleAuditService");
  }
}