package bt.utils;

import java.util.Comparator;

import bt.domain.Trade2018;

public class TradeIdComparatorForIslem implements Comparator<Trade2018>{
    
	public int compare(Trade2018 e1, Trade2018 e2) {
	    
	    return e1.getTrade_number().compareTo(e2.getTrade_number());
	    
	    //if (e1.getTime().before(e2.getTime())) {
//	    	if (e1.getIslemNo().compareTo(e2.getIslemNo())<0) {
//	          return -1;
//	        } else if (e1.getSequence()>e2.getSequence()) {
//	          return 1;
//	        } else {
//	          return 0;
//	        }
	}
}
