package runner;

class Testing
{
  java.awt.Robot robot;
  public Testing()
  {
    changeCursorLocation();
  }
  public void changeCursorLocation()
  {
    try
    {
      robot = new java.awt.Robot();
      final int W = 1024;//<---enter sceen dimension
      final int H = 768; //<---ditto
     while (true)
      {
        Thread.sleep(10000);
        robot.mouseMove((int)(Math.random()*W), (int)(Math.random()*H));
      }
    }
    catch(Exception e){e.printStackTrace();}
  }
  public static void main(String[] args){new Testing();}
}