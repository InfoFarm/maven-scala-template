import java.io.ByteArrayOutputStream

import org.scalatest.FunSuite

/**
 * A test for the [[SampleApplication]]
 *
 * @author mlavaert
 */
class SampleApplicationTest extends FunSuite {

  test("Test that the sample application actually printed something in the console") {
    val outputStream = new ByteArrayOutputStream()
    Console.withOut(outputStream) {
      SampleApplication.main(Array())
    }

    assert(new String(outputStream.toByteArray) contains "Scala")
  }
}