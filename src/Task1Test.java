import java.util.ArrayList;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test {

  @ParameterizedTest
  @CsvSource({
      "0, 10",
      "2, 8",
      "5, 5",
      "7, 3",
      "10, 0",
      "-1, -1",
      "11, -1",

  })
  public void indexOf(int target, int expected) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(9);
    list.add(8);
    list.add(7);
    list.add(6);
    list.add(5);
    list.add(4);
    list.add(3);
    list.add(2);
    list.add(1);
    list.add(0);
    int actual = Task1.indexOf(list, target);
    assertEquals(expected, actual);
  }
}

