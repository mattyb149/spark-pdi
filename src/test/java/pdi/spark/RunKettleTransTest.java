package pdi.spark;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunKettleTransTest {
  RunKettleTrans runTrans;

  @Before
  public void setUp() throws Exception {
    runTrans = new RunKettleTrans();
  }

  @Test
  public void testCall() throws Exception {

    assertEquals( "Hello", runTrans.call( "World" ) );

  }
}
