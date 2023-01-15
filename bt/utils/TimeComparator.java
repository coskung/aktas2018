package bt.utils;

import java.util.Comparator;

import bt.domain.Order2018;

public class TimeComparator implements Comparator<Order2018>{
    
        public int compare(Order2018 e1, Order2018 e2) {
          if (e1.getOrder_entry_date_and_time().before(e2.getOrder_entry_date_and_time())) {
            return -1;
          } else if (e1.getOrder_entry_date_and_time().after(e2.getOrder_entry_date_and_time())) {
            return 1;
          } else {
            return 0;
          }
        }
}