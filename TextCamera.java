package data.structures;

public class TextCamera {
  private char[] data;
  private int width;
  private int front;
  
  public TextCamera(){
    width = 4;
    data = new char[width];
    front = 0;
  }
  
  public void setFocus(int width){
    this.width = width;
    data = new char[width];
    front = 0;
  }
  
  public void shift(char entry){
    data[front++] = entry;
    front %= width;
  }
  
  @Override
  public String toString(){
    String s = "";
    for(int i = 0;i<width;i++){
        s = s + data[(front+i)%width];
    }
    return s;
  }
  
  public boolean compare(String target){
      if(target.length() != width){
        return false;
      }
      
      for(int i = 0; i < width; i++){
        if(target.charAt(i) != data[front+i]%width){
            return false;
        }
      }
      return true;
    }
  }
  

