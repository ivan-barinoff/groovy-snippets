package features

class Collections {

    static main(args) {
        // Array
        def strings = ["one", "two", "three"]
        strings[-1]
        strings[1]
        strings[1..2]
        strings[0, 2]

        List<String> stringList = new ArrayList<>(Arrays.asList("one", "two", "three"));
        stringList.get(stringList.size() - 1);
        stringList.get(1);
        stringList.subList(1, 3)
        Arrays.asList(stringList.get(0), stringList.get(2))

        // Map
        def map = [one: 1, two: 2, three: 3] // as HashMap
        map["one"]
        map.unknown
        map.one

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("one", 1);
        map2.put("two", 2);
        map2.put("three", 3);
        map2.get("one")
    }
}
