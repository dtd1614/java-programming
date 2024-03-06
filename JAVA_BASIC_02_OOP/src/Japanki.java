class Coffee {
   String name;
   int price;
   int volume;
      
   Coffee(String name, int price, int volume) {
      this.name = name;
      this.price = price;
      this.volume = volume;
   }
   
   Coffee makeCoffee(){
      return new Coffee(this.name, this.price, this.volume);
   }
   
   int getPrice() {
      return this.price;
   }
   
   String getName() {
      return this.name;
   }
   
   int getVolume() {
      return this.volume;
   }
}


public class Japanki {
   String shape;
   int size;
   String color;
   String serialNum;
   String factory;

   int maximJego;
   int georgiaJego;
   int kanuJego;
   
   int japankiCashAmount;
   
   int userCash;
   int userBalance;
   
   boolean isPowerOn;
   
   Coffee maximCoffee;
   Coffee georgiaCoffee;
   Coffee kanuCoffee;
   
   Japanki() {
      this.shape = "직사각형";
      this.size = 1500;
      this.color = "blue";
      this.serialNum = "HS-1234";
      this.factory = "효성산업";

      this.maximJego = 0;
      this.georgiaJego = 3;
      this.kanuJego = 4;
      this.japankiCashAmount = 2000;
      this.isPowerOn = true;

      this.userCash = 0;
      this.userBalance = 0;
      
      this.maximCoffee = new Coffee("맥심", 500, 500);
      this.georgiaCoffee = new Coffee("조지아", 600, 500);
      this.kanuCoffee = new Coffee("카누", 700, 500);
   }
   
   int inputCash(int cash) {
      if(cash < maximCoffee.getPrice()) {
         System.out.println("잔액이 부족합니다.");
         return cash;
      }
      this.userCash = cash;
      System.out.println("커피를 골라주세요.");
      return 0;
   }
   
   Coffee choiceCoffee(String coffeeName) {
      if(coffeeName.equals(this.maximCoffee.getName())) {
         if (this.maximJego == 0) {
            System.out.println("재고가 없습니다.");
         }else if(this.userCash < this.maximCoffee.getPrice()) {
            System.out.println("잔액이 부족합니다.");
         }else {
            this.userBalance = getBalance(maximCoffee.getPrice());
            --this.maximJego;
            this.japankiCashAmount += this.maximCoffee.getPrice();
            return this.maximCoffee.makeCoffee();
         }
      }else if(coffeeName.equals(this.georgiaCoffee.getName())) {
         if (this.georgiaJego == 0) {
            System.out.println("재고가 없습니다.");
         }else if(this.userCash < this.georgiaCoffee.getPrice()) {
            System.out.println("잔액이 부족합니다.");
         }else {
            this.userBalance = getBalance(georgiaCoffee.getPrice());
            --this.georgiaJego; 
            this.japankiCashAmount += this.georgiaCoffee.getPrice();
            return this.georgiaCoffee.makeCoffee();
         }
      }else if(coffeeName.equals(kanuCoffee.getName())){
         if (this.kanuJego == 0) {
            System.out.println("재고가 없습니다.");
         }else if(this.userCash < this.kanuCoffee.getPrice()) {
            System.out.println("잔액이 부족합니다.");
         }else {
            this.userBalance = getBalance(kanuCoffee.getPrice());
            --this.kanuJego; 
            this.japankiCashAmount += this.kanuCoffee.getPrice();
            return this.kanuCoffee.makeCoffee();
         }
      }else {
         System.out.println("존재하지 않는 커피입니다.");
      }
      return null;
   }
   
   int getBalance(int price) {
      return this.userCash - price;
   }
   
   int getUserBalance() {
      return this.userBalance;
   }

   public static void main(String[] args) {
      
   }

}
