package Java6.uzduotys;

public class AntraUzduotis {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        System.out.println(getElementByIndex(array, 2));
        System.out.println(getElementByIndex(array, 9));
        System.out.println(getElementByIndex(array, 1));

        Integer number = getElementByIndex(array, 100);
        if(number == null) {
            System.out.println("Number does not exist");
        }
    }

    static Integer getElementByIndex(Integer[] array, int index) {
        try {
            return array[index];
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }
}
