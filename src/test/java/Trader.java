import java.util.*;

import lombok.Value;

public class Trader {

    public enum Stock{ IBM, GOOG, APPL, TSLA; }

    private final HashMap<Stock, Double> prices;


    public Trader(HashMap<Stock, Double> prices) {
        this.prices = prices;
    }

    @Value
    public static class Position{
        Stock stock;
        int quantity;
    }

    @Value
    public static class TradeOrder{
        public enum Order { BUY, SELL; }
        Order order;
        Stock stock;
        int quantity;
    }

    /*
      Compares the current positions' value to the expected weights and creates BUY/SELL orders to
      get closer to the expected weights.
      1. Currect positions' value: IBM XX, GOOG XX, APPL XX, TSLA XX (XX- stock price)
      2. Expected weight: IBM 0.3, GOOG 0.5, APPL 0.1, TSLA 0.6

      The portfolio should not get into a negative cash balance after the transactions,
      there should not be trades smaller than $1000 (because commissions will eat up our profits!)
      test cases:
      1. portfolio >= 0
      2. trades >= 1000


      @param currentPositions what we currently have
      @param expectedWeights what the value of positions should be, e.g. TSLA 0.6, IBM 0.3, AAPL 0.1
                             means that a $100 portfolio should contain $60 worth of TSLA, $30 IBM, $10 AAPL
      @return list of trades to execute to get closer to the expected weights
     */
    public List<TradeOrder> rebalance(List<Position> currentPositions, Map<Stock, Double> expectedWeights){
        return Collections.emptyList();
    }
}
