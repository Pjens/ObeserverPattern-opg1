class TestObserver {
  
  public static void main( String argv[] ) {
    Observer obsA, obsB;
    ConSubject sub;
    
    sub = new ConSubject( 1 );
    
    obsA = new AlarmObserver( sub, 3 );
    obsB = new PrintObserver( sub );
    
    for ( int i=2; i<5; i++ )
      sub.changeState( i );
  }
}