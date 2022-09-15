import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.Logger;

public class homework1 {
    public static void main(String[] args) {
        //int[] numbers = new int[]{};
        int[] numbers = getArray(5);
        logger(Arrays.toString(numbers));
        logger(String.valueOf(offerFirst(numbers, 13)));
        logger(String.valueOf(offerLast(numbers, 13)));
        logger(String.valueOf(peekFirst(numbers)));
        logger(String.valueOf(peekLast(numbers)));
        logger(String.valueOf(pollFirst(numbers)));
        logger(String.valueOf(pollLast(numbers)));
    }

    public static int[] getArray(int n){
        int[] resultArray = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            resultArray[i] = (random.nextInt(0, 100));
        }
        return resultArray;
    }

    //добавляет элемент element в самое начало массива. Если элемент удачно добавлен, возвращает true, иначе - false
    public static boolean offerFirst(int[] list, int element) {
        int[] newList = new int[list.length + 1];
        try {
            newList[0] = element;
            System.arraycopy(list, 0, newList, 1, list.length);
            list = newList;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    //добавляет элемент element в конец массива. Если элемент удачно добавлен, возвращает true, иначе - false
    public static boolean offerLast(int[] list, int element) {
        int[] newList = new int[list.length + 1];
        try {
            newList[newList.length - 1] = element;
            System.arraycopy(list, 0, newList, 0, list.length);
            list = newList;
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    //возвращает без удаления элемент из начала массива. Если массив пуст, возвращает значение null
    public static Integer peekFirst(int[] list) {
        if (list.length > 0) {
            int firstElement = list[0];
            return firstElement;
        } else return null;
    }

    //возвращает без удаления последний элемент массива. Если массив пуст, возвращает значение null
    public static Integer peekLast(int[] list) {
        if (list.length > 0) {
            int lastElement = list[list.length - 1];
            return lastElement;
        } else return null;
    }

    //возвращает с удалением элемент из начала массива. Если массив пуст, возвращает значение null
    public static Integer pollFirst(int[] list) {
        if (list.length > 0) {
            int firstElement = list[0];
            int[] newList = new int[list.length - 1];
            System.arraycopy(list, 1, newList, 0, newList.length);
            list = newList;
            return firstElement;
        } else return null;
    }

    //возвращает с удалением последний элемент массива. Если массив пуст, возвращает значение null
    public static Integer pollLast(int[] list) {
        if (list.length > 0) {
            int lastElement = list[list.length - 1];
            int[] newList = new int[list.length - 1];
            System.arraycopy(list, 0, newList, 0, newList.length);
            list = newList;
            return lastElement;
        } else return null;
    }


    public static void logger(String message) {
        Logger l = Logger.getAnonymousLogger();
        l.info(message);
    }
}
