public class Memory{
  private static double[] mem = new double[50];
  public int count = 0;

  public void storeMem(double num, int count){
    mem[count] = num;
  }

  public double getMem(int index){
    return mem[index];
  }
}