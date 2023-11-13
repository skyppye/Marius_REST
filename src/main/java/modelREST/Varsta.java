package modelREST;

public class Varsta {
 private int ani;

 public Varsta(int ani) {
     this.ani = ani;
 }

 public int getAni() {
     return ani;
 }

 public void setAni(int ani) {
     this.ani = ani;
 }

 @Override
 public String toString() {
     return "Varsta [ani=" + ani + "]";
 }
}
