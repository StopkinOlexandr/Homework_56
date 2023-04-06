import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {
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
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите число для поиска: ");
    int target = Integer.parseInt(br.readLine());

    System.out.println("Результат: " + Task1.indexOf(list, target));

  }

}
