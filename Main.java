public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Word1", "Word2", "Word3",
                "Word4", "Word5", "Word6",
                "Word7", "Word8", "Word9",
                "Word3", "Word11", "Word12",
                "Word13", "Word14", "Word7",
                "Word5", "Word17", "Word18", "Word1"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }

    private static void task2() {
        Directory directory = new Directory();

        directory.add("Ivanov", "89031259875");
        directory.add("Alekseev", "89771595687");
        directory.add("Petrov", "8917356455");
        directory.add("Egorov", "89271589785");
        directory.add("Ivanov", "89017895624");
        directory.add("Petrov", "89059785126");
        directory.add("Egorov", "89061259876");
        directory.add("Alekseev", "89872659431");
        directory.add("Ivanov", "89075496508");

        System.out.println(directory.get("Ivanov"));
        System.out.println(directory.get("Alekseev"));
        System.out.println(directory.get("Egorov"));
        System.out.println(directory.get("Petrov"));
    }
}

class Directory {
    private Map<String, List<String>> directory_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }
}
