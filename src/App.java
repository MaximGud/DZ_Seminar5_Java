public class App {
    public static void main(String[] args) throws Exception {
        // 1)Реализуйте структуру телефонной книги с помощью HashMap.
        // Программа также должна учитывать, что во входной структуре
        // будут повторяющиеся имена с разными телефонами, их необходимо
        // считать, как одного человека с разными телефонами. Вывод должен
        // быть отсортирован по убыванию числа телефонов.(можно выводить без сортировки,
        // но обязательно в отдельном методе)
        Task1 phoneBook = new Task1();// вызываем конструктор создания HashMap
        phoneBook.addContact("Антон", "89654256532");
        phoneBook.addContact("Иван", "86538547523");
        phoneBook.addContact("Иван", "89053256874");
        phoneBook.addContact("Катя", "89657452585");
        phoneBook.addContact("Катя", "89132587485");
        phoneBook.addContact("Катя", "89156581232");
        phoneBook.printContacts();

        // 2) Реализовать алгоритм пирамидальной сортировки (HeapSort)(найти метод в
        // Интернете и включить в проект)
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        
        Task2 ob = new Task2();
        ob.sort(arr);

        System.out.println("Отсортированный массив: ");
        Task2.printArray(arr);
    }
}
