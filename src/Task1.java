//Задача 1.
//Напишите метод для поиска числа в заранее отсортированном по убыванию списке различных целых чисел.
//
//Метод должен вернуть индекс, если элемент найден, и -1, если элемент не найден.
//
//Используйте в качестве образца задачу 2 из классной работы.

import java.util.ArrayList;

public class Task1 {

  public static int indexOf(ArrayList<Integer> numbers, int target) {
    int left = 0;
    int right = numbers.size();
    while (left < right - 1) {
      int mid = (left + right) / 2;
      if (numbers.get(mid) == target) {
        return mid;
      }
      if (numbers.get(mid) > target) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }
    if (left < numbers.size() && numbers.get(left) == target) {

      return left;
    }
    return -1;
  }
}


