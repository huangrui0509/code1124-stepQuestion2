import java.util.function.Supplier;

/**
 * 台阶问题的实现
 */
public class FibonacciSupplier implements Supplier<Long> {
  private long a = 0;
  private long b = 0;
  private long c = 1;

  @Override
  public Long get() {
	  long s=a+b+c;
		a=b;
		b=c;
		c=s;
		return s;
  }
}
