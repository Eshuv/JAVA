import java.util.ArrayList;

public class Operations {
    public static void main(String[] args) {
        ArrayList<Integer> mainList = new ArrayList<>();

        mainList.add(1);
        mainList.add(2);
        mainList.add(3);
        mainList.add(4);
        mainList.add(5);

        for (int i: mainList){
            System.out.print(i);
        }
    }
}
