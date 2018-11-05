package c05.loose;

public class InvokeMen {

    public static void main(String[] args) {
        Provider provider = new Provider();
        // 规模标准
        // 较少参数耦合小于较多参数
        provider.less("one");
        provider.more("one", "two", "three");
        // 较少调用连接小于较多调用连接
        provider.total("one", "two");
        provider.part1("one");
        provider.part2("two");

        // 可见性，可见小于不可见
        provider.disable();
        provider.visible("visible");

        Person person = new Person();
        person.setName("tom");
        person.setAge(11);

        // 灵活性
        group(person);
        group(person.getName(), person.getAge());
        dispersion(person);
        dispersion(person.getName(), person.getAge());

        GroupParam groupParam = new GroupParam();
        groupParam.setName("jack");
        groupParam.setAge(12);
        provider.group(groupParam);
    }

    /**
     * 灵活性
     * 聚合入参适合调用方已有入参对象，对于没有入参对象则需要仔细了解入参对象的情况
     */
    private static void group(Person person) {
        Provider provider = new Provider();
        provider.group(person);
    }
    private static void group(String name, Integer age) {
        Provider provider = new Provider();
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        provider.group(person);
    }

    /**
     * 灵活性
     * 分散参数适合两种情况
     */
    private static void dispersion(Person person) {
        Provider provider = new Provider();
        provider.dispersion(person.getName(), person.getAge());
    }
    private static void dispersion(String name, Integer age) {
        Provider provider = new Provider();
        provider.dispersion(name, age);
    }

}
