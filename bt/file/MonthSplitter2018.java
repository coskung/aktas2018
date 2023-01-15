package bt.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import bt.domain.Order2018;
import bt.domain.Trade2018;
import bt.utils.DateComparator;
import bt.utils.TimeComparatorForIslem;



public class MonthSplitter2018 {
    
    static ArrayList<Order2018> orderListFullMonth = new ArrayList<Order2018>();
    static ArrayList<Trade2018> tradeListFullMonth = new ArrayList<Trade2018>();
    static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    static List<String> menkulKiymetListesi = new ArrayList<String> ();
    static DateFormat dateFormatForFileName = new SimpleDateFormat("dd-MMM-yy", Locale.ENGLISH);
    static DateFormat dateFormatTrade = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

    
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        int i = 1;
        String emirFile = "orders_2011_KES_5.csv";
        String islemFile = "trades_2011_KES_5.csv";

        readOrderMonthCSVFile(emirFile);
        
        readTradeMonthCSVFile(islemFile);

        DateComparator dateComparator = new DateComparator();
        TimeComparatorForIslem comparatorForIslem = new TimeComparatorForIslem();
        Collections.sort(orderListFullMonth, dateComparator);
        //Collections.sort(tradeListFullMonth, comparatorForIslem);  //bunu acinca dosya uretiminda fazlaliklar oluyor kontrol etmeyi unutma 3 Aralik notu

        //once her bir menkul kiymet icin bir aylik liste olustur:
        for (String menkulKiymet : menkulKiymetListesi) {
            splitOrdersToMenkulKiymetList(menkulKiymet);
        }
        
        for (String menkulKiymet : menkulKiymetListesi) {
            splitTradesToMenkulKiymetList(menkulKiymet);
        }
        
//        while(orderListFullMonth.size()>0){
//            
//            
//                splitEmirlist(i);
//                i++;
//        }       
//        i=1;
//        while(tradeListFullMonth.size()>0){
//                splitIslemlist(i);
//                i++;
//        }
        System.out.println("durduk");

    }
    
    private static void readTradeMonthCSVFile(String fileName) throws Exception {
        File file = new File(fileName);
        BufferedReader bufRdr = new BufferedReader(new FileReader(file));
        String line = null;
        //String tmp;
        int row = 0;
        //read each line of text file
        while ((line = bufRdr.readLine()) != null) {
            Trade2018 t = convertLineToTrade2018(line);
            if(t!=null){  //t returns null if that trade is already in the trade list (remember similar B and S lines in trade file 
                tradeListFullMonth.add(row, t);
                row++;
            }
        }
        bufRdr.close();
        
        System.out.println("trade dosya - menkulkiymet list size:"+menkulKiymetListesi.size());
        
    }

    public static Trade2018 convertLineToTrade2018(String line) {

		Trade2018 t = new Trade2018();
		bt.utils.Parse parser = new bt.utils.Parse(line, ";");

		if (line != null) {
			// System.out.println("line:"+line);
			String tmp = parser.nextToken();

			
			//TODO: 24-11-2022 test icin asagidaki if ve ilgili fonksiyon devre disi birakildi
			//if (thisTradeExistsThenUpdate(line)) {
				// System.out.println("trade exists:"+line);
				//return null;
			//}

			while (tmp != null) {

				Date trade_date = null;
				try {
					trade_date = dateFormatTrade.parse(tmp);
					t.setTrade_date(trade_date);
				} catch (ParseException e1) {
					e1.printStackTrace();
				}

				tmp = parser.nextToken();
				t.setTrade_time(tmp);

				tmp = parser.nextToken();
				t.setInstrument_code(tmp);

				tmp = parser.nextToken();
				t.setMarket_code(tmp);

				tmp = parser.nextToken();
				t.setMarket_name(tmp);

				tmp = parser.nextToken();
				t.setTrade_number(tmp);
				//System.out.println(tmp);

				tmp = parser.nextToken();
				t.setBuy_sell(tmp);

				tmp = parser.nextToken();
				Date value_date_1 = null;
				try {
					value_date_1 = dateFormatTrade.parse(tmp);
					t.setValue_date_1(value_date_1);
				} catch (ParseException e1) {
					e1.printStackTrace();
				}

				tmp = parser.nextToken();
				Date value_date_2 = null;
				try {
                	if(!tmp.isEmpty())
                		value_date_2 = dateFormatTrade.parse(tmp);
					t.setValue_date_2(value_date_2);
				} catch (ParseException e1) {
					e1.printStackTrace();
				}

				tmp = parser.nextToken();
				t.setInstrument_id(tmp);

				tmp = parser.nextToken();
				t.setDtm_repo_time(tmp);

				tmp = parser.nextToken();
				t.setDays_to_coupon(tmp);

				tmp = parser.nextToken();
				BigDecimal price_rate = new BigDecimal(tmp);
				t.setPrice_rate(price_rate);

				tmp = parser.nextToken();
				t.setReturn_val(tmp);

				tmp = parser.nextToken();
				if (!tmp.isEmpty()) {
					BigDecimal repo_collateral_price = new BigDecimal(tmp);
					t.setRepo_collateral_price(repo_collateral_price);
				} else
					t.setRepo_collateral_price(null);

				tmp = parser.nextToken();
				int quantity = Integer.parseInt(tmp);
				t.setQuantity(quantity);

				tmp = parser.nextToken();
				if (!tmp.isEmpty()) {
					BigDecimal amount = new BigDecimal(tmp);
					t.setAmount(amount);
				} else
					t.setAmount(null);

				tmp = parser.nextToken();
				t.setAccrued_interest_accrued_lease(tmp);

				tmp = parser.nextToken();
				if (!tmp.isEmpty()) {
					BigDecimal clean_price = new BigDecimal(tmp);
					t.setClean_price(clean_price);
				} else
					t.setClean_price(null);

				tmp = parser.nextToken();
				if (!tmp.isEmpty()) {
					BigDecimal accrued_interest_amount_accrued_lease_amount = new BigDecimal(tmp);
					t.setAccrued_interest_amount_accrued_lease_amount(accrued_interest_amount_accrued_lease_amount);
				} else
					t.setAccrued_interest_amount_accrued_lease_amount(null);

				tmp = parser.nextToken();
				if (!tmp.isEmpty()) {
					BigDecimal principal_amount = new BigDecimal(tmp);
					t.setPrincipal_amount(principal_amount);
				} else
					t.setPrincipal_amount(null);

				tmp = parser.nextToken();
				t.setInflation_index(tmp);

				tmp = parser.nextToken();
				if (!tmp.isEmpty()) {
					BigDecimal dirty_price = new BigDecimal(tmp);
					t.setDirty_price(dirty_price);
				} else
					t.setDirty_price(null);

				tmp = parser.nextToken();
				if (!tmp.isEmpty()) {
					BigDecimal settlement_price = new BigDecimal(tmp);
					t.setSettlement_price(settlement_price);
				} else
					t.setSettlement_price(null);

				tmp = parser.nextToken();
				if (!tmp.isEmpty()) {
					BigDecimal value_date2_price = new BigDecimal(tmp);
					t.setValue_date2_price(value_date2_price);
				} else
					t.setValue_date2_price(null);

				tmp = parser.nextToken();
				t.setCurrency(tmp);

				tmp = parser.nextToken();
				t.setClearing_house(tmp);

				tmp = parser.nextToken();
				t.setPrincipal_interest_witholding_tax(tmp);

				tmp = parser.nextToken();
				t.setRepo_interest_amount(tmp);

				tmp = parser.nextToken();
				t.setWitholding_tax_amount(tmp);

				tmp = parser.nextToken();
				t.setOrder_nr(tmp);

				tmp = parser.nextToken();
				t.setSession(tmp);

				tmp = parser.nextToken();
				t.setAft1400pm_fund_trade(tmp);

				tmp = parser.nextToken();
				t.setTrade_type(tmp);

				tmp = parser.nextToken();
				t.setTrade_type_for_otc_trades(tmp);

				tmp = parser.nextToken();
				t.setTrade_report(tmp);

				tmp = parser.nextToken();
				// System.out.println("--"+tmp);
			}
		}
		return t;
	}

    private static boolean thisTradeExistsThenUpdate(String line) {
        
        bt.utils.Parse parser = new bt.utils.Parse(line, ",");        
        String islemNo = parser.nextToken();
        //System.out.println("tradeListSize:"+tradeListFullMonth.size());
        
        for(int i=0;i<tradeListFullMonth.size();i++){
            if(tradeListFullMonth.get(i).getTrade_number().compareTo(islemNo)==0){  //this trade already exists - update buy or sell
                String alis_satis = parser.nextToken();
                String tmp=parser.nextToken();//islemTarihi
                tmp=parser.nextToken();//parabirimi
                tmp=parser.nextToken();//zaman
                String emirNo=parser.nextToken();
                tradeListFullMonth.get(i).setOrder_nr(emirNo);
                return true;
            }
         }
        return false;
    }

    private static void splitOrdersToMenkulKiymetList(String menkulKiymet) throws Exception {
        ArrayList<Order2018> singleList = new ArrayList<Order2018>();
        for(int i=0;i<orderListFullMonth.size();i++){
            Order2018 o=orderListFullMonth.get(i);
            //if(!(o.getDurum().compareTo("W")==0 && o.getMiktar()==o.getBakiye())){
                if(o.getInstrument_id().compareTo(menkulKiymet)==0)
                    singleList.add(o);
            //}
        }
        
        int i=1;
        while(singleList.size()>0){
            splitEmirlist(i,singleList);
            i++;
        } 
    }
    
    private static void splitTradesToMenkulKiymetList(String menkulKiymet) throws Exception {
        ArrayList<Trade2018> singleList = new ArrayList<Trade2018>();
        for(int i=0;i<tradeListFullMonth.size();i++){
            Trade2018 t=tradeListFullMonth.get(i);
                if(t.getInstrument_id().compareTo(menkulKiymet)==0)
                    singleList.add(t);
        }
        
        int i=1;
        while(singleList.size()>0){
            splitTradelist(i,singleList);
            i++;
    } 
    }

    public static void readOrderMonthCSVFile(String fileName) throws Exception {
        File file = new File(fileName);
        BufferedReader bufRdr = new BufferedReader(new FileReader(file));
        String line = null;
        //String tmp;
        int row = 0;
        //read each line of text file
        while ((line = bufRdr.readLine()) != null) {
            Order2018 e = convertLineToOrder2018(line);
            orderListFullMonth.add(row, e);
            row++;
        }
        bufRdr.close();
        
        System.out.println("order dosya - menkulkiymet list size:"+menkulKiymetListesi.size());
    }
    
    public static Order2018 convertLineToOrder2018(String line) {
		// System.out.println(line);
		Order2018 e = new Order2018();
		bt.utils.Parse parser = new bt.utils.Parse(line, ";");

		if (line != null) {
			String tmp = parser.nextToken();
			while (tmp != null) {
				e.setUnique_order_id(tmp);
				// System.out.println(e.getUnique_order_id());

				tmp = parser.nextToken();
				e.setOrder_nr(tmp);

				tmp = parser.nextToken();
				e.setPrevious_order_nr(tmp);

				tmp = parser.nextToken();
				Date order_entry_date_and_time = null;
				try {
					order_entry_date_and_time = dateFormat.parse(tmp);
					e.setOrder_entry_date_and_time(order_entry_date_and_time);
				} catch (ParseException e1) {
					e1.printStackTrace();
				}

				tmp = parser.nextToken();
				Date order_change_date_and_time = null;
				try {
					order_change_date_and_time = dateFormat.parse(tmp);
					e.setOrder_change_date_and_time(order_change_date_and_time);
				} catch (ParseException e1) {
					e1.printStackTrace();
				}

				tmp = parser.nextToken();
				e.setInstrument_id(tmp);

				tmp = parser.nextToken();
				e.setMarket_code(tmp);

				tmp = parser.nextToken();
				Date start_date = null;
				try {
					start_date = dateFormat.parse(tmp);
					e.setStart_date(start_date);
				} catch (ParseException e1) {
					e1.printStackTrace();
				}

				tmp = parser.nextToken();
				e.setCurrency(tmp);

				tmp = parser.nextToken();
				e.setBuy_sell(tmp);

				tmp = parser.nextToken();
				BigDecimal price_rate = new BigDecimal(tmp);
				e.setPrice_rate(price_rate);

				tmp = parser.nextToken();
				if (!tmp.isEmpty()) {
					BigDecimal secondary_price = new BigDecimal(tmp);
					e.setSecondary_price(secondary_price);
				} else
					e.setSecondary_price(null);
				
				tmp = parser.nextToken();
				int quantity = Integer.parseInt(tmp);
				e.setQuantity(quantity);

				tmp = parser.nextToken();
				int remaining_quantity = Integer.parseInt(tmp);
				e.setRemaining_quantity(remaining_quantity);

				tmp = parser.nextToken();
				if (!tmp.isEmpty()) {
					BigDecimal price_yield = new BigDecimal(tmp);
					e.setPrice_yield(price_yield);
				} else
					e.setPrice_yield(null);

				tmp = parser.nextToken();
				if (!tmp.isEmpty()) {
					BigDecimal clean_price = new BigDecimal(tmp);
					e.setClean_price(clean_price);
				} else
					e.setClean_price(null);

				tmp = parser.nextToken();
				if (!tmp.isEmpty()) {
					BigDecimal dirty_price = new BigDecimal(tmp);
					e.setDirty_price(dirty_price);
				} else
					e.setDirty_price(null);

				tmp = parser.nextToken();
				e.setOrder_status(tmp);

				tmp = parser.nextToken();
				e.setOrder_change_reason(tmp);

				tmp = parser.nextToken();
				e.setOrder_type(tmp);

				tmp = parser.nextToken();
				e.setOrder_category(tmp);

				tmp = parser.nextToken();
			}
		}
		return e;
	}


    public static void splitEmirlist(int fileNumber, ArrayList<Order2018> singleList) throws Exception {
        ArrayList<Order2018> orderListOneDay = new ArrayList<Order2018>();
        for (int i = 0; i < singleList.size(); i++) {
            Order2018 order = singleList.get(i);
            if (i<singleList.size()-1 && order.getOrder_entry_date_and_time().compareTo(singleList.get(i+1).getOrder_entry_date_and_time())==0) {
                orderListOneDay.add(order);
            }
            else{
                orderListOneDay.add(order);//gunun son emri icin...       
                i=singleList.size();
            }
        }
        String nameOfFile=singleList.get(0).getInstrument_id()+"-"+dateFormatForFileName.format(singleList.get(0).getOrder_entry_date_and_time())+"_emir.csv";
        WriteFile.writeCSVfileEmirDaily(orderListOneDay,nameOfFile);
        System.out.println("emir."+fileNumber+"="+nameOfFile);
        singleList.removeAll(orderListOneDay);
    }
    
    public static void splitTradelist(int fileNumber, ArrayList<Trade2018> singleList) throws Exception {
        ArrayList<Trade2018> tradeListOneDay = new ArrayList<Trade2018>();
        for (int i = 0; i < singleList.size(); i++) {
            Trade2018 trade = singleList.get(i);
            if (i<singleList.size()-1 && trade.getTrade_date().compareTo(singleList.get(i+1).getTrade_date())==0) {
                tradeListOneDay.add(trade);
            }
            else{
                tradeListOneDay.add(trade);//gunun son emri icin...       
                i=singleList.size();
            }
        }
        String nameOfFile=singleList.get(0).getInstrument_id()+"-"+dateFormatForFileName.format(singleList.get(0).getTrade_date())+"_islem.csv";
        WriteFile.writeCSVfileTradeDaily(tradeListOneDay,nameOfFile);
        System.out.println("islem."+fileNumber+"="+nameOfFile);
        singleList.removeAll(tradeListOneDay);
    }
}
