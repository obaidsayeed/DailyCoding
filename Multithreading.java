public class Multithreading extends Thread{  
  public void run(){  
    System.out.println("Thread is in running state");  
  }   
  public static void main(String args[]){  
     Multithreading obj=new Multithreading();   
     obj.start();  
  }  
}
