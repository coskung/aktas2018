package bt.domain;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Trade2018 {

    static DateFormat dateFormatForFile = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    static DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy HH:mm:ss", Locale.ENGLISH);

    
//    TRADE DATE;TRADE TIME;INSTRUMENT CODE;MARKET CODE;MARKET NAME;TRADE NUMBER;BUY/SELL;VALUE DATE1;VALUE DATE2;INSTRUMENT ID;DTM/REPO TIME;
//    DAYS TO COUPON;PRICE/RATE;RETURN;REPO COLLATERAL PRICE;QUANTITY;AMOUNT;ACCRUED INTEREST/ACCRUED LEASE;CLEAN PRICE;ACCRUED INTEREST AMOUNT/ACCRUED LEASE AMOUNT;
//    PRINCIPAL AMOUNT;INFLATION INDEX;DIRTY PRICE;SETTLEMENT PRICE;VALUE DATE2 PRICE;CURRENCY;CLEARING HOUSE;PRINCIPAL+INTEREST- WITHOLDING TAX;
//    REPO INTEREST AMOUNT;WITHOLDING TAX AMOUNT;ORDER NR.;SESSION;AFT. 14:00 PM B/S FUND TRADE;TRADE TYPE;TRADE TYPE FOR OTC TRADES;TRADEREPORT

    Date trade_date;
    String trade_time;
    String instrument_code;
    String market_code;
    String market_name;
    String trade_number;
    String buy_sell;
    Date value_date_1;
    Date value_date_2;
    String instrument_id;
    String dtm_repo_time;
    String days_to_coupon;
    BigDecimal price_rate;
    String return_val;
    BigDecimal repo_collateral_price;
    int quantity;
    BigDecimal amount;
    String accrued_interest_accrued_lease;
    BigDecimal clean_price;
    BigDecimal accrued_interest_amount_accrued_lease_amount;
    BigDecimal principal_amount;
    String inflation_index;
    BigDecimal dirty_price;
    BigDecimal settlement_price;
    BigDecimal value_date2_price;
    String currency;
    String clearing_house;
    String principal_interest_witholding_tax;
    String repo_interest_amount;
    String witholding_tax_amount;
    String order_nr;
    String session;
    String aft1400pm_fund_trade;
    String trade_type;
    String trade_type_for_otc_trades;
    String trade_report;
    
    Boolean isProcessed;
    
//    String islemNo;
//    Date islemTarihi;
//    String paraBirimi;
//    String zaman;
//    String b_emirNo;
//    String s_emirNo;
//    String menkulKiymet;
//    String pazar;
//    BigDecimal fiyat;
//    BigDecimal repo2Fiyati;
//    int miktar;
//    BigDecimal tlTutar;
//    int repoFaizi;
//    int stopaj;
//    Date valor1;
//    Date valor2;
//    BigDecimal getiri;
//    String repoSuresi;
//    BigDecimal temizFiyat;
//    BigDecimal islemisFaiz;
//    BigDecimal islemisFaizTutari;
//    BigDecimal anaparaTutari;
//    BigDecimal takasFiyati;
//    BigDecimal kirliFiyat;
//    BigDecimal enflasyonKatsayisi;
//    String kendineFon;
//    Boolean isProcessed;
//    BigDecimal hacim;
//    String durum;
    

    public Date getTrade_date() {
		return trade_date;
	}
	public void setTrade_date(Date trade_date) {
		this.trade_date = trade_date;
	}
	public String getTrade_time() {
		return trade_time;
	}
	public void setTrade_time(String trade_time) {
		this.trade_time = trade_time;
	}
	public String getInstrument_code() {
		return instrument_code;
	}
	public void setInstrument_code(String instrument_code) {
		this.instrument_code = instrument_code;
	}
	public String getMarket_code() {
		return market_code;
	}
	public void setMarket_code(String market_code) {
		this.market_code = market_code;
	}
	public String getMarket_name() {
		return market_name;
	}
	public void setMarket_name(String market_name) {
		this.market_name = market_name;
	}
	public String getTrade_number() {
		return trade_number;
	}
	public void setTrade_number(String trade_number) {
		this.trade_number = trade_number;
	}
	public String getBuy_sell() {
		return buy_sell;
	}
	public void setBuy_sell(String buy_sell) {
		this.buy_sell = buy_sell;
	}
	public Date getValue_date_1() {
		return value_date_1;
	}
	public void setValue_date_1(Date value_date_1) {
		this.value_date_1 = value_date_1;
	}
	public Date getValue_date_2() {
		return value_date_2;
	}
	public void setValue_date_2(Date value_date_2) {
		this.value_date_2 = value_date_2;
	}
	public String getInstrument_id() {
		return instrument_id;
	}
	public void setInstrument_id(String instrument_id) {
		this.instrument_id = instrument_id;
	}
	public String getDtm_repo_time() {
		return dtm_repo_time;
	}
	public void setDtm_repo_time(String dtm_repo_time) {
		this.dtm_repo_time = dtm_repo_time;
	}
	public String getDays_to_coupon() {
		return days_to_coupon;
	}
	public void setDays_to_coupon(String days_to_coupon) {
		this.days_to_coupon = days_to_coupon;
	}
	public BigDecimal getPrice_rate() {
		return price_rate;
	}
	public void setPrice_rate(BigDecimal price_rate) {
		this.price_rate = price_rate;
	}
	public String getReturn_val() {
		return return_val;
	}
	public void setReturn_val(String return_val) {
		this.return_val = return_val;
	}
	public BigDecimal getRepo_collateral_price() {
		return repo_collateral_price;
	}
	public void setRepo_collateral_price(BigDecimal repo_collateral_price) {
		this.repo_collateral_price = repo_collateral_price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getAccrued_interest_accrued_lease() {
		return accrued_interest_accrued_lease;
	}
	public void setAccrued_interest_accrued_lease(String accrued_interest_accrued_lease) {
		this.accrued_interest_accrued_lease = accrued_interest_accrued_lease;
	}
	public BigDecimal getClean_price() {
		return clean_price;
	}
	public void setClean_price(BigDecimal clean_price) {
		this.clean_price = clean_price;
	}
	public BigDecimal getAccrued_interest_amount_accrued_lease_amount() {
		return accrued_interest_amount_accrued_lease_amount;
	}
	public void setAccrued_interest_amount_accrued_lease_amount(BigDecimal accrued_interest_amount_accrued_lease_amount) {
		this.accrued_interest_amount_accrued_lease_amount = accrued_interest_amount_accrued_lease_amount;
	}
	public BigDecimal getPrincipal_amount() {
		return principal_amount;
	}
	public void setPrincipal_amount(BigDecimal principal_amount) {
		this.principal_amount = principal_amount;
	}
	public String getInflation_index() {
		return inflation_index;
	}
	public void setInflation_index(String inflation_index) {
		this.inflation_index = inflation_index;
	}
	public BigDecimal getDirty_price() {
		return dirty_price;
	}
	public void setDirty_price(BigDecimal dirty_price) {
		this.dirty_price = dirty_price;
	}
	public BigDecimal getSettlement_price() {
		return settlement_price;
	}
	public void setSettlement_price(BigDecimal settlement_price) {
		this.settlement_price = settlement_price;
	}
	public BigDecimal getValue_date2_price() {
		return value_date2_price;
	}
	public void setValue_date2_price(BigDecimal value_date2_price) {
		this.value_date2_price = value_date2_price;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getClearing_house() {
		return clearing_house;
	}
	public void setClearing_house(String clearing_house) {
		this.clearing_house = clearing_house;
	}
	public String getPrincipal_interest_witholding_tax() {
		return principal_interest_witholding_tax;
	}
	public void setPrincipal_interest_witholding_tax(String principal_interest_witholding_tax) {
		this.principal_interest_witholding_tax = principal_interest_witholding_tax;
	}
	public String getRepo_interest_amount() {
		return repo_interest_amount;
	}
	public void setRepo_interest_amount(String repo_interest_amount) {
		this.repo_interest_amount = repo_interest_amount;
	}
	public String getWitholding_tax_amount() {
		return witholding_tax_amount;
	}
	public void setWitholding_tax_amount(String witholding_tax_amount) {
		this.witholding_tax_amount = witholding_tax_amount;
	}
	public String getOrder_nr() {
		return order_nr;
	}
	public void setOrder_nr(String order_nr) {
		this.order_nr = order_nr;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getAft1400pm_fund_trade() {
		return aft1400pm_fund_trade;
	}
	public void setAft1400pm_fund_trade(String aft1400pm_fund_trade) {
		this.aft1400pm_fund_trade = aft1400pm_fund_trade;
	}
	public String getTrade_type() {
		return trade_type;
	}
	public void setTrade_type(String trade_type) {
		this.trade_type = trade_type;
	}
	public String getTrade_type_for_otc_trades() {
		return trade_type_for_otc_trades;
	}
	public void setTrade_type_for_otc_trades(String trade_type_for_otc_trades) {
		this.trade_type_for_otc_trades = trade_type_for_otc_trades;
	}
	public String getTrade_report() {
		return trade_report;
	}
	public void setTrade_report(String trade_report) {
		this.trade_report = trade_report;
	}
	
		
	public Boolean getProcessed() {
		return isProcessed;
	}
	public void setProcessed(Boolean isProcessed) {
		this.isProcessed = isProcessed;
	}
	public String checkNull(BigDecimal b) {
        if(b==null)
            return "";
        return b.toString();
    }
	
	public String toStringCSV(){
        
        String tradeString="";
        tradeString+=dateFormatForFile.format(trade_date)+";";
        tradeString+=trade_time+";";
        tradeString+= instrument_code+";";
        tradeString+=market_code+";";
        tradeString+=market_name+";";
        tradeString+=trade_number+";";
        tradeString+=buy_sell+";";
        tradeString+=isDateNull(value_date_1)+";";
        tradeString+=isDateNull(value_date_2)+";";
        //tradeString+= dateFormatForFile.format(isNull(value_date_1))+";";
        //tradeString+= dateFormatForFile.format(isNull(value_date_2))+";";
        tradeString+=instrument_id+";";
        tradeString+=dtm_repo_time+";";
        tradeString+=days_to_coupon+";";
        tradeString+=checkNull(price_rate)+";";
        tradeString+=return_val+";";
        tradeString+=checkNull(repo_collateral_price)+";";
        tradeString+=quantity+";";
        tradeString+=amount+";";
        tradeString+=accrued_interest_accrued_lease+";";
        tradeString+= isNull(clean_price)+";";
        tradeString+= isNull(accrued_interest_amount_accrued_lease_amount)+";";
        tradeString+= principal_amount+";";
        tradeString+= inflation_index+";";
        tradeString+=checkNull(dirty_price)+";";
        tradeString+=checkNull(settlement_price)+";";
        tradeString+=checkNull(value_date2_price)+";";
        tradeString+= currency+";";
        tradeString+=clearing_house+";";
        tradeString+=principal_interest_witholding_tax+";";
        tradeString+=repo_interest_amount+";";
        tradeString+= witholding_tax_amount+";";
        tradeString+= order_nr+";";
        tradeString+= session+";";
        tradeString+= aft1400pm_fund_trade+";";
        tradeString+= trade_type+";";
        tradeString+= trade_type_for_otc_trades+";";
        tradeString+= trade_report+";";
        
        return tradeString;
}
	
	
    public Date getTime(){
        
        Calendar tmp = Calendar.getInstance();
        tmp.setTime(this.getTrade_date());
        tmp.set(Calendar.HOUR, Integer.parseInt(this.getTrade_time().substring(0,2)));
        tmp.set(Calendar.MINUTE, Integer.parseInt(this.getTrade_time().substring(3,5)));
        tmp.set(Calendar.SECOND, Integer.parseInt(this.getTrade_time().substring(6,8)));
        return tmp.getTime();
        
//        try {
//            return dateFormat.parse(this.getIslemTarihi()+ " " + this.getZaman());
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        return null;
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
    
    public String isDateNull(Date d){
        if(d==null)
            return "";
//        else if(s.compareTo("null")==0)
//            return "";
//        else if(s.length()==0)
//            return "";
        else return dateFormatForFile.format(d);
    }
    
    public String getB_emirNo() {
    	 if(buy_sell.compareTo("B")==0)
             return order_nr;
    	 else
    		 return "";
    }
    
    public String getS_emirNo() {
    	if(buy_sell.compareTo("S")==0)
            return order_nr;
    	else
    		return "";
   }
}
