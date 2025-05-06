public class Hello implements Runnable {
    @Override
    public void run()
    {
        for(int i=0; i<5; i++)
        {
            System.out.println("Hello");

            //sleeping for 1sec to simulate that each step is taking time to proceses
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
