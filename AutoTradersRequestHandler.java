package Autotraders;

public class AutoTradersRequestHandler {
	AutoTradersRequestHandler(){}
	public static void main(String[] args){
	boolean trade_window=false,suff_points=false;
	int policy_Default=0;	
	//creating Autotraderrequesthandler obj to make use of the setters method
		AutoTradersRequestHandler requestHandler=new AutoTradersRequestHandler();
	//creating AutotraderController obj to access getters and setters methods in that class
		AutotraderController objATController=new AutotraderController();
	//accessing setters methods to set all values
		requestHandler.setters(objATController);
	//creating validator obj
	    Validator objValidator=new Validator();
	//method checking trade window
		trade_window=objValidator.withinTradeWindow();
	//method checking sufficient points
		suff_points=objValidator.sufficientPoints();
	//if the trade window and points are good enough the tradingFactor object is created
		if(trade_window==true && suff_points==true ){
		          TradingManagerFactory objFactory=new TradingManagerFactory();
			      Object tmObj=objFactory.policySelect(policy_Default);
			      ((TradingManagerIntfc) tmObj).exploreTrade();
			      ((TradingManagerIntfc) tmObj).reviseTrade();
			      ((TradingManagerIntfc) tmObj).commitTrade();
		}
		else {
			System.out.println("insufficient or no trade window");
		}
		
		
		
		
	}

public void setters(AutotraderController objATController){
int i=12;
i=objATController.get_quesID();
	System.out.println("all setters methods called here"+i);
	
	
	
}













}
