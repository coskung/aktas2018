package bt.utils;

import java.util.Comparator;

import bt.domain.Trade2018;

public class TimeComparatorForIslem implements Comparator<Trade2018>{
    
	public int compare(Trade2018 e1, Trade2018 e2) {
	    return e1.getTrade_time().compareTo(e2.getTrade_time());
//	    if (e1.get.before(e2.getTime())) {
//	          return -1;
//	        } else if (e1.getTime().after(e2.getTime())) {
//	          return 1;
//	        } else {
//	          return 0;
//	        }
	}
}
