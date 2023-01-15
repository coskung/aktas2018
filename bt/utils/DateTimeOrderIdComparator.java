package bt.utils;

import java.util.Comparator;

import bt.domain.Order2018;

public class DateTimeOrderIdComparator implements Comparator<Order2018>{
    
    public int compare(Order2018 e1, Order2018 e2) {
        if (e1.getOrder_entry_date_and_time().compareTo(e2.getOrder_entry_date_and_time())<0) {
          return -1;
        } else if (e1.getOrder_entry_date_and_time().compareTo(e2.getOrder_entry_date_and_time())>0) {
          return 1;
        } else {
        	if (e1.getGirisSaati().compareTo(e2.getGirisSaati())<0) {
                return -1;
              } else if (e1.getGirisSaati().compareTo(e2.getGirisSaati())>0) {
                return 1;
              } else {
            	  if (e1.getUnique_order_id().compareTo(e2.getUnique_order_id())<0) {
                      return -1;
                    } else if (e1.getUnique_order_id().compareTo(e2.getUnique_order_id())>0) {
                      return 1;
                    } else {
                    	return 0;
                    }
              }
        }
      }
}
