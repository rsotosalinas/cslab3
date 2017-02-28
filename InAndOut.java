import java.util.Random;

public class InAndOut {
	   private static class Food{
	       private String FoodItem;
	       private int expirationDate;
       
	       Food(String FoodItem, int expirationDate){
		      this.FoodItem = FoodItem;
		      this.expirationDate = expirationDate;
	       }
	       private void setFood(int exp){
		      expirationDate = exp;
	       }
	       public String toString(){
	    	   String item = FoodItem;
		      return item;
	       }
	       private int number(){
		      return expirationDate;
	       } 
	
	       
	   }
	
	   public static void refillStock( LinkedStack<Food> cheese, LinkedStack<Food> bun,LinkedStack<Food> patty,LinkedStack<Food> lettuce, 
			   LinkedStack<Food> tomato,LinkedStack<Food> onion){
		       Random randomGenerator = new Random();
		       int rand = randomGenerator.nextInt(301) + 700;

		       for(int i = 1; i <= rand; i++){
	    	      cheese.push(new Food("cheese",2));    
	    	      
	           }
	       
	           rand = randomGenerator.nextInt(301) + 700;
	       
	           for(int i = 1; i <= rand; i++){
	    	      bun.push(new Food("bun",5));    	   
	           }
	       
	           rand = randomGenerator.nextInt(301) + 700;
	       
	           for(int i = 1; i <= rand; i++){
	    	       patty.push(new Food("patty", 4));    	   
	           }
	       
	           rand = randomGenerator.nextInt(301) + 700;
	       
	           for(int i = 1; i <= rand; i++){
	    	       lettuce.push(new Food("lettuce", 3));    	   
	           }
	       
	           rand = randomGenerator.nextInt(301) + 700;
	       
	           for(int i = 1; i <= rand; i++){
	    	       tomato.push(new Food("tomato",3));    	   
	           }
	       
	           rand = randomGenerator.nextInt(301) + 700;
	       
	           for(int i = 1; i <= rand; i++){
	    	       onion.push(new Food ("onion",5));    	   
	           }		   
	   }
	   public static int lostCustomer(LinkedQueue<Integer> customer){
		   int lostCustomers = 0;
		    while(!customer.isEmpty()){
		    	customer.dequeue();
		    	lostCustomers++;
		    }
		    return lostCustomers;
	   }
	   public static void refillCustomer(LinkedQueue<Integer> customer){
		   Random randomGenerator = new Random();
		   int randOrder = randomGenerator.nextInt(6) + 1;
	          int randCustomer = randomGenerator.nextInt(100) + 1;
	          for(int i = 1; i <= randCustomer; i++){
	        	  customer.enqueue(randOrder);
	        	  randOrder = randomGenerator.nextInt(6) + 1;
	          }
	          
		   
	   }
	   public static int oneDayPass(LinkedStack<Food> FoodItem){
		   Object[] obj = (Object[])FoodItem.lookAll();
		    Object[] on = new Object[obj.length];
			   for(int i = 0; i < obj.length; i++){
				   Food tempitem = (Food)obj[i];
				   tempitem.expirationDate = tempitem.expirationDate -1;
				   on[i] = tempitem;
				   FoodItem.pop();
				  
			   }

		    for(int i = 0; i < obj.length; i++){
		    	Food temp2 = (Food)on[i];
		    	if(temp2.expirationDate != 0)
		    	FoodItem.push((Food)on[i]);
		    	
		    }
		    Object[] asdf = (Object[])FoodItem.lookAll();

		    
		    
		   return (obj.length - asdf.length);
	   }
	   public static void oneHourWork(LinkedDataList<String> orderNumber, LinkedStack<Food> cheese,LinkedStack<Food> bun,
			   LinkedStack<Food> patty, LinkedStack<Food> lettuce,LinkedStack<Food> tomato,LinkedStack<Food> onion ){
		   Object[] obj = (Object[])orderNumber.lookAll();
		   String[] sdf = new String[obj.length];
		   for(int i = 0; i < obj.length; i++){
			   sdf[i] =(String) obj[i];
   	           if(sdf[i] == "cheese"){
   	        	   cheese.pop();
   	           }
   	           else if(sdf[i] == "bun"){
   	        	   bun.pop();
   	           }
   	           else if(sdf[i] == "patty"){
   	        	   patty.pop();
   	           }
   	           else if(sdf[i] == "lettuce"){
   	        	   if(!lettuce.isEmpty())
                   lettuce.pop();
   	           }
   	           else if(sdf[i] == "tomato"){
   	        	   tomato.pop();
   	           }
   	           else if(sdf[i]== "onion"){
   	        	   onion.pop();
   	           }
	   
		   }
	   }
	//   public static void()
	
	public static void main(String[] args){
		int customerDayLost = 0, wasteCheese = 0, wasteBun = 0,
				   wastePatty = 0, wasteOnion = 0,wasteLettuce = 0, wasteTomato = 0 ; 
				   int countItem =0, countItemTwo = 0, countItemThree = 0, countItemFour = 0,
				   countItemFive = 0, countItemSix = 0;
	  
		   Random randomGenerator = new Random();
	       int rand = randomGenerator.nextInt(301) + 700;

          LinkedDataList<String> burger = new LinkedDataList<String>();
          LinkedDataList<String> cheeseBurger = new LinkedDataList<String>();

          LinkedDataList<String> veganBurger = new LinkedDataList<String>();
          LinkedDataList<String> burgerNoOnion = new LinkedDataList<String>();
          LinkedDataList<String> cheeseBurgerNoOnion= new LinkedDataList<String>();
          LinkedDataList<String> burgerNoTomato= new LinkedDataList<String>();
       
          LinkedStack<Food> cheese = new LinkedStack<Food>();
          LinkedStack<Food> bun = new LinkedStack<Food>();
          LinkedStack<Food> patty = new LinkedStack<Food>();
          LinkedStack<Food> lettuce = new LinkedStack<Food>();
          LinkedStack<Food> tomato = new LinkedStack<Food>();
          LinkedStack<Food> onion = new LinkedStack<Food>();
          
          refillStock(cheese, bun, patty, lettuce, tomato, onion);  
       
          LinkedQueue<Integer> customer = new LinkedQueue<Integer>(); 
          refillCustomer(customer);

          burger.add("bun");
          burger.add("patty");
          burger.add("lettuce");
          burger.add("tomato");
          burger.add("onion");

          cheeseBurger.add("cheese");
          cheeseBurger.add("bun");
          cheeseBurger.add("patty");
          cheeseBurger.add("lettuce");
          cheeseBurger.add("tomato");
          cheeseBurger.add("onion");

          veganBurger.add("lettuce");
          veganBurger.add("lettuce");
          veganBurger.add("tomato");
          veganBurger.add("onion");

          burgerNoOnion.add("bun");
          burgerNoOnion.add("patty");
          burgerNoOnion.add("lettuce");
          burgerNoOnion.add("tomato");

          cheeseBurgerNoOnion.add("cheese");
          cheeseBurgerNoOnion.add("bun");
          cheeseBurgerNoOnion.add("patty");
          cheeseBurgerNoOnion.add("lettuce");
          cheeseBurgerNoOnion.add("onion");

          burgerNoTomato.add("bun");
          burgerNoTomato.add("patty");
          burgerNoTomato.add("lettuce");
          burgerNoTomato.add("onion");
           
      // System.out.println(customer.getFront());
        
////////////////////////////////////////////////////////////////
          
          for(int i = 0; i < 31 ; i++){
        	  
      		//  customerDayLost = 0; wasteCheese = 0; wasteBun = 0;
 		      wastePatty = 0; wasteOnion = 0;wasteLettuce = 0; wasteTomato = 0 ; 
 		      countItem =0; countItemTwo = 0; countItemThree = 0; countItemFour = 0;
 		      countItemFive = 0; countItemSix = 0; customerDayLost = 0;
 	  
        	  if((i ) %3 == 0)
    			  refillStock( cheese, bun, patty,lettuce, tomato, onion);
        	  for(int j = 0; j < 12 ; j++){
        		
        			refillCustomer(customer);
        		     for(int k = 0; k < 50; k++){
        			    //  System.out.println(customer.getFront());
        		    	 //refillCustomer(customer);
        			      if(!customer.isEmpty()){
        			    	  
        			      
        			     if(customer.getFront() == 1){
        			    	 if(!bun.isEmpty() && !patty.isEmpty() && !lettuce.isEmpty() && !tomato.isEmpty() && !onion.isEmpty()){
        			   	     oneHourWork(burger,  cheese, bun, patty, lettuce, tomato,onion );
        			   	     countItem++;
        			    	 }
        			     }
        			     else if(customer.getFront() == 2){
        			    	 if(!bun.isEmpty() && !patty.isEmpty() && !lettuce.isEmpty() && !tomato.isEmpty() && !onion.isEmpty() && !cheese.isEmpty()){

        				     oneHourWork(cheeseBurger,  cheese, bun, patty, lettuce, tomato,onion );
        				     countItemTwo++;
        			    	 }
        			     }
        			     else if(customer.getFront() == 3){
        			    	 if(!lettuce.isEmpty() && !tomato.isEmpty() && !onion.isEmpty()){

        				     oneHourWork(veganBurger,  cheese, bun, patty, lettuce, tomato,onion );
        				     countItemThree++;
        			    	 }
        			     }
        			     else if(customer.getFront() == 4){
        			    	 if(!bun.isEmpty() && !patty.isEmpty() && !lettuce.isEmpty() && !tomato.isEmpty()){

        				     oneHourWork(burgerNoOnion,  cheese, bun, patty, lettuce, tomato,onion );
        				     countItemFour++;
        			    	 }
        			     }
        			     else if(customer.getFront() == 5){
        			    	 
        			    	 if(!bun.isEmpty() && !patty.isEmpty() && !lettuce.isEmpty() && !tomato.isEmpty() && !cheese.isEmpty()){
        				     oneHourWork(cheeseBurgerNoOnion,  cheese, bun, patty, lettuce, tomato,onion );
        				     countItemFive++;
        			    	 }
        			     }
        			     else if(customer.getFront() == 6){
        			    	 if(!bun.isEmpty() && !patty.isEmpty() && !lettuce.isEmpty()  && !onion.isEmpty()){

        				     oneHourWork(burgerNoTomato,  cheese, bun, patty, lettuce, tomato,onion );
        				     countItemSix++;
        			    	 }
        			     }
        			     else{
        			    	 System.out.println("empty");
        			     }
        			     customer.dequeue();
            		    //customerDayLost = lostCustomer(customer) + customerDayLost;
            		     
        			      }
                      
        		     }
        		    
         		    customerDayLost = lostCustomer(customer) + customerDayLost;

           		     
        	  }
        	
        	  
        	  wasteCheese = oneDayPass(cheese);
        	  wasteBun = oneDayPass(bun);
        	  wastePatty = oneDayPass(patty);
        	  wasteLettuce = oneDayPass(lettuce);
        	  wasteTomato = oneDayPass(tomato);
        	  wasteOnion = oneDayPass(onion);
        	  
        	  System.out.println("March " + (i +1) + " :");
        	  System.out.println("Customers Lost : " + customerDayLost);
        	  System.out.println("Item wasted:" + "cheese:" + wasteCheese +" bun:" + wasteBun + " patty: " + wastePatty 
        			  + " lettuce: " + wasteLettuce + " tomato: " + wasteTomato + " onion: " + wasteOnion);
        	  System.out.println("Successful Orders:" + "Item one:" + countItem + " Item Two:" + countItemTwo + " Item Three:" + countItemThree
        			  + " Item Four:" + countItemFour + " Item Five:" + countItemFive + " Item Six:" + countItemSix );
          
         }
    
   }
}
