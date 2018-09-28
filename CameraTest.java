package data.structures;

public class CameraTest {
  public static void main(String[] args)throws Exception{
    TextCamera myCamera = new TextCamera();
    String s = "st a";
    String msg = "student Framingham State university thanks you for your interest and invites you to explore";
    for(int i = 0; i < msg.length();i++){
      myCamera.shift(msg.charAt(i));
      System.out.print("" +(char)13);
      for(int j = 0;j < i;j++){
        System.out.print("");
      }
      System.out.print(myCamera);
      if(myCamera.compare(s)){
        System.exit(0);
      }
      Thread.sleep(300);
    }
  }  
}
