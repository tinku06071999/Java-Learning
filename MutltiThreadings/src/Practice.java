public class Practice extends Thread {

    @Override
    public void run(){
       for(int i =1;i<=5;i++){
           try{
                Thread.sleep(1000);
           }catch (InterruptedException e){
                System.out.println(e);
           }
           System.out.println(i);
       }
    }
    public static void main(String[] args){
        Practice t1 = new Practice();
        t1.start();
//        t1.run();
    }

}
