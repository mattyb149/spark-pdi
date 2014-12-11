package pdi.spark;

import org.apache.spark.api.java.function.Function;
import pdi.bridge.KettleBridge;

import java.io.IOException;

/**
 * Created by mburgess on 12/11/14.
 */
public class RunKettleTrans implements Function<String, String> {

  private static final ClassLoader kettleClassLoader;
  private Object transRunner = null;

  static {
    try {
      kettleClassLoader = KettleBridge.getKettleClassloader();
    } catch ( Exception e ) {
      throw new RuntimeException( e );
    }
  }

  @Override
  public String call( String v1 ) throws Exception {
    try {
      KettleBridge.init();
      //KettleBridge.startTransformation( filename, fields );
      // TODO
      return "Hello";
    } catch ( Exception e ) {
      throw new IOException( "Caught exception processing input row ", e );
    }
  }
}
