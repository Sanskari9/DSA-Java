public class GetterAndSetter {
   static  class vehile{
        private int price;
        public   int getPrice(){
            return price;
        }
        public void setPrice(int price){
            if(price<0){
                return ;
            }
            this.price = price;
        }
    }
    public static void main(String [] args){
        vehile v1 = new vehile();
        System.out.println(v1.getPrice());
        v1.setPrice(10);  
        System.out.println(v1.getPrice());
    }
}
