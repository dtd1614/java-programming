package lotto.exception;

public class OutOfRangeNumberException extends Exception{

   public OutOfRangeNumberException(String message) {
      super(message);
   }
   
   public OutOfRangeNumberException() {
      super();
   }
}
