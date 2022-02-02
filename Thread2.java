

		  class Thread2 {
			    public void m()
			    {
			        System.out.println("Hello ");
			    }
			}
			  
			class Test extends Thread2 implements Runnable {
			   
				public void run()
			    {
			        System.out.println("child Thread");
			    }
			   
				public static void main(String[] args)
			    {
			        Test t = new Test();
			        t.m();
			        
			        Thread t1 = new Thread(t);
			       
			        t1.start();
			        System.out.println("main thread");
			    }
			}
			}
