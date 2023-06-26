import java.util.HashMap;
import java.util.HashSet;

public class Task1 {
    private static HashMap<String, HashSet<String>> book;//объявляем HashMap book для использования  в разных методах

    // создаем конструктор "PhoneBook" с выделением памяти для HashMap
    public Task1() {
        book = new HashMap<>();
    }

    // метод добавления контактов (имя, телефон), в HashMap PhoneBook
    public void addContact(String name, String phone) {
        HashSet<String> phones = book.getOrDefault(name, new HashSet<>()); // создаем множество phones с назанчением
                                                                           // имени и множества телефонов к нему
        phones.add(phone); // добавляем в созданное множество телефоны
        book.put(name, phones); // в HashMap относим имя и телефоны
    }

    // метод печати контактов
    public void printContacts() {
        book.entrySet()
                .stream()
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                });
    }
}