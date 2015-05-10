import java.util.*;

class ConObserver implements Observer {
  private int state;
  private String name;
  
  public ConObserver( Observable subject, String n ) {
    name = n;
    subject.addObserver( this );
  }
  
  public void update( Observable sub, Object obj ) {
    if ( sub instanceof ConSubject ) {
      state = ((ConSubject) sub).getState();
      System.out.println( name + ": Subject changed to " + state );
    }
  }
}