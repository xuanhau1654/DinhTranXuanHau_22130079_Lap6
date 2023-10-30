package MyArrayList;

public class Test {
	public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<>();

        // Thêm phần tử
        myList.add(5);
        myList.add(10);
        myList.add(7);
        myList.add(3);

        // Kiểm tra các phương thức
        System.out.println("Size: " + myList.size());
        System.out.println("Is empty: " + myList.isEmpty());
        System.out.println("Contains 7: " + myList.contains(7));
        System.out.println("Index of 10: " + myList.indexOf(10));
        System.out.println("Last index of 7: " + myList.lastIndexOf(7));
        System.out.println("Element at index 2: " + myList.get(2));

        // Sắp xếp danh sách (sử dụng Comparator)
        

        // In danh sách sau khi sắp xếp
        System.out.print("Sorted List: ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();

        // Xóa phần tử
        int removedElement = myList.remove(2);
        System.out.println("Removed element at index 2: " + removedElement);

        // In danh sách sau khi xóa
        System.out.print("List after removal: ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();

        // Xóa phần tử theo giá trị
        boolean removed = myList.remove(Integer.valueOf(10));
        System.out.println("Removed element 10: " + removed);

        // In danh sách sau khi xóa
        System.out.print("List after removing value 10: ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();
    }
}
