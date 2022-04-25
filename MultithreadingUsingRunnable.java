class MultithreadingUsingRunnable implements Runnable{  
  public void run(){  
    System.out.println("My thread is in running state.");  
  }   
  public static void main(String args[]){  
     MultithreadingUsingRunnable obj=new MultithreadingUsingRunnable();  
     Thread tobj =new Thread(obj);  
     tobj.start();  
 }  
}
