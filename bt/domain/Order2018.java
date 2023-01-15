package bt.domain;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Order2018 {

    static DateFormat dateFormatForFile = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    static DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy HH:mm:ss", Locale.ENGLISH);
    static DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss.SSS", Locale.ENGLISH);

    
    //UNIQUE ORDER ID;ORDER NR;PREVIOUS ORDER NR;ORDER ENTRY DATE AND TIME;ORDER CHANGE DATE AND TIME;INSTRUMENT ID;MARKET CODE;
    //START DATE;CURRENCY;BUY/SELL;PRICE/RATE;SECONDARY PRICE;QUANTITY;REMAINING QUANTITY;PRICE/YIELD;CLEAN PRICE;DIRTY PRICE;ORDER STATUS;
    //ORDER CHANGE REASON;ORDER TYPE;ORDER CATEGORY

    String unique_order_id;
    String order_nr;
    String previous_order_nr;
    Date order_entry_date_and_time;
    Date order_change_date_and_time;
    String instrument_id;
    String market_code;
    Date start_date;
    String currency;
    String buy_sell;
    BigDecimal price_rate;
    BigDecimal secondary_price;
    int quantity;
    int remaining_quantity;
    BigDecimal price_yield;
    BigDecimal clean_price;
    BigDecimal dirty_price;
    String order_status;
    String order_change_reason;
    String order_type;
    String order_category;
    
//    String emirNumarasi;
//    Date emirTarihi;
//    String girisSaati;
//    String menkulKiymet;
//    String pazar;
//    String alis_satis;
//    BigDecimal fiyat;
//    BigDecimal repo2Fiyati;
//    int miktar;
//    int bakiye;
//    String durum;
//    String sonDegistirmeSaati;
//    String ilgiliEmirNumarasi;
//    Date valor1;
//    Date valor2;
//    BigDecimal getiri;
//    String paraBirimi;
//    String repo;
//    String hesabi;
//    BigDecimal tlTutar;
//    BigDecimal temizFiyat;
//    BigDecimal takasFiyati;
//    BigDecimal kalanHacim;
//    Date sonDegistirmeTarihi;
//    String ilgiliEmir2;

	
	public String getUnique_order_id() {
		return unique_order_id;
	}
	public void setUnique_order_id(String unique_order_id) {
		this.unique_order_id = unique_order_id;
	}
	public String getOrder_nr() {
		return order_nr;
	}
	public void setOrder_nr(String order_nr) {
		this.order_nr = order_nr;
	}
	public String getPrevious_order_nr() {
		return previous_order_nr;
	}
	public void setPrevious_order_nr(String previous_order_nr) {
		this.previous_order_nr = previous_order_nr;
	}
	public Date getOrder_entry_date_and_time() {
		return order_entry_date_and_time;
	}
	public void setOrder_entry_date_and_time(Date order_entry_date_and_time) {
		this.order_entry_date_and_time = order_entry_date_and_time;
	}
	public Date getOrder_change_date_and_time() {
		return order_change_date_and_time;
	}
	public void setOrder_change_date_and_time(Date order_change_date_and_time) {
		this.order_change_date_and_time = order_change_date_and_time;
	}
	public String getInstrument_id() {
		return instrument_id;
	}
	public void setInstrument_id(String instrument_id) {
		this.instrument_id = instrument_id;
	}
	public String getMarket_code() {
		return market_code;
	}
	public void setMarket_code(String market_code) {
		this.market_code = market_code;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getBuy_sell() {
		return buy_sell;
	}
	public void setBuy_sell(String buy_sell) {
		this.buy_sell = buy_sell;
	}
	public BigDecimal getPrice_rate() {
		return price_rate;
	}
	public void setPrice_rate(BigDecimal price_rate) {
		this.price_rate = price_rate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getRemaining_quantity() {
		return remaining_quantity;
	}
	public void setRemaining_quantity(int remaining_quantity) {
		this.remaining_quantity = remaining_quantity;
	}
	public BigDecimal getPrice_yield() {
		return price_yield;
	}
	public void setPrice_yield(BigDecimal price_yield) {
		this.price_yield = price_yield;
	}
	public BigDecimal getClean_price() {
		return clean_price;
	}
	public void setClean_price(BigDecimal clean_price) {
		this.clean_price = clean_price;
	}
	public BigDecimal getDirty_price() {
		return dirty_price;
	}
	public void setDirty_price(BigDecimal dirty_price) {
		this.dirty_price = dirty_price;
	}
	public String getOrder_status() {
		return order_status;
	}
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	public String getOrder_change_reason() {
		return order_change_reason;
	}
	public void setOrder_change_reason(String order_change_reason) {
		this.order_change_reason = order_change_reason;
	}
	public String getOrder_type() {
		return order_type;
	}
	public void setOrder_type(String order_type) {
		this.order_type = order_type;
	}
	public String getOrder_category() {
		return order_category;
	}
	public void setOrder_category(String order_category) {
		this.order_category = order_category;
	}
	
	
	public BigDecimal getSecondary_price() {
		return secondary_price;
	}
	public void setSecondary_price(BigDecimal secondary_price) {
		this.secondary_price = secondary_price;
	}
	public String toStringCSV(){
        String orderString="";
        orderString+=unique_order_id+";";
        orderString+=order_nr+";";
        orderString+=previous_order_nr+";";
        orderString+=dateFormat.format(order_entry_date_and_time)+";";
        orderString+=dateFormat.format(order_change_date_and_time)+";";
        orderString+=instrument_id+";";
        orderString+=market_code+";";
        orderString+= dateFormatForFile.format(start_date)+";";
        orderString+=currency+";";
        orderString+=buy_sell+";";
        orderString+=price_rate+";";
        orderString+=secondary_price+";";
        orderString+=quantity+";";
        orderString+=remaining_quantity+";";
        orderString+=price_yield+";";
        orderString+=clean_price+";";
        orderString+=dirty_price+";";
        orderString+= order_status+";";
        orderString+= order_change_reason+";";
        orderString+= order_type+";";
        orderString+= order_category+";";
        return orderString;
}
    public Date getTime(){
//        //try {
//            Calendar tmp = Calendar.getInstance();
//            tmp.setTime(this.getOrder_entry_date_and_time());
//            String girisSaati=this.getOrder_entry_date_and_time().toString();
//            if(girisSaati.length()==8)
//            	girisSaati="0"+girisSaati;
//            tmp.set(Calendar.HOUR, Integer.parseInt(girisSaati.substring(0,2)));
//            tmp.set(Calendar.MINUTE, Integer.parseInt(girisSaati.substring(2,4)));
//            tmp.set(Calendar.SECOND, Integer.parseInt(girisSaati.substring(4,6)));
//            tmp.set(Calendar.MILLISECOND, Integer.parseInt(girisSaati.substring(6,9)));
//            return tmp.getTime();
    	return order_entry_date_and_time;
    }
    
    public String getDate(){
        //try {
            Calendar tmp = Calendar.getInstance();
            tmp.setTime(this.getOrder_entry_date_and_time());
            return tmp.get(Calendar.DAY_OF_MONTH) + "-" + tmp.get(Calendar.MONTH) +"-"+ tmp.get(Calendar.YEAR);
    }
    
    public String isNull(Object s){
        if(s==null)
            return "";
//        else if(s.compareTo("null")==0)
//            return "";
//        else if(s.length()==0)
//            return "";
        else return s.toString();
    }
    
    public String isDateNull(Object s){
        if(s==null)
            return "";
//        else if(s.compareTo("null")==0)
//            return "";
//        else if(s.length()==0)
//            return "";
        else return dateFormatForFile.format(s);
    }
    
    public String getGirisSaati() {
    	 Calendar tmp = Calendar.getInstance();
         tmp.setTime(this.getOrder_entry_date_and_time());
         return tmp.get(Calendar.HOUR) + "-" + tmp.get(Calendar.MINUTE) +"-"+ tmp.get(Calendar.SECOND);
    }
}
