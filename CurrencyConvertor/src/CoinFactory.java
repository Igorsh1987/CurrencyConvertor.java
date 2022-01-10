public class CoinFactory {
    private static Coins getCoinInstanse(Coins coin) {
        switch (coin) {
            case ILS:
                return Coins.ILS;
            case USD:
                return Coins.USD;
        }
        return coin;
    }
}



