package classworks.lesson21_20230531.mockito.test.mockTest;

//package _2023_05_31.mockito.test.mockTest;
//
//import _2023_05_31.mockito.mock.*;
//
//import org.mockito.*;
//import static org.mockito.Mockito.*;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//
//@ExtendWith(MockitoExtension.class)
//class SimpleAuditServiceTest {
//
//	@Mock  // actually, this is a stub
//    TradeRepository tradeRepository;
//
//	@Mock
//    Trade trade;
//
//	@Mock  // and this one is indeed a mock
//    AuditService auditService;
//
//	@Test
//	public void testAuditLogEntryMadeForNewTrade() throws Exception {
//	//	Trade trade = new Trade("Ref 1", "Description 1");
//
//		when(tradeRepository.createTrade(trade)).thenReturn(anyLong());
//
//		TradingService tradingService = new SimpleTradingService(tradeRepository, auditService);
//		tradingService.createTrade(trade);
//
//		verify(auditService).logNewTrade(trade);
//	}
//}