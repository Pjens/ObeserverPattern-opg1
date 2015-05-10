import java.util.*;

class ConSubject extends Observable {
  private int state;
  
  public ConSubject( int value ) {
    changeState( value );
  }
  
  public void changeState( int value ) {
    state = value;
    setChanged();
    notifyObservers();
  }
  
  public int getState() {
    return state;
  }
}