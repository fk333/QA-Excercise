package domain;

public class Stock {
	public int stockId;
	public String stockName;
	public int stockQty;
	public float stockPrice;
	
	public void showStock()
	{
		System.out.println(stockId+"--"+stockName+"--"+stockQty+"--"+stockPrice);
}
}